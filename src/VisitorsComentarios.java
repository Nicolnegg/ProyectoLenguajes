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
        if(ctx.testlist_star_expr()!=null){
            if(ctx.assign_part()!=null){
                String valorText= ctx.testlist_star_expr().getText();
                Object valor = engine.eval(valorText);
                valores_global.add((String) valor);
                String variable = ctx.testlist_star_expr().getText();
                variables_global.add(variable);
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
