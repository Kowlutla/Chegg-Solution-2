package exam;

class Exam {
	
	private String exTitle="Exam 1";
	public double weight=10.0;
	
	public Exam() {
	}
	
	public Exam(String exTitle, double weight) {
		this.exTitle = exTitle;
		this.weight = weight;
	}
	

	public String getExTitle() {
		return exTitle;
	}

	public double getWeight() {
		return weight;
	}
}
