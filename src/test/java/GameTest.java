import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GameTest {

    Game game;
    Deck deck;
    Player player1;
    Player player2;
    Player player3;
    Player player4;
    Card queenOfClubs;
    Card aceOfHearts;
    Card queenOfDiamonds;
    Card kingOfSpades;
    Card threeOfSpades;

    @Before
    public void before(){
        game = new Game();
        deck = new Deck();
        player1 = new Player("Neale");
        player2 = new Player("Rosie");
        player3 = new Player("Emilia");
        player4 = new Player("Tom");
        queenOfClubs = new Card(SuitType.CLUBS, RankType.QUEEN);
        aceOfHearts = new Card(SuitType.HEARTS, RankType.ACE);
        queenOfDiamonds = new Card(SuitType.DIAMONDS, RankType.QUEEN);
        kingOfSpades = new Card(SuitType.SPADES, RankType.KING);
        threeOfSpades = new Card(SuitType.SPADES, RankType.THREE);
    }

    @Test
    public void canDealCardToPlayer(){
        game.dealCardToPlayer(player1, deck);
        assertNotEquals(null, player1.getHand());
    }

    @Test
    public void canAddPlayerToGame(){
        game.addPlayerToGame(player1);
        assertEquals(1, game.getNoOfPlayers());
    }

    @Test
    public void canDetermineWinnerDifferentCards(){
        player1.addCardToHand(queenOfClubs);
        player2.addCardToHand(aceOfHearts);
        player3.addCardToHand(kingOfSpades);
        player4.addCardToHand(threeOfSpades);
        game.addPlayerToGame(player1);
        game.addPlayerToGame(player2);
        game.addPlayerToGame(player3);
        game.addPlayerToGame(player4);
        assertEquals(player3, game.getWinner());
    }

    @Test
    public void canDetermineWinnerSameRanks(){
        player1.addCardToHand(queenOfClubs);
        player2.addCardToHand(aceOfHearts);
        player3.addCardToHand(queenOfDiamonds);
        player4.addCardToHand(threeOfSpades);
        game.addPlayerToGame(player1);
        game.addPlayerToGame(player2);
        game.addPlayerToGame(player3);
        game.addPlayerToGame(player4);
        assertEquals(player1, game.getWinner());
    }
}
