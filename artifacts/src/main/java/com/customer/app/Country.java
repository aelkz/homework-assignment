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
 * Country - "A community of people composed of one or more nationalities and possessing a more or less defined territory and government." â€“ Merriam-Webster. An organization created to govern a country, which has the power to grant citizenship to its people.
 * 
 * <p>Classe Java de Country complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Country"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="countrycode" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Country", propOrder = {
    "countrycode"
})
@XmlRootElement(name = "Country")
public class Country
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Code countrycode;

    /**
     * Obtém o valor da propriedade countrycode.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getCountrycode() {
        return countrycode;
    }

    /**
     * Define o valor da propriedade countrycode.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setCountrycode(Code value) {
        this.countrycode = value;
    }

}
