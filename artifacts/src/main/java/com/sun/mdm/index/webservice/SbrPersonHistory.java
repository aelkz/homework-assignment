
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de sbrPersonHistory complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="sbrPersonHistory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="after" type="{http://webservice.index.mdm.sun.com/}sbrPerson" minOccurs="0"/&gt;
 *         &lt;element name="before" type="{http://webservice.index.mdm.sun.com/}sbrPerson" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sbrPersonHistory", propOrder = {
    "after",
    "before"
})
public class SbrPersonHistory
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected SbrPerson after;
    protected SbrPerson before;

    /**
     * Obtém o valor da propriedade after.
     * 
     * @return
     *     possible object is
     *     {@link SbrPerson }
     *     
     */
    public SbrPerson getAfter() {
        return after;
    }

    /**
     * Define o valor da propriedade after.
     * 
     * @param value
     *     allowed object is
     *     {@link SbrPerson }
     *     
     */
    public void setAfter(SbrPerson value) {
        this.after = value;
    }

    public boolean isSetAfter() {
        return (this.after!= null);
    }

    /**
     * Obtém o valor da propriedade before.
     * 
     * @return
     *     possible object is
     *     {@link SbrPerson }
     *     
     */
    public SbrPerson getBefore() {
        return before;
    }

    /**
     * Define o valor da propriedade before.
     * 
     * @param value
     *     allowed object is
     *     {@link SbrPerson }
     *     
     */
    public void setBefore(SbrPerson value) {
        this.before = value;
    }

    public boolean isSetBefore() {
        return (this.before!= null);
    }

}
