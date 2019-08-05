
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de resolvePotentialDuplicate complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="resolvePotentialDuplicate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callerInfo" type="{http://webservice.index.mdm.sun.com/}callerInfo" minOccurs="0"/&gt;
 *         &lt;element name="potentialDuplicateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="permanentResolve" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resolvePotentialDuplicate", propOrder = {
    "callerInfo",
    "potentialDuplicateId",
    "permanentResolve"
})
@XmlRootElement(name = "resolvePotentialDuplicate")
public class ResolvePotentialDuplicate
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected CallerInfo callerInfo;
    protected String potentialDuplicateId;
    protected boolean permanentResolve;

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
     * Obtém o valor da propriedade potentialDuplicateId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPotentialDuplicateId() {
        return potentialDuplicateId;
    }

    /**
     * Define o valor da propriedade potentialDuplicateId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPotentialDuplicateId(String value) {
        this.potentialDuplicateId = value;
    }

    public boolean isSetPotentialDuplicateId() {
        return (this.potentialDuplicateId!= null);
    }

    /**
     * Obtém o valor da propriedade permanentResolve.
     * 
     */
    public boolean isPermanentResolve() {
        return permanentResolve;
    }

    /**
     * Define o valor da propriedade permanentResolve.
     * 
     */
    public void setPermanentResolve(boolean value) {
        this.permanentResolve = value;
    }

    public boolean isSetPermanentResolve() {
        return true;
    }

}
