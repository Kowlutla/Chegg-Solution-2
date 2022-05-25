import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String>list1=new ArrayList<String>();
		list1.add("K");
		list1.add("A");
		list1.add("C");
		list1.add("D");
		list1.add("G");
		System.out.println(list1);
		list1.remove(1);
		System.out.println(list1);
		list1.add(3, "W");
		System.out.println(list1);
		list1.add("Y");
		list1.add(list1.size(), "Y");
		System.out.println(list1);

	}

}
