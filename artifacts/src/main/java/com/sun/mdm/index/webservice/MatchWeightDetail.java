
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de matchWeightDetail complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="matchWeightDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="matchFunctionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matchFunctionId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="matchFunctionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="value1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="value2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "matchWeightDetail", propOrder = {
    "matchFunctionDescription",
    "matchFunctionId",
    "matchFunctionName",
    "value1",
    "value2",
    "weight"
})
public class MatchWeightDetail
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String matchFunctionDescription;
    protected long matchFunctionId;
    protected String matchFunctionName;
    protected String value1;
    protected String value2;
    protected float weight;

    /**
     * Obtém o valor da propriedade matchFunctionDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchFunctionDescription() {
        return matchFunctionDescription;
    }

    /**
     * Define o valor da propriedade matchFunctionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchFunctionDescription(String value) {
        this.matchFunctionDescription = value;
    }

    public boolean isSetMatchFunctionDescription() {
        return (this.matchFunctionDescription!= null);
    }

    /**
     * Obtém o valor da propriedade matchFunctionId.
     * 
     */
    public long getMatchFunctionId() {
        return matchFunctionId;
    }

    /**
     * Define o valor da propriedade matchFunctionId.
     * 
     */
    public void setMatchFunctionId(long value) {
        this.matchFunctionId = value;
    }

    public boolean isSetMatchFunctionId() {
        return true;
    }

    /**
     * Obtém o valor da propriedade matchFunctionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchFunctionName() {
        return matchFunctionName;
    }

    /**
     * Define o valor da propriedade matchFunctionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchFunctionName(String value) {
        this.matchFunctionName = value;
    }

    public boolean isSetMatchFunctionName() {
        return (this.matchFunctionName!= null);
    }

    /**
     * Obtém o valor da propriedade value1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue1() {
        return value1;
    }

    /**
     * Define o valor da propriedade value1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue1(String value) {
        this.value1 = value;
    }

    public boolean isSetValue1() {
        return (this.value1 != null);
    }

    /**
     * Obtém o valor da propriedade value2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue2() {
        return value2;
    }

    /**
     * Define o valor da propriedade value2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue2(String value) {
        this.value2 = value;
    }

    public boolean isSetValue2() {
        return (this.value2 != null);
    }

    /**
     * Obtém o valor da propriedade weight.
     * 
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Define o valor da propriedade weight.
     * 
     */
    public void setWeight(float value) {
        this.weight = value;
    }

    public boolean isSetWeight() {
        return true;
    }

}
