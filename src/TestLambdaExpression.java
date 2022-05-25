
public class TestLambdaExpression {

	public static void main(String[] args) {
		
		//Defining My_Interface_1 method execute() Using lambda expression
		My_Interface_1 my_interface_1 = () -> //body of method
		{
			//printing some statement in method
			System.out.println("Implementing Interface method using lambda expression");
		};
		
		//calling execute() method which is above defined
		my_interface_1.execute();
	}
}
