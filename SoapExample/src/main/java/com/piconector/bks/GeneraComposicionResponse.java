
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
 *         &amp;lt;element name="generaComposicionReturn" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
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
    "generaComposicionReturn"
})
@XmlRootElement(name = "generaComposicionResponse")
public class GeneraComposicionResponse {

    @XmlElement(required = true, nillable = true)
    protected String generaComposicionReturn;

    /**
     * Obtiene el valor de la propiedad generaComposicionReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneraComposicionReturn() {
        return generaComposicionReturn;
    }

    /**
     * Define el valor de la propiedad generaComposicionReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneraComposicionReturn(String value) {
        this.generaComposicionReturn = value;
    }

}
