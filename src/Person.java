
public class Person {
	
	private String name;
	private boolean hasDriverLicense;
	private int age;
	private int height;
	public Person(String name, boolean hasDriverLicense, int age, int height) {;
		this.name = name;
		this.hasDriverLicense = hasDriverLicense;
		this.age = age;
		this.height = height;
	}
	
	
	public Person clone()
	{
		return this.clone();
	}
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", hasDriverLicense=" + hasDriverLicense + ", age=" + age + ", height=" + height
				+ "]";
	}


	public static void main(String[] args) {
		
	}
	

}
