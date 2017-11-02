package za.co.bluelable.client.observer;

import za.co.bluelable.client.SocketClientException;

/**
 * Observable interface
 * @author Debasmita on 02 Nov 2017
 *
 */
public interface Observable {

	/**
	 * This method registers an observer
	 * @param observer
	 */
	public void register(Observer observer);
	/**
	 * This method removes the obeserver
	 * @param observer
	 */
	public void unregister(Observer observer);
	/**
	 * This method notifies the observer about the change
	 * @throws SocketClientException
	 */
	public void notifyObserver() throws SocketClientException;
	/**
	 * this method write the messsage to the socket output stream
	 * @param message
	 * @throws SocketClientException
	 */
	public void writetoSocket(String message) throws SocketClientException;
}
