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
 * This class records observations regarding the usual occupation of a person, and what industries the person has worked in. This information is needed primarily for occupation safety and workplace-related illness tracking purposes, but it is often asked for other non-healthcare related reasons, such as insurance.
 * 
 * <p>Classe Java de OccupationalHistoryObservation complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OccupationalHistoryObservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currentindustryclassification" type="{http://www.app.customer.com}CodeWithOriginalText" minOccurs="0"/&gt;
 *         &lt;element name="currentoccupation" type="{http://www.app.customer.com}CodeWithOriginalText" minOccurs="0"/&gt;
 *         &lt;element name="dateobserved" type="{http://www.app.customer.com}PointInTime" minOccurs="0"/&gt;
 *         &lt;element name="usualindustry" type="{http://www.app.customer.com}CodeWithOriginalText" minOccurs="0"/&gt;
 *         &lt;element name="usualoccupation" type="{http://www.app.customer.com}CodeWithOriginalText" minOccurs="0"/&gt;
 *         &lt;element name="yearsincurrentoccupation" type="{http://www.app.customer.com}Real" minOccurs="0"/&gt;
 *         &lt;element name="yearsinusualoccupation" type="{http://www.app.customer.com}Real" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OccupationalHistoryObservation", propOrder = {
    "currentindustryclassification",
    "currentoccupation",
    "dateobserved",
    "usualindustry",
    "usualoccupation",
    "yearsincurrentoccupation",
    "yearsinusualoccupation"
})
@XmlRootElement(name = "OccupationalHistoryObservation")
public class OccupationalHistoryObservation
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected CodeWithOriginalText currentindustryclassification;
    protected CodeWithOriginalText currentoccupation;
    protected PointInTime dateobserved;
    protected CodeWithOriginalText usualindustry;
    protected CodeWithOriginalText usualoccupation;
    protected Real yearsincurrentoccupation;
    protected Real yearsinusualoccupation;

    /**
     * Obtém o valor da propriedade currentindustryclassification.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithOriginalText }
     *     
     */
    public CodeWithOriginalText getCurrentindustryclassification() {
        return currentindustryclassification;
    }

    /**
     * Define o valor da propriedade currentindustryclassification.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithOriginalText }
     *     
     */
    public void setCurrentindustryclassification(CodeWithOriginalText value) {
        this.currentindustryclassification = value;
    }

    /**
     * Obtém o valor da propriedade currentoccupation.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithOriginalText }
     *     
     */
    public CodeWithOriginalText getCurrentoccupation() {
        return currentoccupation;
    }

    /**
     * Define o valor da propriedade currentoccupation.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithOriginalText }
     *     
     */
    public void setCurrentoccupation(CodeWithOriginalText value) {
        this.currentoccupation = value;
    }

    /**
     * Obtém o valor da propriedade dateobserved.
     * 
     * @return
     *     possible object is
     *     {@link PointInTime }
     *     
     */
    public PointInTime getDateobserved() {
        return dateobserved;
    }

    /**
     * Define o valor da propriedade dateobserved.
     * 
     * @param value
     *     allowed object is
     *     {@link PointInTime }
     *     
     */
    public void setDateobserved(PointInTime value) {
        this.dateobserved = value;
    }

    /**
     * Obtém o valor da propriedade usualindustry.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithOriginalText }
     *     
     */
    public CodeWithOriginalText getUsualindustry() {
        return usualindustry;
    }

    /**
     * Define o valor da propriedade usualindustry.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithOriginalText }
     *     
     */
    public void setUsualindustry(CodeWithOriginalText value) {
        this.usualindustry = value;
    }

    /**
     * Obtém o valor da propriedade usualoccupation.
     * 
     * @return
     *     possible object is
     *     {@link CodeWithOriginalText }
     *     
     */
    public CodeWithOriginalText getUsualoccupation() {
        return usualoccupation;
    }

    /**
     * Define o valor da propriedade usualoccupation.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeWithOriginalText }
     *     
     */
    public void setUsualoccupation(CodeWithOriginalText value) {
        this.usualoccupation = value;
    }

    /**
     * Obtém o valor da propriedade yearsincurrentoccupation.
     * 
     * @return
     *     possible object is
     *     {@link Real }
     *     
     */
    public Real getYearsincurrentoccupation() {
        return yearsincurrentoccupation;
    }

    /**
     * Define o valor da propriedade yearsincurrentoccupation.
     * 
     * @param value
     *     allowed object is
     *     {@link Real }
     *     
     */
    public void setYearsincurrentoccupation(Real value) {
        this.yearsincurrentoccupation = value;
    }

    /**
     * Obtém o valor da propriedade yearsinusualoccupation.
     * 
     * @return
     *     possible object is
     *     {@link Real }
     *     
     */
    public Real getYearsinusualoccupation() {
        return yearsinusualoccupation;
    }

    /**
     * Define o valor da propriedade yearsinusualoccupation.
     * 
     * @param value
     *     allowed object is
     *     {@link Real }
     *     
     */
    public void setYearsinusualoccupation(Real value) {
        this.yearsinusualoccupation = value;
    }

}
