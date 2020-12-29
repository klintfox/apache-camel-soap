
package com.piconector.beans;

import java.util.ArrayList;
import java.util.List;
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
 *         &amp;lt;element ref="{http://beans.piconector.com}ResponseItemInfo" maxOccurs="unbounded"/&amp;gt;
 *         &amp;lt;element ref="{http://beans.piconector.com}ResponseItemURL"/&amp;gt;
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
    "responseItemInfo",
    "responseItemURL"
})
@XmlRootElement(name = "ResponseItem")
public class ResponseItem {

    @XmlElement(name = "ResponseItemInfo", required = true)
    protected List<ResponseItemInfo> responseItemInfo;
    @XmlElement(name = "ResponseItemURL", required = true)
    protected String responseItemURL;

    /**
     * Gets the value of the responseItemInfo property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the responseItemInfo property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getResponseItemInfo().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseItemInfo }
     * 
     * 
     */
    public List<ResponseItemInfo> getResponseItemInfo() {
        if (responseItemInfo == null) {
            responseItemInfo = new ArrayList<ResponseItemInfo>();
        }
        return this.responseItemInfo;
    }

    /**
     * Obtiene el valor de la propiedad responseItemURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseItemURL() {
        return responseItemURL;
    }

    /**
     * Define el valor de la propiedad responseItemURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseItemURL(String value) {
        this.responseItemURL = value;
    }

}
