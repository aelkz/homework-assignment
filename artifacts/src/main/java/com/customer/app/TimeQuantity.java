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
 * This class represents an amount of time, such as 10 minutes, 3.2 seconds, etc. This class is structurally identical to a Physical Quantity, although the units of measure are by definition time units (e.g., hours), rather than physical units (e.g., kilograms).
 * 
 * <p>Classe Java de TimeQuantity complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TimeQuantity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unit" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://www.app.customer.com}Real" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeQuantity", propOrder = {
    "unit",
    "value"
})
@XmlRootElement(name = "TimeQuantity")
public class TimeQuantity
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Code unit;
    protected Real value;

    /**
     * Obtém o valor da propriedade unit.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getUnit() {
        return unit;
    }

    /**
     * Define o valor da propriedade unit.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setUnit(Code value) {
        this.unit = value;
    }

    /**
     * Obtém o valor da propriedade value.
     * 
     * @return
     *     possible object is
     *     {@link Real }
     *     
     */
    public Real getValue() {
        return value;
    }

    /**
     * Define o valor da propriedade value.
     * 
     * @param value
     *     allowed object is
     *     {@link Real }
     *     
     */
    public void setValue(Real value) {
        this.value = value;
    }

}
