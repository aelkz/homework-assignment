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
 * A specialization of Code which additionally contains a property to hold the original text as seen and/or selected by the user who entered the data
 * 
 * <p>Classe Java de CodeWithOriginalText complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CodeWithOriginalText"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.app.customer.com}Code"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="originaltext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeWithOriginalText", propOrder = {
    "originaltext"
})
@XmlSeeAlso({
    NullableCode.class
})
public class CodeWithOriginalText
    extends Code
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String originaltext;

    /**
     * Obtém o valor da propriedade originaltext.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginaltext() {
        return originaltext;
    }

    /**
     * Define o valor da propriedade originaltext.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginaltext(String value) {
        this.originaltext = value;
    }

}
