import java.util.ArrayList;
import java.util.List;

public class Deck {
	private final List<Card> cards = new ArrayList<Card>();
	public Deck() {
		//スペード
		cards.add(Card.ACE_OF_SPADE);
		cards.add(Card.TWO_OF_SPADE);
		cards.add(Card.THREE_OF_SPADE);
		cards.add(Card.FOUR_OF_SPADE);
		cards.add(Card.FIVE_OF_SPADE);
		cards.add(Card.SIX_OF_SPADE);
		cards.add(Card.SEVEN_OF_SPADE);
		cards.add(Card.EIGHT_OF_SPADE);
		cards.add(Card.NINE_OF_SPADE);
		cards.add(Card.TEN_OF_SPADE);
		cards.add(Card.JACK_OF_SPADE);
		cards.add(Card.QUEEN_OF_SPADE);
		cards.add(Card.KING_OF_SPADE);
		//ダイア
		cards.add(Card.ACE_OF_DIAMONDS);
		cards.add(Card.TWO_OF_DIAMONDS);
		cards.add(Card.THREE_OF_DIAMONDS);
		cards.add(Card.FOUR_OF_DIAMONDS);
		cards.add(Card.FIVE_OF_DIAMONDS);
		cards.add(Card.SIX_OF_DIAMONDS);
		cards.add(Card.SEVEN_OF_DIAMONDS);
		cards.add(Card.EIGHT_OF_DIAMONDS);
		cards.add(Card.NINE_OF_DIAMONDS);
		cards.add(Card.TEN_OF_DIAMONDS);
		cards.add(Card.JACK_OF_DIAMONDS);
		cards.add(Card.QUEEN_OF_DIAMONDS);
		cards.add(Card.KING_OF_DIAMONDS);
		//クラブ
		cards.add(Card.ACE_OF_CLUB);
		cards.add(Card.TWO_OF_CLUB);
		cards.add(Card.THREE_OF_CLUB);
		cards.add(Card.FOUR_OF_CLUB);
		cards.add(Card.FIVE_OF_CLUB);
		cards.add(Card.SIX_OF_CLUB);
		cards.add(Card.SEVEN_OF_CLUB);
		cards.add(Card.EIGHT_OF_CLUB);
		cards.add(Card.NINE_OF_CLUB);
		cards.add(Card.TEN_OF_CLUB);
		cards.add(Card.JACK_OF_CLUB);
		cards.add(Card.QUEEN_OF_CLUB);
		cards.add(Card.KING_OF_CLUB);
		//ハート
		cards.add(Card.ACE_OF_HEART);
		cards.add(Card.TWO_OF_HEART);
		cards.add(Card.THREE_OF_HEART);
		cards.add(Card.FOUR_OF_HEART);
		cards.add(Card.FIVE_OF_HEART);
		cards.add(Card.SIX_OF_HEART);
		cards.add(Card.SEVEN_OF_HEART);
		cards.add(Card.EIGHT_OF_HEART);
		cards.add(Card.NINE_OF_HEART);
		cards.add(Card.TEN_OF_HEART);
		cards.add(Card.JACK_OF_HEART);
		cards.add(Card.QUEEN_OF_HEART);
		cards.add(Card.KING_OF_HEART);
	}
	public int count() {
		List<Card> cards = this.cards;
		int count = cards.size();
		return count;
	}
	public boolean contains(Card card) {
		List<Card> cards = this.cards;
		boolean isCard = cards.contains(card);
		return isCard;
	}
}
