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
 * Parties Alternate Ids 
 * 
 * <p>Classe Java de PartiesAlternateId complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PartiesAlternateId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alternateidsrole" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="alternateid" type="{http://www.app.customer.com}ID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartiesAlternateId", propOrder = {
    "alternateidsrole",
    "alternateid"
})
@XmlRootElement(name = "PartiesAlternateId")
public class PartiesAlternateId
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Code alternateidsrole;
    protected ID alternateid;

    /**
     * Obtém o valor da propriedade alternateidsrole.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getAlternateidsrole() {
        return alternateidsrole;
    }

    /**
     * Define o valor da propriedade alternateidsrole.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setAlternateidsrole(Code value) {
        this.alternateidsrole = value;
    }

    /**
     * Obtém o valor da propriedade alternateid.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getAlternateid() {
        return alternateid;
    }

    /**
     * Define o valor da propriedade alternateid.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setAlternateid(ID value) {
        this.alternateid = value;
    }

}
