//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.07.26 às 04:04:44 PM BRT 
//


package com.customer.app;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Healthcare Provider - A health care provider is an individual or an institution that provides preventive, curative, promotional or rehabilitative health care services in a systematic way to individuals, families or communities.
 * 
 * <p>Classe Java de HealthcareProvider complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="HealthcareProvider"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="digitalcertificateid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="digitalcertificatedistinguishedname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.app.customer.com}ID" minOccurs="0"/&gt;
 *         &lt;element name="nationalproviderid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="providercategory" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="providerrole" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="publicdigitalcertificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.app.customer.com}Address" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.app.customer.com}ContactMechanism" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.app.customer.com}ContactMechanism" minOccurs="0"/&gt;
 *         &lt;element name="facsimile" type="{http://www.app.customer.com}ContactMechanism" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthcareProvider", propOrder = {
    "digitalcertificateid",
    "digitalcertificatedistinguishedname",
    "id",
    "nationalproviderid",
    "providercategory",
    "providerrole",
    "publicdigitalcertificate",
    "taxid",
    "address",
    "email",
    "phone",
    "facsimile"
})
@XmlRootElement(name = "HealthcareProvider")
public class HealthcareProvider
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String digitalcertificateid;
    protected String digitalcertificatedistinguishedname;
    protected ID id;
    protected String nationalproviderid;
    protected Code providercategory;
    protected Code providerrole;
    protected String publicdigitalcertificate;
    protected String taxid;
    protected Address address;
    protected ContactMechanism email;
    protected ContactMechanism phone;
    protected ContactMechanism facsimile;

    /**
     * Obtém o valor da propriedade digitalcertificateid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalcertificateid() {
        return digitalcertificateid;
    }

    /**
     * Define o valor da propriedade digitalcertificateid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalcertificateid(String value) {
        this.digitalcertificateid = value;
    }

    /**
     * Obtém o valor da propriedade digitalcertificatedistinguishedname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalcertificatedistinguishedname() {
        return digitalcertificatedistinguishedname;
    }

    /**
     * Define o valor da propriedade digitalcertificatedistinguishedname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalcertificatedistinguishedname(String value) {
        this.digitalcertificatedistinguishedname = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setId(ID value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade nationalproviderid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalproviderid() {
        return nationalproviderid;
    }

    /**
     * Define o valor da propriedade nationalproviderid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalproviderid(String value) {
        this.nationalproviderid = value;
    }

    /**
     * Obtém o valor da propriedade providercategory.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getProvidercategory() {
        return providercategory;
    }

    /**
     * Define o valor da propriedade providercategory.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setProvidercategory(Code value) {
        this.providercategory = value;
    }

    /**
     * Obtém o valor da propriedade providerrole.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getProviderrole() {
        return providerrole;
    }

    /**
     * Define o valor da propriedade providerrole.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setProviderrole(Code value) {
        this.providerrole = value;
    }

    /**
     * Obtém o valor da propriedade publicdigitalcertificate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicdigitalcertificate() {
        return publicdigitalcertificate;
    }

    /**
     * Define o valor da propriedade publicdigitalcertificate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicdigitalcertificate(String value) {
        this.publicdigitalcertificate = value;
    }

    /**
     * Obtém o valor da propriedade taxid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxid() {
        return taxid;
    }

    /**
     * Define o valor da propriedade taxid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxid(String value) {
        this.taxid = value;
    }

    /**
     * Obtém o valor da propriedade address.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Define o valor da propriedade address.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Obtém o valor da propriedade email.
     * 
     * @return
     *     possible object is
     *     {@link ContactMechanism }
     *     
     */
    public ContactMechanism getEmail() {
        return email;
    }

    /**
     * Define o valor da propriedade email.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMechanism }
     *     
     */
    public void setEmail(ContactMechanism value) {
        this.email = value;
    }

    /**
     * Obtém o valor da propriedade phone.
     * 
     * @return
     *     possible object is
     *     {@link ContactMechanism }
     *     
     */
    public ContactMechanism getPhone() {
        return phone;
    }

    /**
     * Define o valor da propriedade phone.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMechanism }
     *     
     */
    public void setPhone(ContactMechanism value) {
        this.phone = value;
    }

    /**
     * Obtém o valor da propriedade facsimile.
     * 
     * @return
     *     possible object is
     *     {@link ContactMechanism }
     *     
     */
    public ContactMechanism getFacsimile() {
        return facsimile;
    }

    /**
     * Define o valor da propriedade facsimile.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMechanism }
     *     
     */
    public void setFacsimile(ContactMechanism value) {
        this.facsimile = value;
    }

}
