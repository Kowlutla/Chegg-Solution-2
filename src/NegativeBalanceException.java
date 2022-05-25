/**
 * This exception reports a negative initial balance on a bank account.
 */
public class NegativeBalanceException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeBalanceException() {
	}

	public NegativeBalanceException(String message) {
		super(message);
	}
}
