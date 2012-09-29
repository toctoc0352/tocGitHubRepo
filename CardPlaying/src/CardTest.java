import static org.junit.Assert.*;

import org.junit.Test;


public class CardTest {

	@Test
	//スペードのエースのプロパティチェック
	public void testCheckAceOfSpadePropatys() {
        int value = 1;
		assertEquals(Card.Suit.SPADE, Card.ACE_OF_SPADE.getSuit());
		assertEquals(value, Card.ACE_OF_SPADE.getValue());
	}

}
