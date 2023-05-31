// Generated from C:/Users/princ/IdeaProjects/ProyectoLenguajes/grammar\MyGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#single_input}.
	 * @param ctx the parse tree
	 */
	void enterSingle_input(MyGrammarParser.Single_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#single_input}.
	 * @param ctx the parse tree
	 */
	void exitSingle_input(MyGrammarParser.Single_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(MyGrammarParser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(MyGrammarParser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#eval_input}.
	 * @param ctx the parse tree
	 */
	void enterEval_input(MyGrammarParser.Eval_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#eval_input}.
	 * @param ctx the parse tree
	 */
	void exitEval_input(MyGrammarParser.Eval_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(MyGrammarParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(MyGrammarParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#decorators}.
	 * @param ctx the parse tree
	 */
	void enterDecorators(MyGrammarParser.DecoratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#decorators}.
	 * @param ctx the parse tree
	 */
	void exitDecorators(MyGrammarParser.DecoratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#decorated}.
	 * @param ctx the parse tree
	 */
	void enterDecorated(MyGrammarParser.DecoratedContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#decorated}.
	 * @param ctx the parse tree
	 */
	void exitDecorated(MyGrammarParser.DecoratedContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#async_funcdef}.
	 * @param ctx the parse tree
	 */
	void enterAsync_funcdef(MyGrammarParser.Async_funcdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#async_funcdef}.
	 * @param ctx the parse tree
	 */
	void exitAsync_funcdef(MyGrammarParser.Async_funcdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(MyGrammarParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(MyGrammarParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(MyGrammarParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(MyGrammarParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslist(MyGrammarParser.TypedargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslist(MyGrammarParser.TypedargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void enterTfpdef(MyGrammarParser.TfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void exitTfpdef(MyGrammarParser.TfpdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#varargslist}.
	 * @param ctx the parse tree
	 */
	void enterVarargslist(MyGrammarParser.VarargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#varargslist}.
	 * @param ctx the parse tree
	 */
	void exitVarargslist(MyGrammarParser.VarargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#vfpdef}.
	 * @param ctx the parse tree
	 */
	void enterVfpdef(MyGrammarParser.VfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#vfpdef}.
	 * @param ctx the parse tree
	 */
	void exitVfpdef(MyGrammarParser.VfpdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(MyGrammarParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(MyGrammarParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(MyGrammarParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(MyGrammarParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmall_stmt(MyGrammarParser.Small_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmall_stmt(MyGrammarParser.Small_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(MyGrammarParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(MyGrammarParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#annassign}.
	 * @param ctx the parse tree
	 */
	void enterAnnassign(MyGrammarParser.AnnassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#annassign}.
	 * @param ctx the parse tree
	 */
	void exitAnnassign(MyGrammarParser.AnnassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_star_expr(MyGrammarParser.Testlist_star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_star_expr(MyGrammarParser.Testlist_star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugassign(MyGrammarParser.AugassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugassign(MyGrammarParser.AugassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDel_stmt(MyGrammarParser.Del_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDel_stmt(MyGrammarParser.Del_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPass_stmt(MyGrammarParser.Pass_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPass_stmt(MyGrammarParser.Pass_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlow_stmt(MyGrammarParser.Flow_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlow_stmt(MyGrammarParser.Flow_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(MyGrammarParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(MyGrammarParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(MyGrammarParser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(MyGrammarParser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(MyGrammarParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(MyGrammarParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void enterYield_stmt(MyGrammarParser.Yield_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void exitYield_stmt(MyGrammarParser.Yield_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaise_stmt(MyGrammarParser.Raise_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaise_stmt(MyGrammarParser.Raise_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(MyGrammarParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(MyGrammarParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#import_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_name(MyGrammarParser.Import_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#import_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_name(MyGrammarParser.Import_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#import_from}.
	 * @param ctx the parse tree
	 */
	void enterImport_from(MyGrammarParser.Import_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#import_from}.
	 * @param ctx the parse tree
	 */
	void exitImport_from(MyGrammarParser.Import_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_name(MyGrammarParser.Import_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_name(MyGrammarParser.Import_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_name(MyGrammarParser.Dotted_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_name(MyGrammarParser.Dotted_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_names(MyGrammarParser.Import_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_names(MyGrammarParser.Import_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_names(MyGrammarParser.Dotted_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_names(MyGrammarParser.Dotted_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(MyGrammarParser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(MyGrammarParser.Dotted_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_stmt(MyGrammarParser.Global_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_stmt(MyGrammarParser.Global_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNonlocal_stmt(MyGrammarParser.Nonlocal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNonlocal_stmt(MyGrammarParser.Nonlocal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssert_stmt(MyGrammarParser.Assert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssert_stmt(MyGrammarParser.Assert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(MyGrammarParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(MyGrammarParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#async_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAsync_stmt(MyGrammarParser.Async_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#async_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAsync_stmt(MyGrammarParser.Async_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(MyGrammarParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(MyGrammarParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(MyGrammarParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(MyGrammarParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(MyGrammarParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(MyGrammarParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTry_stmt(MyGrammarParser.Try_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTry_stmt(MyGrammarParser.Try_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWith_stmt(MyGrammarParser.With_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWith_stmt(MyGrammarParser.With_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#with_item}.
	 * @param ctx the parse tree
	 */
	void enterWith_item(MyGrammarParser.With_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#with_item}.
	 * @param ctx the parse tree
	 */
	void exitWith_item(MyGrammarParser.With_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void enterExcept_clause(MyGrammarParser.Except_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void exitExcept_clause(MyGrammarParser.Except_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(MyGrammarParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(MyGrammarParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#namedexpr_test}.
	 * @param ctx the parse tree
	 */
	void enterNamedexpr_test(MyGrammarParser.Namedexpr_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#namedexpr_test}.
	 * @param ctx the parse tree
	 */
	void exitNamedexpr_test(MyGrammarParser.Namedexpr_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(MyGrammarParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(MyGrammarParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void enterTest_nocond(MyGrammarParser.Test_nocondContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void exitTest_nocond(MyGrammarParser.Test_nocondContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#lambdef}.
	 * @param ctx the parse tree
	 */
	void enterLambdef(MyGrammarParser.LambdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#lambdef}.
	 * @param ctx the parse tree
	 */
	void exitLambdef(MyGrammarParser.LambdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#lambdef_nocond}.
	 * @param ctx the parse tree
	 */
	void enterLambdef_nocond(MyGrammarParser.Lambdef_nocondContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#lambdef_nocond}.
	 * @param ctx the parse tree
	 */
	void exitLambdef_nocond(MyGrammarParser.Lambdef_nocondContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#or_test}.
	 * @param ctx the parse tree
	 */
	void enterOr_test(MyGrammarParser.Or_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#or_test}.
	 * @param ctx the parse tree
	 */
	void exitOr_test(MyGrammarParser.Or_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#and_test}.
	 * @param ctx the parse tree
	 */
	void enterAnd_test(MyGrammarParser.And_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#and_test}.
	 * @param ctx the parse tree
	 */
	void exitAnd_test(MyGrammarParser.And_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#not_test}.
	 * @param ctx the parse tree
	 */
	void enterNot_test(MyGrammarParser.Not_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#not_test}.
	 * @param ctx the parse tree
	 */
	void exitNot_test(MyGrammarParser.Not_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(MyGrammarParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(MyGrammarParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(MyGrammarParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(MyGrammarParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void enterStar_expr(MyGrammarParser.Star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void exitStar_expr(MyGrammarParser.Star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MyGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MyGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void enterXor_expr(MyGrammarParser.Xor_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void exitXor_expr(MyGrammarParser.Xor_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(MyGrammarParser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(MyGrammarParser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void enterShift_expr(MyGrammarParser.Shift_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void exitShift_expr(MyGrammarParser.Shift_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr(MyGrammarParser.Arith_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr(MyGrammarParser.Arith_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MyGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MyGrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MyGrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MyGrammarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(MyGrammarParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(MyGrammarParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtom_expr(MyGrammarParser.Atom_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtom_expr(MyGrammarParser.Atom_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(MyGrammarParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(MyGrammarParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_comp(MyGrammarParser.Testlist_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_comp(MyGrammarParser.Testlist_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailer(MyGrammarParser.TrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailer(MyGrammarParser.TrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptlist(MyGrammarParser.SubscriptlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptlist(MyGrammarParser.SubscriptlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(MyGrammarParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(MyGrammarParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#sliceop}.
	 * @param ctx the parse tree
	 */
	void enterSliceop(MyGrammarParser.SliceopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#sliceop}.
	 * @param ctx the parse tree
	 */
	void exitSliceop(MyGrammarParser.SliceopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(MyGrammarParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(MyGrammarParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#testlist}.
	 * @param ctx the parse tree
	 */
	void enterTestlist(MyGrammarParser.TestlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#testlist}.
	 * @param ctx the parse tree
	 */
	void exitTestlist(MyGrammarParser.TestlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void enterDictorsetmaker(MyGrammarParser.DictorsetmakerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void exitDictorsetmaker(MyGrammarParser.DictorsetmakerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#classdef}.
	 * @param ctx the parse tree
	 */
	void enterClassdef(MyGrammarParser.ClassdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#classdef}.
	 * @param ctx the parse tree
	 */
	void exitClassdef(MyGrammarParser.ClassdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(MyGrammarParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(MyGrammarParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(MyGrammarParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(MyGrammarParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void enterComp_iter(MyGrammarParser.Comp_iterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void exitComp_iter(MyGrammarParser.Comp_iterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#sync_comp_for}.
	 * @param ctx the parse tree
	 */
	void enterSync_comp_for(MyGrammarParser.Sync_comp_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#sync_comp_for}.
	 * @param ctx the parse tree
	 */
	void exitSync_comp_for(MyGrammarParser.Sync_comp_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void enterComp_for(MyGrammarParser.Comp_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void exitComp_for(MyGrammarParser.Comp_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#comp_if}.
	 * @param ctx the parse tree
	 */
	void enterComp_if(MyGrammarParser.Comp_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#comp_if}.
	 * @param ctx the parse tree
	 */
	void exitComp_if(MyGrammarParser.Comp_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#encoding_decl}.
	 * @param ctx the parse tree
	 */
	void enterEncoding_decl(MyGrammarParser.Encoding_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#encoding_decl}.
	 * @param ctx the parse tree
	 */
	void exitEncoding_decl(MyGrammarParser.Encoding_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void enterYield_expr(MyGrammarParser.Yield_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void exitYield_expr(MyGrammarParser.Yield_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void enterYield_arg(MyGrammarParser.Yield_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void exitYield_arg(MyGrammarParser.Yield_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#func_body_suite}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body_suite(MyGrammarParser.Func_body_suiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#func_body_suite}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body_suite(MyGrammarParser.Func_body_suiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#func_type_input}.
	 * @param ctx the parse tree
	 */
	void enterFunc_type_input(MyGrammarParser.Func_type_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#func_type_input}.
	 * @param ctx the parse tree
	 */
	void exitFunc_type_input(MyGrammarParser.Func_type_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#func_type}.
	 * @param ctx the parse tree
	 */
	void enterFunc_type(MyGrammarParser.Func_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#func_type}.
	 * @param ctx the parse tree
	 */
	void exitFunc_type(MyGrammarParser.Func_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#typelist}.
	 * @param ctx the parse tree
	 */
	void enterTypelist(MyGrammarParser.TypelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#typelist}.
	 * @param ctx the parse tree
	 */
	void exitTypelist(MyGrammarParser.TypelistContext ctx);
}