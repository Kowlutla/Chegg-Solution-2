
public class PlayerGame {

	public static void main(String[] args) {
		/*
		 * values of score1 and score2 (they have already been assigned
		 */
		int score1 = 92;
		int score2 = 56;

		/*
		 * player 1 wins when score1 is higher than score2
		 */
		if (score1 > score2) {
			System.out.println("Player 1 wins");
		}
		/*
		 * player 2 wins when score2 is higher than score1
		 */
		else if (score2 > score1) {
			System.out.println("Player 2 wins");
		}

		/*
		 * tie when score1 score2
		 */
		else {
			System.out.println("It is tie");
		}
	}
}
