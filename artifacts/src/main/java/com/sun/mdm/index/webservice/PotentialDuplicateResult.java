
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de potentialDuplicateResult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="potentialDuplicateResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comparisonId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="createUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EUID1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EUID2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resolvedComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resolvedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="resolvedUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="systemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "potentialDuplicateResult", propOrder = {
    "comparisonId",
    "createDate",
    "createUser",
    "euid1",
    "euid2",
    "id",
    "resolvedComment",
    "resolvedDate",
    "resolvedUser",
    "status",
    "systemCode",
    "weight"
})
public class PotentialDuplicateResult
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected long comparisonId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    protected String createUser;
    @XmlElement(name = "EUID1")
    protected String euid1;
    @XmlElement(name = "EUID2")
    protected String euid2;
    protected String id;
    protected String resolvedComment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar resolvedDate;
    protected String resolvedUser;
    protected String status;
    protected String systemCode;
    protected float weight;

    /**
     * Obtém o valor da propriedade comparisonId.
     * 
     */
    public long getComparisonId() {
        return comparisonId;
    }

    /**
     * Define o valor da propriedade comparisonId.
     * 
     */
    public void setComparisonId(long value) {
        this.comparisonId = value;
    }

    public boolean isSetComparisonId() {
        return true;
    }

    /**
     * Obtém o valor da propriedade createDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Define o valor da propriedade createDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    public boolean isSetCreateDate() {
        return (this.createDate!= null);
    }

    /**
     * Obtém o valor da propriedade createUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * Define o valor da propriedade createUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateUser(String value) {
        this.createUser = value;
    }

    public boolean isSetCreateUser() {
        return (this.createUser!= null);
    }

    /**
     * Obtém o valor da propriedade euid1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEUID1() {
        return euid1;
    }

    /**
     * Define o valor da propriedade euid1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEUID1(String value) {
        this.euid1 = value;
    }

    public boolean isSetEUID1() {
        return (this.euid1 != null);
    }

    /**
     * Obtém o valor da propriedade euid2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEUID2() {
        return euid2;
    }

    /**
     * Define o valor da propriedade euid2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEUID2(String value) {
        this.euid2 = value;
    }

    public boolean isSetEUID2() {
        return (this.euid2 != null);
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

    /**
     * Obtém o valor da propriedade resolvedComment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolvedComment() {
        return resolvedComment;
    }

    /**
     * Define o valor da propriedade resolvedComment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolvedComment(String value) {
        this.resolvedComment = value;
    }

    public boolean isSetResolvedComment() {
        return (this.resolvedComment!= null);
    }

    /**
     * Obtém o valor da propriedade resolvedDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResolvedDate() {
        return resolvedDate;
    }

    /**
     * Define o valor da propriedade resolvedDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResolvedDate(XMLGregorianCalendar value) {
        this.resolvedDate = value;
    }

    public boolean isSetResolvedDate() {
        return (this.resolvedDate!= null);
    }

    /**
     * Obtém o valor da propriedade resolvedUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolvedUser() {
        return resolvedUser;
    }

    /**
     * Define o valor da propriedade resolvedUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolvedUser(String value) {
        this.resolvedUser = value;
    }

    public boolean isSetResolvedUser() {
        return (this.resolvedUser!= null);
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return (this.status!= null);
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

    /**
     * Obtém o valor da propriedade weight.
     * 
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Define o valor da propriedade weight.
     * 
     */
    public void setWeight(float value) {
        this.weight = value;
    }

    public boolean isSetWeight() {
        return true;
    }

}
