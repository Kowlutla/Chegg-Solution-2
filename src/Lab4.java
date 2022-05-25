import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Lab4 {

	/*
	 *Note: Please mention what Tuition Program perform
	 * */
	public static void main(String[] args) throws FileNotFoundException {
//		//calling methods
//		residenceTution();
//		nonResidenceTution();
//		display();
		
		File f1=new File("file1.txt");
		File f2=new File("file2.txt");
		PrintWriter pw1=new PrintWriter(f1);
		PrintWriter pw2=new PrintWriter(f2);
		pw1.write("file1");

		pw2.write("file2");
		pw1.close();
		pw2.close();
	}
	//residenceTution method
	public static void residenceTution()
	{
		System.out.println("Residence Tution method");
	}
	
	//nonResidenceTution method
	public static void nonResidenceTution()
	{
		System.out.println("Non-residence Tution method");
	}
	
	//display method
	public static void display()
	{
		System.out.println("Display Method");
	}

}
