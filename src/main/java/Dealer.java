public class Dealer {

    private String name;
    private Deck deck;

    public Dealer(String name) {
        this.name = name;
        this.deck = new Deck();
        this.deck.populate();
    }

    public String getName() {
        return this.name;
    }

    public int checkNumberOfCards() {
        return this.deck.numberOfCards();
    }

    public Card dealCard() {
        return this.deck.removeCard();
    }

    public Card getCard(int index) {
        return this.deck.getCard(index);
    }

    public void shuffleCards() {
        this.deck.shuffleCards();
    }
}
