import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class myClass
{

	public static void main(String[] args) {
		
//		int array[]= {3,89,2,8,1,23,9,-3,12};
//		System.out.println(Arrays.toString(array));
//		array=fun(array);
//		System.out.println(Arrays.toString(array));
		
//		final Set<String> x = new HashSet<>(Arrays.asList("first", "second"));
//		x.remove("first");
//		x.add("last");
//		
//		Solution s=new Solution();
//		System.out.println(s.solution("rather", "harder"));
//		System.out.println(s.solution("lemon", "melon"));
//		System.out.println(s.solution("apple", "pear"));
		
//		String a="string";
//		String b=new String("string");
//		String c=a;
//		System.out.println(a==b);
//		System.out.println(a==c);
//		System.out.println(b.equals(c));
	}
	
	
	public static int[] fun(int array[])
	{
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i]>array[i+1])
			{
				int temp=array[i];
				array[i]=array[i+1];
				array[i+1]=temp;
			}
		}
		return array;
	}
}
class Solution {
    public int solution(String A, String B) {
        // write your code in Java SE 8
        
        /*
        array used to how many time a character occured in string
        Since String A and String B Contain only lowecase letters
        Considering array length is 26 because no of alphabets is 26
        */
        int countarray[]=new int[26];
        //for String A
	   for(char c:A.toCharArray())
	   {
	       //for current character increment its ocuurence count by 1
	       countarray[c-'a']++;
	   }
	   //for String B
	   for(char c:B.toCharArray())
	   {
	        //for current character decrement its ocuurence count by 1
	       countarray[c-'a']--;
	   }
	       
	   int count=0;//to hold how many letters to be added to make anagrams
	   for(int i=0;i<countarray.length;i++)
	   {
	       //sum the values in countarray(Make values to positive,, because there may be nagative value in countarray which mean no characters needed to add for String A and Positive value in countarray is no of characters added to String B)
	       count+=Math.abs(countarray[i]);
	   }
	   //return count as number of characters to be added to strings to make those string as anagrams
	   return count;
    }
}


abstract class classA
{
	abstract void foo();
}
class B extends classA
{

	@Override
	protected void foo() {
		// TODO Auto-generated method stub
		
	}
	
}

class C extends classA
{

	@Override
	protected void foo() {
		// TODO Auto-generated method stub
		
	}
	
}
