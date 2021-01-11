import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;

    public Game(){
        this.players = new ArrayList<Player>();
    }

    public void dealCardToPlayer(Player player, Deck deck) {
        Card dealtCard = deck.dealACard();
        player.addCardToHand(dealtCard);
    }

    public int getNoOfPlayers(){
        return players.size();
    }

    public void addPlayerToGame(Player player){
        players.add(player);
    }

    public Player getWinner() {
        Player winningPlayer = null;
        for (Player player: players) {
            if (winningPlayer == null){
                winningPlayer = player;
            }else if (player.getHand().getRankValueFromEnum() == winningPlayer.getHand().getRankValueFromEnum()){
                if (player.getHand().getSuitRankFromEnum() < winningPlayer.getHand().getSuitRankFromEnum()){
                    winningPlayer = player;
                }
            } else if (player.getHand().getRankValueFromEnum() > winningPlayer.getHand().getRankValueFromEnum()){
                winningPlayer = player;
            }
        }
        return winningPlayer;
    }

    public String playGame(Deck deck) {
        if (getNoOfPlayers() > 52){
            return "Too many players";
        } else {
            for (Player player: players){
                dealCardToPlayer(player,deck);
            }
            return getWinner().getName() + " wins!";
        }
    }
}
