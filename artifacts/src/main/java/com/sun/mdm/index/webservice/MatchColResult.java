
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de matchColResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="matchColResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matchFieldChanged" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="overlayDetected" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="potentialDuplicates" type="{http://webservice.index.mdm.sun.com/}potentialDuplicateRecordArray" minOccurs="0"/&gt;
 *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "matchColResult", propOrder = {
    "euid",
    "matchFieldChanged",
    "overlayDetected",
    "potentialDuplicates",
    "resultCode"
})
public class MatchColResult
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "EUID")
    protected String euid;
    protected boolean matchFieldChanged;
    protected boolean overlayDetected;
    protected PotentialDuplicateRecordArray potentialDuplicates;
    protected int resultCode;

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

    /**
     * Obtém o valor da propriedade matchFieldChanged.
     * 
     */
    public boolean isMatchFieldChanged() {
        return matchFieldChanged;
    }

    /**
     * Define o valor da propriedade matchFieldChanged.
     * 
     */
    public void setMatchFieldChanged(boolean value) {
        this.matchFieldChanged = value;
    }

    public boolean isSetMatchFieldChanged() {
        return true;
    }

    /**
     * Obtém o valor da propriedade overlayDetected.
     * 
     */
    public boolean isOverlayDetected() {
        return overlayDetected;
    }

    /**
     * Define o valor da propriedade overlayDetected.
     * 
     */
    public void setOverlayDetected(boolean value) {
        this.overlayDetected = value;
    }

    public boolean isSetOverlayDetected() {
        return true;
    }

    /**
     * Obtém o valor da propriedade potentialDuplicates.
     * 
     * @return
     *     possible object is
     *     {@link PotentialDuplicateRecordArray }
     *     
     */
    public PotentialDuplicateRecordArray getPotentialDuplicates() {
        return potentialDuplicates;
    }

    /**
     * Define o valor da propriedade potentialDuplicates.
     * 
     * @param value
     *     allowed object is
     *     {@link PotentialDuplicateRecordArray }
     *     
     */
    public void setPotentialDuplicates(PotentialDuplicateRecordArray value) {
        this.potentialDuplicates = value;
    }

    public boolean isSetPotentialDuplicates() {
        return (this.potentialDuplicates!= null);
    }

    /**
     * Obtém o valor da propriedade resultCode.
     * 
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * Define o valor da propriedade resultCode.
     * 
     */
    public void setResultCode(int value) {
        this.resultCode = value;
    }

    public boolean isSetResultCode() {
        return true;
    }

}
