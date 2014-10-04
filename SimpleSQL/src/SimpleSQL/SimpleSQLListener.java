// Generated from SimpleSQL.g4 by ANTLR 4.4

    package SimpleSQL;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleSQLParser}.
 */
public interface SimpleSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleSQLParser#projections}.
	 * @param ctx the parse tree
	 */
	void enterProjections(@NotNull SimpleSQLParser.ProjectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSQLParser#projections}.
	 * @param ctx the parse tree
	 */
	void exitProjections(@NotNull SimpleSQLParser.ProjectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSQLParser#tableField}.
	 * @param ctx the parse tree
	 */
	void enterTableField(@NotNull SimpleSQLParser.TableFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSQLParser#tableField}.
	 * @param ctx the parse tree
	 */
	void exitTableField(@NotNull SimpleSQLParser.TableFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSQLParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(@NotNull SimpleSQLParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSQLParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(@NotNull SimpleSQLParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSQLParser#relationFragment}.
	 * @param ctx the parse tree
	 */
	void enterRelationFragment(@NotNull SimpleSQLParser.RelationFragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSQLParser#relationFragment}.
	 * @param ctx the parse tree
	 */
	void exitRelationFragment(@NotNull SimpleSQLParser.RelationFragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSQLParser#joinStatement}.
	 * @param ctx the parse tree
	 */
	void enterJoinStatement(@NotNull SimpleSQLParser.JoinStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSQLParser#joinStatement}.
	 * @param ctx the parse tree
	 */
	void exitJoinStatement(@NotNull SimpleSQLParser.JoinStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSQLParser#qualifiedField}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedField(@NotNull SimpleSQLParser.QualifiedFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSQLParser#qualifiedField}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedField(@NotNull SimpleSQLParser.QualifiedFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSQLParser#selections}.
	 * @param ctx the parse tree
	 */
	void enterSelections(@NotNull SimpleSQLParser.SelectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSQLParser#selections}.
	 * @param ctx the parse tree
	 */
	void exitSelections(@NotNull SimpleSQLParser.SelectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSQLParser#selection}.
	 * @param ctx the parse tree
	 */
	void enterSelection(@NotNull SimpleSQLParser.SelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSQLParser#selection}.
	 * @param ctx the parse tree
	 */
	void exitSelection(@NotNull SimpleSQLParser.SelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSQLParser#fieldIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldIdentifier(@NotNull SimpleSQLParser.FieldIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSQLParser#fieldIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldIdentifier(@NotNull SimpleSQLParser.FieldIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSQLParser#tablePrefix}.
	 * @param ctx the parse tree
	 */
	void enterTablePrefix(@NotNull SimpleSQLParser.TablePrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSQLParser#tablePrefix}.
	 * @param ctx the parse tree
	 */
	void exitTablePrefix(@NotNull SimpleSQLParser.TablePrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull SimpleSQLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull SimpleSQLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSQLParser#projectionFragment}.
	 * @param ctx the parse tree
	 */
	void enterProjectionFragment(@NotNull SimpleSQLParser.ProjectionFragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSQLParser#projectionFragment}.
	 * @param ctx the parse tree
	 */
	void exitProjectionFragment(@NotNull SimpleSQLParser.ProjectionFragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSQLParser#fieldComparison}.
	 * @param ctx the parse tree
	 */
	void enterFieldComparison(@NotNull SimpleSQLParser.FieldComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSQLParser#fieldComparison}.
	 * @param ctx the parse tree
	 */
	void exitFieldComparison(@NotNull SimpleSQLParser.FieldComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSQLParser#relations}.
	 * @param ctx the parse tree
	 */
	void enterRelations(@NotNull SimpleSQLParser.RelationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSQLParser#relations}.
	 * @param ctx the parse tree
	 */
	void exitRelations(@NotNull SimpleSQLParser.RelationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleSQLParser#selectionFragment}.
	 * @param ctx the parse tree
	 */
	void enterSelectionFragment(@NotNull SimpleSQLParser.SelectionFragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleSQLParser#selectionFragment}.
	 * @param ctx the parse tree
	 */
	void exitSelectionFragment(@NotNull SimpleSQLParser.SelectionFragmentContext ctx);
}