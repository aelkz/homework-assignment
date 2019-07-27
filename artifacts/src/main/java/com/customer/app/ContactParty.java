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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contact Party 
 * 
 * <p>Classe Java de ContactParty complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ContactParty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactcategory" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="contactreason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isprimarycontact" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="effectivedaterange" type="{http://www.app.customer.com}TimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="enddate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Person" type="{http://www.app.customer.com}Person" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactParty", propOrder = {
    "contactcategory",
    "contactreason",
    "isprimarycontact",
    "effectivedaterange",
    "enddate",
    "person"
})
@XmlRootElement(name = "ContactParty")
public class ContactParty
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Code contactcategory;
    protected String contactreason;
    protected Boolean isprimarycontact;
    protected TimeInterval effectivedaterange;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar enddate;
    @XmlElement(name = "Person")
    protected Person person;

    /**
     * Obtém o valor da propriedade contactcategory.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getContactcategory() {
        return contactcategory;
    }

    /**
     * Define o valor da propriedade contactcategory.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setContactcategory(Code value) {
        this.contactcategory = value;
    }

    /**
     * Obtém o valor da propriedade contactreason.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactreason() {
        return contactreason;
    }

    /**
     * Define o valor da propriedade contactreason.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactreason(String value) {
        this.contactreason = value;
    }

    /**
     * Obtém o valor da propriedade isprimarycontact.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsprimarycontact() {
        return isprimarycontact;
    }

    /**
     * Define o valor da propriedade isprimarycontact.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsprimarycontact(Boolean value) {
        this.isprimarycontact = value;
    }

    /**
     * Obtém o valor da propriedade effectivedaterange.
     * 
     * @return
     *     possible object is
     *     {@link TimeInterval }
     *     
     */
    public TimeInterval getEffectivedaterange() {
        return effectivedaterange;
    }

    /**
     * Define o valor da propriedade effectivedaterange.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInterval }
     *     
     */
    public void setEffectivedaterange(TimeInterval value) {
        this.effectivedaterange = value;
    }

    /**
     * Obtém o valor da propriedade enddate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnddate() {
        return enddate;
    }

    /**
     * Define o valor da propriedade enddate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnddate(XMLGregorianCalendar value) {
        this.enddate = value;
    }

    /**
     * Obtém o valor da propriedade person.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Define o valor da propriedade person.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

}
