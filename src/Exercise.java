interface Base {
	default int foo() {
		return 1;
	}

	String bar();
}

interface Foo extends Base{
	
	int foo();
	public default String bar()
	{
		return "world";
	}
}

public class Exercise {
	public static void main(String[] arg) {
		Base foo1 = () -> "hello";
		Base foo2 = (Foo) () -> 2;
		assert(foo1.bar() + foo2.bar()).equals("hello world");
		System.out.println("Hello");
	}
}