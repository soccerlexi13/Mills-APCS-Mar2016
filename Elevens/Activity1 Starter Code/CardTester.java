/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        Card card1=new Card("Queen", "hearts", 10);
        System.out.println(card1);
        Card card2=new Card("3", "clubs", 3);
        System.out.println(card2);
        Card card3=new Card("9", "spades", 9);
        System.out.println(card3);
        Card card4=new Card("9", "spades", 9);
        System.out.println(card3.matches(card4));
    }
}
