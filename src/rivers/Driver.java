package rivers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws IOException {
	
		Scanner sc=new Scanner(System.in);
		//Creating file reader and buffered reader object to read data
		File file=new File("eclipse-workspace/Chegg1/src/rivers/input.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		
		//Array of River to hold max 100 Rivers
		River riverlist[]=new River[100];
		//keep track of number of rivers stored in variable counter
		int counter=0;
		String s="";
		//read data from an input file "input.txt" into an array of River objects, named riverList
		while((s=br.readLine())!=null)
		{
			//split current line using tab(\t) delimeter
			//note:delimeter between name and length should be tab
			String data[]=s.split("\t");
			String name=data[0];//get name of river
			int length=Integer.parseInt(data[1]);//get length of river
			River r=new River(name,length);//creating river object
			riverlist[counter++]=r;//adding river object to riverlist
		}
		
		//Creating CTRiver Class Object to access method of that class
		CTRivers riv=new CTRivers();
		
		//Print all long rivers.
		riv.printLongRiversRec(riverlist, counter);

		System.out.println("\n--------------------------------------------------------------");
		//Unsuccessful search
		System.out.println("Search for River Ganga: ");
		int index=riv.linearSearch(riverlist, counter, "Ganga");
		if(index!=-1)
		{
			System.out.println("\tFound at index "+index);
		}
		else
		{
			System.out.println("\tNot found");
		}
		//successful search
		System.out.println("Search for River Connecticut: ");
		index=riv.linearSearch(riverlist, counter, "Connecticut");
		if(index!=-1)
		{
			System.out.println("\tFound at index "+index);
		}
		else
		{
			System.out.println("\tNot found");
		}
		
		System.out.println("\n--------------------------------------------------------------");
		//getting max and min length from user
		System.out.print("Enter min lenght: ");
		int min=sc.nextInt();
		System.out.print("Enter max lenght: ");
		int max=sc.nextInt();
		ArrayList<River>rangerivers=riv.searchRange(riverlist, counter, min, max);
		System.out.println("\n--------------------------------------------------------------");
		System.out.printf("Rivers whose length between %d and %d\n",min,max);
		//printing using foreach loop
		rangerivers.forEach((river)->System.out.println(river));
		
		System.out.println("\n--------------------------------------------------------------");
		//Sort myList by river names, and print sorted list.
		riv.sortByNameRec(riverlist, counter);
		//printing list
		for(int i=0;i<counter;i++)
		{
			System.out.println(riverlist[i]);
		}
		
		System.out.println("\n--------------------------------------------------------------");
		//Unsuccessful search
		System.out.println("Search for River Ganga: ");
		index=riv.binarySearchRec(riverlist, 0, counter, "Ganga");
		if(index!=-1)
		{
			System.out.println("\tFound at index "+index);
		}
		else
		{
			System.out.println("\tNot found");
		}
		//successful search
		System.out.println("Search for River Housatoic: ");
		index=riv.binarySearchRec(riverlist, 0, counter, "Housatoic");
		if(index!=-1)
		{
			System.out.println("\tFound at index "+index);
		}
		else
		{
			System.out.println("\tNot found");
		}
	}
}
