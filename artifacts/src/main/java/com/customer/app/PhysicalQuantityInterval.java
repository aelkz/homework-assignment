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
 * This data type represents an Interval, where the Low and High Limits are Physical Quantities. An Interval is a "set of consecutive values of an ordered base data type." - HL7 V3 A Physical Quantity is "a dimensioned quantity expressing the result of measuring" - HL7 V3
 * 
 * <p>Classe Java de PhysicalQuantityInterval complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PhysicalQuantityInterval"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="highunit" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="highvalue" type="{http://www.app.customer.com}Real" minOccurs="0"/&gt;
 *         &lt;element name="lowunit" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="lowvalue" type="{http://www.app.customer.com}Real" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalQuantityInterval", propOrder = {
    "highunit",
    "highvalue",
    "lowunit",
    "lowvalue"
})
@XmlRootElement(name = "PhysicalQuantityInterval")
public class PhysicalQuantityInterval
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Code highunit;
    protected Real highvalue;
    protected Code lowunit;
    protected Real lowvalue;

    /**
     * Obtém o valor da propriedade highunit.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getHighunit() {
        return highunit;
    }

    /**
     * Define o valor da propriedade highunit.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setHighunit(Code value) {
        this.highunit = value;
    }

    /**
     * Obtém o valor da propriedade highvalue.
     * 
     * @return
     *     possible object is
     *     {@link Real }
     *     
     */
    public Real getHighvalue() {
        return highvalue;
    }

    /**
     * Define o valor da propriedade highvalue.
     * 
     * @param value
     *     allowed object is
     *     {@link Real }
     *     
     */
    public void setHighvalue(Real value) {
        this.highvalue = value;
    }

    /**
     * Obtém o valor da propriedade lowunit.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getLowunit() {
        return lowunit;
    }

    /**
     * Define o valor da propriedade lowunit.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setLowunit(Code value) {
        this.lowunit = value;
    }

    /**
     * Obtém o valor da propriedade lowvalue.
     * 
     * @return
     *     possible object is
     *     {@link Real }
     *     
     */
    public Real getLowvalue() {
        return lowvalue;
    }

    /**
     * Define o valor da propriedade lowvalue.
     * 
     * @param value
     *     allowed object is
     *     {@link Real }
     *     
     */
    public void setLowvalue(Real value) {
        this.lowvalue = value;
    }

}
