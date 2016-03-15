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
    }
}
