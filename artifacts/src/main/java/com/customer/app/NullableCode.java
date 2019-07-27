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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A specialization of Code which additionally contains a property to hold a reason why the value of the code is empty.
 * 
 * <p>Classe Java de NullableCode complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NullableCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.app.customer.com}CodeWithOriginalText"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nullflavor" type="{http://www.app.customer.com}NullFlavors" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NullableCode", propOrder = {
    "nullflavor"
})
@XmlSeeAlso({
    LonicAnswerCode.class
})
public class NullableCode
    extends CodeWithOriginalText
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlSchemaType(name = "string")
    protected NullFlavors nullflavor;

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

}
