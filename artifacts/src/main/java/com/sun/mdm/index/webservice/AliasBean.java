
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de aliasBean complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="aliasBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aliasId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aliasType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fnamePhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lnamePhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mnamePhoneticCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stdFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stdLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stdMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aliasBean", propOrder = {
    "aliasId",
    "aliasType",
    "firstName",
    "fnamePhoneticCode",
    "lastName",
    "lnamePhoneticCode",
    "middleName",
    "mnamePhoneticCode",
    "stdFirstName",
    "stdLastName",
    "stdMiddleName"
})
public class AliasBean
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String aliasId;
    protected String aliasType;
    protected String firstName;
    protected String fnamePhoneticCode;
    protected String lastName;
    protected String lnamePhoneticCode;
    protected String middleName;
    protected String mnamePhoneticCode;
    protected String stdFirstName;
    protected String stdLastName;
    protected String stdMiddleName;

    /**
     * Obtém o valor da propriedade aliasId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasId() {
        return aliasId;
    }

    /**
     * Define o valor da propriedade aliasId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasId(String value) {
        this.aliasId = value;
    }

    public boolean isSetAliasId() {
        return (this.aliasId!= null);
    }

    /**
     * Obtém o valor da propriedade aliasType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasType() {
        return aliasType;
    }

    /**
     * Define o valor da propriedade aliasType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasType(String value) {
        this.aliasType = value;
    }

    public boolean isSetAliasType() {
        return (this.aliasType!= null);
    }

    /**
     * Obtém o valor da propriedade firstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Define o valor da propriedade firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    public boolean isSetFirstName() {
        return (this.firstName!= null);
    }

    /**
     * Obtém o valor da propriedade fnamePhoneticCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFnamePhoneticCode() {
        return fnamePhoneticCode;
    }

    /**
     * Define o valor da propriedade fnamePhoneticCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFnamePhoneticCode(String value) {
        this.fnamePhoneticCode = value;
    }

    public boolean isSetFnamePhoneticCode() {
        return (this.fnamePhoneticCode!= null);
    }

    /**
     * Obtém o valor da propriedade lastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Define o valor da propriedade lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    public boolean isSetLastName() {
        return (this.lastName!= null);
    }

    /**
     * Obtém o valor da propriedade lnamePhoneticCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLnamePhoneticCode() {
        return lnamePhoneticCode;
    }

    /**
     * Define o valor da propriedade lnamePhoneticCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLnamePhoneticCode(String value) {
        this.lnamePhoneticCode = value;
    }

    public boolean isSetLnamePhoneticCode() {
        return (this.lnamePhoneticCode!= null);
    }

    /**
     * Obtém o valor da propriedade middleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Define o valor da propriedade middleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    public boolean isSetMiddleName() {
        return (this.middleName!= null);
    }

    /**
     * Obtém o valor da propriedade mnamePhoneticCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnamePhoneticCode() {
        return mnamePhoneticCode;
    }

    /**
     * Define o valor da propriedade mnamePhoneticCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnamePhoneticCode(String value) {
        this.mnamePhoneticCode = value;
    }

    public boolean isSetMnamePhoneticCode() {
        return (this.mnamePhoneticCode!= null);
    }

    /**
     * Obtém o valor da propriedade stdFirstName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdFirstName() {
        return stdFirstName;
    }

    /**
     * Define o valor da propriedade stdFirstName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdFirstName(String value) {
        this.stdFirstName = value;
    }

    public boolean isSetStdFirstName() {
        return (this.stdFirstName!= null);
    }

    /**
     * Obtém o valor da propriedade stdLastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdLastName() {
        return stdLastName;
    }

    /**
     * Define o valor da propriedade stdLastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdLastName(String value) {
        this.stdLastName = value;
    }

    public boolean isSetStdLastName() {
        return (this.stdLastName!= null);
    }

    /**
     * Obtém o valor da propriedade stdMiddleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdMiddleName() {
        return stdMiddleName;
    }

    /**
     * Define o valor da propriedade stdMiddleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdMiddleName(String value) {
        this.stdMiddleName = value;
    }

    public boolean isSetStdMiddleName() {
        return (this.stdMiddleName!= null);
    }

}
