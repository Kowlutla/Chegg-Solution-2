import javax.swing.JOptionPane;

public class FunnerPartOfExam {

	public static void main(String[] args) {
		
		String house=new String("abcdefghij");
		String building="1a2b3c4d5e";
		String pond="abcc";
		String tree=JOptionPane.showInputDialog("Enter 1a2b3c4d5e");
		System.out.println(building.toUpperCase().indexOf("C4"));
		System.out.println(Character.isDigit(building.charAt(1)));
		if(building.regionMatches(1, "house", 0, 1))
			System.out.println("Not Having Fun");
		else
			System.out.println("Having fun");
		System.out.println(house.substring(4,house.length()-5));
		System.out.println(building==tree);
		System.out.println(building.length());
		System.out.println(pond.compareTo(house));
		System.out.println(house.endsWith("bc"));
		System.out.println(building);
		System.out.println(tree);
	}

}
