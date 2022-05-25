import java.util.Scanner;

public class Week {

	static String weeks[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Week: ");
		String myWeek=sc.nextLine();
		
		System.out.println("Number Of days to add: ");
		int days=sc.nextInt();
		
		int resultedDayIndex=getIndex(myWeek,days);
		System.out.println(weeks[resultedDayIndex]);
	}
	private static int getIndex(String myWeek, int days) {
		
		days=days%7;
		int index=-1;
		for(int i=0;i<weeks.length;i++)
		{
			if(weeks[i].equalsIgnoreCase(myWeek))
			{
				index=i;
				break;
			}
		}
		
		if(days<0)
		{
			days+=7;
		}
		return (index+days)%7;
	}

}
