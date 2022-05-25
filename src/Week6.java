import java.util.TreeSet;

import java.util.Comparator;

public class Week6 {

	private class MyComparator implements Comparator<String> {

		@Override

		public int compare(String o1, String o2) {

			//Since object is a type of string and contain only one character
			
			//get the o1 Object string character ascii value
			int c1=o1.charAt(0);
			//get the o2 Object string character ascii value
			int c2=o2.charAt(0);
			
			//if o1 is integer added 10,000 
			if(c1>=48 && c1<=57)
			{
				c1=(c1+10000);
			}
			//if o1 is integer added 10,000
			if(c2>=48 && c2<=57)
			{
				c2=(c2+10000);
			}
			//if first String object is greater return some +ve value
			if(c1>c2)
			{
				return 1;
			}
			//if second String object is greater return some -ve value
			else if(c1<c2)
			{
				return -1;
			}
			//return 0 if both are equal
			else
			{
				return 0;
			}
		}

	}

	static TreeSet<String> t = new TreeSet<String>(new Week6().new MyComparator());

	public static void main(String[] args) {

		int numElements = 10;

		treeExperiment(numElements);

	}

	public static void treeExperiment(int numElements) {

		//TreeSet<String> treeSet = new TreeSet<>(new Week6().new MyComparator());

		for (int i = 1; i <= numElements / 2; i++) {

			t.add(Integer.toString(i));

		}

		for (int i = 0; i < numElements / 2; i++) {

			t.add(Character.toString((char) ('A' + i % 26)));

		}

		System.out.println(formatTreeString(t));

	}

	public static String formatTreeString(TreeSet<String> treeSet) {

		String formattedOutput = "[";

		for (String item : treeSet)

		{

			formattedOutput = formattedOutput + item + ", ";

		}

		formattedOutput = formattedOutput.substring(0, formattedOutput.length() - 2);

		formattedOutput = formattedOutput + "]";

		return formattedOutput;

	}

}