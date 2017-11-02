package za.co.bluelable.client.observer;

import java.net.Socket;

import za.co.bluelable.client.SocketClientException;

/**
 * Observer interface
 * @author Debasmita on 02 Nov 2017
 *
 */
public interface Observer {

	/**
	 * This method reads the response from socket output stream
	 * @param socket
	 * @throws SocketClientException
	 */
	public void readFromSocket(Socket socket) throws SocketClientException;
	/**
	 * @return The response from socket
	 */
	public byte[] getResponse();
}
