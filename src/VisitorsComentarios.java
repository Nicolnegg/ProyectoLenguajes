import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.CommonTokenStream;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class VisitorsComentarios  extends PythonParserBaseVisitor<Void> {
    public  List<String> variables_global = new ArrayList<>();
    public  List<Object> valores_global = new ArrayList<>();
    public  List<String> variables_temporales = new ArrayList<>();
    public  List<Object> valores_temporales = new ArrayList<>();
    public Void visitExpr_stmt(PythonParser.Expr_stmtContext ctx) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        if(ctx.testlist_star_expr()!=null){
            if(ctx.assign_part()!=null){
                String valorText= ctx.assign_part().getText();
                String[] valordiv= valorText.split("=");
                //valordiv[0] queda eelmoperador, valordiv[1] queda la asignacion
                char es_lista=valordiv[1].charAt(0);
                if (es_lista=='['){

                }
                Object valor = engine.eval(valordiv[1]);
                String variable = ctx.testlist_star_expr().getText();
                if(variables_global.contains(variable)){
                    int posicion = variables_global.indexOf(variable);
                    if(valordiv[0].equals("")){
                        valores_global.set(posicion,valor.toString());
                    }else{
                        Object masigual = engine.eval(  valores_global.get(posicion)+ valordiv[0] +valor.toString());
                        valores_global.set(posicion,masigual.toString());
                    }
                }
                else if(!valordiv[0].equals("")){
                    throw new RuntimeException("Error: No se pueden realizar operaciones con variables inexistentes");
                }
                else{
                    valores_global.add(valor.toString());
                    variables_global.add(variable);
                }
                Object obj = valores_global.get(0);
                System.out.println(obj);
                if (obj instanceof ArrayList) {
                    ArrayList<Object> lista = (ArrayList<Object>) obj;
                    System.out.println(lista.get(0).toString());
                } else if (obj instanceof Object[]) {
                    Object[] array = (Object[]) obj;
                    ArrayList<Object> lista = new ArrayList<>(Arrays.asList(array));
                    System.out.println(lista.get(0).toString());
                } else if (obj instanceof String) {
                    String str = (String) obj;
                    System.out.println(str);
                } else {
                    System.out.println(variables_global.get(0));
                    System.out.println("Object type: " + obj.getClass().getName());
                }

            }
        }
        return super.visitExpr_stmt(ctx);
    }
    public List<String> getVariables_global() {
        return variables_global;
    }
    public List<Object> getValores_global() {
        return valores_global;
    }
    public List<String> getVariables_temporales() {
        return variables_temporales;
    }
    public List<Object> getValores_temporales() {
        return valores_temporales;
    }
}
