import java.util.Scanner;

public class LabProgram {

	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		double num=scnr.nextDouble();
		double r=Math.pow(2, (1.0/12.0));
		double f0=num;
		System.out.printf("%.2f ",num);
		//print three values with space
		for(int i=1;i<4;i++)
		{
			num=f0*Math.pow(r, i);
			System.out.printf("%.2f ",num);
		}
		//print fourth value without space
		num=f0*Math.pow(r, 4);
		System.out.printf("%.2f",num);
		System.out.println();
		scnr.close();
	}
}
