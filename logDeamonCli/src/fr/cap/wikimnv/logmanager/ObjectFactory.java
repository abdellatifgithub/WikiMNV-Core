
package fr.cap.wikimnv.logmanager;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.cap.wikimnv.logmanager package. 
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

    private final static QName _Exception_QNAME = new QName("http://logManager.wikimnv.cap.fr/", "Exception");
    private final static QName _LoggerResponse_QNAME = new QName("http://logManager.wikimnv.cap.fr/", "loggerResponse");
    private final static QName _Logger_QNAME = new QName("http://logManager.wikimnv.cap.fr/", "logger");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.cap.wikimnv.logmanager
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoggerResponse }
     * 
     */
    public LoggerResponse createLoggerResponse() {
        return new LoggerResponse();
    }

    /**
     * Create an instance of {@link Logger }
     * 
     */
    public Logger createLogger() {
        return new Logger();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logManager.wikimnv.cap.fr/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoggerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logManager.wikimnv.cap.fr/", name = "loggerResponse")
    public JAXBElement<LoggerResponse> createLoggerResponse(LoggerResponse value) {
        return new JAXBElement<LoggerResponse>(_LoggerResponse_QNAME, LoggerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logManager.wikimnv.cap.fr/", name = "logger")
    public JAXBElement<Logger> createLogger(Logger value) {
        return new JAXBElement<Logger>(_Logger_QNAME, Logger.class, null, value);
    }

}
