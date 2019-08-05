
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de scoreElement complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="scoreElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comparisonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="decisionResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="falsePositiveExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="potentialFalsePositive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="weightExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scoreElement", propOrder = {
    "comparisonId",
    "decisionResult",
    "euid",
    "falsePositiveExplanation",
    "potentialFalsePositive",
    "weight",
    "weightExplanation"
})
public class ScoreElement
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Long comparisonId;
    protected String decisionResult;
    @XmlElement(name = "EUID")
    protected String euid;
    protected String falsePositiveExplanation;
    protected boolean potentialFalsePositive;
    protected double weight;
    protected String weightExplanation;

    /**
     * Obtém o valor da propriedade comparisonId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getComparisonId() {
        return comparisonId;
    }

    /**
     * Define o valor da propriedade comparisonId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setComparisonId(Long value) {
        this.comparisonId = value;
    }

    public boolean isSetComparisonId() {
        return (this.comparisonId!= null);
    }

    /**
     * Obtém o valor da propriedade decisionResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionResult() {
        return decisionResult;
    }

    /**
     * Define o valor da propriedade decisionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionResult(String value) {
        this.decisionResult = value;
    }

    public boolean isSetDecisionResult() {
        return (this.decisionResult!= null);
    }

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
     * Obtém o valor da propriedade falsePositiveExplanation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFalsePositiveExplanation() {
        return falsePositiveExplanation;
    }

    /**
     * Define o valor da propriedade falsePositiveExplanation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFalsePositiveExplanation(String value) {
        this.falsePositiveExplanation = value;
    }

    public boolean isSetFalsePositiveExplanation() {
        return (this.falsePositiveExplanation!= null);
    }

    /**
     * Obtém o valor da propriedade potentialFalsePositive.
     * 
     */
    public boolean isPotentialFalsePositive() {
        return potentialFalsePositive;
    }

    /**
     * Define o valor da propriedade potentialFalsePositive.
     * 
     */
    public void setPotentialFalsePositive(boolean value) {
        this.potentialFalsePositive = value;
    }

    public boolean isSetPotentialFalsePositive() {
        return true;
    }

    /**
     * Obtém o valor da propriedade weight.
     * 
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Define o valor da propriedade weight.
     * 
     */
    public void setWeight(double value) {
        this.weight = value;
    }

    public boolean isSetWeight() {
        return true;
    }

    /**
     * Obtém o valor da propriedade weightExplanation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightExplanation() {
        return weightExplanation;
    }

    /**
     * Define o valor da propriedade weightExplanation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightExplanation(String value) {
        this.weightExplanation = value;
    }

    public boolean isSetWeightExplanation() {
        return (this.weightExplanation!= null);
    }

}
