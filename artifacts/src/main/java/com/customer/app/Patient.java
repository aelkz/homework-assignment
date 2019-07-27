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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Patient - a person receiving or registered to receive medical treatment.
 * 
 * <p>Classe Java de Patient complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Patient"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="begindate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="enddate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="mothersidentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="patientid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sourcesystemidentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="locationid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="facilitynumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="locationtype" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="HealthcareProvider" type="{http://www.app.customer.com}HealthcareProvider" minOccurs="0"/&gt;
 *         &lt;element name="HealthRecord" type="{http://www.app.customer.com}HealthRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PatientInformation" type="{http://www.app.customer.com}PatientInformation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Patient", propOrder = {
    "begindate",
    "enddate",
    "mothersidentifier",
    "patientid",
    "sourcesystemidentifier",
    "locationid",
    "facilitynumber",
    "locationtype",
    "status",
    "healthcareProvider",
    "healthRecords",
    "patientInformation"
})
@XmlRootElement(name = "Patient")
public class Patient
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar begindate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar enddate;
    protected String mothersidentifier;
    protected String patientid;
    protected String sourcesystemidentifier;
    protected String locationid;
    protected String facilitynumber;
    protected Code locationtype;
    protected Code status;
    @XmlElement(name = "HealthcareProvider")
    protected HealthcareProvider healthcareProvider;
    @XmlElement(name = "HealthRecord")
    protected List<HealthRecord> healthRecords;
    @XmlElement(name = "PatientInformation")
    protected PatientInformation patientInformation;

    /**
     * Obtém o valor da propriedade begindate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBegindate() {
        return begindate;
    }

    /**
     * Define o valor da propriedade begindate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBegindate(XMLGregorianCalendar value) {
        this.begindate = value;
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
     * Obtém o valor da propriedade mothersidentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMothersidentifier() {
        return mothersidentifier;
    }

    /**
     * Define o valor da propriedade mothersidentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMothersidentifier(String value) {
        this.mothersidentifier = value;
    }

    /**
     * Obtém o valor da propriedade patientid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientid() {
        return patientid;
    }

    /**
     * Define o valor da propriedade patientid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientid(String value) {
        this.patientid = value;
    }

    /**
     * Obtém o valor da propriedade sourcesystemidentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcesystemidentifier() {
        return sourcesystemidentifier;
    }

    /**
     * Define o valor da propriedade sourcesystemidentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcesystemidentifier(String value) {
        this.sourcesystemidentifier = value;
    }

    /**
     * Obtém o valor da propriedade locationid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationid() {
        return locationid;
    }

    /**
     * Define o valor da propriedade locationid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationid(String value) {
        this.locationid = value;
    }

    /**
     * Obtém o valor da propriedade facilitynumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilitynumber() {
        return facilitynumber;
    }

    /**
     * Define o valor da propriedade facilitynumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilitynumber(String value) {
        this.facilitynumber = value;
    }

    /**
     * Obtém o valor da propriedade locationtype.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getLocationtype() {
        return locationtype;
    }

    /**
     * Define o valor da propriedade locationtype.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setLocationtype(Code value) {
        this.locationtype = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setStatus(Code value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade healthcareProvider.
     * 
     * @return
     *     possible object is
     *     {@link HealthcareProvider }
     *     
     */
    public HealthcareProvider getHealthcareProvider() {
        return healthcareProvider;
    }

    /**
     * Define o valor da propriedade healthcareProvider.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthcareProvider }
     *     
     */
    public void setHealthcareProvider(HealthcareProvider value) {
        this.healthcareProvider = value;
    }

    /**
     * Gets the value of the healthRecords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the healthRecords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHealthRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HealthRecord }
     * 
     * 
     */
    public List<HealthRecord> getHealthRecords() {
        if (healthRecords == null) {
            healthRecords = new ArrayList<HealthRecord>();
        }
        return this.healthRecords;
    }

    /**
     * Obtém o valor da propriedade patientInformation.
     * 
     * @return
     *     possible object is
     *     {@link PatientInformation }
     *     
     */
    public PatientInformation getPatientInformation() {
        return patientInformation;
    }

    /**
     * Define o valor da propriedade patientInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientInformation }
     *     
     */
    public void setPatientInformation(PatientInformation value) {
        this.patientInformation = value;
    }

}
