
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getSBRs complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getSBRs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callerInfo" type="{http://webservice.index.mdm.sun.com/}callerInfo" minOccurs="0"/&gt;
 *         &lt;element name="euids" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="allowMergedEuid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSBRs", propOrder = {
    "callerInfo",
    "euids",
    "allowMergedEuid"
})
@XmlRootElement(name = "getSBRs")
public class GetSBRs
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected CallerInfo callerInfo;
    @XmlElement(nillable = true)
    protected List<String> euids;
    protected boolean allowMergedEuid;

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
     * Gets the value of the euids property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the euids property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEuids().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEuids() {
        if (euids == null) {
            euids = new ArrayList<String>();
        }
        return this.euids;
    }

    public boolean isSetEuids() {
        return ((this.euids!= null)&&(!this.euids.isEmpty()));
    }

    public void unsetEuids() {
        this.euids = null;
    }

    /**
     * Obtém o valor da propriedade allowMergedEuid.
     * 
     */
    public boolean isAllowMergedEuid() {
        return allowMergedEuid;
    }

    /**
     * Define o valor da propriedade allowMergedEuid.
     * 
     */
    public void setAllowMergedEuid(boolean value) {
        this.allowMergedEuid = value;
    }

    public boolean isSetAllowMergedEuid() {
        return true;
    }

}
