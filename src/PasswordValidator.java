import java.util.Scanner;
import java.util.TreeMap;

public class PasswordValidator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String b=input.substring(0,3);
		input=input.substring(3);
		input=insert(input,2,"e");
		input=erase(input, 1, 2);
		input=erase(input, 2, 6);
		System.out.println(b+input);

	}

	
	public static String erase(String str,int start,int end)
	{
		if(str.length()<start || str.length()<end)
		{
			return str;
		}
		else
		{
			return str.substring(0,start)+str.substring(end);
		}
	}
	
	public static String insert(String str,int pos,String what)
	{
		if(str.length()<pos)
		{
			return str+what;
		}
		return str.substring(0,pos)+what+str.substring(pos);
	}
	public static int CountKDigits(int array[],int k)
	{
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			if((int)Math.log10(array[i])+1==k)
			{
				count++;
			}
		}
		return count;
	}
	
	public static int findAutoCount(String n)
	{
		if(n==null)
			return 0;
		
		
		TreeMap<Character,Integer>map=new TreeMap<>();
		
		for(int i=0;i<n.length();i++)
		{
			if(map.containsKey(n.charAt(i)))
			{
				map.put(n.charAt(i),map.get(n.charAt(i))+1);
			}
			else
			{
				map.put(n.charAt(i),1);
			}
		}

		int count=0;
		for(int i=0;i<n.length();i++)
		{
			if(map.containsKey((char)(i+48)))
			{
				if(map.get((char)(i+48))==(n.charAt(i)-48))
				{
					count++;
				}
			}
		}
		return count;
	}
}

//42101000