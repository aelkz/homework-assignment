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
 * This data type represents an Interval, where the Low and High Limits are Points In Time. An Interval is a "set of consecutive values of an ordered base data type." - HL7 V3 A PointInTime is "a quantity specifying a point on the axis of natural time. A point in time is most often represented as a calendar expression." - HL7 V3
 * 
 * <p>Classe Java de TimeInterval complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TimeInterval"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="high" type="{http://www.app.customer.com}PointInTime" minOccurs="0"/&gt;
 *         &lt;element name="low" type="{http://www.app.customer.com}PointInTime" minOccurs="0"/&gt;
 *         &lt;element name="width" type="{http://www.app.customer.com}TimeQuantity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeInterval", propOrder = {
    "high",
    "low",
    "width"
})
@XmlRootElement(name = "TimeInterval")
public class TimeInterval
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected PointInTime high;
    protected PointInTime low;
    protected TimeQuantity width;

    /**
     * Obtém o valor da propriedade high.
     * 
     * @return
     *     possible object is
     *     {@link PointInTime }
     *     
     */
    public PointInTime getHigh() {
        return high;
    }

    /**
     * Define o valor da propriedade high.
     * 
     * @param value
     *     allowed object is
     *     {@link PointInTime }
     *     
     */
    public void setHigh(PointInTime value) {
        this.high = value;
    }

    /**
     * Obtém o valor da propriedade low.
     * 
     * @return
     *     possible object is
     *     {@link PointInTime }
     *     
     */
    public PointInTime getLow() {
        return low;
    }

    /**
     * Define o valor da propriedade low.
     * 
     * @param value
     *     allowed object is
     *     {@link PointInTime }
     *     
     */
    public void setLow(PointInTime value) {
        this.low = value;
    }

    /**
     * Obtém o valor da propriedade width.
     * 
     * @return
     *     possible object is
     *     {@link TimeQuantity }
     *     
     */
    public TimeQuantity getWidth() {
        return width;
    }

    /**
     * Define o valor da propriedade width.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeQuantity }
     *     
     */
    public void setWidth(TimeQuantity value) {
        this.width = value;
    }

}
