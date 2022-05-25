import java.util.Deque;
import java.util.LinkedList;

public class DequeueDemo {

	public static void main(String[] args) {
		Deque d=new LinkedList();
		d.addLast("T");
		d.addFirst("e");
		d.addFirst("s");
		d.addLast("L");
		d.offer(d.remove(d.contains("S")));
		System.out.println(d);

		d.addLast(d.remove(d.contains("T")));
		System.out.println(d);
		
		d.push(d.remove("T".toLowerCase()));
		System.out.println(d);
		
		d.offer(d.remove());
		System.out.println(d);
		
		d.offerFirst(d.remove(d.element()));
		System.out.println(d);
	}

}
