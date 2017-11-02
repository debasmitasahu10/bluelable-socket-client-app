package za.co.bluelable.socket.client.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import za.co.bluelable.client.SocketClientException;
import za.co.bluelable.client.SocketSendAndReceive;
import za.co.bluelable.client.SocketSendAndReceiveImpl;
import za.co.bluelable.client.jaxb.binding.ObjectFactory;
import za.co.bluelable.client.jaxb.binding.Request;
import za.co.bluelable.client.util.JaxbUtil;

public class SocketClientTest {

	private SocketSendAndReceive sendAndReceive;
	
	@Before
	public void init() {
		sendAndReceive = new SocketSendAndReceiveImpl("196.37.22.179", 9011);
	}
	
	@Test
	public void testSocketCLient() {
		ObjectFactory objectFactory = new ObjectFactory();
		Request request = objectFactory.createRequest();
		request.setEventType("Authentication");
		Request.Event event = objectFactory.createRequestEvent();
		event.setUserPin(12345);
		event.setDeviceId(12345);
		event.setDeviceSer("ABCDE");
		event.setDeviceVer("ABCDE");
		event.setTransType("Users");
		request.setEvent(event);
		try {
			String xml = JaxbUtil.marshalObject(Request.class, request);
			byte[] response = sendAndReceive.sendAndReceive(xml, "README.txt");
			System.out.println(new String(response));
			Assert.assertNotNull(response);
		} catch (SocketClientException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
}
