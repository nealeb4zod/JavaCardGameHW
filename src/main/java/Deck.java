import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private final ArrayList<Card> createdDeck;

    public Deck() {

        createdDeck = new ArrayList<Card>();
        for (SuitType suit: SuitType.values()){
            for (RankType rank: RankType.values()) {
                 Card generatedCard = new Card(suit, rank);
                 createdDeck.add(generatedCard);
            }
        }
    }

    public int getDeckSize(){
        return createdDeck.size();
    }
    
    public boolean isCardInDeck(Card card) {
        return createdDeck.contains(card);
    }
    
    public Card getCardAtIndex(int index) {
        return createdDeck.get(index);
    }

    public ArrayList<Card> shuffle() {
        Collections.shuffle(createdDeck);
        return createdDeck;
    }

    public Card deal() {
        Card dealtCard = createdDeck.get(0);
        createdDeck.remove(dealtCard);
        return dealtCard;
    }
}
