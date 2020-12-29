
package com.piconector.bks;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.imdea.gestorimagenes.beans.GetAllPicRequest;


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
 *         &amp;lt;element ref="{http://beans.gestorimagenes.imdea.com}getAllPicRequest"/&amp;gt;
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
    "getAllPicRequest"
})
@XmlRootElement(name = "getAllPic")
public class GetAllPic {

    @XmlElement(namespace = "http://beans.gestorimagenes.imdea.com", required = true)
    protected GetAllPicRequest getAllPicRequest;

    /**
     * Obtiene el valor de la propiedad getAllPicRequest.
     * 
     * @return
     *     possible object is
     *     {@link GetAllPicRequest }
     *     
     */
    public GetAllPicRequest getGetAllPicRequest() {
        return getAllPicRequest;
    }

    /**
     * Define el valor de la propiedad getAllPicRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAllPicRequest }
     *     
     */
    public void setGetAllPicRequest(GetAllPicRequest value) {
        this.getAllPicRequest = value;
    }

}
