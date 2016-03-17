/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        String[] rankA={"Queen", "Jack", "8", "3"};
        String[] suitA={"clubs", "hearts", "diamonds", "spades"};
        int[] valueA={10, 10, 8, 3};
        Deck deck1=new Deck(rankA, suitA, valueA);
        deck1.deal();
        System.out.println(deck1);
        
        String[] rankB={"Queen", "Jack", "8", "3"};
        String[] suitB={"clubs", "hearts", "diamonds", "spades"};
        int[] valueB={10, 10, 8, 3};
        Deck deck2=new Deck(rankB, suitB, valueB);
        deck2.deal();
        System.out.println(deck2);
        
        String[] rankC={"Queen", "Jack", "8", "3"};
        String[] suitC={"clubs", "hearts", "diamonds", "spades"};
        int[] valueC={10, 10, 8, 3};
        Deck deck3=new Deck(rankC, suitC, valueC);
        deck3.deal();
        System.out.println(deck3);
    }
}
