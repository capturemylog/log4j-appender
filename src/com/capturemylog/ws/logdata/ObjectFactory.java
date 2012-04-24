
package com.capturemylog.ws.logdata;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.log2cloud.ws.logdata package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.log2cloud.ws.logdata
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LogCount }
     * 
     */
    public LogCount createLogCount() {
        return new LogCount();
    }

    /**
     * Create an instance of {@link LogNewDataResponse }
     * 
     */
    public LogNewDataResponse createLogNewDataResponse() {
        return new LogNewDataResponse();
    }

    /**
     * Create an instance of {@link LogNewData }
     * 
     */
    public LogNewData createLogNewData() {
        return new LogNewData();
    }

    /**
     * Create an instance of {@link LogCountResponse }
     * 
     */
    public LogCountResponse createLogCountResponse() {
        return new LogCountResponse();
    }

    /**
     * Create an instance of {@link LogObject }
     * 
     */
    public LogObject createLogObject() {
        return new LogObject();
    }

}
