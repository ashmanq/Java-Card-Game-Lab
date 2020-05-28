import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player1, player2, player3;
    private Card card;

    @Before
    public void setUp() {
        player1 = new Player("Ralph");
        player2 = new Player("Ash");
        player3 = new Player("Eugene");

        card = new Card(SuitType.HEARTS, RankType.KING);
    }

    @Test
    public void hasName() {
        assertEquals("Ralph", player1.getName());
    }

    @Test
    public void cardsStartEmpty() {
        assertEquals(0, player1.getCards().size());
    }

    @Test
    public void scoreStartsAtZero() {
        assertEquals(0, player1.getScore());
    }

    @Test
    public void canReceiveCard() {
        player1.receiveCard(card);
        assertEquals(1, player1.getCards().size());
    }
}
