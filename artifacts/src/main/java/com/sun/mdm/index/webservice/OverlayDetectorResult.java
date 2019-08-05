
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de overlayDetectorResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="overlayDetectorResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="overlay" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="rejectTransaction" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="splitRecord" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="systemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "overlayDetectorResult", propOrder = {
    "description",
    "lid",
    "overlay",
    "rejectTransaction",
    "splitRecord",
    "systemCode"
})
public class OverlayDetectorResult
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String description;
    @XmlElement(name = "LID")
    protected String lid;
    protected boolean overlay;
    protected boolean rejectTransaction;
    protected boolean splitRecord;
    protected String systemCode;

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

    /**
     * Obtém o valor da propriedade lid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLID() {
        return lid;
    }

    /**
     * Define o valor da propriedade lid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLID(String value) {
        this.lid = value;
    }

    public boolean isSetLID() {
        return (this.lid!= null);
    }

    /**
     * Obtém o valor da propriedade overlay.
     * 
     */
    public boolean isOverlay() {
        return overlay;
    }

    /**
     * Define o valor da propriedade overlay.
     * 
     */
    public void setOverlay(boolean value) {
        this.overlay = value;
    }

    public boolean isSetOverlay() {
        return true;
    }

    /**
     * Obtém o valor da propriedade rejectTransaction.
     * 
     */
    public boolean isRejectTransaction() {
        return rejectTransaction;
    }

    /**
     * Define o valor da propriedade rejectTransaction.
     * 
     */
    public void setRejectTransaction(boolean value) {
        this.rejectTransaction = value;
    }

    public boolean isSetRejectTransaction() {
        return true;
    }

    /**
     * Obtém o valor da propriedade splitRecord.
     * 
     */
    public boolean isSplitRecord() {
        return splitRecord;
    }

    /**
     * Define o valor da propriedade splitRecord.
     * 
     */
    public void setSplitRecord(boolean value) {
        this.splitRecord = value;
    }

    public boolean isSetSplitRecord() {
        return true;
    }

    /**
     * Obtém o valor da propriedade systemCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemCode() {
        return systemCode;
    }

    /**
     * Define o valor da propriedade systemCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemCode(String value) {
        this.systemCode = value;
    }

    public boolean isSetSystemCode() {
        return (this.systemCode!= null);
    }

}
