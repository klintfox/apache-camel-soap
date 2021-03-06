
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
 *         &amp;lt;element name="obtenerEstadoReenvioReturn" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
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
    "obtenerEstadoReenvioReturn"
})
@XmlRootElement(name = "obtenerEstadoReenvioResponse")
public class ObtenerEstadoReenvioResponse {

    @XmlElement(required = true, nillable = true)
    protected String obtenerEstadoReenvioReturn;

    /**
     * Obtiene el valor de la propiedad obtenerEstadoReenvioReturn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObtenerEstadoReenvioReturn() {
        return obtenerEstadoReenvioReturn;
    }

    /**
     * Define el valor de la propiedad obtenerEstadoReenvioReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObtenerEstadoReenvioReturn(String value) {
        this.obtenerEstadoReenvioReturn = value;
    }

}
