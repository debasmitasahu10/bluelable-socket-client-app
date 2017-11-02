package za.co.bluelable.client.observer;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.Socket;

import za.co.bluelable.client.SocketClientException;

/**
 * Socket Client observer implementation
 * @author Debasmita on 02 Nov 2017
 *
 */
public class SocketClientObserver implements Observer {
	
	private byte[] response;
	
	/*
	 * (non-Javadoc)
	 * @see za.co.bluelable.client.observer.Observer#readFromSocket(java.net.Socket)
	 */
	public void readFromSocket(Socket socket) throws SocketClientException {
		InputStream in = null;
		ByteArrayOutputStream out = null;
		try {
			in = socket.getInputStream();
			out = new ByteArrayOutputStream();
			byte[] buffer = new byte[1024];
			int val;
			while ((val = in.read(buffer)) > -1) {
				out.write(buffer, 0, val);
			}
			this.response = out.toByteArray();
			out.flush();
		} catch (Exception ex) {

		} finally {
			try {
				if (in != null)
					in.close();
				if (out != null)
					out.close();
			} catch (Exception ex) {
				throw new SocketClientException("Failed to close the input/output streams", ex);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * @see za.co.bluelable.client.observer.Observer#getResponse()
	 */
	public byte[] getResponse() {
		return this.response;
	}
}
