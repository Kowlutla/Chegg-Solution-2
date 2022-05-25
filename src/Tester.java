import java.util.Random;

//Tester Class
public class Tester {
	public static void main(String args[]) {
		// creating NumberClass Object
		NumberClass numberClass = new NumberClass();
		// creating Producer Class by passing NumberClass
		new Producer(numberClass);
		// creating Consumer Class by passing NumberClass
		new Consumer(numberClass);
	}
}

class NumberClass {
	int number;
	boolean isputNumber = false;

	// method to generate random number between 1 to 100 inclusive
	public synchronized void putNumber() {
		while (isputNumber)// if number is already put in buffer then wait for some time
		{
			try {
				wait();
			} catch (Exception e) {
			}
		}
		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}
		Random r = new Random();
		number = r.nextInt(100) + 1;
		System.out.println(Thread.currentThread().getName() + " Produced: " + number);// if numbers is not put in buffer
																					// then puts the number
		isputNumber = true;
		notify();// notifies to the next thread once it put number
	}

	// method to evaluate generated random number is even or odd
	public synchronized void testNumber() {
		while (!isputNumber)// wait for till the producer put number into buffer
		{
			try {
				wait();
			} catch (Exception e) {
			}
		}
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		// evaluating number whether even or odd
		if (number % 2 == 1) {
			System.out.println(Thread.currentThread().getName() + " Test and results " + number + " as Odd");
		} else {
			System.out.println(Thread.currentThread().getName() + " Test and results " + number + " as Even");
		}
		// message to Producer
		System.out.println("\nConsumer Test Completed completed.Please generate another number ");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		isputNumber = false;
		notify();
	}
}

//Class Producer which acts as Thread by extending Thread class
class Producer extends Thread {
	NumberClass numberClass;

	// Constructor to initialize numberClass and create new thread itself with name
	// producer and start thread
	public Producer(NumberClass numberClass) {
		this.numberClass = numberClass;
		Thread t = new Thread(this, "Producer Thread");
		t.start();
	}

	// Overrided method run
	public void run() {
		// calling putNumber method to generate random number of infinite amount of times
		while (true) {
			numberClass.putNumber();
		}
	}
}

//Class Consumer which acts as Thread by extending Thread
class Consumer extends Thread {
	NumberClass numberClass;

	// Constructor to initialize numberClass 
	//creates new Thread and start thread
	public Consumer(NumberClass numberClass) {
		this.numberClass = numberClass;
		Thread t1 = new Thread(this, "Consumer Thread");
		t1.start();
	}

	// Overrided run method
	public void run() {
		// calling testNumber method to check generated number is even or odd
		while (true) {
			numberClass.testNumber();
		}
	}
}
