import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.ArrayList;
import java.util.Collections;

public class Runner {

    public static void main(String[] args) {

        Player player1 = new Player("Ralph");
        Player player2 = new Player("Ash");
        Player player3 = new Player("Eugene");

        ArrayList<Player> players = new ArrayList<Player>();

        players.add(player1);
        players.add(player2);
        players.add(player3);

        Dealer dealer = new Dealer("Tom");

        dealer.shuffleCards();

        System.out.println("Hello world");

      ArrayList<Integer> results = startGame(players, dealer);
      Integer i = Collections.max(results);
      int indexOf = results.indexOf(i);
      Player winner = players.get(indexOf);
        System.out.println(winner.getName());


    }

    public static ArrayList<Integer> startGame(ArrayList<Player> players, Dealer dealer) {
        ArrayList<Integer> playerHands= new ArrayList<Integer>();
        for (int i = 0; i < players.size(); i++) {
            Card card = dealer.dealCard();
            playerHands.add(card.getRank().getValue());
//            players[i].receiveCard(card);
        } return playerHands;

    }

//    public void compareScore(ArrayList<Player> players) {
//        String winner = null;
//
//        for (int i = 0; i < players.size(); i++) {
//            if (players[i].getCards()[0]. > players[i+1].getCards()[0]) {
//                winner = players[i].getCards
//            }
//        }
//    }

}
