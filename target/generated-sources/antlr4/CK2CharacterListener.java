// Generated from CK2Character.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CK2CharacterParser}.
 */
public interface CK2CharacterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CK2CharacterParser#characters}.
	 * @param ctx the parse tree
	 */
	void enterCharacters(@NotNull CK2CharacterParser.CharactersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CK2CharacterParser#characters}.
	 * @param ctx the parse tree
	 */
	void exitCharacters(@NotNull CK2CharacterParser.CharactersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CK2CharacterParser#date_attribute}.
	 * @param ctx the parse tree
	 */
	void enterDate_attribute(@NotNull CK2CharacterParser.Date_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CK2CharacterParser#date_attribute}.
	 * @param ctx the parse tree
	 */
	void exitDate_attribute(@NotNull CK2CharacterParser.Date_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CK2CharacterParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(@NotNull CK2CharacterParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CK2CharacterParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(@NotNull CK2CharacterParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CK2CharacterParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(@NotNull CK2CharacterParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CK2CharacterParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(@NotNull CK2CharacterParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CK2CharacterParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull CK2CharacterParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CK2CharacterParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull CK2CharacterParser.ValueContext ctx);
}