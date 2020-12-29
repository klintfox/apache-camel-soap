
package com.piconector.tracking;

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
 *         &amp;lt;element name="TrackingStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="TrackingExtendedStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="TrackingDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element ref="{http://tracking.piconector.com}Tracking"/&amp;gt;
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
    "trackingStatus",
    "trackingExtendedStatus",
    "trackingDescription",
    "tracking"
})
@XmlRootElement(name = "Root")
public class Root {

    @XmlElement(name = "TrackingStatus", namespace = "", required = true)
    protected String trackingStatus;
    @XmlElement(name = "TrackingExtendedStatus", namespace = "", required = true)
    protected String trackingExtendedStatus;
    @XmlElement(name = "TrackingDescription", namespace = "", required = true)
    protected String trackingDescription;
    @XmlElement(name = "Tracking", required = true, nillable = true)
    protected Tracking tracking;

    /**
     * Obtiene el valor de la propiedad trackingStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingStatus() {
        return trackingStatus;
    }

    /**
     * Define el valor de la propiedad trackingStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingStatus(String value) {
        this.trackingStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad trackingExtendedStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingExtendedStatus() {
        return trackingExtendedStatus;
    }

    /**
     * Define el valor de la propiedad trackingExtendedStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingExtendedStatus(String value) {
        this.trackingExtendedStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad trackingDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingDescription() {
        return trackingDescription;
    }

    /**
     * Define el valor de la propiedad trackingDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingDescription(String value) {
        this.trackingDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad tracking.
     * 
     * @return
     *     possible object is
     *     {@link Tracking }
     *     
     */
    public Tracking getTracking() {
        return tracking;
    }

    /**
     * Define el valor de la propiedad tracking.
     * 
     * @param value
     *     allowed object is
     *     {@link Tracking }
     *     
     */
    public void setTracking(Tracking value) {
        this.tracking = value;
    }

}
