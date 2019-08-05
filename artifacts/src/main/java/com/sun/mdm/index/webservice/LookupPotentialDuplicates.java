
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de lookupPotentialDuplicates complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="lookupPotentialDuplicates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callerInfo" type="{http://webservice.index.mdm.sun.com/}callerInfo" minOccurs="0"/&gt;
 *         &lt;element name="PotentialDuplicateSearchObjectBean" type="{http://webservice.index.mdm.sun.com/}potentialDuplicateSearchObjectBean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lookupPotentialDuplicates", propOrder = {
    "callerInfo",
    "potentialDuplicateSearchObjectBean"
})
@XmlRootElement(name = "lookupPotentialDuplicates")
public class LookupPotentialDuplicates
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected CallerInfo callerInfo;
    @XmlElement(name = "PotentialDuplicateSearchObjectBean")
    protected PotentialDuplicateSearchObjectBean potentialDuplicateSearchObjectBean;

    /**
     * Obtém o valor da propriedade callerInfo.
     * 
     * @return
     *     possible object is
     *     {@link CallerInfo }
     *     
     */
    public CallerInfo getCallerInfo() {
        return callerInfo;
    }

    /**
     * Define o valor da propriedade callerInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link CallerInfo }
     *     
     */
    public void setCallerInfo(CallerInfo value) {
        this.callerInfo = value;
    }

    public boolean isSetCallerInfo() {
        return (this.callerInfo!= null);
    }

    /**
     * Obtém o valor da propriedade potentialDuplicateSearchObjectBean.
     * 
     * @return
     *     possible object is
     *     {@link PotentialDuplicateSearchObjectBean }
     *     
     */
    public PotentialDuplicateSearchObjectBean getPotentialDuplicateSearchObjectBean() {
        return potentialDuplicateSearchObjectBean;
    }

    /**
     * Define o valor da propriedade potentialDuplicateSearchObjectBean.
     * 
     * @param value
     *     allowed object is
     *     {@link PotentialDuplicateSearchObjectBean }
     *     
     */
    public void setPotentialDuplicateSearchObjectBean(PotentialDuplicateSearchObjectBean value) {
        this.potentialDuplicateSearchObjectBean = value;
    }

    public boolean isSetPotentialDuplicateSearchObjectBean() {
        return (this.potentialDuplicateSearchObjectBean!= null);
    }

}
