
public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=8;
		int b=2;
		
		/*
		 * 8<2 -->false
		 * 16<2 -->false
		 * since both statements are false 
		 * the control will go to the else block
		 */
		if(a<b || a*2<b)
			System.out.println(a-b);
		else
			System.out.println(b+a);//it will print 10
	}

}
