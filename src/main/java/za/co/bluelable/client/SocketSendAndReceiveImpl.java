package za.co.bluelable.client;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;

import za.co.bluelable.client.observer.Observable;
import za.co.bluelable.client.observer.Observer;
import za.co.bluelable.client.observer.SocketClientObservable;
import za.co.bluelable.client.observer.SocketClientObserver;

/**
 * 
 * @author Debasmita on 02 Nov 2017
 * 
 */
public class SocketSendAndReceiveImpl implements SocketSendAndReceive {

	private String host;
	private int port;

	public SocketSendAndReceiveImpl(String host, int port) {
		this.host = host;
		this.port = port;
	}

	/*
	 * (non-Javadoc)
	 * @see za.co.bluelable.client.SocketSendAndReceive#sendAndReceive(java.lang.String, java.lang.String)
	 */
	public byte[] sendAndReceive(String xmlMessage, String fileLocation) throws SocketClientException {
		Socket socket = null;
		byte[] response = null;
		try {
			socket = new Socket(host, port);
			Observer observer = new SocketClientObserver();
			Observable observable = new SocketClientObservable(socket);
			observable.register(observer);
			observable.writetoSocket(xmlMessage);
			response = observer.getResponse();
			if (fileLocation != null && !fileLocation.isEmpty()) {
				writeResponseToFile(response,fileLocation);
			}
		} catch (Exception se) {
			throw new SocketClientException(se);
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					throw new SocketClientException(e);
				}
			}
		}
		return response;
	}

	/**
	 * This method writes the byte response to specified file location
	 * @param response
	 * @param fileLocation
	 * @throws IOException
	 */
	private void writeResponseToFile(byte[] response, String fileLocation) throws IOException {
		FileOutputStream fos = null;
		try {
			if (response != null) {
				File file = new File(fileLocation);
				fos = new FileOutputStream(file);
				fos.write(response);
				fos.flush();
			}
		} catch (IOException ex) {
			throw ex;
		} finally {
			if (fos != null) {
				fos.close();
			}
		}
	}

}
