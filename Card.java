/**
 * Diese Klasse repräsentiert eine Karte (Bsp. EICHELN ASS)
 * Sie soll Instanzvariablen von Typ "Suit" und "Rank" haben,
 * einen Konstruktor, eine Methode "toString()" zur Representation
 * als Zeichenkette, sowie eine "equals(Card other)" Methode, welche
 * zurückgibt, ob die aktuelle Karte gleichen Suit und Rank wie die
 * andere Karte hat.
 */
public class Card {
	private Suit suit;
	private Rank rank;

	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return suit + " " + rank;
	}

	public boolean equals(Card other) {
		if (this.suit == other.suit && this.rank == other.rank) {
			return true;
		}
		return false;
	}
    
}
