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
 * This data type represents an Interval, where the Low and High Limits are Integers. An Interval is a "set of consecutive values of an ordered base data type." - HL7 V3 "Integer numbers are precise numbers that are results of counting and enumerating. Integer numbers are discrete, the set of integers is infinite but countable. No arbitrary limit is imposed on the range of integer numbers." - HL7 V3
 * 
 * <p>Classe Java de IntegerInterval complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IntegerInterval"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="low" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="high" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegerInterval", propOrder = {
    "low",
    "high"
})
@XmlRootElement(name = "IntegerInterval")
public class IntegerInterval
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Integer low;
    protected Integer high;

    /**
     * Obtém o valor da propriedade low.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLow() {
        return low;
    }

    /**
     * Define o valor da propriedade low.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLow(Integer value) {
        this.low = value;
    }

    /**
     * Obtém o valor da propriedade high.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHigh() {
        return high;
    }

    /**
     * Define o valor da propriedade high.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHigh(Integer value) {
        this.high = value;
    }

}
