import static org.junit.Assert.*;
import org.junit.Test;


public class DeckTest {

	@Test
	public void testVerifyDeckContains52Cards() {
		Deck deck = new Deck();
		assertEquals(52, deck.count());
	}

}
