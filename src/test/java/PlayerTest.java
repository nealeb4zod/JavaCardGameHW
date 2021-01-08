import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PlayerTest {

    Deck deck;
    Player player;
    Card queenOfClubs;

    @Before
    public void before(){
        deck = new Deck();
        player = new Player("Neale");
        queenOfClubs = new Card(SuitType.CLUBS, RankType.QUEEN);
    }

    @Test
    public void checkPlayerHasName(){
        assertEquals("Neale", player.getName());
    }

    @Test
    public void checkPlayerHandIsEmptyAtStart(){
        assertNull(player.getHand());
    }

    @Test
    public void checkCanAddCardToHand(){
        player.addCardToHand(queenOfClubs);
        assertEquals(queenOfClubs, player.getHand());
    }

}
