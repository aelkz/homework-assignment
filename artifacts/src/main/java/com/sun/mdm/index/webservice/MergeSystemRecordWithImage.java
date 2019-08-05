
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de mergeSystemRecordWithImage complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="mergeSystemRecordWithImage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callerInfo" type="{http://webservice.index.mdm.sun.com/}callerInfo" minOccurs="0"/&gt;
 *         &lt;element name="systemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourceLID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destLID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destImage" type="{http://webservice.index.mdm.sun.com/}personObject" minOccurs="0"/&gt;
 *         &lt;element name="calculateOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mergeSystemRecordWithImage", propOrder = {
    "callerInfo",
    "systemCode",
    "sourceLID",
    "destLID",
    "destImage",
    "calculateOnly"
})
@XmlRootElement(name = "mergeSystemRecordWithImage")
public class MergeSystemRecordWithImage
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected CallerInfo callerInfo;
    protected String systemCode;
    protected String sourceLID;
    protected String destLID;
    protected PersonObject destImage;
    protected boolean calculateOnly;

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
     * Obtém o valor da propriedade systemCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemCode() {
        return systemCode;
    }

    /**
     * Define o valor da propriedade systemCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemCode(String value) {
        this.systemCode = value;
    }

    public boolean isSetSystemCode() {
        return (this.systemCode!= null);
    }

    /**
     * Obtém o valor da propriedade sourceLID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceLID() {
        return sourceLID;
    }

    /**
     * Define o valor da propriedade sourceLID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceLID(String value) {
        this.sourceLID = value;
    }

    public boolean isSetSourceLID() {
        return (this.sourceLID!= null);
    }

    /**
     * Obtém o valor da propriedade destLID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestLID() {
        return destLID;
    }

    /**
     * Define o valor da propriedade destLID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestLID(String value) {
        this.destLID = value;
    }

    public boolean isSetDestLID() {
        return (this.destLID!= null);
    }

    /**
     * Obtém o valor da propriedade destImage.
     * 
     * @return
     *     possible object is
     *     {@link PersonObject }
     *     
     */
    public PersonObject getDestImage() {
        return destImage;
    }

    /**
     * Define o valor da propriedade destImage.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonObject }
     *     
     */
    public void setDestImage(PersonObject value) {
        this.destImage = value;
    }

    public boolean isSetDestImage() {
        return (this.destImage!= null);
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

}
