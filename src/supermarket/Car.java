package supermarket;

public class Car {

	private final Trolley _trolley;
	/*
	 * Modification1: create static variable single_instance of type Car
	 */
	private static Car single_instance = null;

	/*
	 * Modification2: Change the public to private 
	 * private constructor restricted to this class itself
	 */
	private Car() {
		_trolley = new Trolley();
	}
	
	static Car getCar() {
		/*
		 * Modification3:
		 * if single_instance is null which mean not a single Car Object is
		 * created,create new Car object and return it
		 * if already one Car Object is created return it
		 */
		if (single_instance == null) {
			single_instance = new Car();
		}
		return single_instance;
	}
	public int getTrolleyID() {
		return _trolley.getTrolleyID();
	}
}
