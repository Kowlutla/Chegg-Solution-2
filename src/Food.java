import java.util.Arrays;
import java.util.Scanner;

public class Food {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Asking for no of food purchased
		int N = sc.nextInt();

		String foods[] = new String[N];// array to store food names
		double costs[] = new double[N];// array to store costs of food
		boolean substitutions[] = new boolean[N];// array to store substitution acceptance
		sc.nextLine();

		// taking all food names as one line separated by space
		String foodnames = sc.nextLine();
		String[] array = foodnames.split("\\s");
		// extracting each food name and store in array
		for (int i = 0; i < array.length; i++) {
			foods[i] = array[i];
		}

		// taking all food costs as one line separated by space
		String cost = sc.nextLine();
		array = cost.split("\\s");

		// extracting each food cost and store in array
		for (int i = 0; i < array.length; i++) {
			costs[i] = Double.parseDouble(array[i]);
		}

		// taking all food substitutions acceptance as one line separated by space
		String substitution = sc.nextLine();
		array = substitution.split("\\s");

		// extracting each food substitution acceptance and store in array
		for (int i = 0; i < array.length; i++) {
			substitutions[i] = Boolean.parseBoolean(array[i]);
		}

		// Taking outOfStock food name
		String foodOutOfStock = sc.nextLine();
		// Taking replacement food name
		String replacementFood = sc.nextLine();
		// taking replacement food cost
		double replacementFoodCost = sc.nextDouble();

		// check for outOfStock Food name and store index value
		int index = -1;
		for (int i = 0; i < N; i++) {
			if (foods[i].equalsIgnoreCase(foodOutOfStock)) {
				index = i;
				break;
			}
		}

		if (index != -1)// if we found entered outOfStock food name
		{
			if (substitutions[index])// if substitution allowed for that food
			{
				foods[index] = replacementFood;// replace it's name with replacementFoodName
				costs[index] = replacementFoodCost;// replace it's cost with replacementFoodCost
			}
		}

		System.out.println(Arrays.toString(foods));// printing food names after all operations
		sc.close();
	}

}
