// Generated from /home/abductcows/IdeaProjects/antlrTests/src/main/antlr4/Declaration.g4 by ANTLR 4.9.2
package io.github.abductcows.antlrtests.antlr.declaration;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DeclarationParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DeclarationVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DeclarationParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(DeclarationParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeclarationParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(DeclarationParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeclarationParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(DeclarationParser.VariableNameContext ctx);
}