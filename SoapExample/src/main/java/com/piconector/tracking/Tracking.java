
package com.piconector.tracking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para anonymous complex type.
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element ref="{http://tracking.piconector.com}Status"/&amp;gt;
 *         &amp;lt;element ref="{http://tracking.piconector.com}Info"/&amp;gt;
 *         &amp;lt;element ref="{http://tracking.piconector.com}Format"/&amp;gt;
 *         &amp;lt;element ref="{http://tracking.piconector.com}Storage"/&amp;gt;
 *         &amp;lt;element ref="{http://tracking.piconector.com}Runtime"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "status",
    "info",
    "format",
    "storage",
    "runtime"
})
public class Tracking {

    @XmlElement(name = "Status", required = true)
    protected Status status;
    @XmlElement(name = "Info", required = true)
    protected Info info;
    @XmlElement(name = "Format", required = true)
    protected Format format;
    @XmlElement(name = "Storage", required = true)
    protected Storage storage;
    @XmlElement(name = "Runtime", required = true)
    protected Runtime runtime;

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad info.
     * 
     * @return
     *     possible object is
     *     {@link Info }
     *     
     */
    public Info getInfo() {
        return info;
    }

    /**
     * Define el valor de la propiedad info.
     * 
     * @param value
     *     allowed object is
     *     {@link Info }
     *     
     */
    public void setInfo(Info value) {
        this.info = value;
    }

    /**
     * Obtiene el valor de la propiedad format.
     * 
     * @return
     *     possible object is
     *     {@link Format }
     *     
     */
    public Format getFormat() {
        return format;
    }

    /**
     * Define el valor de la propiedad format.
     * 
     * @param value
     *     allowed object is
     *     {@link Format }
     *     
     */
    public void setFormat(Format value) {
        this.format = value;
    }

    /**
     * Obtiene el valor de la propiedad storage.
     * 
     * @return
     *     possible object is
     *     {@link Storage }
     *     
     */
    public Storage getStorage() {
        return storage;
    }

    /**
     * Define el valor de la propiedad storage.
     * 
     * @param value
     *     allowed object is
     *     {@link Storage }
     *     
     */
    public void setStorage(Storage value) {
        this.storage = value;
    }

    /**
     * Obtiene el valor de la propiedad runtime.
     * 
     * @return
     *     possible object is
     *     {@link Runtime }
     *     
     */
    public Runtime getRuntime() {
        return runtime;
    }

    /**
     * Define el valor de la propiedad runtime.
     * 
     * @param value
     *     allowed object is
     *     {@link Runtime }
     *     
     */
    public void setRuntime(Runtime value) {
        this.runtime = value;
    }

}
