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
 * Language Capability
 * 
 * <p>Classe Java de LanguageCapability complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LanguageCapability"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ispreferred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="methodofexpression" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="proficiencylevel" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LanguageCapability", propOrder = {
    "ispreferred",
    "language",
    "methodofexpression",
    "proficiencylevel"
})
@XmlRootElement(name = "LanguageCapability")
public class LanguageCapability
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Boolean ispreferred;
    protected Code language;
    protected Code methodofexpression;
    protected Code proficiencylevel;

    /**
     * Obtém o valor da propriedade ispreferred.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIspreferred() {
        return ispreferred;
    }

    /**
     * Define o valor da propriedade ispreferred.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIspreferred(Boolean value) {
        this.ispreferred = value;
    }

    /**
     * Obtém o valor da propriedade language.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getLanguage() {
        return language;
    }

    /**
     * Define o valor da propriedade language.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setLanguage(Code value) {
        this.language = value;
    }

    /**
     * Obtém o valor da propriedade methodofexpression.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getMethodofexpression() {
        return methodofexpression;
    }

    /**
     * Define o valor da propriedade methodofexpression.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setMethodofexpression(Code value) {
        this.methodofexpression = value;
    }

    /**
     * Obtém o valor da propriedade proficiencylevel.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getProficiencylevel() {
        return proficiencylevel;
    }

    /**
     * Define o valor da propriedade proficiencylevel.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setProficiencylevel(Code value) {
        this.proficiencylevel = value;
    }

}
