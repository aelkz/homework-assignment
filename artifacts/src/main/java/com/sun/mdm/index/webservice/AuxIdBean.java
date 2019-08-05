
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de auxIdBean complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="auxIdBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="assigningAuthorityNamespace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="assigningAuthorityUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="assigningAuthorityUIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="auxIdDef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="auxIdId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auxIdBean", propOrder = {
    "assigningAuthorityNamespace",
    "assigningAuthorityUID",
    "assigningAuthorityUIDType",
    "auxIdDef",
    "auxIdId",
    "id"
})
public class AuxIdBean
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String assigningAuthorityNamespace;
    protected String assigningAuthorityUID;
    protected String assigningAuthorityUIDType;
    protected String auxIdDef;
    protected String auxIdId;
    protected String id;

    /**
     * Obtém o valor da propriedade assigningAuthorityNamespace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssigningAuthorityNamespace() {
        return assigningAuthorityNamespace;
    }

    /**
     * Define o valor da propriedade assigningAuthorityNamespace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssigningAuthorityNamespace(String value) {
        this.assigningAuthorityNamespace = value;
    }

    public boolean isSetAssigningAuthorityNamespace() {
        return (this.assigningAuthorityNamespace!= null);
    }

    /**
     * Obtém o valor da propriedade assigningAuthorityUID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssigningAuthorityUID() {
        return assigningAuthorityUID;
    }

    /**
     * Define o valor da propriedade assigningAuthorityUID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssigningAuthorityUID(String value) {
        this.assigningAuthorityUID = value;
    }

    public boolean isSetAssigningAuthorityUID() {
        return (this.assigningAuthorityUID!= null);
    }

    /**
     * Obtém o valor da propriedade assigningAuthorityUIDType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssigningAuthorityUIDType() {
        return assigningAuthorityUIDType;
    }

    /**
     * Define o valor da propriedade assigningAuthorityUIDType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssigningAuthorityUIDType(String value) {
        this.assigningAuthorityUIDType = value;
    }

    public boolean isSetAssigningAuthorityUIDType() {
        return (this.assigningAuthorityUIDType!= null);
    }

    /**
     * Obtém o valor da propriedade auxIdDef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxIdDef() {
        return auxIdDef;
    }

    /**
     * Define o valor da propriedade auxIdDef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxIdDef(String value) {
        this.auxIdDef = value;
    }

    public boolean isSetAuxIdDef() {
        return (this.auxIdDef!= null);
    }

    /**
     * Obtém o valor da propriedade auxIdId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuxIdId() {
        return auxIdId;
    }

    /**
     * Define o valor da propriedade auxIdId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuxIdId(String value) {
        this.auxIdId = value;
    }

    public boolean isSetAuxIdId() {
        return (this.auxIdId!= null);
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public boolean isSetId() {
        return (this.id!= null);
    }

}
