
package com.piconector.bks;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.imdea.gestorimagenes.beans.RemovePicRequest;


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
 *         &amp;lt;element ref="{http://beans.gestorimagenes.imdea.com}removePicRequest"/&amp;gt;
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
    "removePicRequest"
})
@XmlRootElement(name = "removePic")
public class RemovePic {

    @XmlElement(namespace = "http://beans.gestorimagenes.imdea.com", required = true)
    protected RemovePicRequest removePicRequest;

    /**
     * Obtiene el valor de la propiedad removePicRequest.
     * 
     * @return
     *     possible object is
     *     {@link RemovePicRequest }
     *     
     */
    public RemovePicRequest getRemovePicRequest() {
        return removePicRequest;
    }

    /**
     * Define el valor de la propiedad removePicRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link RemovePicRequest }
     *     
     */
    public void setRemovePicRequest(RemovePicRequest value) {
        this.removePicRequest = value;
    }

}
