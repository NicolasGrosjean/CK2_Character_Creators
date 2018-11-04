import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;

public class CK2CharacterModListener extends CK2CharacterBaseListener {
	private List<Character> characters = new ArrayList<Character>();
	private Map<Integer, Character> characterDB = new HashMap<Integer, Character>();
	
	private Character currentCharacter;

	public List<Character> getCharacters() {
		return characters;
	}
	
	@Override public void enterCharacter(@NotNull CK2CharacterParser.CharacterContext ctx) {
		currentCharacter = new Character(Integer.valueOf(ctx.getChild(0).toString()));
	}
	
	@Override public void exitCharacter(@NotNull CK2CharacterParser.CharacterContext ctx) {
		characters.add(currentCharacter);
		characterDB.put(Integer.valueOf(currentCharacter.getId()), currentCharacter);
		currentCharacter = null;
	}
	
	@Override public void enterAttribute(@NotNull CK2CharacterParser.AttributeContext ctx) {
		assert(ctx.getChildCount() == 3);
		String attributeName = ctx.getChild(0).toString();
		ParseTree attributeValueTree = ctx.getChild(2);
		String attributeValue = "";
		if (attributeValueTree.getChildCount() == 3) {
			attributeValue = attributeValueTree.getChild(1).toString();
		} else if (attributeValueTree.getChildCount() == 1) {
			attributeValue = attributeValueTree.getChild(0).toString();
		}
		currentCharacter.addAttribute(attributeName, attributeValue);
	}
	
	@Override public void enterDate_attribute(@NotNull CK2CharacterParser.Date_attributeContext ctx) {
		assert(ctx.getChildCount() == 7);
		String date = ctx.getChild(0).toString();
		String attribute = ctx.getChild(3).toString();
		currentCharacter.addAttribute(attribute, date);
	}
	
	@Override public void visitErrorNode(@NotNull ErrorNode node) {
		System.err.println(node.toString());
	}
}
