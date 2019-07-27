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
 * Contact Mechanism
 * 
 *                 Phone
 *                 Fax
 *                 email
 *                 Website 
 * 
 * <p>Classe Java de ContactMechanism complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ContactMechanism"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactmechanismtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="effectivedaterange" type="{http://www.app.customer.com}TimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="istextmessageenabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="universalrecordid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactMechanism", propOrder = {
    "contactmechanismtype",
    "effectivedaterange",
    "istextmessageenabled",
    "universalrecordid"
})
@XmlRootElement(name = "ContactMechanism")
public class ContactMechanism
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String contactmechanismtype;
    protected TimeInterval effectivedaterange;
    protected Boolean istextmessageenabled;
    protected String universalrecordid;

    /**
     * Obtém o valor da propriedade contactmechanismtype.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactmechanismtype() {
        return contactmechanismtype;
    }

    /**
     * Define o valor da propriedade contactmechanismtype.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactmechanismtype(String value) {
        this.contactmechanismtype = value;
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
     * Obtém o valor da propriedade istextmessageenabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIstextmessageenabled() {
        return istextmessageenabled;
    }

    /**
     * Define o valor da propriedade istextmessageenabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIstextmessageenabled(Boolean value) {
        this.istextmessageenabled = value;
    }

    /**
     * Obtém o valor da propriedade universalrecordid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalrecordid() {
        return universalrecordid;
    }

    /**
     * Define o valor da propriedade universalrecordid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalrecordid(String value) {
        this.universalrecordid = value;
    }

}
