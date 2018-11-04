import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Assert;
import org.junit.Test;

public class TestCharacterParsing {

	@Test
	public void testParseOneCharater() throws IOException {
		CK2CharacterLexer lexer = new CK2CharacterLexer(new ANTLRFileStream("tests/one_character.txt"));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CK2CharacterParser parser = new CK2CharacterParser(tokens);
		ParseTree tree = parser.character();			
		ParseTreeWalker walker = new ParseTreeWalker();
		CK2CharacterModListener listener = new CK2CharacterModListener();
	    walker.walk(listener, tree);
	    List<Character> characters = listener.getCharacters();
	    Assert.assertEquals(1, characters.size());
	    Character character = characters.get(0);
	    Assert.assertEquals(200001, character.getId());
	    Assert.assertEquals("Bernard", character.getAttribute("name"));
	    Assert.assertEquals("400100", character.getAttribute("dynasty"));
	    Assert.assertEquals("arpitan", character.getAttribute("culture"));
	    Assert.assertEquals("catholic", character.getAttribute("religion"));
	    Assert.assertEquals("4", character.getAttribute("martial"));
	    Assert.assertEquals("7", character.getAttribute("diplomacy"));
	    Assert.assertEquals("7", character.getAttribute("stewardship"));
	    Assert.assertEquals("3", character.getAttribute("intrigue"));
	    Assert.assertEquals("4", character.getAttribute("learning"));
	    Assert.assertEquals("1270.10.20", character.getAttribute("birth"));
	    Assert.assertEquals("1336.10.20", character.getAttribute("death"));
	    Assert.assertEquals(2, character.getTraits().size());
	    Assert.assertEquals("flamboyant_schemer", character.getTraits().get(0));
	    Assert.assertEquals("greedy", character.getTraits().get(1));
	    Assert.assertEquals(0, character.getChildren().size());
	    Assert.assertEquals(0, character.getSpouses().size());
	    Assert.assertEquals(null, character.getFather());
	    Assert.assertEquals(null, character.getMother());
	}

}
