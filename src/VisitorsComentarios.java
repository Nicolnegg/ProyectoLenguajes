import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.CommonTokenStream;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class VisitorsComentarios  extends PythonParserBaseVisitor<Void> {
    public  List<String> variables_global = new ArrayList<>();
    public  List<String> valores_global = new ArrayList<>();
    public  List<String> variables_temporales = new ArrayList<>();
    public  List<String> valores_temporales = new ArrayList<>();
    public Void visitExpr_stmt(PythonParser.Expr_stmtContext ctx) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        valores_global.add("1");
        variables_global.add("a");
        if(ctx.testlist_star_expr()!=null){
            if(ctx.assign_part()!=null){
                String valorText= ctx.assign_part().getText();
                String[] valordiv= valorText.split("=");
                //valordiv[0] queda eelmoperador, valordiv[1] queda la asignacion
                Object valor = engine.eval(valordiv[1]);
                String variable = ctx.testlist_star_expr().getText();
                if(variables_global.contains(variable)){
                    System.out.println(valores_global.get(0));
                    if(!valordiv[0].equals("")){
                        int posicion = variables_global.indexOf(variable);
                        valores_global.set(posicion,valor.toString());
                        variables_global.add(posicion,variable);
                        System.out.println(valores_global.get(posicion));

                    }else{

                    }
                }
                else if(!valordiv[0].equals("")){
                    throw new RuntimeException("Error: No se pueden realizar operaciones con variables inexistentes");
                }


            }
        }
        return super.visitExpr_stmt(ctx);
    }
    public List<String> getVariables_global() {
        return variables_global;
    }
    public List<String> getValores_global() {
        return valores_global;
    }
    public List<String> getVariables_temporales() {
        return variables_temporales;
    }
    public List<String> getValores_temporales() {
        return valores_temporales;
    }
}
