
package com.piconector.config;

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
 *         &amp;lt;element ref="{http://config.piconector.com}Piinfo"/&amp;gt;
 *         &amp;lt;element ref="{http://config.piconector.com}Piconfiguration"/&amp;gt;
 *         &amp;lt;element ref="{http://config.piconector.com}Piconnections" minOccurs="0"/&amp;gt;
 *         &amp;lt;element ref="{http://config.piconector.com}Pistorage"/&amp;gt;
 *         &amp;lt;element ref="{http://config.piconector.com}Pipurgers"/&amp;gt;
 *         &amp;lt;element ref="{http://config.piconector.com}Piloggers"/&amp;gt;
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
    "piinfo",
    "piconfiguration",
    "piconnections",
    "pistorage",
    "pipurgers",
    "piloggers"
})
@XmlRootElement(name = "FileConfig")
public class FileConfig {

    @XmlElement(name = "Piinfo", required = true)
    protected Piinfo piinfo;
    @XmlElement(name = "Piconfiguration", required = true)
    protected Piconfiguration piconfiguration;
    @XmlElement(name = "Piconnections")
    protected Piconnections piconnections;
    @XmlElement(name = "Pistorage", required = true)
    protected Pistorage pistorage;
    @XmlElement(name = "Pipurgers", required = true)
    protected Pipurgers pipurgers;
    @XmlElement(name = "Piloggers", required = true)
    protected Piloggers piloggers;

    /**
     * Obtiene el valor de la propiedad piinfo.
     * 
     * @return
     *     possible object is
     *     {@link Piinfo }
     *     
     */
    public Piinfo getPiinfo() {
        return piinfo;
    }

    /**
     * Define el valor de la propiedad piinfo.
     * 
     * @param value
     *     allowed object is
     *     {@link Piinfo }
     *     
     */
    public void setPiinfo(Piinfo value) {
        this.piinfo = value;
    }

    /**
     * Obtiene el valor de la propiedad piconfiguration.
     * 
     * @return
     *     possible object is
     *     {@link Piconfiguration }
     *     
     */
    public Piconfiguration getPiconfiguration() {
        return piconfiguration;
    }

    /**
     * Define el valor de la propiedad piconfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link Piconfiguration }
     *     
     */
    public void setPiconfiguration(Piconfiguration value) {
        this.piconfiguration = value;
    }

    /**
     * Obtiene el valor de la propiedad piconnections.
     * 
     * @return
     *     possible object is
     *     {@link Piconnections }
     *     
     */
    public Piconnections getPiconnections() {
        return piconnections;
    }

    /**
     * Define el valor de la propiedad piconnections.
     * 
     * @param value
     *     allowed object is
     *     {@link Piconnections }
     *     
     */
    public void setPiconnections(Piconnections value) {
        this.piconnections = value;
    }

    /**
     * Obtiene el valor de la propiedad pistorage.
     * 
     * @return
     *     possible object is
     *     {@link Pistorage }
     *     
     */
    public Pistorage getPistorage() {
        return pistorage;
    }

    /**
     * Define el valor de la propiedad pistorage.
     * 
     * @param value
     *     allowed object is
     *     {@link Pistorage }
     *     
     */
    public void setPistorage(Pistorage value) {
        this.pistorage = value;
    }

    /**
     * Obtiene el valor de la propiedad pipurgers.
     * 
     * @return
     *     possible object is
     *     {@link Pipurgers }
     *     
     */
    public Pipurgers getPipurgers() {
        return pipurgers;
    }

    /**
     * Define el valor de la propiedad pipurgers.
     * 
     * @param value
     *     allowed object is
     *     {@link Pipurgers }
     *     
     */
    public void setPipurgers(Pipurgers value) {
        this.pipurgers = value;
    }

    /**
     * Obtiene el valor de la propiedad piloggers.
     * 
     * @return
     *     possible object is
     *     {@link Piloggers }
     *     
     */
    public Piloggers getPiloggers() {
        return piloggers;
    }

    /**
     * Define el valor de la propiedad piloggers.
     * 
     * @param value
     *     allowed object is
     *     {@link Piloggers }
     *     
     */
    public void setPiloggers(Piloggers value) {
        this.piloggers = value;
    }

}
