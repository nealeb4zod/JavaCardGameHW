import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
        assertTrue(deck.isCardInDeck(queenOfClubs));
    }

    @Test
    public void getCardAtIndex(){
        assertEquals(queenOfClubs, deck.getCardAtIndex(37));
    }

    @Test
    public void checkDeckIsShuffled(){
        deck.shuffle();
        assertNotEquals(queenOfClubs, deck.getCardAtIndex(37));
    }

    @Test
    public void checkDealReturnsCardAtIndexZero(){
        deck.shuffle();
        Card cardAtIndexZero = deck.getCardAtIndex(0);
        assertEquals(cardAtIndexZero, deck.deal());
    }

    @Test
    public void checkDealRemovesCardFromDeck(){
        deck.shuffle();
        Card dealtCard = deck.deal();
        assertFalse(deck.isCardInDeck(dealtCard));
    }
}
