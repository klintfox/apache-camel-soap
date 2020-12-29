
package com.imdea.gestorimagenes.beans;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.imdea.gestorimagenes.beans package. 
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

    private final static QName _PicId_QNAME = new QName("http://beans.gestorimagenes.imdea.com", "picId");
    private final static QName _StatusDesc_QNAME = new QName("http://beans.gestorimagenes.imdea.com", "statusDesc");
    private final static QName _Channel_QNAME = new QName("http://beans.gestorimagenes.imdea.com", "channel");
    private final static QName _Status_QNAME = new QName("http://beans.gestorimagenes.imdea.com", "status");
    private final static QName _Lang_QNAME = new QName("http://beans.gestorimagenes.imdea.com", "lang");
    private final static QName _From_QNAME = new QName("http://beans.gestorimagenes.imdea.com", "from");
    private final static QName _Bks_QNAME = new QName("http://beans.gestorimagenes.imdea.com", "bks");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.imdea.gestorimagenes.beans
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link GetPicRequest }
     * 
     */
    public GetPicRequest createGetPicRequest() {
        return new GetPicRequest();
    }

    /**
     * Create an instance of {@link Info }
     * 
     */
    public Info createInfo() {
        return new Info();
    }

    /**
     * Create an instance of {@link Params }
     * 
     */
    public Params createParams() {
        return new Params();
    }

    /**
     * Create an instance of {@link Param }
     * 
     */
    public Param createParam() {
        return new Param();
    }

    /**
     * Create an instance of {@link Picture }
     * 
     */
    public Picture createPicture() {
        return new Picture();
    }

    /**
     * Create an instance of {@link RemovePicRequest }
     * 
     */
    public RemovePicRequest createRemovePicRequest() {
        return new RemovePicRequest();
    }

    /**
     * Create an instance of {@link SetPicRequest }
     * 
     */
    public SetPicRequest createSetPicRequest() {
        return new SetPicRequest();
    }

    /**
     * Create an instance of {@link AddPicRequest }
     * 
     */
    public AddPicRequest createAddPicRequest() {
        return new AddPicRequest();
    }

    /**
     * Create an instance of {@link GetAllPicRequest }
     * 
     */
    public GetAllPicRequest createGetAllPicRequest() {
        return new GetAllPicRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://beans.gestorimagenes.imdea.com", name = "picId")
    public JAXBElement<String> createPicId(String value) {
        return new JAXBElement<String>(_PicId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://beans.gestorimagenes.imdea.com", name = "statusDesc")
    public JAXBElement<String> createStatusDesc(String value) {
        return new JAXBElement<String>(_StatusDesc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://beans.gestorimagenes.imdea.com", name = "channel")
    public JAXBElement<String> createChannel(String value) {
        return new JAXBElement<String>(_Channel_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://beans.gestorimagenes.imdea.com", name = "status")
    public JAXBElement<String> createStatus(String value) {
        return new JAXBElement<String>(_Status_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://beans.gestorimagenes.imdea.com", name = "lang")
    public JAXBElement<String> createLang(String value) {
        return new JAXBElement<String>(_Lang_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://beans.gestorimagenes.imdea.com", name = "from")
    public JAXBElement<String> createFrom(String value) {
        return new JAXBElement<String>(_From_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://beans.gestorimagenes.imdea.com", name = "bks")
    public JAXBElement<byte[]> createBks(byte[] value) {
        return new JAXBElement<byte[]>(_Bks_QNAME, byte[].class, null, ((byte[]) value));
    }

}
