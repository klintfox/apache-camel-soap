
package com.piconector.beans;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.piconector.beans package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
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

    private final static QName _ResponseItemURL_QNAME = new QName("http://beans.piconector.com", "ResponseItemURL");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.piconector.beans
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseInfo }
     * 
     */
    public ResponseInfo createResponseInfo() {
        return new ResponseInfo();
    }

    /**
     * Create an instance of {@link CompositionResponse }
     * 
     */
    public CompositionResponse createCompositionResponse() {
        return new CompositionResponse();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link ResponseItem }
     * 
     */
    public ResponseItem createResponseItem() {
        return new ResponseItem();
    }

    /**
     * Create an instance of {@link ResponseItemInfo }
     * 
     */
    public ResponseItemInfo createResponseItemInfo() {
        return new ResponseItemInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://beans.piconector.com", name = "ResponseItemURL")
    public JAXBElement<String> createResponseItemURL(String value) {
        return new JAXBElement<String>(_ResponseItemURL_QNAME, String.class, null, value);
    }

}
