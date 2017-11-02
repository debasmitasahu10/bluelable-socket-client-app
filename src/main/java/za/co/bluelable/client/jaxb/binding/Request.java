//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.01 at 11:40:09 PM CAT 
//

package za.co.bluelable.client.jaxb.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="event">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UserPin" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="DeviceId" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="DeviceSer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DeviceVer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TransType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "eventType",
    "event"
})
@XmlRootElement(name = "request")
public class Request {

    @XmlElement(name = "EventType", required = true)
    protected String eventType;
    @XmlElement(required = true)
    protected Request.Event event;

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link Request.Event }
     *     
     */
    public Request.Event getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link Request.Event }
     *     
     */
    public void setEvent(Request.Event value) {
        this.event = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="UserPin" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="DeviceId" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="DeviceSer" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DeviceVer" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TransType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "userPin",
        "deviceId",
        "deviceSer",
        "deviceVer",
        "transType"
    })
    public static class Event {

        @XmlElement(name = "UserPin")
        protected int userPin;
        @XmlElement(name = "DeviceId")
        protected int deviceId;
        @XmlElement(name = "DeviceSer", required = true)
        protected String deviceSer;
        @XmlElement(name = "DeviceVer", required = true)
        protected String deviceVer;
        @XmlElement(name = "TransType", required = true)
        protected String transType;

        /**
         * Gets the value of the userPin property.
         * 
         */
        public int getUserPin() {
            return userPin;
        }

        /**
         * Sets the value of the userPin property.
         * 
         */
        public void setUserPin(int value) {
            this.userPin = value;
        }

        /**
         * Gets the value of the deviceId property.
         * 
         */
        public int getDeviceId() {
            return deviceId;
        }

        /**
         * Sets the value of the deviceId property.
         * 
         */
        public void setDeviceId(int value) {
            this.deviceId = value;
        }

        /**
         * Gets the value of the deviceSer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeviceSer() {
            return deviceSer;
        }

        /**
         * Sets the value of the deviceSer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeviceSer(String value) {
            this.deviceSer = value;
        }

        /**
         * Gets the value of the deviceVer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeviceVer() {
            return deviceVer;
        }

        /**
         * Sets the value of the deviceVer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeviceVer(String value) {
            this.deviceVer = value;
        }

        /**
         * Gets the value of the transType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransType() {
            return transType;
        }

        /**
         * Sets the value of the transType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransType(String value) {
            this.transType = value;
        }

    }

}