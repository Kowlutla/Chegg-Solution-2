import java.util.Scanner;

public class Fibnocii2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Taking input from user
		System.out.println("Input: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println("Output:");
		
		//find the m-2 and m-1 number in fibonocii series
		int t1 = 0, t2 = 1;
        for (int i = 1; i <m; ++i)
        {
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        //t1 => m-2 number in fibonocii series
        //t2 => m-1 number in fibonocii series
        
        //printing the series from mth number to nth number
		for (int i = m ; i <=n; i++) {
			System.out.print(t2+" ");
			long sum=t1+t2;
			t1=t2;
			t2=(int) sum;
		}		
		sc.close();
	}
}
