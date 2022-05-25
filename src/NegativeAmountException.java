/**
 * This exception reports a negative amount on with draw or deposite
 */
public class NegativeAmountException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeAmountException() {
	}

	public NegativeAmountException(String message) {
		super(message);
	}
	
}
