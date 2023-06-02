import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ListenersComentarios implements PythonParserListener {

    private final PythonParser parser;

    public ListenersComentarios(PythonParser parser) {
        this.parser = parser;
    }

    @Override
    public void enterRoot(PythonParser.RootContext ctx) {
        TokenStream tokens = parser.getTokenStream();
        int start = ctx.getStart().getTokenIndex();
        int stop = ctx.getStop().getTokenIndex();
        for (int i = start; i <= stop; i++) {
            Token token = tokens.get(i);
            String text = token.getText();
            System.out.print(text); // Imprimir el token con un espacio después
        }

    }

    @Override
    public void exitRoot(PythonParser.RootContext ctx) {

    }

    @Override
    public void enterSingle_input(PythonParser.Single_inputContext ctx) {

    }

    @Override
    public void exitSingle_input(PythonParser.Single_inputContext ctx) {

    }

    @Override
    public void enterFile_input(PythonParser.File_inputContext ctx) {

    }

    @Override
    public void exitFile_input(PythonParser.File_inputContext ctx) {

    }

    @Override
    public void enterEval_input(PythonParser.Eval_inputContext ctx) {

    }

    @Override
    public void exitEval_input(PythonParser.Eval_inputContext ctx) {

    }

    @Override
    public void enterStmt(PythonParser.StmtContext ctx) {

    }

    @Override
    public void exitStmt(PythonParser.StmtContext ctx) {

    }

    @Override
    public void enterIf_stmt(PythonParser.If_stmtContext ctx) {

    }

    @Override
    public void exitIf_stmt(PythonParser.If_stmtContext ctx) {

    }

    @Override
    public void enterWhile_stmt(PythonParser.While_stmtContext ctx) {

    }

    @Override
    public void exitWhile_stmt(PythonParser.While_stmtContext ctx) {

    }

    @Override
    public void enterFor_stmt(PythonParser.For_stmtContext ctx) {

    }

    @Override
    public void exitFor_stmt(PythonParser.For_stmtContext ctx) {

    }

    @Override
    public void enterTry_stmt(PythonParser.Try_stmtContext ctx) {

    }

    @Override
    public void exitTry_stmt(PythonParser.Try_stmtContext ctx) {

    }

    @Override
    public void enterWith_stmt(PythonParser.With_stmtContext ctx) {

    }

    @Override
    public void exitWith_stmt(PythonParser.With_stmtContext ctx) {

    }

    @Override
    public void enterClass_or_func_def_stmt(PythonParser.Class_or_func_def_stmtContext ctx) {

    }

    @Override
    public void exitClass_or_func_def_stmt(PythonParser.Class_or_func_def_stmtContext ctx) {

    }

    @Override
    public void enterSuite(PythonParser.SuiteContext ctx) {

    }

    @Override
    public void exitSuite(PythonParser.SuiteContext ctx) {

    }

    @Override
    public void enterDecorator(PythonParser.DecoratorContext ctx) {

    }

    @Override
    public void exitDecorator(PythonParser.DecoratorContext ctx) {

    }

    @Override
    public void enterElif_clause(PythonParser.Elif_clauseContext ctx) {

    }

    @Override
    public void exitElif_clause(PythonParser.Elif_clauseContext ctx) {

    }

    @Override
    public void enterElse_clause(PythonParser.Else_clauseContext ctx) {

    }

    @Override
    public void exitElse_clause(PythonParser.Else_clauseContext ctx) {

    }

    @Override
    public void enterFinally_clause(PythonParser.Finally_clauseContext ctx) {

    }

    @Override
    public void exitFinally_clause(PythonParser.Finally_clauseContext ctx) {

    }

    @Override
    public void enterWith_item(PythonParser.With_itemContext ctx) {

    }

    @Override
    public void exitWith_item(PythonParser.With_itemContext ctx) {

    }

    @Override
    public void enterExcept_clause(PythonParser.Except_clauseContext ctx) {

    }

    @Override
    public void exitExcept_clause(PythonParser.Except_clauseContext ctx) {

    }

    @Override
    public void enterClassdef(PythonParser.ClassdefContext ctx) {

    }

    @Override
    public void exitClassdef(PythonParser.ClassdefContext ctx) {

    }

    @Override
    public void enterFuncdef(PythonParser.FuncdefContext ctx) {

    }

    @Override
    public void exitFuncdef(PythonParser.FuncdefContext ctx) {

    }

    @Override
    public void enterTypedargslist(PythonParser.TypedargslistContext ctx) {

    }

    @Override
    public void exitTypedargslist(PythonParser.TypedargslistContext ctx) {

    }

    @Override
    public void enterArgs(PythonParser.ArgsContext ctx) {

    }

    @Override
    public void exitArgs(PythonParser.ArgsContext ctx) {

    }

    @Override
    public void enterKwargs(PythonParser.KwargsContext ctx) {

    }

    @Override
    public void exitKwargs(PythonParser.KwargsContext ctx) {

    }

    @Override
    public void enterDef_parameters(PythonParser.Def_parametersContext ctx) {

    }

    @Override
    public void exitDef_parameters(PythonParser.Def_parametersContext ctx) {

    }

    @Override
    public void enterDef_parameter(PythonParser.Def_parameterContext ctx) {

    }

    @Override
    public void exitDef_parameter(PythonParser.Def_parameterContext ctx) {

    }

    @Override
    public void enterNamed_parameter(PythonParser.Named_parameterContext ctx) {

    }

    @Override
    public void exitNamed_parameter(PythonParser.Named_parameterContext ctx) {

    }

    @Override
    public void enterSimple_stmt(PythonParser.Simple_stmtContext ctx) {

    }

    @Override
    public void exitSimple_stmt(PythonParser.Simple_stmtContext ctx) {

    }

    @Override
    public void enterExpr_stmt(PythonParser.Expr_stmtContext ctx) {

    }

    @Override
    public void exitExpr_stmt(PythonParser.Expr_stmtContext ctx) {

    }

    @Override
    public void enterPrint_stmt(PythonParser.Print_stmtContext ctx) {

    }

    @Override
    public void exitPrint_stmt(PythonParser.Print_stmtContext ctx) {

    }

    @Override
    public void enterDel_stmt(PythonParser.Del_stmtContext ctx) {

    }

    @Override
    public void exitDel_stmt(PythonParser.Del_stmtContext ctx) {

    }

    @Override
    public void enterPass_stmt(PythonParser.Pass_stmtContext ctx) {

    }

    @Override
    public void exitPass_stmt(PythonParser.Pass_stmtContext ctx) {

    }

    @Override
    public void enterBreak_stmt(PythonParser.Break_stmtContext ctx) {

    }

    @Override
    public void exitBreak_stmt(PythonParser.Break_stmtContext ctx) {

    }

    @Override
    public void enterContinue_stmt(PythonParser.Continue_stmtContext ctx) {

    }

    @Override
    public void exitContinue_stmt(PythonParser.Continue_stmtContext ctx) {

    }

    @Override
    public void enterReturn_stmt(PythonParser.Return_stmtContext ctx) {

    }

    @Override
    public void exitReturn_stmt(PythonParser.Return_stmtContext ctx) {

    }

    @Override
    public void enterRaise_stmt(PythonParser.Raise_stmtContext ctx) {

    }

    @Override
    public void exitRaise_stmt(PythonParser.Raise_stmtContext ctx) {

    }

    @Override
    public void enterYield_stmt(PythonParser.Yield_stmtContext ctx) {

    }

    @Override
    public void exitYield_stmt(PythonParser.Yield_stmtContext ctx) {

    }

    @Override
    public void enterImport_stmt(PythonParser.Import_stmtContext ctx) {

    }

    @Override
    public void exitImport_stmt(PythonParser.Import_stmtContext ctx) {

    }

    @Override
    public void enterFrom_stmt(PythonParser.From_stmtContext ctx) {

    }

    @Override
    public void exitFrom_stmt(PythonParser.From_stmtContext ctx) {

    }

    @Override
    public void enterGlobal_stmt(PythonParser.Global_stmtContext ctx) {

    }

    @Override
    public void exitGlobal_stmt(PythonParser.Global_stmtContext ctx) {

    }

    @Override
    public void enterExec_stmt(PythonParser.Exec_stmtContext ctx) {

    }

    @Override
    public void exitExec_stmt(PythonParser.Exec_stmtContext ctx) {

    }

    @Override
    public void enterAssert_stmt(PythonParser.Assert_stmtContext ctx) {

    }

    @Override
    public void exitAssert_stmt(PythonParser.Assert_stmtContext ctx) {

    }

    @Override
    public void enterNonlocal_stmt(PythonParser.Nonlocal_stmtContext ctx) {

    }

    @Override
    public void exitNonlocal_stmt(PythonParser.Nonlocal_stmtContext ctx) {

    }

    @Override
    public void enterTestlist_star_expr(PythonParser.Testlist_star_exprContext ctx) {

    }

    @Override
    public void exitTestlist_star_expr(PythonParser.Testlist_star_exprContext ctx) {

    }

    @Override
    public void enterStar_expr(PythonParser.Star_exprContext ctx) {

    }

    @Override
    public void exitStar_expr(PythonParser.Star_exprContext ctx) {

    }

    @Override
    public void enterAssign_part(PythonParser.Assign_partContext ctx) {

    }

    @Override
    public void exitAssign_part(PythonParser.Assign_partContext ctx) {

    }

    @Override
    public void enterExprlist(PythonParser.ExprlistContext ctx) {

    }

    @Override
    public void exitExprlist(PythonParser.ExprlistContext ctx) {

    }

    @Override
    public void enterImport_as_names(PythonParser.Import_as_namesContext ctx) {

    }

    @Override
    public void exitImport_as_names(PythonParser.Import_as_namesContext ctx) {

    }

    @Override
    public void enterImport_as_name(PythonParser.Import_as_nameContext ctx) {

    }

    @Override
    public void exitImport_as_name(PythonParser.Import_as_nameContext ctx) {

    }

    @Override
    public void enterDotted_as_names(PythonParser.Dotted_as_namesContext ctx) {

    }

    @Override
    public void exitDotted_as_names(PythonParser.Dotted_as_namesContext ctx) {

    }

    @Override
    public void enterDotted_as_name(PythonParser.Dotted_as_nameContext ctx) {

    }

    @Override
    public void exitDotted_as_name(PythonParser.Dotted_as_nameContext ctx) {

    }

    @Override
    public void enterTest(PythonParser.TestContext ctx) {

    }

    @Override
    public void exitTest(PythonParser.TestContext ctx) {

    }

    @Override
    public void enterVarargslist(PythonParser.VarargslistContext ctx) {

    }

    @Override
    public void exitVarargslist(PythonParser.VarargslistContext ctx) {

    }

    @Override
    public void enterVardef_parameters(PythonParser.Vardef_parametersContext ctx) {

    }

    @Override
    public void exitVardef_parameters(PythonParser.Vardef_parametersContext ctx) {

    }

    @Override
    public void enterVardef_parameter(PythonParser.Vardef_parameterContext ctx) {

    }

    @Override
    public void exitVardef_parameter(PythonParser.Vardef_parameterContext ctx) {

    }

    @Override
    public void enterVarargs(PythonParser.VarargsContext ctx) {

    }

    @Override
    public void exitVarargs(PythonParser.VarargsContext ctx) {

    }

    @Override
    public void enterVarkwargs(PythonParser.VarkwargsContext ctx) {

    }

    @Override
    public void exitVarkwargs(PythonParser.VarkwargsContext ctx) {

    }

    @Override
    public void enterLogical_test(PythonParser.Logical_testContext ctx) {

    }

    @Override
    public void exitLogical_test(PythonParser.Logical_testContext ctx) {

    }

    @Override
    public void enterComparison(PythonParser.ComparisonContext ctx) {

    }

    @Override
    public void exitComparison(PythonParser.ComparisonContext ctx) {

    }

    @Override
    public void enterExpr(PythonParser.ExprContext ctx) {

    }

    @Override
    public void exitExpr(PythonParser.ExprContext ctx) {

    }

    @Override
    public void enterAtom(PythonParser.AtomContext ctx) {

    }

    @Override
    public void exitAtom(PythonParser.AtomContext ctx) {

    }

    @Override
    public void enterDictorsetmaker(PythonParser.DictorsetmakerContext ctx) {

    }

    @Override
    public void exitDictorsetmaker(PythonParser.DictorsetmakerContext ctx) {

    }

    @Override
    public void enterTestlist_comp(PythonParser.Testlist_compContext ctx) {

    }

    @Override
    public void exitTestlist_comp(PythonParser.Testlist_compContext ctx) {

    }

    @Override
    public void enterTestlist(PythonParser.TestlistContext ctx) {

    }

    @Override
    public void exitTestlist(PythonParser.TestlistContext ctx) {

    }

    @Override
    public void enterDotted_name(PythonParser.Dotted_nameContext ctx) {

    }

    @Override
    public void exitDotted_name(PythonParser.Dotted_nameContext ctx) {

    }

    @Override
    public void enterName(PythonParser.NameContext ctx) {

    }

    @Override
    public void exitName(PythonParser.NameContext ctx) {

    }

    @Override
    public void enterNumber(PythonParser.NumberContext ctx) {

    }

    @Override
    public void exitNumber(PythonParser.NumberContext ctx) {

    }

    @Override
    public void enterInteger(PythonParser.IntegerContext ctx) {

    }

    @Override
    public void exitInteger(PythonParser.IntegerContext ctx) {

    }

    @Override
    public void enterYield_expr(PythonParser.Yield_exprContext ctx) {

    }

    @Override
    public void exitYield_expr(PythonParser.Yield_exprContext ctx) {

    }

    @Override
    public void enterYield_arg(PythonParser.Yield_argContext ctx) {

    }

    @Override
    public void exitYield_arg(PythonParser.Yield_argContext ctx) {

    }

    @Override
    public void enterTrailer(PythonParser.TrailerContext ctx) {

    }

    @Override
    public void exitTrailer(PythonParser.TrailerContext ctx) {

    }

    @Override
    public void enterArguments(PythonParser.ArgumentsContext ctx) {

    }

    @Override
    public void exitArguments(PythonParser.ArgumentsContext ctx) {

    }

    @Override
    public void enterArglist(PythonParser.ArglistContext ctx) {

    }

    @Override
    public void exitArglist(PythonParser.ArglistContext ctx) {

    }

    @Override
    public void enterArgument(PythonParser.ArgumentContext ctx) {

    }

    @Override
    public void exitArgument(PythonParser.ArgumentContext ctx) {

    }

    @Override
    public void enterSubscriptlist(PythonParser.SubscriptlistContext ctx) {

    }

    @Override
    public void exitSubscriptlist(PythonParser.SubscriptlistContext ctx) {

    }

    @Override
    public void enterSubscript(PythonParser.SubscriptContext ctx) {

    }

    @Override
    public void exitSubscript(PythonParser.SubscriptContext ctx) {

    }

    @Override
    public void enterSliceop(PythonParser.SliceopContext ctx) {

    }

    @Override
    public void exitSliceop(PythonParser.SliceopContext ctx) {

    }

    @Override
    public void enterComp_for(PythonParser.Comp_forContext ctx) {

    }

    @Override
    public void exitComp_for(PythonParser.Comp_forContext ctx) {

    }

    @Override
    public void enterComp_iter(PythonParser.Comp_iterContext ctx) {

    }

    @Override
    public void exitComp_iter(PythonParser.Comp_iterContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
