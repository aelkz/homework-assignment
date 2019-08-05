
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de checkForOverlay complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="checkForOverlay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beforeObj" type="{http://webservice.index.mdm.sun.com/}personBean" minOccurs="0"/&gt;
 *         &lt;element name="afterObj" type="{http://webservice.index.mdm.sun.com/}personBean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkForOverlay", propOrder = {
    "beforeObj",
    "afterObj"
})
@XmlRootElement(name = "checkForOverlay")
public class CheckForOverlay
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected PersonBean beforeObj;
    protected PersonBean afterObj;

    /**
     * Obtém o valor da propriedade beforeObj.
     * 
     * @return
     *     possible object is
     *     {@link PersonBean }
     *     
     */
    public PersonBean getBeforeObj() {
        return beforeObj;
    }

    /**
     * Define o valor da propriedade beforeObj.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonBean }
     *     
     */
    public void setBeforeObj(PersonBean value) {
        this.beforeObj = value;
    }

    public boolean isSetBeforeObj() {
        return (this.beforeObj!= null);
    }

    /**
     * Obtém o valor da propriedade afterObj.
     * 
     * @return
     *     possible object is
     *     {@link PersonBean }
     *     
     */
    public PersonBean getAfterObj() {
        return afterObj;
    }

    /**
     * Define o valor da propriedade afterObj.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonBean }
     *     
     */
    public void setAfterObj(PersonBean value) {
        this.afterObj = value;
    }

    public boolean isSetAfterObj() {
        return (this.afterObj!= null);
    }

}
