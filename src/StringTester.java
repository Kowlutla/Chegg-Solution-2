import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringTester {

	public static void main(String[] args) {

		System.out.println("Enter String: ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		//1st way
		/*
		 * new StringBuffer(s)=>converts String to StringBuffer Object
		 * .reverse()=> reverse the contents of StringBuffer
		 * .toString()=>converts StringBuffer to String
		 */
		System.out.println(new StringBuffer(s).reverse().toString());
		
		//2nd way
		/*
		 * Using Streams(Java 8)
		 */
		System.out.println(Stream.of(s).map(word->new StringBuilder(word).reverse()).collect(Collectors.joining(" ")));
		sc.close();
	}

}
