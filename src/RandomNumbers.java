import java.util.Random;
import java.util.Scanner;

/*
 * Formula:
 * randomValue=randomNumber%maxRrange
 * randomValue=random number in range
 * randomNumber:generated by random number generator
 * maxRange:maximum value in range
 * 
 * Ex:randomNumber=1678462386
 * 	  maxRange=100
 * 	  randomValue=1678462386%100=86
 * 	
 * 
 * */
public class RandomNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		System.out.println("Random numbers: ");
		for(int i=1;i<=50;i++)
		{
			int randomnumber=rand.nextInt()%n;
			System.out.println(Math.abs(randomnumber));
		}
	}

}
