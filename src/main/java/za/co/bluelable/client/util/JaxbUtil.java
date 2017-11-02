package za.co.bluelable.client.util;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import za.co.bluelable.client.SocketClientException;

/**
 * Jaxb utility class
 * @author Debasmita on 02 Nov 2017
 *
 */
public class JaxbUtil {


	/**
	 *  marshal the object into xml
	 *  
	 * @param aClass
	 * @param object
	 * @return XML String
	 * @throws SocketClientException
	 */
	public static String marshalObject(Class aClass, Object object) throws SocketClientException {
		StringWriter result = new StringWriter();
		try {
			JAXBContext context = JAXBContext.newInstance(aClass);
			Marshaller marshaller = context.createMarshaller();
			marshaller.marshal(object, result);
		} catch (JAXBException e) {
			throw new SocketClientException(e);
		}
		return result.toString();
	}

	/**
	 * unmarshal the xml into object
	 * @param xmlStr
	 * @param aClass
	 * @return
	 * @throws SocketClientException
	 */
	public static Object unmarshalObject(String xmlStr, Class aClass) throws SocketClientException {
		Object object = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(aClass);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			object = unmarshaller.unmarshal(new StringReader(xmlStr));
		} catch (JAXBException e) {
			throw new SocketClientException(e);
		}
		return object;
	}
}
