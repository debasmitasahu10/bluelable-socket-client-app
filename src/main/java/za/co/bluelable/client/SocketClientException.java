package za.co.bluelable.client;

/**
 * 
 * @author Debasmita on 02 Nov 2017
 *
 */
public class SocketClientException extends Exception {

	/**
	 * Default serial id
	 */
	private static final long serialVersionUID = 1L;

	public SocketClientException(Throwable t) {
		super(t);
	}
	
	public SocketClientException(String message) {
		super(message);
	}
	
	public SocketClientException(String message , Throwable t) {
		super(message, t);
	}
}
