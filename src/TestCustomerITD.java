import java.util.Scanner;

public class TestCustomerITD {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			LinkedQueue queue = new LinkedQueue();
			int choice;
			do {

				// showing choices to user
				System.out.println("\n1- Insert\n2- Remove\n3- Who is next?\n4- Check if empty\n"
						+ "5- Check the size\n6- Check if contains\n7- display the queue\n0- stop");

				// asking user to enter choice
				System.out.print("\nEnter your choice: ");
				choice = sc.nextInt();
				switch (choice) {
				case 1: // if choice is 1
				{
					System.out.print("Enter First Name: ");
					String fname = sc.next();
					System.out.print("Enter Last Name: ");
					String lname = sc.next();
					CustomerITD c = new CustomerITD(fname, lname);
					queue.enQueue(c);
					break;
				}
				case 2: // if choice is 2
				{
					CustomerITD c = queue.deQueue();
					if (c == null) {
						System.out.println("Queue is empty ....");
					} else {
						System.out.println(c);
					}
					break;
				}
				case 3:// if choice is 3
				{
					CustomerITD c = queue.peekFront();
					if (c == null) {
						System.out.println("Queue is empty ....");
					} else {
						System.out.println(c);
					}
					break;
				}
				case 4:// if choice is 4
				{
					System.out.println("Empty? " + queue.isEmpty());
					break;
				}

				case 5:// if choice is 5
				{
					System.out.println("Size: " + queue.size());
					break;
				}
				case 6:// if choice is 6
				{
					System.out.print("Enter first or last name: ");
					String name = sc.next();
					System.out.println("In the queue:? " + queue.contains(name));
					break;
				}
				case 7:// if choice is 7
				{
					queue.display();
					break;
				}
				case 0:// if choice is 0
				{
					System.out.println("Bye");
					break;
				}
				default:// any other choice entered
				{
					System.out.println("Invalid choice.. Please try again");
					break;
				}
				}
			} while (choice != 0);
		} catch (Exception e) {
			System.out.println(e);
			sc.close();
		}
	}
}
