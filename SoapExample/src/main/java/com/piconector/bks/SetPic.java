
package com.piconector.bks;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.imdea.gestorimagenes.beans.SetPicRequest;


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
 *         &amp;lt;element ref="{http://beans.gestorimagenes.imdea.com}setPicRequest"/&amp;gt;
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
    "setPicRequest"
})
@XmlRootElement(name = "setPic")
public class SetPic {

    @XmlElement(namespace = "http://beans.gestorimagenes.imdea.com", required = true)
    protected SetPicRequest setPicRequest;

    /**
     * Obtiene el valor de la propiedad setPicRequest.
     * 
     * @return
     *     possible object is
     *     {@link SetPicRequest }
     *     
     */
    public SetPicRequest getSetPicRequest() {
        return setPicRequest;
    }

    /**
     * Define el valor de la propiedad setPicRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link SetPicRequest }
     *     
     */
    public void setSetPicRequest(SetPicRequest value) {
        this.setPicRequest = value;
    }

}
