
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de enterprisePerson complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="enterprisePerson"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SBRPerson" type="{http://webservice.index.mdm.sun.com/}sbrPerson" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="systemPerson" type="{http://webservice.index.mdm.sun.com/}systemPerson" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enterprisePerson", propOrder = {
    "euid",
    "sbrPerson",
    "status",
    "systemPersons"
})
public class EnterprisePerson
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "EUID")
    protected String euid;
    @XmlElement(name = "SBRPerson")
    protected SbrPerson sbrPerson;
    protected String status;
    @XmlElement(name = "systemPerson", nillable = true)
    protected List<SystemPerson> systemPersons;

    /**
     * Obtém o valor da propriedade euid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEUID() {
        return euid;
    }

    /**
     * Define o valor da propriedade euid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEUID(String value) {
        this.euid = value;
    }

    public boolean isSetEUID() {
        return (this.euid!= null);
    }

    /**
     * Obtém o valor da propriedade sbrPerson.
     * 
     * @return
     *     possible object is
     *     {@link SbrPerson }
     *     
     */
    public SbrPerson getSBRPerson() {
        return sbrPerson;
    }

    /**
     * Define o valor da propriedade sbrPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link SbrPerson }
     *     
     */
    public void setSBRPerson(SbrPerson value) {
        this.sbrPerson = value;
    }

    public boolean isSetSBRPerson() {
        return (this.sbrPerson!= null);
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
     * Gets the value of the systemPersons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the systemPersons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystemPersons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemPerson }
     * 
     * 
     */
    public List<SystemPerson> getSystemPersons() {
        if (systemPersons == null) {
            systemPersons = new ArrayList<SystemPerson>();
        }
        return this.systemPersons;
    }

    public boolean isSetSystemPersons() {
        return ((this.systemPersons!= null)&&(!this.systemPersons.isEmpty()));
    }

    public void unsetSystemPersons() {
        this.systemPersons = null;
    }

}
