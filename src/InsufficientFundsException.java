
/**
 * This exception reports a InsufficientFund on with draw 
 */
public class InsufficientFundsException extends Exception {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientFundsException() {
	}

	public InsufficientFundsException(String message) {
		super(message);
	}
}
