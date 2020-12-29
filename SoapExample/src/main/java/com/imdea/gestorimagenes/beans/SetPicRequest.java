
package com.imdea.gestorimagenes.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &amp;lt;element ref="{http://beans.gestorimagenes.imdea.com}info"/&amp;gt;
 *         &amp;lt;element ref="{http://beans.gestorimagenes.imdea.com}params"/&amp;gt;
 *         &amp;lt;element ref="{http://beans.gestorimagenes.imdea.com}bks"/&amp;gt;
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
    "info",
    "params",
    "bks"
})
@XmlRootElement(name = "setPicRequest")
public class SetPicRequest {

    @XmlElement(required = true)
    protected Info info;
    @XmlElement(required = true)
    protected Params params;
    @XmlElement(required = true)
    protected byte[] bks;

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
     * Obtiene el valor de la propiedad params.
     * 
     * @return
     *     possible object is
     *     {@link Params }
     *     
     */
    public Params getParams() {
        return params;
    }

    /**
     * Define el valor de la propiedad params.
     * 
     * @param value
     *     allowed object is
     *     {@link Params }
     *     
     */
    public void setParams(Params value) {
        this.params = value;
    }

    /**
     * Obtiene el valor de la propiedad bks.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBks() {
        return bks;
    }

    /**
     * Define el valor de la propiedad bks.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBks(byte[] value) {
        this.bks = value;
    }

}
