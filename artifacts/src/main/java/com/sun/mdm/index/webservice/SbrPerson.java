
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de sbrPerson complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="sbrPerson"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="createDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="createFunction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="person" type="{http://webservice.index.mdm.sun.com/}personBean" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="updateFunction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updateSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sbrPerson", propOrder = {
    "createDateTime",
    "createFunction",
    "createSystem",
    "createUser",
    "person",
    "status",
    "updateDateTime",
    "updateFunction",
    "updateSystem",
    "updateUser"
})
public class SbrPerson
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    protected String createFunction;
    protected String createSystem;
    protected String createUser;
    protected PersonBean person;
    protected String status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDateTime;
    protected String updateFunction;
    protected String updateSystem;
    protected String updateUser;

    /**
     * Obtém o valor da propriedade createDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * Define o valor da propriedade createDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

    public boolean isSetCreateDateTime() {
        return (this.createDateTime!= null);
    }

    /**
     * Obtém o valor da propriedade createFunction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateFunction() {
        return createFunction;
    }

    /**
     * Define o valor da propriedade createFunction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateFunction(String value) {
        this.createFunction = value;
    }

    public boolean isSetCreateFunction() {
        return (this.createFunction!= null);
    }

    /**
     * Obtém o valor da propriedade createSystem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateSystem() {
        return createSystem;
    }

    /**
     * Define o valor da propriedade createSystem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateSystem(String value) {
        this.createSystem = value;
    }

    public boolean isSetCreateSystem() {
        return (this.createSystem!= null);
    }

    /**
     * Obtém o valor da propriedade createUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * Define o valor da propriedade createUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateUser(String value) {
        this.createUser = value;
    }

    public boolean isSetCreateUser() {
        return (this.createUser!= null);
    }

    /**
     * Obtém o valor da propriedade person.
     * 
     * @return
     *     possible object is
     *     {@link PersonBean }
     *     
     */
    public PersonBean getPerson() {
        return person;
    }

    /**
     * Define o valor da propriedade person.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonBean }
     *     
     */
    public void setPerson(PersonBean value) {
        this.person = value;
    }

    public boolean isSetPerson() {
        return (this.person!= null);
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return (this.status!= null);
    }

    /**
     * Obtém o valor da propriedade updateDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDateTime() {
        return updateDateTime;
    }

    /**
     * Define o valor da propriedade updateDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDateTime(XMLGregorianCalendar value) {
        this.updateDateTime = value;
    }

    public boolean isSetUpdateDateTime() {
        return (this.updateDateTime!= null);
    }

    /**
     * Obtém o valor da propriedade updateFunction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateFunction() {
        return updateFunction;
    }

    /**
     * Define o valor da propriedade updateFunction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateFunction(String value) {
        this.updateFunction = value;
    }

    public boolean isSetUpdateFunction() {
        return (this.updateFunction!= null);
    }

    /**
     * Obtém o valor da propriedade updateSystem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateSystem() {
        return updateSystem;
    }

    /**
     * Define o valor da propriedade updateSystem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateSystem(String value) {
        this.updateSystem = value;
    }

    public boolean isSetUpdateSystem() {
        return (this.updateSystem!= null);
    }

    /**
     * Obtém o valor da propriedade updateUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * Define o valor da propriedade updateUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateUser(String value) {
        this.updateUser = value;
    }

    public boolean isSetUpdateUser() {
        return (this.updateUser!= null);
    }

}
