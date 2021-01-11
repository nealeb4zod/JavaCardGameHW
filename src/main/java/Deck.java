import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private final ArrayList<Card> deck;

    public Deck() {

        deck = new ArrayList<Card>();
        for (SuitType suit: SuitType.values()){
            for (RankType rank: RankType.values()) {
                 Card card = new Card(suit, rank);
                 deck.add(card);
            }
        }
    }

    public int getDeckSize(){
        return deck.size();
    }
    
    public boolean isCardInDeck(Card card) {
        return deck.contains(card);
    }
    
    public Card getCardAtIndex(int index) {
        return deck.get(index);
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public Card dealACard() {
        Card dealtCard = deck.get(0);
        deck.remove(dealtCard);
        return dealtCard;
    }
}
