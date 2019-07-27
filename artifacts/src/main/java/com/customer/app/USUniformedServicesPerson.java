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
 * Uniformed Services Person  or Military Services Person - This class represents information about a person while in the role of a member of the United States Uniformed Services, which includes military and Public Health Service members.
 * 
 * <p>Classe Java de USUniformedServicesPerson complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="USUniformedServicesPerson"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="militarybranch" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="militaryrank" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="militarystatus" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="militarygrade" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="effectivedaterange" type="{http://www.app.customer.com}TimeInterval" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USUniformedServicesPerson", propOrder = {
    "militarybranch",
    "militaryrank",
    "militarystatus",
    "militarygrade",
    "effectivedaterange"
})
@XmlRootElement(name = "USUniformedServicesPerson")
public class USUniformedServicesPerson
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Code militarybranch;
    protected Code militaryrank;
    protected Code militarystatus;
    protected Code militarygrade;
    protected TimeInterval effectivedaterange;

    /**
     * Obtém o valor da propriedade militarybranch.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getMilitarybranch() {
        return militarybranch;
    }

    /**
     * Define o valor da propriedade militarybranch.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setMilitarybranch(Code value) {
        this.militarybranch = value;
    }

    /**
     * Obtém o valor da propriedade militaryrank.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getMilitaryrank() {
        return militaryrank;
    }

    /**
     * Define o valor da propriedade militaryrank.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setMilitaryrank(Code value) {
        this.militaryrank = value;
    }

    /**
     * Obtém o valor da propriedade militarystatus.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getMilitarystatus() {
        return militarystatus;
    }

    /**
     * Define o valor da propriedade militarystatus.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setMilitarystatus(Code value) {
        this.militarystatus = value;
    }

    /**
     * Obtém o valor da propriedade militarygrade.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getMilitarygrade() {
        return militarygrade;
    }

    /**
     * Define o valor da propriedade militarygrade.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setMilitarygrade(Code value) {
        this.militarygrade = value;
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

}
