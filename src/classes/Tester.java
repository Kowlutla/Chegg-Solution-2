package classes;

public class Tester {

	public static void main(String[] args) {
		
		Gandalf var1=new Frodo();
		Gandalf var2=new Bilbo();
		Gandalf var3=new Gandalf();
		Object var4=new Bilbo();
		Bilbo var5=new Frodo();
		Object var6=new Gollum();
		
		System.out.println("****1.var1.method1();*******************");
		var1.method1();
		System.out.println("***2.var2.method1();********************");
		var2.method1();
		System.out.println("***3.var3.method1();********************");
		var3.method1();
		System.out.println("***4.var4.method1();********************");
		//var4.method1();
		System.out.println("***5.var5.method1();********************");
		var5.method1();
		System.out.println("***6.var6.method1();********************");
		//var6.method1();
		System.out.println("***7.var1.method2();********************");
		var1.method2();
		System.out.println("***8.var2.method2();********************");
		var2.method2();
		System.out.println("***9.var3.method2();********************");
		var3.method2();
		System.out.println("***11.var5.method2();********************");
		var5.method2();
		System.out.println("***14.((Gandalf)var1).method2();;********************");
		((Gandalf)var1).method2();
		System.out.println("***16.((Gandalf)var6).method2();;********************");
		((Gandalf)var6).method2();
	
		
	}

}
