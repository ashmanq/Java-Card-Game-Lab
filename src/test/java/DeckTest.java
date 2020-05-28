import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    Deck deck;
    Card card;
    Card actualCard;
    Card shuffledCard;

    @Before
    public void setUp() {
        deck = new Deck();
    }

    @Test
    public void cardArrayListStartsEmpty() {
        assertEquals(0, deck.numberOfCards());
    }

    @Test
    public void populatesDeckWith52Cards() {
        deck.populate();
        assertEquals(52, deck.numberOfCards());
    }

    @Test
    public void canGetCard() {
        deck.populate();
        actualCard = deck.getCard(0);
        assertEquals(SuitType.HEARTS, actualCard.getSuit());
        assertEquals(RankType.ACE, actualCard.getRank());
    }

    @Test
    public void canShuffleDeck() {
        deck.populate();
        card = deck.getCard(0);
        deck.shuffleCards();
        shuffledCard = deck.getCard(0);
        assertNotEquals(card.getRank(), shuffledCard.getRank());
    }

    @Test
    public void canGetAllCards() {
        deck.populate();
        assertEquals(52, deck.getAllCards().size());
    }

    @Test
    public void canShuffleDeckTestCardByIndex() {
        deck.populate();
        card = deck.getCard(0);
        deck.shuffleCards();
        assertNotEquals(0, deck.getAllCards().indexOf(card));
    }

    @Test
    public void canRemoveCardFromTheDeck() {
        deck.populate();
        deck.removeCard();
        assertEquals(51, deck.numberOfCards());
    }
}
