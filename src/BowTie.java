import java.util.Scanner;

public class BowTie {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter size>");
		int size=in.nextInt();
		int x=1;
		int midPoint=size/2;
		if(size%2==0)
			midPoint--;
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(i<=j && j>=size || (j<=(size-i) && j>=i && i<size))
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			if(i<midPoint)
			{
				x++;
			}
			if(i>=midPoint)
			{
				x--;
			}
			System.out.println();
		}
	}

}
