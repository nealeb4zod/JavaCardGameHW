import java.util.ArrayList;

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


    public boolean getCardFromDeck(Card card) {
        return createdDeck.contains(card);
    }


}
