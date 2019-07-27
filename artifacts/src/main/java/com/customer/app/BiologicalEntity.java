//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.07.26 às 04:04:44 PM BRT 
//


package com.customer.app;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Entity - Person - Biological Entity
 * 
 * <p>Classe Java de BiologicalEntity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BiologicalEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.app.customer.com}Parties"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="agegroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateofdeath" type="{http://www.app.customer.com}PointInTime" minOccurs="0"/&gt;
 *         &lt;element name="isdeceased" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="deathcertificatenumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isorgandonor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="multiplebirthorder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ageatdeath" type="{http://www.app.customer.com}TimeQuantity" minOccurs="0"/&gt;
 *         &lt;element name="wasmultiplebirth" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dateofbirth" type="{http://www.app.customer.com}PointInTime" minOccurs="0"/&gt;
 *         &lt;element name="Patient" type="{http://www.app.customer.com}Patient" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CauseOfDeath" type="{http://www.app.customer.com}CauseOfDeath" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BiologicalEntity", propOrder = {
    "age",
    "agegroup",
    "dateofdeath",
    "isdeceased",
    "deathcertificatenumber",
    "isorgandonor",
    "multiplebirthorder",
    "ageatdeath",
    "wasmultiplebirth",
    "dateofbirth",
    "patients",
    "causeOfDeaths"
})
@XmlSeeAlso({
    Person.class
})
public class BiologicalEntity
    extends Parties
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Integer age;
    protected String agegroup;
    protected PointInTime dateofdeath;
    protected Boolean isdeceased;
    protected String deathcertificatenumber;
    protected Boolean isorgandonor;
    protected Integer multiplebirthorder;
    protected TimeQuantity ageatdeath;
    protected Boolean wasmultiplebirth;
    protected PointInTime dateofbirth;
    @XmlElement(name = "Patient")
    protected List<Patient> patients;
    @XmlElement(name = "CauseOfDeath")
    protected List<CauseOfDeath> causeOfDeaths;

    /**
     * Obtém o valor da propriedade age.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Define o valor da propriedade age.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAge(Integer value) {
        this.age = value;
    }

    /**
     * Obtém o valor da propriedade agegroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgegroup() {
        return agegroup;
    }

    /**
     * Define o valor da propriedade agegroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgegroup(String value) {
        this.agegroup = value;
    }

    /**
     * Obtém o valor da propriedade dateofdeath.
     * 
     * @return
     *     possible object is
     *     {@link PointInTime }
     *     
     */
    public PointInTime getDateofdeath() {
        return dateofdeath;
    }

    /**
     * Define o valor da propriedade dateofdeath.
     * 
     * @param value
     *     allowed object is
     *     {@link PointInTime }
     *     
     */
    public void setDateofdeath(PointInTime value) {
        this.dateofdeath = value;
    }

    /**
     * Obtém o valor da propriedade isdeceased.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsdeceased() {
        return isdeceased;
    }

    /**
     * Define o valor da propriedade isdeceased.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsdeceased(Boolean value) {
        this.isdeceased = value;
    }

    /**
     * Obtém o valor da propriedade deathcertificatenumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathcertificatenumber() {
        return deathcertificatenumber;
    }

    /**
     * Define o valor da propriedade deathcertificatenumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathcertificatenumber(String value) {
        this.deathcertificatenumber = value;
    }

    /**
     * Obtém o valor da propriedade isorgandonor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsorgandonor() {
        return isorgandonor;
    }

    /**
     * Define o valor da propriedade isorgandonor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsorgandonor(Boolean value) {
        this.isorgandonor = value;
    }

    /**
     * Obtém o valor da propriedade multiplebirthorder.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMultiplebirthorder() {
        return multiplebirthorder;
    }

    /**
     * Define o valor da propriedade multiplebirthorder.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMultiplebirthorder(Integer value) {
        this.multiplebirthorder = value;
    }

    /**
     * Obtém o valor da propriedade ageatdeath.
     * 
     * @return
     *     possible object is
     *     {@link TimeQuantity }
     *     
     */
    public TimeQuantity getAgeatdeath() {
        return ageatdeath;
    }

    /**
     * Define o valor da propriedade ageatdeath.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeQuantity }
     *     
     */
    public void setAgeatdeath(TimeQuantity value) {
        this.ageatdeath = value;
    }

    /**
     * Obtém o valor da propriedade wasmultiplebirth.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWasmultiplebirth() {
        return wasmultiplebirth;
    }

    /**
     * Define o valor da propriedade wasmultiplebirth.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWasmultiplebirth(Boolean value) {
        this.wasmultiplebirth = value;
    }

    /**
     * Obtém o valor da propriedade dateofbirth.
     * 
     * @return
     *     possible object is
     *     {@link PointInTime }
     *     
     */
    public PointInTime getDateofbirth() {
        return dateofbirth;
    }

    /**
     * Define o valor da propriedade dateofbirth.
     * 
     * @param value
     *     allowed object is
     *     {@link PointInTime }
     *     
     */
    public void setDateofbirth(PointInTime value) {
        this.dateofbirth = value;
    }

    /**
     * Gets the value of the patients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the patients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPatients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Patient }
     * 
     * 
     */
    public List<Patient> getPatients() {
        if (patients == null) {
            patients = new ArrayList<Patient>();
        }
        return this.patients;
    }

    /**
     * Gets the value of the causeOfDeaths property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the causeOfDeaths property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCauseOfDeaths().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CauseOfDeath }
     * 
     * 
     */
    public List<CauseOfDeath> getCauseOfDeaths() {
        if (causeOfDeaths == null) {
            causeOfDeaths = new ArrayList<CauseOfDeath>();
        }
        return this.causeOfDeaths;
    }

}
