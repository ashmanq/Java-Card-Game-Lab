import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> cards;
    private int score;

    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<Card>();
        this.score = 0;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int getScore() {
        return score;
    }

    public void receiveCard(Card card) {
        this.cards.add(card);
    }
}
