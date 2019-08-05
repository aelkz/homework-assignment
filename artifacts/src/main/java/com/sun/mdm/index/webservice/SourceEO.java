
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de sourceEO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="sourceEO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterprisePerson" type="{http://webservice.index.mdm.sun.com/}enterprisePerson" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sourceEO", propOrder = {
    "enterprisePerson"
})
public class SourceEO
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected EnterprisePerson enterprisePerson;

    /**
     * Obtém o valor da propriedade enterprisePerson.
     * 
     * @return
     *     possible object is
     *     {@link EnterprisePerson }
     *     
     */
    public EnterprisePerson getEnterprisePerson() {
        return enterprisePerson;
    }

    /**
     * Define o valor da propriedade enterprisePerson.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterprisePerson }
     *     
     */
    public void setEnterprisePerson(EnterprisePerson value) {
        this.enterprisePerson = value;
    }

    public boolean isSetEnterprisePerson() {
        return (this.enterprisePerson!= null);
    }

}
