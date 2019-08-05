
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de transferSystemRecordUID complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="transferSystemRecordUID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callerInfo" type="{http://webservice.index.mdm.sun.com/}callerInfo" minOccurs="0"/&gt;
 *         &lt;element name="destSystemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destLID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transferSystemRecordUID", propOrder = {
    "callerInfo",
    "destSystemCode",
    "destLID",
    "uidType",
    "uid"
})
@XmlRootElement(name = "transferSystemRecordUID")
public class TransferSystemRecordUID
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected CallerInfo callerInfo;
    protected String destSystemCode;
    protected String destLID;
    @XmlElement(name = "UIDType")
    protected String uidType;
    @XmlElement(name = "UID")
    protected String uid;

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
     * Obtém o valor da propriedade destSystemCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestSystemCode() {
        return destSystemCode;
    }

    /**
     * Define o valor da propriedade destSystemCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestSystemCode(String value) {
        this.destSystemCode = value;
    }

    public boolean isSetDestSystemCode() {
        return (this.destSystemCode!= null);
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
     * Obtém o valor da propriedade uidType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUIDType() {
        return uidType;
    }

    /**
     * Define o valor da propriedade uidType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUIDType(String value) {
        this.uidType = value;
    }

    public boolean isSetUIDType() {
        return (this.uidType!= null);
    }

    /**
     * Obtém o valor da propriedade uid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUID() {
        return uid;
    }

    /**
     * Define o valor da propriedade uid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUID(String value) {
        this.uid = value;
    }

    public boolean isSetUID() {
        return (this.uid!= null);
    }

}
