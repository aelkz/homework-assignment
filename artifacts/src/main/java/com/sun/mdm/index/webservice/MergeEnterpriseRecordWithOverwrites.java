
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de mergeEnterpriseRecordWithOverwrites complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="mergeEnterpriseRecordWithOverwrites"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callerInfo" type="{http://webservice.index.mdm.sun.com/}callerInfo" minOccurs="0"/&gt;
 *         &lt;element name="fromEUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toEUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calculateOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="setSourceSystemStatusToMerged" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="overwrite" type="{http://webservice.index.mdm.sun.com/}sbrOverWriteBean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mergeEnterpriseRecordWithOverwrites", propOrder = {
    "callerInfo",
    "fromEUID",
    "toEUID",
    "calculateOnly",
    "setSourceSystemStatusToMerged",
    "overwrites"
})
@XmlRootElement(name = "mergeEnterpriseRecordWithOverwrites")
public class MergeEnterpriseRecordWithOverwrites
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected CallerInfo callerInfo;
    protected String fromEUID;
    protected String toEUID;
    protected boolean calculateOnly;
    protected boolean setSourceSystemStatusToMerged;
    @XmlElement(name = "overwrite", nillable = true)
    protected List<SbrOverWriteBean> overwrites;

    /**
     * Obtém o valor da propriedade callerInfo.
     * 
     * @return
     *     possible object is
     *     {@link CallerInfo }
     *     
     */
    public CallerInfo getCallerInfo() {
        return callerInfo;
    }

    /**
     * Define o valor da propriedade callerInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link CallerInfo }
     *     
     */
    public void setCallerInfo(CallerInfo value) {
        this.callerInfo = value;
    }

    public boolean isSetCallerInfo() {
        return (this.callerInfo!= null);
    }

    /**
     * Obtém o valor da propriedade fromEUID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromEUID() {
        return fromEUID;
    }

    /**
     * Define o valor da propriedade fromEUID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromEUID(String value) {
        this.fromEUID = value;
    }

    public boolean isSetFromEUID() {
        return (this.fromEUID!= null);
    }

    /**
     * Obtém o valor da propriedade toEUID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToEUID() {
        return toEUID;
    }

    /**
     * Define o valor da propriedade toEUID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToEUID(String value) {
        this.toEUID = value;
    }

    public boolean isSetToEUID() {
        return (this.toEUID!= null);
    }

    /**
     * Obtém o valor da propriedade calculateOnly.
     * 
     */
    public boolean isCalculateOnly() {
        return calculateOnly;
    }

    /**
     * Define o valor da propriedade calculateOnly.
     * 
     */
    public void setCalculateOnly(boolean value) {
        this.calculateOnly = value;
    }

    public boolean isSetCalculateOnly() {
        return true;
    }

    /**
     * Obtém o valor da propriedade setSourceSystemStatusToMerged.
     * 
     */
    public boolean isSetSourceSystemStatusToMerged() {
        return setSourceSystemStatusToMerged;
    }

    /**
     * Define o valor da propriedade setSourceSystemStatusToMerged.
     * 
     */
    public void setSetSourceSystemStatusToMerged(boolean value) {
        this.setSourceSystemStatusToMerged = value;
    }

    public boolean isSetSetSourceSystemStatusToMerged() {
        return true;
    }

    /**
     * Gets the value of the overwrites property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overwrites property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverwrites().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SbrOverWriteBean }
     * 
     * 
     */
    public List<SbrOverWriteBean> getOverwrites() {
        if (overwrites == null) {
            overwrites = new ArrayList<SbrOverWriteBean>();
        }
        return this.overwrites;
    }

    public boolean isSetOverwrites() {
        return ((this.overwrites!= null)&&(!this.overwrites.isEmpty()));
    }

    public void unsetOverwrites() {
        this.overwrites = null;
    }

}
