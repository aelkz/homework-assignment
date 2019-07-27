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
 * Rate: "A certain quantity or amount of one thing considered in relation to a unit of another thing and used as a standard or measure: at the rate of 60 miles an hour." - Dictionary.com This class represents a ratio of some Physical Quantity over a period of time. This class is structurally similar to other Ratio classes (e.g., IntegerRatio), except the denominator is by definition a TimeQuantity.
 * 
 * <p>Classe Java de RateQuantity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RateQuantity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="denominator" type="{http://www.app.customer.com}TimeQuantity" minOccurs="0"/&gt;
 *         &lt;element name="numerator" type="{http://www.app.customer.com}PhysicalQualtity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateQuantity", propOrder = {
    "denominator",
    "numerator"
})
@XmlRootElement(name = "RateQuantity")
public class RateQuantity
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected TimeQuantity denominator;
    protected PhysicalQualtity numerator;

    /**
     * Obtém o valor da propriedade denominator.
     * 
     * @return
     *     possible object is
     *     {@link TimeQuantity }
     *     
     */
    public TimeQuantity getDenominator() {
        return denominator;
    }

    /**
     * Define o valor da propriedade denominator.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeQuantity }
     *     
     */
    public void setDenominator(TimeQuantity value) {
        this.denominator = value;
    }

    /**
     * Obtém o valor da propriedade numerator.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalQualtity }
     *     
     */
    public PhysicalQualtity getNumerator() {
        return numerator;
    }

    /**
     * Define o valor da propriedade numerator.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalQualtity }
     *     
     */
    public void setNumerator(PhysicalQualtity value) {
        this.numerator = value;
    }

}
