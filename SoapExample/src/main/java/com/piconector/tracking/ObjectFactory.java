
package com.piconector.tracking;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.piconector.tracking package. 
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

    private final static QName _Tracking_QNAME = new QName("http://tracking.piconector.com", "Tracking");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.piconector.tracking
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DevuelveXmlTrackingResponse }
     * 
     */
    public DevuelveXmlTrackingResponse createDevuelveXmlTrackingResponse() {
        return new DevuelveXmlTrackingResponse();
    }

    /**
     * Create an instance of {@link Root }
     * 
     */
    public Root createRoot() {
        return new Root();
    }

    /**
     * Create an instance of {@link Tracking }
     * 
     */
    public Tracking createTracking() {
        return new Tracking();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link StatusItem }
     * 
     */
    public StatusItem createStatusItem() {
        return new StatusItem();
    }

    /**
     * Create an instance of {@link Info }
     * 
     */
    public Info createInfo() {
        return new Info();
    }

    /**
     * Create an instance of {@link InfoItem }
     * 
     */
    public InfoItem createInfoItem() {
        return new InfoItem();
    }

    /**
     * Create an instance of {@link Format }
     * 
     */
    public Format createFormat() {
        return new Format();
    }

    /**
     * Create an instance of {@link FormatItem }
     * 
     */
    public FormatItem createFormatItem() {
        return new FormatItem();
    }

    /**
     * Create an instance of {@link Storage }
     * 
     */
    public Storage createStorage() {
        return new Storage();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link Runtime }
     * 
     */
    public Runtime createRuntime() {
        return new Runtime();
    }

    /**
     * Create an instance of {@link RuntimeItem }
     * 
     */
    public RuntimeItem createRuntimeItem() {
        return new RuntimeItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tracking }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tracking }{@code >}
     */
    @XmlElementDecl(namespace = "http://tracking.piconector.com", name = "Tracking")
    public JAXBElement<Tracking> createTracking(Tracking value) {
        return new JAXBElement<Tracking>(_Tracking_QNAME, Tracking.class, null, value);
    }

}
