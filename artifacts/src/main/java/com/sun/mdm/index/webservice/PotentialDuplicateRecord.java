
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de potentialDuplicateRecord complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="potentialDuplicateRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "potentialDuplicateRecord", propOrder = {
    "euid"
})
public class PotentialDuplicateRecord
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "EUID")
    protected String euid;

    /**
     * Obtém o valor da propriedade euid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEUID() {
        return euid;
    }

    /**
     * Define o valor da propriedade euid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEUID(String value) {
        this.euid = value;
    }

    public boolean isSetEUID() {
        return (this.euid!= null);
    }

}
