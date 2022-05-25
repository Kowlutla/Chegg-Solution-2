package sorting;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter fw=new FileWriter("a.txt");
		PrintWriter pw=new  PrintWriter(fw);
		Random rand=new Random();
		for(int i=1;i<=100;i++)
		{
			pw.print(rand.nextInt(1000)+1+" ");
		}
		pw.close();
		fw.close();
	}

}
