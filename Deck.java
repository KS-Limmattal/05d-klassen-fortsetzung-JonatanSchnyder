import java.util.Random;
import java.util.Arrays;
import java.lang.*;

/**
 * Diese Klasse repräsentiert einen Kartenstapel mit einer variablen Anzahl
 * Karten * Sie soll ein Array von Typ Card als Instanzvariable haben,
 * - einen Konstruktor Deck(Card[] cards), welches eine Instanz bestehend aus
 * den gegebenen Karten kreiert,
 * - einen Konstruktor Deck(), welcher ein vollständiges Kartenset (4x9 Karten)
 * erzeugt,
 * - einen (trivialen) Getter getCards()
 * - eine Methode addCard(Card card), welche zum Deck eine Karte hinzufügt,
 * falls diese noch nicht im Deck enthalten ist und andernfalls eine Warnung auf
 * der Konsole ausgibt
 * - eine Methode pop(), welche die letzte Karte im Array aus dem Deck entfernt,
 * sofern Karten vorhanden sind
 * - eine Methode shuffle(), welche die Karten im Array durchmischt
 * 
 * Tipps:
 * - Um ein Array zu redimensionieren, verwende den Befehl "Arrays.copyOf" aus
 * java.util.Arrays
 * - Um eine zufällige Ganzzahl in einem gegebenen Bereich zu erzeugen, verwende
 * "rnd.nextInt", wobei "rnd" eine Instanz der Klasse "Random" aus
 * "java.util.Random" bezeichnet
 *
 */
public class Deck {
	private Card[] cards;

	public Deck(Card[] cards) {
		this.cards = cards;
	}

	public Deck() {
		this.cards = new Card[36];

		int counter = 0;
		for (Suit suit: Suit.values()){
			for (Rank rank: Rank.values()) {
				// this.cards[counter].suit = suit; // this code is private
				// this.cards[counter].rank = rank;
				this.cards[counter] = new Card(suit ,rank );
				counter++;
			}
		}
	}

	public Card[] getCards() {
		return this.cards;
	}

	public void addCard(Card othcard) {
		for (Card mycard: this.cards) {
			if (mycard.equals(othcard)) {
				System.out.println("This card already exists in the Deck");
				return;
			}
		}
		Card []newcard = new Card[this.cards.length + 1];
		System.arraycopy(this.cards, 0, newcard, 0, this.cards.length + 1);
		this.cards = newcard;
		this.cards[this.cards.length - 1] = othcard;

		return;
	}


    
}
