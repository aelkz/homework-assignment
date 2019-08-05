
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de phoneHistoryBean complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="phoneHistoryBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phoneExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phoneHistoryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phoneIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phoneType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phoneHistoryBean", propOrder = {
    "phone",
    "phoneExt",
    "phoneHistoryId",
    "phoneIndex",
    "phoneType"
})
public class PhoneHistoryBean
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String phone;
    protected String phoneExt;
    protected String phoneHistoryId;
    protected String phoneIndex;
    protected String phoneType;

    /**
     * Obtém o valor da propriedade phone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Define o valor da propriedade phone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    public boolean isSetPhone() {
        return (this.phone!= null);
    }

    /**
     * Obtém o valor da propriedade phoneExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneExt() {
        return phoneExt;
    }

    /**
     * Define o valor da propriedade phoneExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneExt(String value) {
        this.phoneExt = value;
    }

    public boolean isSetPhoneExt() {
        return (this.phoneExt!= null);
    }

    /**
     * Obtém o valor da propriedade phoneHistoryId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneHistoryId() {
        return phoneHistoryId;
    }

    /**
     * Define o valor da propriedade phoneHistoryId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneHistoryId(String value) {
        this.phoneHistoryId = value;
    }

    public boolean isSetPhoneHistoryId() {
        return (this.phoneHistoryId!= null);
    }

    /**
     * Obtém o valor da propriedade phoneIndex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneIndex() {
        return phoneIndex;
    }

    /**
     * Define o valor da propriedade phoneIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneIndex(String value) {
        this.phoneIndex = value;
    }

    public boolean isSetPhoneIndex() {
        return (this.phoneIndex!= null);
    }

    /**
     * Obtém o valor da propriedade phoneType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneType() {
        return phoneType;
    }

    /**
     * Define o valor da propriedade phoneType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneType(String value) {
        this.phoneType = value;
    }

    public boolean isSetPhoneType() {
        return (this.phoneType!= null);
    }

}
