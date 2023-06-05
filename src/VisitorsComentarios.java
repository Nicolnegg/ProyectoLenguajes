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
                String variable = ctx.testlist_star_expr().getText();
                char es_tupla=variable.charAt(0);
                if (es_tupla=='('){
                    variable = variable.substring(1, valordiv[1].length() - 1);

                }
                else{
                    if (es_lista=='['){
                        valordiv[1] = valordiv[1].substring(1, valordiv[1].length() - 1);
                        String[] elementos = valordiv[1].split(",");
                        List<String> lista = new ArrayList<>();
                        for (String elemento : elementos) {
                            lista.add(elemento); // Agrega el elemento a la lista
                        }
                        if(variables_global.contains(variable)){

                            int posicion = variables_global.indexOf(variable);
                            if(valordiv[0].equals("")){

                                valores_global.set(posicion,lista);
                            }else if(valordiv[0].equals("+")){
                                Object obj = valores_global.get(posicion);
                                if (obj instanceof List) {
                                    List<Object> valor = (List<Object>) obj;
                                    valor.addAll(lista);
                                }
                            }else{
                                throw new RuntimeException("Error: No se pueden realizar esta operacion en una lista");
                            }
                        }
                        else if(!valordiv[0].equals("")){
                            throw new RuntimeException("Error: No se pueden realizar operaciones con variables inexistentes");
                        }
                        else{
                            valores_global.add(lista);
                            variables_global.add(variable);
                        }
                    }else{
                        Object valor = engine.eval(valordiv[1]);
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
                    }
                }

                Object obj = valores_global.get(0);
                if (obj instanceof List) {
                    List<Object> lista = (List<Object>) obj;
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
    public Void visitFor_stmt(PythonParser.For_stmtContext ctx) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        boolean dentro_del_for;

        String variable = ctx.exprlist().getText();
        if (ctx.testlist().getText().startsWith("range")) {
            String rangeValue = ctx.testlist().getText().substring(6, ctx.testlist().getText().length() - 1).trim();
            String[] rangeValues = rangeValue.split(",");

            if (rangeValues.length >= 2) {
                String secondValue = rangeValues[1].trim();
                Object rangeResult = engine.eval(secondValue);
                String firstValue = rangeValues[0].trim();
                Object rangeResult1 = engine.eval(firstValue);
                if (variables_temporales.contains(variable)){
                    int index = variables_temporales.indexOf(variable);
                    Object value1 = valores_temporales.get(index);
                    int value = ((Number) value1).intValue();
                    if(valores_temporales.get(index).equals(secondValue)){
                        dentro_del_for=false;
                    }else{
                        if(rangeValues.length >= 3){
                            String thirdValue = rangeValues[2].trim();
                            Object rangeResult3 = engine.eval(thirdValue);
                            int Value = ((Number) rangeResult3).intValue();
                            value += Value;
                            valores_temporales.set(index, value);
                        }else{
                            value += 1;
                            valores_temporales.set(index, value);
                        }
                    }
                } else{
                    if (rangeResult instanceof Number) {
                        int maxValue = ((Number) rangeResult).intValue();
                        int Value = ((Number) rangeResult1).intValue();
                        variables_temporales.add(variable);
                        valores_temporales.add(Value);
                        dentro_del_for = true;
                    } else {
                        throw new RuntimeException("Error: El rango del bucle no es un número válido");
                    }
                }
            } else{
                String secondValue = rangeValues[0].trim();
                Object rangeResult = engine.eval(secondValue);
                if (variables_temporales.contains(variable)){
                    int index = variables_temporales.indexOf(variable);
                    Object value = valores_temporales.get(index);
                    int Value = ((Number) value).intValue();
                    if(valores_temporales.get(index).equals(secondValue)){
                        dentro_del_for=false;
                    }else{
                        Value += 1;
                        valores_temporales.set(index, Value);
                    }
                }else{
                    if (rangeResult instanceof Number) {
                        int maxValue = ((Number) rangeResult).intValue();
                        int Value = 1;
                        variables_temporales.add(variable);
                        valores_temporales.add(Value);
                        dentro_del_for = true;
                    } else {
                        throw new RuntimeException("Error: El rango del bucle no es un número válido");
                    }
                }
            }
        }else{
            String variableValue = ctx.testlist().getText();
            if (variables_temporales.contains(variable)){
                int index = variables_temporales.indexOf(variable);
                Object value = valores_temporales.get(index);
                int Value = ((Number) value).intValue();
                if(valores_temporales.get(index).equals(Integer.parseInt(variableValue))){
                    dentro_del_for=false;
                }else{
                    Value += 1;
                    valores_temporales.set(index, Value);
                }
            }else{
                try {
                    int intValue = 1;
                    variables_temporales.add(variable);
                    valores_temporales.add(1);
                    dentro_del_for = true;
                }catch(NumberFormatException e){
                    variables_temporales.add(variable);
                    valores_temporales.add(variableValue);
                    dentro_del_for = true;
                }

            }
        }

        dentro_del_for = false;
        return super.visitFor_stmt(ctx);
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
