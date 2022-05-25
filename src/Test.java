public class Test{
 public static void main(String[] arr){
  
	A a=new K();
	a.m1();;
 }
}

class A
{
	public static  void m1()
	{
		System.out.println(" A Main");
	}
}

class K extends A{
	
	public static void m1() {
		System.out.println(" K Main");
	}
}
