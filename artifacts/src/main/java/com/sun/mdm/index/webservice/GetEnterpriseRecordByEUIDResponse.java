
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getEnterpriseRecordByEUIDResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getEnterpriseRecordByEUIDResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://webservice.index.mdm.sun.com/}enterprisePerson" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEnterpriseRecordByEUIDResponse", propOrder = {
    "_return"
})
@XmlRootElement(name = "getEnterpriseRecordByEUIDResponse")
public class GetEnterpriseRecordByEUIDResponse
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "return")
    protected EnterprisePerson _return;

    /**
     * Obtém o valor da propriedade return.
     * 
     * @return
     *     possible object is
     *     {@link EnterprisePerson }
     *     
     */
    public EnterprisePerson getReturn() {
        return _return;
    }

    /**
     * Define o valor da propriedade return.
     * 
     * @param value
     *     allowed object is
     *     {@link EnterprisePerson }
     *     
     */
    public void setReturn(EnterprisePerson value) {
        this._return = value;
    }

    public boolean isSetReturn() {
        return (this._return!= null);
    }

}
