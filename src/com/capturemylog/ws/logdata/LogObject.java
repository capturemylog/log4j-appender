
package com.capturemylog.ws.logdata;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LogObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GUIDOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateUpload" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LogType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LoggingString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeviceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ApplicationGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HaveByteContent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogObject", propOrder = {
    "guid",
    "guidOwner",
    "dateUpload",
    "logType",
    "deviceName",
    "loggingString",
    "deviceDate",
    "applicationGUID",
    "haveByteContent"
})
public class LogObject {

    @XmlElement(name = "GUID")
    protected String guid;
    @XmlElement(name = "GUIDOwner")
    protected String guidOwner;
    @XmlElement(name = "DateUpload", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateUpload;
    @XmlElement(name = "LogType")
    protected String logType;
    @XmlElement(name = "DeviceName")
    protected String deviceName;
    @XmlElement(name = "LoggingString")
    protected String loggingString;
    @XmlElement(name = "DeviceDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deviceDate;
    @XmlElement(name = "ApplicationGUID")
    protected String applicationGUID;
    @XmlElement(name = "HaveByteContent", required = true, type = Boolean.class, nillable = true)
    protected Boolean haveByteContent;

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUID() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGUID(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the guidOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUIDOwner() {
        return guidOwner;
    }

    /**
     * Sets the value of the guidOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGUIDOwner(String value) {
        this.guidOwner = value;
    }

    /**
     * Gets the value of the dateUpload property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateUpload() {
        return dateUpload;
    }

    /**
     * Sets the value of the dateUpload property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateUpload(XMLGregorianCalendar value) {
        this.dateUpload = value;
    }

    /**
     * Gets the value of the logType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogType() {
        return logType;
    }

    /**
     * Sets the value of the logType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogType(String value) {
        this.logType = value;
    }

    /**
     * Gets the value of the deviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * Sets the value of the deviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceName(String value) {
        this.deviceName = value;
    }

    /**
     * Gets the value of the loggingString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggingString() {
        return loggingString;
    }

    /**
     * Sets the value of the loggingString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggingString(String value) {
        this.loggingString = value;
    }

    /**
     * Gets the value of the deviceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeviceDate() {
        return deviceDate;
    }

    /**
     * Sets the value of the deviceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeviceDate(XMLGregorianCalendar value) {
        this.deviceDate = value;
    }

    /**
     * Gets the value of the applicationGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationGUID() {
        return applicationGUID;
    }

    /**
     * Sets the value of the applicationGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationGUID(String value) {
        this.applicationGUID = value;
    }

    /**
     * Gets the value of the haveByteContent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHaveByteContent() {
        return haveByteContent;
    }

    /**
     * Sets the value of the haveByteContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHaveByteContent(Boolean value) {
        this.haveByteContent = value;
    }

}
