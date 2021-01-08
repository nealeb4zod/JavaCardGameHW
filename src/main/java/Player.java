import jdk.nashorn.api.scripting.ScriptObjectMirror;

import java.util.ArrayList;

public class Player {


    private String name;
    private Card hand;

    public Player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCardToHand(Card card) {
        hand = card;
    }

    public Card getHand() {
        return hand;
    }
}
