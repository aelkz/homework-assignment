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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Personal Relationship - This Role identifies a Person to whom the originating Person is related in some way
 * 
 *                 Patient - Subscriber
 *                 Patient - Parent ( Father/Mother) 
 * 
 * <p>Classe Java de PersonalRelationship complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PersonalRelationship"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relationshipcategorycode" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="effectivedaterange" type="{http://www.app.customer.com}TimeInterval" minOccurs="0"/&gt;
 *         &lt;element name="Person" type="{http://www.app.customer.com}Person" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalRelationship", propOrder = {
    "relationshipcategorycode",
    "effectivedaterange",
    "person"
})
@XmlRootElement(name = "PersonalRelationship")
public class PersonalRelationship
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Code relationshipcategorycode;
    protected TimeInterval effectivedaterange;
    @XmlElement(name = "Person")
    protected Person person;

    /**
     * Obtém o valor da propriedade relationshipcategorycode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getRelationshipcategorycode() {
        return relationshipcategorycode;
    }

    /**
     * Define o valor da propriedade relationshipcategorycode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setRelationshipcategorycode(Code value) {
        this.relationshipcategorycode = value;
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
     * Obtém o valor da propriedade person.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Define o valor da propriedade person.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

}
