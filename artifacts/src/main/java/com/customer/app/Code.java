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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Code 
 * 
 * <p>Classe Java de Code complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Code"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="displaytext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codesystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codesystemversion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Code", propOrder = {
    "code",
    "displaytext",
    "codesystem",
    "codesystemversion"
})
@XmlSeeAlso({
    CodedOrdinal.class,
    CodeWithOriginalText.class
})
public class Code
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String code;
    protected String displaytext;
    protected String codesystem;
    protected String codesystemversion;

    /**
     * Obtém o valor da propriedade code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Define o valor da propriedade code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Obtém o valor da propriedade displaytext.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplaytext() {
        return displaytext;
    }

    /**
     * Define o valor da propriedade displaytext.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplaytext(String value) {
        this.displaytext = value;
    }

    /**
     * Obtém o valor da propriedade codesystem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodesystem() {
        return codesystem;
    }

    /**
     * Define o valor da propriedade codesystem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodesystem(String value) {
        this.codesystem = value;
    }

    /**
     * Obtém o valor da propriedade codesystemversion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodesystemversion() {
        return codesystemversion;
    }

    /**
     * Define o valor da propriedade codesystemversion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodesystemversion(String value) {
        this.codesystemversion = value;
    }

}
