
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
 *         &amp;lt;element ref="{http://beans.gestorimagenes.imdea.com}picId" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{http://beans.gestorimagenes.imdea.com}status"/&amp;gt;
 *         &amp;lt;element ref="{http://beans.gestorimagenes.imdea.com}statusDesc"/&amp;gt;
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
    "picId",
    "status",
    "statusDesc"
})
@XmlRootElement(name = "result")
public class Result {

    protected String picId;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String statusDesc;

    /**
     * Obtiene el valor de la propiedad picId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPicId() {
        return picId;
    }

    /**
     * Define el valor de la propiedad picId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPicId(String value) {
        this.picId = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad statusDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Define el valor de la propiedad statusDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDesc(String value) {
        this.statusDesc = value;
    }

}
