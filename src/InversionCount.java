import java.util.Random;

public class InversionCount {
	
	static int inversionCount(int A[],int N)
	{
		int COUNT=0;
		for(int I=0;I<=N-1;I++)
		{
			for(int J=I+1;J<=N-1;J++)
			{
				if(A[I]>A[J])
				{
					COUNT++;
				}
			}
		}
		return COUNT;
	}

	public static void main(String[] args) {
		
		int array[]=new int[100];
		Random rand=new Random();
		for(int i=0;i<100;i++)
		{
			array[i]=rand.nextInt()%1000;
		}
		
		int count=inversionCount(array, 100);
		System.out.println("Inversion Count: "+count);

	}

}
