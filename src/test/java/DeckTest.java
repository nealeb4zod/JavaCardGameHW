import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeckTest {

    Deck deck;
    Card queenOfClubs;

    @Before
    public void before(){
        deck = new Deck();
        queenOfClubs = new Card(SuitType.CLUBS, RankType.QUEEN);
    }

    @Test
    public void checkDeckHas52Cards(){
        assertEquals(52, deck.getDeckSize());
    }

    @Test
    public void checkDeckForCard(){
        assertTrue(deck.getCardFromDeck(queenOfClubs));
    }

    @Test
    public void checkDeckIsShuffled(){

    }
}
