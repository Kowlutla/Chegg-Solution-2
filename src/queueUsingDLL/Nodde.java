package queueUsingDLL;

public class Nodde {
	private Nodde next;
	private Nodde previous;
	private int num;

	//constructor to create Nodde Object
	public Nodde(int num) {
		this.num = num;
		next = null;
		previous = null;
	}

	//Method to get next Nodde
	public Nodde getNext() {
		return next;
	}

	//Method to get previous Nodde
	public Nodde getPrevious() {
		return previous;
	}

	//Method to get number
	public int getNum() {
		return num;
	}

	//Method to set Next Nodde
	public void setNext(Nodde next) {
		this.next = next;
	}

	//Method to set previous Nodde
	public void setPrevious(Nodde previous) {
		this.previous = previous;
	}

	//Method to set num
	public void setNum(int num) {
		this.num = num;
	}
}