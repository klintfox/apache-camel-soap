
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
 *         &amp;lt;element name="ConfigStatus" type="{http://www.w3.org/2001/XMLSchema}anyType"/&amp;gt;
 *         &amp;lt;element name="ConfigExtendedStatus" type="{http://www.w3.org/2001/XMLSchema}anyType"/&amp;gt;
 *         &amp;lt;element name="ConfigDescription" type="{http://www.w3.org/2001/XMLSchema}anyType"/&amp;gt;
 *         &amp;lt;element ref="{http://config.piconector.com}FileConfig" minOccurs="0"/&amp;gt;
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
    "configStatus",
    "configExtendedStatus",
    "configDescription",
    "fileConfig"
})
@XmlRootElement(name = "Config")
public class Config {

    @XmlElement(name = "ConfigStatus", namespace = "", required = true)
    protected Object configStatus;
    @XmlElement(name = "ConfigExtendedStatus", namespace = "", required = true)
    protected Object configExtendedStatus;
    @XmlElement(name = "ConfigDescription", namespace = "", required = true)
    protected Object configDescription;
    @XmlElement(name = "FileConfig")
    protected FileConfig fileConfig;

    /**
     * Obtiene el valor de la propiedad configStatus.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getConfigStatus() {
        return configStatus;
    }

    /**
     * Define el valor de la propiedad configStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setConfigStatus(Object value) {
        this.configStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad configExtendedStatus.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getConfigExtendedStatus() {
        return configExtendedStatus;
    }

    /**
     * Define el valor de la propiedad configExtendedStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setConfigExtendedStatus(Object value) {
        this.configExtendedStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad configDescription.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getConfigDescription() {
        return configDescription;
    }

    /**
     * Define el valor de la propiedad configDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setConfigDescription(Object value) {
        this.configDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad fileConfig.
     * 
     * @return
     *     possible object is
     *     {@link FileConfig }
     *     
     */
    public FileConfig getFileConfig() {
        return fileConfig;
    }

    /**
     * Define el valor de la propiedad fileConfig.
     * 
     * @param value
     *     allowed object is
     *     {@link FileConfig }
     *     
     */
    public void setFileConfig(FileConfig value) {
        this.fileConfig = value;
    }

}
