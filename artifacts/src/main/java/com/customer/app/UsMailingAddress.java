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
 * UsMailingAddress
 * 
 * <p>Classe Java de UsMailingAddress complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UsMailingAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.app.customer.com}Address"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usastate" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsMailingAddress", propOrder = {
    "usastate"
})
@XmlRootElement(name = "UsMailingAddress")
public class UsMailingAddress
    extends Address
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Code usastate;

    /**
     * Obtém o valor da propriedade usastate.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getUsastate() {
        return usastate;
    }

    /**
     * Define o valor da propriedade usastate.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setUsastate(Code value) {
        this.usastate = value;
    }

}
