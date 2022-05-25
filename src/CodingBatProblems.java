import java.util.Arrays;

public class CodingBatProblems {

	public static void main(String[] args) {
		//calculteTax method results
		System.out.println("calculateTax(100,7)->" + calculateTax(100, 7));
		System.out.println("calculateTax(1000,7)->" + calculateTax(1000, 7));
		System.out.println("calculateTax(500,7)->" + calculateTax(500, 7));

		System.out.println("\n---------------------------------------------------\n");

		//studentClassification Method results
		System.out.println("studentClassification(1)->" + studentClassification(1));
		System.out.println("studentClassification(2)->" + studentClassification(2));
		System.out.println("studentClassification(3)->" + studentClassification(3));

		System.out.println("\n---------------------------------------------------\n");
		//creditScore Method results
		System.out.println("creditScore(100)->" + creditScore(100));
		System.out.println("creditScore(200)->" + creditScore(200));
		System.out.println("creditScore(800)->" + creditScore(800));

		System.out.println("\n---------------------------------------------------\n");
		//convertToArray method Results
		System.out.println("convertToArray(\"345\")->" + Arrays.toString(convertToArray("345")));
	}

	//Method to calculate and return the tax by taking amount and tax percentage
	public static double calculateTax(double amount, double taxPercentage) {
		return (taxPercentage * amount) / 100;
	}

	//method to return the classification of student by taking year
	public static String studentClassification(int year) {
		if (year == 1) {
			return "freshman";
		} else if (year == 2) {
			return "sophomore";
		} else if (year == 3) {
			return "junior";
		} else if (year == 4) {
			return "senior";
		} else {
			return "undefined";
		}
	}

	//Method to return creditScore status by taking credit Score
	public static String creditScore(int score) {
		if (score <= 500) {
			return "poor";
		} else if (score <= 600) {
			return "average";
		} else if (score <= 700) {
			return "good";
		} else if (score < 800) {
			return "exellent";
		} else {
			return "outstanding";
		}
	}

	//method to convert given string into character array and return that arry
	public static char[] convertToArray(String text) {
		char[] array = new char[text.length()];
		for (int i = 0; i < text.length(); i++) {
			array[i] = text.charAt(i);
		}
		return array;
		//return text.toCharArray();(Single Line Solution )
	}
}
