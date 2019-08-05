
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de customLogicResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="customLogicResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="responseText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customLogicResponse", propOrder = {
    "responseCode",
    "responseText"
})
public class CustomLogicResponse
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected int responseCode;
    protected String responseText;

    /**
     * Obtém o valor da propriedade responseCode.
     * 
     */
    public int getResponseCode() {
        return responseCode;
    }

    /**
     * Define o valor da propriedade responseCode.
     * 
     */
    public void setResponseCode(int value) {
        this.responseCode = value;
    }

    public boolean isSetResponseCode() {
        return true;
    }

    /**
     * Obtém o valor da propriedade responseText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseText() {
        return responseText;
    }

    /**
     * Define o valor da propriedade responseText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseText(String value) {
        this.responseText = value;
    }

    public boolean isSetResponseText() {
        return (this.responseText!= null);
    }

}
