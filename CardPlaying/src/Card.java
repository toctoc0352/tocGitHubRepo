

public class Card {
	private Suit suit;
	private int value;
	
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
	
	public enum Suit{
		SPADE,DIAMONDS,CLUB,HEART
	}
	//スペード
	public static final Card ACE_OF_SPADE = new Card(Suit.SPADE,ACE);
	public static final Card TWO_OF_SPADE = new Card(Suit.SPADE,TWO);
	public static final Card THREE_OF_SPADE = new Card(Suit.SPADE,THREE);
	public static final Card FOUR_OF_SPADE = new Card(Suit.SPADE,FOUR);
	public static final Card FIVE_OF_SPADE = new Card(Suit.SPADE,FIVE);
	public static final Card SIX_OF_SPADE = new Card(Suit.SPADE,SIX);
	public static final Card SEVEN_OF_SPADE = new Card(Suit.SPADE,SEVEN);
	public static final Card EIGHT_OF_SPADE = new Card(Suit.SPADE,EIGHT);
	public static final Card NINE_OF_SPADE = new Card(Suit.SPADE,NINE);
	public static final Card TEN_OF_SPADE = new Card(Suit.SPADE,TEN);
	public static final Card JACK_OF_SPADE = new Card(Suit.SPADE,JACK);
	public static final Card QUEEN_OF_SPADE = new Card(Suit.SPADE,QUEEN);
	public static final Card KING_OF_SPADE = new Card(Suit.SPADE,KING);

	//ダイア
	public static final Card ACE_OF_DIAMONDS = new Card(Suit.DIAMONDS,ACE);
	public static final Card TWO_OF_DIAMONDS = new Card(Suit.DIAMONDS,TWO);
	public static final Card THREE_OF_DIAMONDS = new Card(Suit.DIAMONDS,THREE);
	public static final Card FOUR_OF_DIAMONDS = new Card(Suit.DIAMONDS,FOUR);
	public static final Card FIVE_OF_DIAMONDS = new Card(Suit.DIAMONDS,FIVE);
	public static final Card SIX_OF_DIAMONDS = new Card(Suit.DIAMONDS,SIX);
	public static final Card SEVEN_OF_DIAMONDS = new Card(Suit.DIAMONDS,SEVEN);
	public static final Card EIGHT_OF_DIAMONDS = new Card(Suit.DIAMONDS,EIGHT);
	public static final Card NINE_OF_DIAMONDS = new Card(Suit.DIAMONDS,NINE);
	public static final Card TEN_OF_DIAMONDS = new Card(Suit.DIAMONDS,TEN);
	public static final Card JACK_OF_DIAMONDS = new Card(Suit.DIAMONDS,JACK);
	public static final Card QUEEN_OF_DIAMONDS = new Card(Suit.DIAMONDS,QUEEN);
	public static final Card KING_OF_DIAMONDS = new Card(Suit.DIAMONDS,KING);

	//クラブ
	public static final Card ACE_OF_CLUB = new Card(Suit.CLUB,ACE);
	public static final Card TWO_OF_CLUB = new Card(Suit.CLUB,TWO);
	public static final Card THREE_OF_CLUB = new Card(Suit.CLUB,THREE);
	public static final Card FOUR_OF_CLUB = new Card(Suit.CLUB,FOUR);
	public static final Card FIVE_OF_CLUB = new Card(Suit.CLUB,FIVE);
	public static final Card SIX_OF_CLUB = new Card(Suit.CLUB,SIX);
	public static final Card SEVEN_OF_CLUB = new Card(Suit.CLUB,SEVEN);
	public static final Card EIGHT_OF_CLUB = new Card(Suit.CLUB,EIGHT);
	public static final Card NINE_OF_CLUB = new Card(Suit.CLUB,NINE);
	public static final Card TEN_OF_CLUB = new Card(Suit.CLUB,TEN);
	public static final Card JACK_OF_CLUB = new Card(Suit.CLUB,JACK);
	public static final Card QUEEN_OF_CLUB = new Card(Suit.CLUB,QUEEN);
	public static final Card KING_OF_CLUB = new Card(Suit.CLUB,KING);

	//ハート
	public static final Card ACE_OF_HEART = new Card(Suit.HEART,ACE);
	public static final Card TWO_OF_HEART = new Card(Suit.HEART,TWO);
	public static final Card THREE_OF_HEART = new Card(Suit.HEART,THREE);
	public static final Card FOUR_OF_HEART = new Card(Suit.HEART,FOUR);
	public static final Card FIVE_OF_HEART = new Card(Suit.HEART,FIVE);
	public static final Card SIX_OF_HEART = new Card(Suit.HEART,SIX);
	public static final Card SEVEN_OF_HEART = new Card(Suit.HEART,SEVEN);
	public static final Card EIGHT_OF_HEART = new Card(Suit.HEART,EIGHT);
	public static final Card NINE_OF_HEART = new Card(Suit.HEART,NINE);
	public static final Card TEN_OF_HEART = new Card(Suit.HEART,TEN);
	public static final Card JACK_OF_HEART = new Card(Suit.HEART,JACK);
	public static final Card QUEEN_OF_HEART = new Card(Suit.HEART,QUEEN);
	public static final Card KING_OF_HEART = new Card(Suit.HEART,KING);

	private Card(Suit suit, int value) {
		this.suit = suit;
		this.value = value;
	}

	public Suit getSuit() {
		return this.suit;
	}

	public int getValue() {
		return this.value;
	}

}
