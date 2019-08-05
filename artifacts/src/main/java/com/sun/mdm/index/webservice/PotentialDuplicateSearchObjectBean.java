
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de potentialDuplicateSearchObjectBean complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="potentialDuplicateSearchObjectBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="createEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="createStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="createUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EUIDs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="localId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maxElements" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="resolvedEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="resolvedStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="resolvedUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "potentialDuplicateSearchObjectBean", propOrder = {
    "createEndDate",
    "createStartDate",
    "createUser",
    "euiDs",
    "localId",
    "maxElements",
    "resolvedEndDate",
    "resolvedStartDate",
    "resolvedUser",
    "status",
    "systemCode"
})
public class PotentialDuplicateSearchObjectBean
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createEndDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createStartDate;
    protected String createUser;
    @XmlElement(name = "EUIDs", nillable = true)
    protected List<String> euiDs;
    protected String localId;
    protected int maxElements;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar resolvedEndDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar resolvedStartDate;
    protected String resolvedUser;
    protected String status;
    protected String systemCode;

    /**
     * Obtém o valor da propriedade createEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateEndDate() {
        return createEndDate;
    }

    /**
     * Define o valor da propriedade createEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateEndDate(XMLGregorianCalendar value) {
        this.createEndDate = value;
    }

    public boolean isSetCreateEndDate() {
        return (this.createEndDate!= null);
    }

    /**
     * Obtém o valor da propriedade createStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateStartDate() {
        return createStartDate;
    }

    /**
     * Define o valor da propriedade createStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateStartDate(XMLGregorianCalendar value) {
        this.createStartDate = value;
    }

    public boolean isSetCreateStartDate() {
        return (this.createStartDate!= null);
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
     * Gets the value of the euiDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the euiDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEUIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEUIDs() {
        if (euiDs == null) {
            euiDs = new ArrayList<String>();
        }
        return this.euiDs;
    }

    public boolean isSetEUIDs() {
        return ((this.euiDs!= null)&&(!this.euiDs.isEmpty()));
    }

    public void unsetEUIDs() {
        this.euiDs = null;
    }

    /**
     * Obtém o valor da propriedade localId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalId() {
        return localId;
    }

    /**
     * Define o valor da propriedade localId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalId(String value) {
        this.localId = value;
    }

    public boolean isSetLocalId() {
        return (this.localId!= null);
    }

    /**
     * Obtém o valor da propriedade maxElements.
     * 
     */
    public int getMaxElements() {
        return maxElements;
    }

    /**
     * Define o valor da propriedade maxElements.
     * 
     */
    public void setMaxElements(int value) {
        this.maxElements = value;
    }

    public boolean isSetMaxElements() {
        return true;
    }

    /**
     * Obtém o valor da propriedade resolvedEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResolvedEndDate() {
        return resolvedEndDate;
    }

    /**
     * Define o valor da propriedade resolvedEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResolvedEndDate(XMLGregorianCalendar value) {
        this.resolvedEndDate = value;
    }

    public boolean isSetResolvedEndDate() {
        return (this.resolvedEndDate!= null);
    }

    /**
     * Obtém o valor da propriedade resolvedStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResolvedStartDate() {
        return resolvedStartDate;
    }

    /**
     * Define o valor da propriedade resolvedStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResolvedStartDate(XMLGregorianCalendar value) {
        this.resolvedStartDate = value;
    }

    public boolean isSetResolvedStartDate() {
        return (this.resolvedStartDate!= null);
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

}
