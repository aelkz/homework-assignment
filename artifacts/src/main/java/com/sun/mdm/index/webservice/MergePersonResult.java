
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de mergePersonResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="mergePersonResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="destinationEO" type="{http://webservice.index.mdm.sun.com/}destinationEO" minOccurs="0"/&gt;
 *         &lt;element name="sourceEO" type="{http://webservice.index.mdm.sun.com/}sourceEO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mergePersonResult", propOrder = {
    "destinationEO",
    "sourceEO"
})
public class MergePersonResult
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected DestinationEO destinationEO;
    protected SourceEO sourceEO;

    /**
     * Obtém o valor da propriedade destinationEO.
     * 
     * @return
     *     possible object is
     *     {@link DestinationEO }
     *     
     */
    public DestinationEO getDestinationEO() {
        return destinationEO;
    }

    /**
     * Define o valor da propriedade destinationEO.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationEO }
     *     
     */
    public void setDestinationEO(DestinationEO value) {
        this.destinationEO = value;
    }

    public boolean isSetDestinationEO() {
        return (this.destinationEO!= null);
    }

    /**
     * Obtém o valor da propriedade sourceEO.
     * 
     * @return
     *     possible object is
     *     {@link SourceEO }
     *     
     */
    public SourceEO getSourceEO() {
        return sourceEO;
    }

    /**
     * Define o valor da propriedade sourceEO.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceEO }
     *     
     */
    public void setSourceEO(SourceEO value) {
        this.sourceEO = value;
    }

    public boolean isSetSourceEO() {
        return (this.sourceEO!= null);
    }

}
