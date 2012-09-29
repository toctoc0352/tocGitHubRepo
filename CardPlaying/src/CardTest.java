import static org.junit.Assert.*;

import org.junit.Test;


public class CardTest {

	@Test
	//スペードのエースのプロパティチェック
	public void testCheckAceOfSpadePropatys() {
        int value = 1;
		Card card = Card.ACE_OF_SPADE;
		assertEquals(Card.Suit.SPADE, card.getSuit());
		assertEquals(value, card.getValue());
	}

}
