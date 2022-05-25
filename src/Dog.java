
//A Dog Object represent the name,breed and age of a dog
public class Dog {
	private String name;
	private String breed;
	private int age;

	// Constructor a new dog object
	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	// return field values
	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// return String for Dog; example:"Rocky, Pug, 4"
	public String toString() {
		return "\"" + this.name + ", " + this.breed + ", " + this.age + "\"";
	}
}
