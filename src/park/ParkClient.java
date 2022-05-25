package park;
public class ParkClient {
	public static void main(String[] args) {
		String pantherId="002357392";//given panther id
		Park parkArray[]=new Park[5];//array of Parks
		//Creating first park with ParkName: CSC1302, ParkID: Last 2 digits of PantherID, ParkShare: "Circle”, ParkLength: 5
		Park p1=new Park("CSE1302",Integer.parseInt(pantherId)%100,"Circle",5);
		//Adding park 1 to parkArray
		parkArray[0]=p1;
		
		// Creating second park with ParkName: CSC1302, ParkID: Last 2 digits of PantherID + 3, ParkShare: "Square”, ParkLength: 6
		Park p2=new Park("CSE1302",Integer.parseInt(pantherId)%100+3,"Square",6);
		//Adding park 2 to parkArray
		parkArray[1]=p2;
		
		//Randomly creating other three parks 
		// Creating third park with ParkName: CSC1305, ParkID: Last 2 digits of PantherID + 5, ParkShare: "Circle”, ParkLength: 2
		Park p3=new Park("CSE1305",Integer.parseInt(pantherId)%100+5,"Circle",2);
		//Adding park 3 to parkArray
		parkArray[2]=p3;
		
		// Creating fourth park with ParkName: CSC1303, ParkID: Last 2 digits of PantherID + 9, ParkShare: "Square”, ParkLength: 3
		Park p4=new Park("CSE1303",Integer.parseInt(pantherId)%100+9,"Square",3);
		//Adding park 4 to parkArray
		parkArray[3]=p4;
		
		// Creating fifth park with ParkName: CSC1301, ParkID: Last 2 digits of PantherID + 7, ParkShare: "Circle”, ParkLength: 2.8
		Park p5=new Park("CSE1301",Integer.parseInt(pantherId)%100+7,"Circle",2.8);
		//Adding park 5 to parkArray
		parkArray[4]=p5;
		
		//finding the information of the Largest Park of all parks in the Park Array
		Park p=p1;//assume first park as large park
		for(int i=1;i<5;i++)//look for remaining park
		{
			//if current park is larger than larger park
			if(p.ParkLengthGetter()<parkArray[i].ParkLengthGetter())
			{
				p=parkArray[i];//make current park as larger park 
			}
		}
		
		// Printing the information of the Largest Park of all parks in the Park Array
		System.out.println("* * * Largest park in park Array * * * ");
		System.out.println("Park Name: "+p.ParkNameGetter()+"\nParkId: "+p.ParkGetId()
				+ "\nPark Shape: "+p.parkShape+"\nPark Length: "+p.ParkLengthGetter());
	}
}
