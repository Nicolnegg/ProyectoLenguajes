// Generated from C:/Users/princ/IdeaProjects/ProyectoLenguajes/grammar\MyGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#single_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_input(MyGrammarParser.Single_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#file_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_input(MyGrammarParser.File_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#eval_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval_input(MyGrammarParser.Eval_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(MyGrammarParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#decorators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorators(MyGrammarParser.DecoratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#decorated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorated(MyGrammarParser.DecoratedContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#async_funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsync_funcdef(MyGrammarParser.Async_funcdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(MyGrammarParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(MyGrammarParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#typedargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedargslist(MyGrammarParser.TypedargslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#tfpdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTfpdef(MyGrammarParser.TfpdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#varargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarargslist(MyGrammarParser.VarargslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#vfpdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVfpdef(MyGrammarParser.VfpdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(MyGrammarParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(MyGrammarParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmall_stmt(MyGrammarParser.Small_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(MyGrammarParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#annassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnassign(MyGrammarParser.AnnassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_star_expr(MyGrammarParser.Testlist_star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugassign(MyGrammarParser.AugassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#del_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDel_stmt(MyGrammarParser.Del_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#pass_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_stmt(MyGrammarParser.Pass_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow_stmt(MyGrammarParser.Flow_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(MyGrammarParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(MyGrammarParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(MyGrammarParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#yield_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_stmt(MyGrammarParser.Yield_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#raise_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_stmt(MyGrammarParser.Raise_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmt(MyGrammarParser.Import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#import_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_name(MyGrammarParser.Import_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#import_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_from(MyGrammarParser.Import_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#import_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_name(MyGrammarParser.Import_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#dotted_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_name(MyGrammarParser.Dotted_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#import_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_names(MyGrammarParser.Import_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#dotted_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_names(MyGrammarParser.Dotted_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#dotted_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_name(MyGrammarParser.Dotted_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#global_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_stmt(MyGrammarParser.Global_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonlocal_stmt(MyGrammarParser.Nonlocal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#assert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssert_stmt(MyGrammarParser.Assert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(MyGrammarParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#async_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsync_stmt(MyGrammarParser.Async_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(MyGrammarParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(MyGrammarParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(MyGrammarParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#try_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_stmt(MyGrammarParser.Try_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#with_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_stmt(MyGrammarParser.With_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#with_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_item(MyGrammarParser.With_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#except_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept_clause(MyGrammarParser.Except_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(MyGrammarParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#namedexpr_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedexpr_test(MyGrammarParser.Namedexpr_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(MyGrammarParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#test_nocond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest_nocond(MyGrammarParser.Test_nocondContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#lambdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdef(MyGrammarParser.LambdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#lambdef_nocond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdef_nocond(MyGrammarParser.Lambdef_nocondContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#or_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_test(MyGrammarParser.Or_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#and_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_test(MyGrammarParser.And_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#not_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_test(MyGrammarParser.Not_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(MyGrammarParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(MyGrammarParser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar_expr(MyGrammarParser.Star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MyGrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#xor_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_expr(MyGrammarParser.Xor_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#and_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expr(MyGrammarParser.And_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#shift_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expr(MyGrammarParser.Shift_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#arith_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_expr(MyGrammarParser.Arith_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(MyGrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(MyGrammarParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(MyGrammarParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#atom_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_expr(MyGrammarParser.Atom_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(MyGrammarParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#testlist_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_comp(MyGrammarParser.Testlist_compContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailer(MyGrammarParser.TrailerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#subscriptlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptlist(MyGrammarParser.SubscriptlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(MyGrammarParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#sliceop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceop(MyGrammarParser.SliceopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(MyGrammarParser.ExprlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#testlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist(MyGrammarParser.TestlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictorsetmaker(MyGrammarParser.DictorsetmakerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#classdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdef(MyGrammarParser.ClassdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(MyGrammarParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(MyGrammarParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#comp_iter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_iter(MyGrammarParser.Comp_iterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#sync_comp_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSync_comp_for(MyGrammarParser.Sync_comp_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#comp_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_for(MyGrammarParser.Comp_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#comp_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_if(MyGrammarParser.Comp_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#encoding_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncoding_decl(MyGrammarParser.Encoding_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#yield_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_expr(MyGrammarParser.Yield_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#yield_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_arg(MyGrammarParser.Yield_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#func_body_suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body_suite(MyGrammarParser.Func_body_suiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#func_type_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_type_input(MyGrammarParser.Func_type_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#func_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_type(MyGrammarParser.Func_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#typelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypelist(MyGrammarParser.TypelistContext ctx);
}