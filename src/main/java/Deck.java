import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public int numberOfCards() {
        return this.cards.size();
    }

    public void populate() {
        for(SuitType suit : SuitType.values()) {
            for(RankType rank : RankType.values()) {
                Card card = new Card(suit, rank);
                this.cards.add(card);
            }
        }
    }

    public Card getCard(int index) {
        return this.cards.get(index);
    }

    public void shuffleCards() {
        Collections.shuffle(this.cards);
    }

    public ArrayList<Card> getAllCards() {
        return this.cards;
    }

    public Card removeCard() {
        return this.cards.remove(0);
    }


//    for(SuitType suit : SuitType.values()) {
////            System.out.println(suit);
//        for(RankType rank : RankType.values()) {
//            Card card = new Card(suit, rank);
//            cards.add(card);
////                System.out.println(suit);
////                System.out.println(rank);
//        }
//    }
}
