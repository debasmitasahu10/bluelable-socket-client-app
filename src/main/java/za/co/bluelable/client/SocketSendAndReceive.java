package za.co.bluelable.client;

/**
 * 
 * @author Debasmita on 02 Nov 2017 
 *
 */
public interface SocketSendAndReceive {

	/**
	 * This method sends the xmlMessage through socket and also reads the response from server
	 * @param xmlMessage
	 * @param fileLocation
	 * @return returns the response received from server
	 * @throws SocketClientException
	 */
	public byte[] sendAndReceive(String xmlMessage, String fileLocation) throws SocketClientException;
}
