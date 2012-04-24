
package com.capturemylog.ws.logdata;

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
 *         &lt;element name="LogCountResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "logCountResult"
})
@XmlRootElement(name = "LogCountResponse")
public class LogCountResponse {

    @XmlElement(name = "LogCountResult")
    protected int logCountResult;

    /**
     * Gets the value of the logCountResult property.
     * 
     */
    public int getLogCountResult() {
        return logCountResult;
    }

    /**
     * Sets the value of the logCountResult property.
     * 
     */
    public void setLogCountResult(int value) {
        this.logCountResult = value;
    }

}
