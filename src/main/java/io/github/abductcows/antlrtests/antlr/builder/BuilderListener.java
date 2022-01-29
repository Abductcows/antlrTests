// Generated from /home/abductcows/IdeaProjects/antlrTests/src/main/antlr4/Builder.g4 by ANTLR 4.9.2
package io.github.abductcows.antlrtests.antlr.builder;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BuilderParser}.
 */
public interface BuilderListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BuilderParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(BuilderParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BuilderParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(BuilderParser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BuilderParser#class_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_name(BuilderParser.Class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BuilderParser#class_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_name(BuilderParser.Class_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BuilderParser#members}.
	 * @param ctx the parse tree
	 */
	void enterMembers(BuilderParser.MembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link BuilderParser#members}.
	 * @param ctx the parse tree
	 */
	void exitMembers(BuilderParser.MembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link BuilderParser#member_line}.
	 * @param ctx the parse tree
	 */
	void enterMember_line(BuilderParser.Member_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link BuilderParser#member_line}.
	 * @param ctx the parse tree
	 */
	void exitMember_line(BuilderParser.Member_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link BuilderParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(BuilderParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BuilderParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(BuilderParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BuilderParser#required_members}.
	 * @param ctx the parse tree
	 */
	void enterRequired_members(BuilderParser.Required_membersContext ctx);
	/**
	 * Exit a parse tree produced by {@link BuilderParser#required_members}.
	 * @param ctx the parse tree
	 */
	void exitRequired_members(BuilderParser.Required_membersContext ctx);
	/**
	 * Enter a parse tree produced by {@link BuilderParser#optional_members}.
	 * @param ctx the parse tree
	 */
	void enterOptional_members(BuilderParser.Optional_membersContext ctx);
	/**
	 * Exit a parse tree produced by {@link BuilderParser#optional_members}.
	 * @param ctx the parse tree
	 */
	void exitOptional_members(BuilderParser.Optional_membersContext ctx);
	/**
	 * Enter a parse tree produced by {@link BuilderParser#declaration_separator}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_separator(BuilderParser.Declaration_separatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BuilderParser#declaration_separator}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_separator(BuilderParser.Declaration_separatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BuilderParser#member_separator}.
	 * @param ctx the parse tree
	 */
	void enterMember_separator(BuilderParser.Member_separatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BuilderParser#member_separator}.
	 * @param ctx the parse tree
	 */
	void exitMember_separator(BuilderParser.Member_separatorContext ctx);
}