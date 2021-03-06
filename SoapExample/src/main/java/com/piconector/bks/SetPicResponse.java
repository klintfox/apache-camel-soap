
package com.piconector.bks;

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
 *         &amp;lt;element name="setPicReturn" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
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
    "setPicReturn"
})
@XmlRootElement(name = "setPicResponse")
public class SetPicResponse {

    @XmlElement(required = true, nillable = true)
    protected String setPicReturn;

    /**
     * Obtiene el valor de la propiedad setPicReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetPicReturn() {
        return setPicReturn;
    }

    /**
     * Define el valor de la propiedad setPicReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetPicReturn(String value) {
        this.setPicReturn = value;
    }

}
