
package com.capturemylog.ws.logpicture;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "LogPicture", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://logcollectorazure.cloudapp.net/logpicture.asmx?WSDL")
public class LogPicture
    extends Service
{

    private final static URL LOGPICTURE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.capturemylog.ws.logpicture.LogPicture.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.capturemylog.ws.logpicture.LogPicture.class.getResource(".");
            url = new URL(baseUrl, "http://logcollectorazure.cloudapp.net/logpicture.asmx?WSDL");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://logcollectorazure.cloudapp.net/logpicture.asmx?WSDL', retrying as a local file");
            logger.warning(e.getMessage());
        }
        LOGPICTURE_WSDL_LOCATION = url;
    }

    public LogPicture(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LogPicture() {
        super(LOGPICTURE_WSDL_LOCATION, new QName("http://tempuri.org/", "LogPicture"));
    }

    /**
     * 
     * @return
     *     returns LogPictureSoap
     */
    @WebEndpoint(name = "LogPictureSoap")
    public LogPictureSoap getLogPictureSoap() {
        return super.getPort(new QName("http://tempuri.org/", "LogPictureSoap"), LogPictureSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LogPictureSoap
     */
    @WebEndpoint(name = "LogPictureSoap")
    public LogPictureSoap getLogPictureSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "LogPictureSoap"), LogPictureSoap.class, features);
    }

}
