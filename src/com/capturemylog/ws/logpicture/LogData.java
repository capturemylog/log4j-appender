
package com.capturemylog.ws.logpicture;

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
 *         &lt;element name="GuidLog" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GUIDOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
    "guidLog",
    "guidOwner",
    "content"
})
@XmlRootElement(name = "LogData")
public class LogData {

    @XmlElement(name = "GuidLog")
    protected String guidLog;
    @XmlElement(name = "GUIDOwner")
    protected String guidOwner;
    @XmlElement(name = "Content")
    protected byte[] content;

    /**
     * Gets the value of the guidLog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuidLog() {
        return guidLog;
    }

    /**
     * Sets the value of the guidLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuidLog(String value) {
        this.guidLog = value;
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
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setContent(byte[] value) {
        this.content = ((byte[]) value);
    }

}
