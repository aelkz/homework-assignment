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
 * Patient's Health Record - This class is used to store a reference to the health record that is the subject of the consent rules in the Consent Directive.
 * 
 * <p>Classe Java de HealthRecord complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="HealthRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recordid" type="{http://www.app.customer.com}ID" minOccurs="0"/&gt;
 *         &lt;element name="recordlocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="effectivedaterange" type="{http://www.app.customer.com}TimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthRecord", propOrder = {
    "recordid",
    "recordlocation",
    "effectivedaterange",
    "status"
})
@XmlRootElement(name = "HealthRecord")
public class HealthRecord
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected ID recordid;
    protected String recordlocation;
    protected TimeInterval effectivedaterange;
    protected String status;

    /**
     * Obtém o valor da propriedade recordid.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getRecordid() {
        return recordid;
    }

    /**
     * Define o valor da propriedade recordid.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setRecordid(ID value) {
        this.recordid = value;
    }

    /**
     * Obtém o valor da propriedade recordlocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordlocation() {
        return recordlocation;
    }

    /**
     * Define o valor da propriedade recordlocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordlocation(String value) {
        this.recordlocation = value;
    }

    /**
     * Obtém o valor da propriedade effectivedaterange.
     * 
     * @return
     *     possible object is
     *     {@link TimeInterval }
     *     
     */
    public TimeInterval getEffectivedaterange() {
        return effectivedaterange;
    }

    /**
     * Define o valor da propriedade effectivedaterange.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInterval }
     *     
     */
    public void setEffectivedaterange(TimeInterval value) {
        this.effectivedaterange = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
