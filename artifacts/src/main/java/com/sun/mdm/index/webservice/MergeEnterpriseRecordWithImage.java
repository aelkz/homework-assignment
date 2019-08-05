
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de mergeEnterpriseRecordWithImage complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="mergeEnterpriseRecordWithImage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callerInfo" type="{http://webservice.index.mdm.sun.com/}callerInfo" minOccurs="0"/&gt;
 *         &lt;element name="fromEUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destinationEO" type="{http://webservice.index.mdm.sun.com/}enterprisePerson" minOccurs="0"/&gt;
 *         &lt;element name="calculateOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="setSourceSystemStatusToMerged" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mergeEnterpriseRecordWithImage", propOrder = {
    "callerInfo",
    "fromEUID",
    "destinationEO",
    "calculateOnly",
    "setSourceSystemStatusToMerged"
})
@XmlRootElement(name = "mergeEnterpriseRecordWithImage")
public class MergeEnterpriseRecordWithImage
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected CallerInfo callerInfo;
    protected String fromEUID;
    protected EnterprisePerson destinationEO;
    protected boolean calculateOnly;
    protected boolean setSourceSystemStatusToMerged;

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
     * Obtém o valor da propriedade destinationEO.
     * 
     * @return
     *     possible object is
     *     {@link EnterprisePerson }
     *     
     */
    public EnterprisePerson getDestinationEO() {
        return destinationEO;
    }

    /**
     * Define o valor da propriedade destinationEO.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterprisePerson }
     *     
     */
    public void setDestinationEO(EnterprisePerson value) {
        this.destinationEO = value;
    }

    public boolean isSetDestinationEO() {
        return (this.destinationEO!= null);
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

}
