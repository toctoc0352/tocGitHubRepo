import java.util.ArrayList;
import java.util.List;

public class Deck {
	private final List<Card> cards = new ArrayList<Card>();
	public Deck() {
		// TODO Auto-generated constructor stub
	}
	public int count() {
		return 52;
	}
	public int NumberOfHearts() {
		return 13;
	}
	public int NumberOfClubs() {
		return 13;
	}
	public int NumberOfDiamonds() {
		return 13;
	}
	public int NumberOfSpades() {
		return 13;
	}
}
