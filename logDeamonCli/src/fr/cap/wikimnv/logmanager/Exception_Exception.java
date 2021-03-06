
package fr.cap.wikimnv.logmanager;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "Exception", targetNamespace = "http://logManager.wikimnv.cap.fr/")
public class Exception_Exception
    extends java.lang.Exception
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private fr.cap.wikimnv.logmanager.Exception faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public Exception_Exception(String message, fr.cap.wikimnv.logmanager.Exception faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public Exception_Exception(String message, fr.cap.wikimnv.logmanager.Exception faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: fr.cap.wikimnv.logmanager.Exception
     */
    public fr.cap.wikimnv.logmanager.Exception getFaultInfo() {
        return faultInfo;
    }

}
