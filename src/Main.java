
import java.util.Scanner;

class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String sub1=sc.next();
		int pos1=sc.nextInt();
		
		String s2=sc.next();
		int noOfChar=sc.nextInt();
		int pos2=sc.nextInt();
		
		
		String result1="";
		result1=s1.substring(0,pos1)+sub1+s1.substring(pos1);
		
		String result2="";
		
		result2=s2.substring(0,pos2)+s2.substring(pos2+noOfChar);
		
		System.out.println(result1);
		System.out.println(result2);
		sc.close();
	}
}