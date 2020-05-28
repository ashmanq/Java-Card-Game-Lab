import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DealerTest {

    Dealer dealer;
    Card card;

    @Before
    public void setUp() {
        dealer = new Dealer("Andrew");
    }

    @Test
    public void hasName() {
        assertEquals("Andrew", dealer.getName());
    }

    @Test
    public void hasDeck() {
        assertEquals(52, dealer.checkNumberOfCards());
    }

    @Test
    public void canGetCard() {
        card = dealer.getCard(0);
        assertEquals(SuitType.HEARTS, card.getSuit());
        assertEquals(RankType.ACE, card.getRank());
    }

    @Test
    public void canShuffleDeck() {
        card = dealer.getCard(0);
        dealer.shuffleCards();
        assertNotEquals(card, dealer.getCard(0));
    }

//
}
