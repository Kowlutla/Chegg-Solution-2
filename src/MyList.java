
public class MyList {
	private double[] list;
	private int dataSize;

	/**
	 * @param inputNumber
	 * @return count of how many numbers in list greater than given inputNumber
	 */
	public int greaterNumbers(double inputNumber) {
		// initialize count to 0
		int count = 0;
		// for all numbers in list
		for (int i = 0; i < dataSize; i++) {
			// if current list number is greater than input number
			if (list[i] > inputNumber) {
				count++;// increment count
			}
		}
		// return count
		return count;
	}

	/**
	 * @param inputNumber Add the given inputNumber to every number in the list
	 */
	public void addNumber(double inputNumber) {
		// for all numbers in list
		for (int i = 0; i < dataSize; i++) {
			// add the input number to current list number
			list[i] = list[i] + inputNumber;
		}
	}

	/**
	 * 
	 * @param inputNumber
	 * @return sum of differences between a given number and each number in
	 *         list(Difference is always positive)
	 */
	public double sumOfDifferences(double inputNumber) {
		// initialize sum to 0
		double sum = 0;
		// for all numbers in list
		for (int i = 0; i < dataSize; i++) {
			// get the difference between inputNumber and current list number
			double dif = inputNumber - list[i];
			// add the difference to sum(by changing dif to +ve)
			sum = sum + Math.abs(dif);
		}
		// return sum
		return sum;
	}
}
