import static org.junit.Assert.*;

import org.junit.Test;


public class CardTest {

	private final static int ACE = 1;
	private final static int TWO = 2;
	private final static int THREE = 3;
	private final static int FOUR = 4;
	private final static int FIVE = 5;
	private final static int SIX = 6;
	private final static int SEVEN = 7;
	private final static int EIGHT = 8;
	private final static int NINE = 9;
	private final static int TEN = 10;
	private final static int JACK = 11;
	private final static int QUEEN = 12;
	private final static int KING = 13;


	@Test
	//52種類のカードプロパティをチェックするテストコード
	public void testCheckEveryCardPropatys() {
		//スペード
		assertTrue(checkCardPropaty(Card.Suit.SPADE, ACE, Card.ACE_OF_SPADE));
		assertTrue(checkCardPropaty(Card.Suit.SPADE, TWO, Card.TWO_OF_SPADE));
		assertTrue(checkCardPropaty(Card.Suit.SPADE, THREE, Card.THREE_OF_SPADE));
		assertTrue(checkCardPropaty(Card.Suit.SPADE, FOUR, Card.FOUR_OF_SPADE));
		assertTrue(checkCardPropaty(Card.Suit.SPADE, FIVE, Card.FIVE_OF_SPADE));
		assertTrue(checkCardPropaty(Card.Suit.SPADE, SIX, Card.SIX_OF_SPADE));
		assertTrue(checkCardPropaty(Card.Suit.SPADE, SEVEN, Card.SEVEN_OF_SPADE));
		assertTrue(checkCardPropaty(Card.Suit.SPADE, EIGHT, Card.EIGHT_OF_SPADE));
		assertTrue(checkCardPropaty(Card.Suit.SPADE, NINE, Card.NINE_OF_SPADE));
		assertTrue(checkCardPropaty(Card.Suit.SPADE, TEN, Card.TEN_OF_SPADE));
		assertTrue(checkCardPropaty(Card.Suit.SPADE, JACK, Card.JACK_OF_SPADE));
		assertTrue(checkCardPropaty(Card.Suit.SPADE, QUEEN, Card.QUEEN_OF_SPADE));
		assertTrue(checkCardPropaty(Card.Suit.SPADE, KING, Card.KING_OF_SPADE));
		//ダイア
		assertTrue(checkCardPropaty(Card.Suit.DIAMONDS, ACE, Card.ACE_OF_DIAMONDS));
		assertTrue(checkCardPropaty(Card.Suit.DIAMONDS, TWO, Card.TWO_OF_DIAMONDS));
		assertTrue(checkCardPropaty(Card.Suit.DIAMONDS, THREE, Card.THREE_OF_DIAMONDS));
		assertTrue(checkCardPropaty(Card.Suit.DIAMONDS, FOUR, Card.FOUR_OF_DIAMONDS));
		assertTrue(checkCardPropaty(Card.Suit.DIAMONDS, FIVE, Card.FIVE_OF_DIAMONDS));
		assertTrue(checkCardPropaty(Card.Suit.DIAMONDS, SIX, Card.SIX_OF_DIAMONDS));
		assertTrue(checkCardPropaty(Card.Suit.DIAMONDS, SEVEN, Card.SEVEN_OF_DIAMONDS));
		assertTrue(checkCardPropaty(Card.Suit.DIAMONDS, EIGHT, Card.EIGHT_OF_DIAMONDS));
		assertTrue(checkCardPropaty(Card.Suit.DIAMONDS, NINE, Card.NINE_OF_DIAMONDS));
		assertTrue(checkCardPropaty(Card.Suit.DIAMONDS, TEN, Card.TEN_OF_DIAMONDS));
		assertTrue(checkCardPropaty(Card.Suit.DIAMONDS, JACK, Card.JACK_OF_DIAMONDS));
		assertTrue(checkCardPropaty(Card.Suit.DIAMONDS, QUEEN, Card.QUEEN_OF_DIAMONDS));
		assertTrue(checkCardPropaty(Card.Suit.DIAMONDS, KING, Card.KING_OF_DIAMONDS));
		//クラブ
		assertTrue(checkCardPropaty(Card.Suit.CLUB, ACE, Card.ACE_OF_CLUB));
		assertTrue(checkCardPropaty(Card.Suit.CLUB, TWO, Card.TWO_OF_CLUB));
		assertTrue(checkCardPropaty(Card.Suit.CLUB, THREE, Card.THREE_OF_CLUB));
		assertTrue(checkCardPropaty(Card.Suit.CLUB, FOUR, Card.FOUR_OF_CLUB));
		assertTrue(checkCardPropaty(Card.Suit.CLUB, FIVE, Card.FIVE_OF_CLUB));
		assertTrue(checkCardPropaty(Card.Suit.CLUB, SIX, Card.SIX_OF_CLUB));
		assertTrue(checkCardPropaty(Card.Suit.CLUB, SEVEN, Card.SEVEN_OF_CLUB));
		assertTrue(checkCardPropaty(Card.Suit.CLUB, EIGHT, Card.EIGHT_OF_CLUB));
		assertTrue(checkCardPropaty(Card.Suit.CLUB, NINE, Card.NINE_OF_CLUB));
		assertTrue(checkCardPropaty(Card.Suit.CLUB, TEN, Card.TEN_OF_CLUB));
		assertTrue(checkCardPropaty(Card.Suit.CLUB, JACK, Card.JACK_OF_CLUB));
		assertTrue(checkCardPropaty(Card.Suit.CLUB, QUEEN, Card.QUEEN_OF_CLUB));
		assertTrue(checkCardPropaty(Card.Suit.CLUB, KING, Card.KING_OF_CLUB));
		//ハート
		assertTrue(checkCardPropaty(Card.Suit.HEART, ACE, Card.ACE_OF_HEART));
		assertTrue(checkCardPropaty(Card.Suit.HEART, TWO, Card.TWO_OF_HEART));
		assertTrue(checkCardPropaty(Card.Suit.HEART, THREE, Card.THREE_OF_HEART));
		assertTrue(checkCardPropaty(Card.Suit.HEART, FOUR, Card.FOUR_OF_HEART));
		assertTrue(checkCardPropaty(Card.Suit.HEART, FIVE, Card.FIVE_OF_HEART));
		assertTrue(checkCardPropaty(Card.Suit.HEART, SIX, Card.SIX_OF_HEART));
		assertTrue(checkCardPropaty(Card.Suit.HEART, SEVEN, Card.SEVEN_OF_HEART));
		assertTrue(checkCardPropaty(Card.Suit.HEART, EIGHT, Card.EIGHT_OF_HEART));
		assertTrue(checkCardPropaty(Card.Suit.HEART, NINE, Card.NINE_OF_HEART));
		assertTrue(checkCardPropaty(Card.Suit.HEART, TEN, Card.TEN_OF_HEART));
		assertTrue(checkCardPropaty(Card.Suit.HEART, JACK, Card.JACK_OF_HEART));
		assertTrue(checkCardPropaty(Card.Suit.HEART, QUEEN, Card.QUEEN_OF_HEART));
		assertTrue(checkCardPropaty(Card.Suit.HEART, KING, Card.KING_OF_HEART));
	}
	
	//カードのプロパティチェック
	private boolean checkCardPropaty(
			Card.Suit expectedSuit, 
			int expectedValue,
			Card targetCard) {
		boolean checkSuit = expectedSuit.equals(targetCard.getSuit());
		boolean checkValue = (expectedValue == targetCard.getValue());
		return checkSuit && checkValue;
	}

}
