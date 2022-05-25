
public class Exam {

	private int a;
	private int b;
	private String s;

	public Exam(Exam exam) {
		this.a = exam.a;
		this.b = exam.b;
	}

	public Exam(int a) {
		this.a = a;
	}

	public Exam(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void findS() {
		if (this.s != null) {
			System.out.println("Found");
		} else {
			System.out.println("Not found");
		}
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	/*
	 * (Question 1 Solution)
	 * toString method returns Exam object in string form 
	 * as a: value_of_a, b: value_of_b
	 */
	public String toString() {
		return "a:" + a + ",b:" + b;
	}

	public static void main(String args[]) {
		
		//(Question 2 Solution)
		//Creating instance of Exam
		Exam e = new Exam(3, 10);
		//Displaying above exam instance (internally used toString method) 
		System.out.println(e);
	}

}
