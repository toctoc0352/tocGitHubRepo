import static org.junit.Assert.*;
import org.junit.Test;


public class DeckTest {

	@Test
	//52枚のカードがカードデッキにあること
	public void testVerifyDeckContains52Cards() {
		Deck deck = new Deck();
		assertEquals(52, deck.count());
	}
	@Test
	//52種類のカードがすべてデッキにあること
	public void testEveryCardInTheDeck() {
		Deck deck = new Deck();
		//スペード
		assertTrue(deck.contains(Card.ACE_OF_SPADE));
		assertTrue(deck.contains(Card.TWO_OF_SPADE));
		assertTrue(deck.contains(Card.THREE_OF_SPADE));
		assertTrue(deck.contains(Card.FOUR_OF_SPADE));
		assertTrue(deck.contains(Card.FIVE_OF_SPADE));
		assertTrue(deck.contains(Card.SIX_OF_SPADE));
		assertTrue(deck.contains(Card.SEVEN_OF_SPADE));
		assertTrue(deck.contains(Card.EIGHT_OF_SPADE));
		assertTrue(deck.contains(Card.NINE_OF_SPADE));
		assertTrue(deck.contains(Card.TEN_OF_SPADE));
		assertTrue(deck.contains(Card.JACK_OF_SPADE));
		assertTrue(deck.contains(Card.QUEEN_OF_SPADE));
		assertTrue(deck.contains(Card.KING_OF_SPADE));
		//ダイア
		assertTrue(deck.contains(Card.ACE_OF_DIAMONDS));
		assertTrue(deck.contains(Card.TWO_OF_DIAMONDS));
		assertTrue(deck.contains(Card.THREE_OF_DIAMONDS));
		assertTrue(deck.contains(Card.FOUR_OF_DIAMONDS));
		assertTrue(deck.contains(Card.FIVE_OF_DIAMONDS));
		assertTrue(deck.contains(Card.SIX_OF_DIAMONDS));
		assertTrue(deck.contains(Card.SEVEN_OF_DIAMONDS));
		assertTrue(deck.contains(Card.EIGHT_OF_DIAMONDS));
		assertTrue(deck.contains(Card.NINE_OF_DIAMONDS));
		assertTrue(deck.contains(Card.TEN_OF_DIAMONDS));
		assertTrue(deck.contains(Card.JACK_OF_DIAMONDS));
		assertTrue(deck.contains(Card.QUEEN_OF_DIAMONDS));
		assertTrue(deck.contains(Card.KING_OF_DIAMONDS));
		//クラブ
		assertTrue(deck.contains(Card.ACE_OF_CLUB));
		assertTrue(deck.contains(Card.TWO_OF_CLUB));
		assertTrue(deck.contains(Card.THREE_OF_CLUB));
		assertTrue(deck.contains(Card.FOUR_OF_CLUB));
		assertTrue(deck.contains(Card.FIVE_OF_CLUB));
		assertTrue(deck.contains(Card.SIX_OF_CLUB));
		assertTrue(deck.contains(Card.SEVEN_OF_CLUB));
		assertTrue(deck.contains(Card.EIGHT_OF_CLUB));
		assertTrue(deck.contains(Card.NINE_OF_CLUB));
		assertTrue(deck.contains(Card.TEN_OF_CLUB));
		assertTrue(deck.contains(Card.JACK_OF_CLUB));
		assertTrue(deck.contains(Card.QUEEN_OF_CLUB));
		assertTrue(deck.contains(Card.KING_OF_CLUB));
		//ハート
		assertTrue(deck.contains(Card.ACE_OF_HEART));
		assertTrue(deck.contains(Card.TWO_OF_HEART));
		assertTrue(deck.contains(Card.THREE_OF_HEART));
		assertTrue(deck.contains(Card.FOUR_OF_HEART));
		assertTrue(deck.contains(Card.FIVE_OF_HEART));
		assertTrue(deck.contains(Card.SIX_OF_HEART));
		assertTrue(deck.contains(Card.SEVEN_OF_HEART));
		assertTrue(deck.contains(Card.EIGHT_OF_HEART));
		assertTrue(deck.contains(Card.NINE_OF_HEART));
		assertTrue(deck.contains(Card.TEN_OF_HEART));
		assertTrue(deck.contains(Card.JACK_OF_HEART));
		assertTrue(deck.contains(Card.QUEEN_OF_HEART));
		assertTrue(deck.contains(Card.KING_OF_HEART));
	}
/*
	@Test
	//スートごとにカードが13枚あること
	public void testVerifyDeckContainsThirteenCardsForEachSuit() {
		Deck deck = new Deck();
		assertEquals(13, deck.NumberOfHearts());
		assertEquals(13, deck.NumberOfClubs());
		assertEquals(13, deck.NumberOfDiamonds());
		assertEquals(13, deck.NumberOfSpades());
	}
*/
}
