/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card one = new Card("3", "Hearts", 3);
		Card two = new Card("4", "Clubs", 4);
		System.out.println("Does card one match card two?" + one.matches(two));
		System.out.println("Suit of card one is " + one.suit());
		System.out.println("Suit of card two is " + two.suit());
	}
}
