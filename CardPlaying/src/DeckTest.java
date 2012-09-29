import static org.junit.Assert.*;
import org.junit.Test;


public class DeckTest {

	@Test
	public void testVerifyDeckContains52Cards() {
		Deck deck = new Deck();
		assertEquals(52, deck.count());
	}
	@Test
	public void testVerifyDeckContainsThirteenCardsForEachSuit() {
		Deck deck = new Deck();
		assertEquals(13, deck.NumberOfHearts());
		assertEquals(13, deck.NumberOfClubs());
		assertEquals(13, deck.NumberOfDiamonds());
		assertEquals(13, deck.NumberOfSpades());
	}

}
