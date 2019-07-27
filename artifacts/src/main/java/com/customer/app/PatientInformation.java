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
 * Patient Specific information
 * 
 * <p>Classe Java de PatientInformation complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PatientInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ishospice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="anticipatedfdod" type="{http://www.app.customer.com}TimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="actualfdod" type="{http://www.app.customer.com}TimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="hospicestartdate" type="{http://www.app.customer.com}TimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="homelocationphyfirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="homelocationphylastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatientInformation", propOrder = {
    "ishospice",
    "anticipatedfdod",
    "actualfdod",
    "hospicestartdate",
    "homelocationphyfirstname",
    "homelocationphylastname"
})
@XmlRootElement(name = "PatientInformation")
public class PatientInformation
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Boolean ishospice;
    protected TimeInterval anticipatedfdod;
    protected TimeInterval actualfdod;
    protected TimeInterval hospicestartdate;
    protected String homelocationphyfirstname;
    protected String homelocationphylastname;

    /**
     * Obtém o valor da propriedade ishospice.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIshospice() {
        return ishospice;
    }

    /**
     * Define o valor da propriedade ishospice.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIshospice(Boolean value) {
        this.ishospice = value;
    }

    /**
     * Obtém o valor da propriedade anticipatedfdod.
     * 
     * @return
     *     possible object is
     *     {@link TimeInterval }
     *     
     */
    public TimeInterval getAnticipatedfdod() {
        return anticipatedfdod;
    }

    /**
     * Define o valor da propriedade anticipatedfdod.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInterval }
     *     
     */
    public void setAnticipatedfdod(TimeInterval value) {
        this.anticipatedfdod = value;
    }

    /**
     * Obtém o valor da propriedade actualfdod.
     * 
     * @return
     *     possible object is
     *     {@link TimeInterval }
     *     
     */
    public TimeInterval getActualfdod() {
        return actualfdod;
    }

    /**
     * Define o valor da propriedade actualfdod.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInterval }
     *     
     */
    public void setActualfdod(TimeInterval value) {
        this.actualfdod = value;
    }

    /**
     * Obtém o valor da propriedade hospicestartdate.
     * 
     * @return
     *     possible object is
     *     {@link TimeInterval }
     *     
     */
    public TimeInterval getHospicestartdate() {
        return hospicestartdate;
    }

    /**
     * Define o valor da propriedade hospicestartdate.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInterval }
     *     
     */
    public void setHospicestartdate(TimeInterval value) {
        this.hospicestartdate = value;
    }

    /**
     * Obtém o valor da propriedade homelocationphyfirstname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomelocationphyfirstname() {
        return homelocationphyfirstname;
    }

    /**
     * Define o valor da propriedade homelocationphyfirstname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomelocationphyfirstname(String value) {
        this.homelocationphyfirstname = value;
    }

    /**
     * Obtém o valor da propriedade homelocationphylastname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomelocationphylastname() {
        return homelocationphylastname;
    }

    /**
     * Define o valor da propriedade homelocationphylastname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomelocationphylastname(String value) {
        this.homelocationphylastname = value;
    }

}
