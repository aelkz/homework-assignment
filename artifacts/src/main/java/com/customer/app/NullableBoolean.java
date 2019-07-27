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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This data type represents a boolean value which may be unknown. In other words, this data type can represent Yes, No, and Unknown; unlike a traditional boolean which can only represent True and False. For this logical model, this class has been modeled in the HL7 V3 style, which has the advantage of being able to account for different kinds of "unknowns", but has the disadvantage of having two fields, one of which must always be populated while the other must always be empty. Implementers may choose to implement this class using a single field instead.
 * 
 * <p>Classe Java de NullableBoolean complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NullableBoolean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nullflavor" type="{http://www.app.customer.com}NullFlavors" minOccurs="0"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NullableBoolean", propOrder = {
    "nullflavor",
    "value"
})
@XmlRootElement(name = "NullableBoolean")
public class NullableBoolean
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlSchemaType(name = "string")
    protected NullFlavors nullflavor;
    protected Boolean value;

    /**
     * Obtém o valor da propriedade nullflavor.
     * 
     * @return
     *     possible object is
     *     {@link NullFlavors }
     *     
     */
    public NullFlavors getNullflavor() {
        return nullflavor;
    }

    /**
     * Define o valor da propriedade nullflavor.
     * 
     * @param value
     *     allowed object is
     *     {@link NullFlavors }
     *     
     */
    public void setNullflavor(NullFlavors value) {
        this.nullflavor = value;
    }

    /**
     * Obtém o valor da propriedade value.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValue() {
        return value;
    }

    /**
     * Define o valor da propriedade value.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValue(Boolean value) {
        this.value = value;
    }

}
