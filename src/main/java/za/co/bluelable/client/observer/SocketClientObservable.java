package za.co.bluelable.client.observer;

import java.io.OutputStream;
import java.net.Socket;

import za.co.bluelable.client.SocketClientException;

/**
 * Observable Observable implementation  
 * @author Debasmita on 02 Nov 2017
 *
 */
public class SocketClientObservable implements Observable {

	private Observer observer = null;
	private Socket socket = null;

	public SocketClientObservable(Socket socket) {
		this.socket = socket;
	}

	/*
	 * (non-Javadoc)
	 * @see za.co.bluelable.client.observer.Observable#register(za.co.bluelable.client.observer.Observer)
	 */
	public void register(Observer observer) {
		if (observer != null) {
			this.observer = observer;
		}
	}

	/*
	 * (non-Javadoc)
	 * @see za.co.bluelable.client.observer.Observable#unregister(za.co.bluelable.client.observer.Observer)
	 */
	public void unregister(Observer observer) {
		if (observer != null) {
			this.observer = null;
		}
	}

	/*
	 * (non-Javadoc)
	 * @see za.co.bluelable.client.observer.Observable#notifyObserver()
	 */
	public void notifyObserver() throws SocketClientException {
		if(this.observer != null) {
			observer.readFromSocket(this.socket);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see za.co.bluelable.client.observer.Observable#writetoSocket(java.lang.String)
	 */
	public void writetoSocket(String message) throws SocketClientException {
		try {
			if (this.socket != null) {
				OutputStream os = this.socket.getOutputStream();
				os.write(message.getBytes());
				os.flush();
				this.socket.shutdownOutput();
				notifyObserver();
			}
		} catch (Exception ex) {
			throw new SocketClientException(ex);
		}
	}

}
