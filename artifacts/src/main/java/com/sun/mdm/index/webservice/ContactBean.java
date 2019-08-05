
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de contactBean complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="contactBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactHomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactNameDegree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactNamePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactNameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactRel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactWorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactBean", propOrder = {
    "contactFirstName",
    "contactHomePhone",
    "contactId",
    "contactLastName",
    "contactMiddleName",
    "contactName",
    "contactNameDegree",
    "contactNamePrefix",
    "contactNameSuffix",
    "contactRel",
    "contactRole",
    "contactWorkPhone"
})
public class ContactBean
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String contactFirstName;
    protected String contactHomePhone;
    protected String contactId;
    protected String contactLastName;
    protected String contactMiddleName;
    protected String contactName;
    protected String contactNameDegree;
    protected String contactNamePrefix;
    protected String contactNameSuffix;
    protected String contactRel;
    protected String contactRole;
    protected String contactWorkPhone;

    /**
     * Obtém o valor da propriedade contactFirstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactFirstName() {
        return contactFirstName;
    }

    /**
     * Define o valor da propriedade contactFirstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactFirstName(String value) {
        this.contactFirstName = value;
    }

    public boolean isSetContactFirstName() {
        return (this.contactFirstName!= null);
    }

    /**
     * Obtém o valor da propriedade contactHomePhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactHomePhone() {
        return contactHomePhone;
    }

    /**
     * Define o valor da propriedade contactHomePhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactHomePhone(String value) {
        this.contactHomePhone = value;
    }

    public boolean isSetContactHomePhone() {
        return (this.contactHomePhone!= null);
    }

    /**
     * Obtém o valor da propriedade contactId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactId() {
        return contactId;
    }

    /**
     * Define o valor da propriedade contactId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactId(String value) {
        this.contactId = value;
    }

    public boolean isSetContactId() {
        return (this.contactId!= null);
    }

    /**
     * Obtém o valor da propriedade contactLastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactLastName() {
        return contactLastName;
    }

    /**
     * Define o valor da propriedade contactLastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactLastName(String value) {
        this.contactLastName = value;
    }

    public boolean isSetContactLastName() {
        return (this.contactLastName!= null);
    }

    /**
     * Obtém o valor da propriedade contactMiddleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMiddleName() {
        return contactMiddleName;
    }

    /**
     * Define o valor da propriedade contactMiddleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMiddleName(String value) {
        this.contactMiddleName = value;
    }

    public boolean isSetContactMiddleName() {
        return (this.contactMiddleName!= null);
    }

    /**
     * Obtém o valor da propriedade contactName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Define o valor da propriedade contactName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    public boolean isSetContactName() {
        return (this.contactName!= null);
    }

    /**
     * Obtém o valor da propriedade contactNameDegree.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNameDegree() {
        return contactNameDegree;
    }

    /**
     * Define o valor da propriedade contactNameDegree.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNameDegree(String value) {
        this.contactNameDegree = value;
    }

    public boolean isSetContactNameDegree() {
        return (this.contactNameDegree!= null);
    }

    /**
     * Obtém o valor da propriedade contactNamePrefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNamePrefix() {
        return contactNamePrefix;
    }

    /**
     * Define o valor da propriedade contactNamePrefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNamePrefix(String value) {
        this.contactNamePrefix = value;
    }

    public boolean isSetContactNamePrefix() {
        return (this.contactNamePrefix!= null);
    }

    /**
     * Obtém o valor da propriedade contactNameSuffix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNameSuffix() {
        return contactNameSuffix;
    }

    /**
     * Define o valor da propriedade contactNameSuffix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNameSuffix(String value) {
        this.contactNameSuffix = value;
    }

    public boolean isSetContactNameSuffix() {
        return (this.contactNameSuffix!= null);
    }

    /**
     * Obtém o valor da propriedade contactRel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactRel() {
        return contactRel;
    }

    /**
     * Define o valor da propriedade contactRel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactRel(String value) {
        this.contactRel = value;
    }

    public boolean isSetContactRel() {
        return (this.contactRel!= null);
    }

    /**
     * Obtém o valor da propriedade contactRole.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactRole() {
        return contactRole;
    }

    /**
     * Define o valor da propriedade contactRole.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactRole(String value) {
        this.contactRole = value;
    }

    public boolean isSetContactRole() {
        return (this.contactRole!= null);
    }

    /**
     * Obtém o valor da propriedade contactWorkPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactWorkPhone() {
        return contactWorkPhone;
    }

    /**
     * Define o valor da propriedade contactWorkPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactWorkPhone(String value) {
        this.contactWorkPhone = value;
    }

    public boolean isSetContactWorkPhone() {
        return (this.contactWorkPhone!= null);
    }

}
