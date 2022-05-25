package com.main;

public class Hw05Source {

	public static void main(String[] args) {
		
		//Creating four strings
		String s1="divide 100.0 50.0";
		String s2="add 25.0 92.0";
		String s3="subtract 225.0 17.0";
		String s4="multiply 11.0 3.0";
		
		//store them in array
		String array[]= {s1,s2,s3,s4};
		//create CalculateHelper object to process the strings
		CalculateHelper ch=new CalculateHelper();
		
		//use loop to process each string
		for(int i=0;i<4;i++)
		{
			ch.process(array[i]);//process the current string
			System.out.println(ch);//print the CalculateHelper object
		}
	}
}
