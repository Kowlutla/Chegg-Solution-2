import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five scorebers: ");
		int score1, score2, score3, score4, score5;
		// Reading five scores
		score1 = sc.nextInt();
		score2 = sc.nextInt();
		score3 = sc.nextInt();
		score4 = sc.nextInt();
		score5 = sc.nextInt();
		// calling calAverage method and printing average
		System.out.println("Average: " + calAverage(score1, score2, score3, score4, score5));
		System.out.println("Determining Grades :");
		System.out.println(score1 + " : " + determineGrade(score1));
		System.out.println(score2 + " : " + determineGrade(score2));
		System.out.println(score3 + " : " + determineGrade(score3));
		System.out.println(score4 + " : " + determineGrade(score4));
		System.out.println(score5 + " : " + determineGrade(score5));
		sc.close();
	}

	// Method accept five test scores and return average
	public static double calAverage(int score1, int score2, int score3, int score4, int score5) {

		int sum = score1 + score2 + score3 + score4 + score5;
		return sum / 5;
	}

	// Method accept test score and return grade
	public static char determineGrade(int score) {
		if (score >= 90) {
			return 'A';
		} else if (score >= 80) {
			return 'B';
		} else if (score >= 65) {
			return 'C';
		} else if (score >= 50) {
			return 'D';
		} else if (score >= 35) {
			return 'E';
		} else {
			return 'F';
		}
	}
}
