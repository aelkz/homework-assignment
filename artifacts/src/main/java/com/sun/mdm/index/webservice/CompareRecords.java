
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de compareRecords complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="compareRecords"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="record1" type="{http://webservice.index.mdm.sun.com/}personBean" minOccurs="0"/&gt;
 *         &lt;element name="record2" type="{http://webservice.index.mdm.sun.com/}personBean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compareRecords", propOrder = {
    "record1",
    "record2"
})
@XmlRootElement(name = "compareRecords")
public class CompareRecords
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected PersonBean record1;
    protected PersonBean record2;

    /**
     * Obtém o valor da propriedade record1.
     * 
     * @return
     *     possible object is
     *     {@link PersonBean }
     *     
     */
    public PersonBean getRecord1() {
        return record1;
    }

    /**
     * Define o valor da propriedade record1.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonBean }
     *     
     */
    public void setRecord1(PersonBean value) {
        this.record1 = value;
    }

    public boolean isSetRecord1() {
        return (this.record1 != null);
    }

    /**
     * Obtém o valor da propriedade record2.
     * 
     * @return
     *     possible object is
     *     {@link PersonBean }
     *     
     */
    public PersonBean getRecord2() {
        return record2;
    }

    /**
     * Define o valor da propriedade record2.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonBean }
     *     
     */
    public void setRecord2(PersonBean value) {
        this.record2 = value;
    }

    public boolean isSetRecord2() {
        return (this.record2 != null);
    }

}
