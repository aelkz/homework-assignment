
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
 * <p>Classe Java de systemDefinition complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="systemDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="allowSameSystemMatch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="duplicateThreshold" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="inputMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matchThreshold" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="properties"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="entry" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="requireOneExactMatch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="systemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="valueMask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemDefinition", propOrder = {
    "allowSameSystemMatch",
    "createDate",
    "description",
    "duplicateThreshold",
    "format",
    "idLength",
    "inputMask",
    "matchThreshold",
    "properties",
    "requireOneExactMatch",
    "status",
    "systemCode",
    "updateDate",
    "valueMask"
})
public class SystemDefinition
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected Boolean allowSameSystemMatch;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    protected String description;
    protected Float duplicateThreshold;
    protected String format;
    protected int idLength;
    protected String inputMask;
    protected Float matchThreshold;
    @XmlElement(required = true)
    protected SystemDefinition.Properties properties;
    protected Boolean requireOneExactMatch;
    protected String status;
    protected String systemCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate;
    protected String valueMask;

    /**
     * Obtém o valor da propriedade allowSameSystemMatch.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowSameSystemMatch() {
        return allowSameSystemMatch;
    }

    /**
     * Define o valor da propriedade allowSameSystemMatch.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowSameSystemMatch(Boolean value) {
        this.allowSameSystemMatch = value;
    }

    public boolean isSetAllowSameSystemMatch() {
        return (this.allowSameSystemMatch!= null);
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
     * Obtém o valor da propriedade duplicateThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDuplicateThreshold() {
        return duplicateThreshold;
    }

    /**
     * Define o valor da propriedade duplicateThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDuplicateThreshold(Float value) {
        this.duplicateThreshold = value;
    }

    public boolean isSetDuplicateThreshold() {
        return (this.duplicateThreshold!= null);
    }

    /**
     * Obtém o valor da propriedade format.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Define o valor da propriedade format.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    public boolean isSetFormat() {
        return (this.format!= null);
    }

    /**
     * Obtém o valor da propriedade idLength.
     * 
     */
    public int getIdLength() {
        return idLength;
    }

    /**
     * Define o valor da propriedade idLength.
     * 
     */
    public void setIdLength(int value) {
        this.idLength = value;
    }

    public boolean isSetIdLength() {
        return true;
    }

    /**
     * Obtém o valor da propriedade inputMask.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputMask() {
        return inputMask;
    }

    /**
     * Define o valor da propriedade inputMask.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputMask(String value) {
        this.inputMask = value;
    }

    public boolean isSetInputMask() {
        return (this.inputMask!= null);
    }

    /**
     * Obtém o valor da propriedade matchThreshold.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMatchThreshold() {
        return matchThreshold;
    }

    /**
     * Define o valor da propriedade matchThreshold.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMatchThreshold(Float value) {
        this.matchThreshold = value;
    }

    public boolean isSetMatchThreshold() {
        return (this.matchThreshold!= null);
    }

    /**
     * Obtém o valor da propriedade properties.
     * 
     * @return
     *     possible object is
     *     {@link SystemDefinition.Properties }
     *     
     */
    public SystemDefinition.Properties getProperties() {
        return properties;
    }

    /**
     * Define o valor da propriedade properties.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDefinition.Properties }
     *     
     */
    public void setProperties(SystemDefinition.Properties value) {
        this.properties = value;
    }

    public boolean isSetProperties() {
        return (this.properties!= null);
    }

    /**
     * Obtém o valor da propriedade requireOneExactMatch.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequireOneExactMatch() {
        return requireOneExactMatch;
    }

    /**
     * Define o valor da propriedade requireOneExactMatch.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireOneExactMatch(Boolean value) {
        this.requireOneExactMatch = value;
    }

    public boolean isSetRequireOneExactMatch() {
        return (this.requireOneExactMatch!= null);
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
     * Obtém o valor da propriedade updateDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Define o valor da propriedade updateDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

    public boolean isSetUpdateDate() {
        return (this.updateDate!= null);
    }

    /**
     * Obtém o valor da propriedade valueMask.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueMask() {
        return valueMask;
    }

    /**
     * Define o valor da propriedade valueMask.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueMask(String value) {
        this.valueMask = value;
    }

    public boolean isSetValueMask() {
        return (this.valueMask!= null);
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="entry" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entries"
    })
    public static class Properties
        implements Serializable
    {

        private final static long serialVersionUID = 12343L;
        @XmlElement(name = "entry")
        protected List<SystemDefinition.Properties.Entry> entries;

        /**
         * Gets the value of the entries property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entries property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntries().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SystemDefinition.Properties.Entry }
         * 
         * 
         */
        public List<SystemDefinition.Properties.Entry> getEntries() {
            if (entries == null) {
                entries = new ArrayList<SystemDefinition.Properties.Entry>();
            }
            return this.entries;
        }

        public boolean isSetEntries() {
            return ((this.entries!= null)&&(!this.entries.isEmpty()));
        }

        public void unsetEntries() {
            this.entries = null;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "key",
            "value"
        })
        public static class Entry
            implements Serializable
        {

            private final static long serialVersionUID = 12343L;
            protected String key;
            protected String value;

            /**
             * Obtém o valor da propriedade key.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKey() {
                return key;
            }

            /**
             * Define o valor da propriedade key.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKey(String value) {
                this.key = value;
            }

            public boolean isSetKey() {
                return (this.key!= null);
            }

            /**
             * Obtém o valor da propriedade value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Define o valor da propriedade value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            public boolean isSetValue() {
                return (this.value!= null);
            }

        }

    }

}
