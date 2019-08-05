
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de fieldDef complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="fieldDef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="autoid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="codeModule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fieldSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fieldType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="keyType" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="maximumValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="minimumValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="refKey" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="refMapping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="updateable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fieldDef", propOrder = {
    "autoid",
    "codeModule",
    "displayName",
    "fieldName",
    "fieldSize",
    "fieldType",
    "keyType",
    "maximumValue",
    "minimumValue",
    "pattern",
    "refKey",
    "refMapping",
    "required",
    "updateable"
})
public class FieldDef
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected boolean autoid;
    protected String codeModule;
    protected String displayName;
    protected String fieldName;
    protected int fieldSize;
    protected String fieldType;
    protected boolean keyType;
    protected String maximumValue;
    protected String minimumValue;
    protected String pattern;
    protected boolean refKey;
    protected String refMapping;
    protected boolean required;
    protected boolean updateable;

    /**
     * Obtém o valor da propriedade autoid.
     * 
     */
    public boolean isAutoid() {
        return autoid;
    }

    /**
     * Define o valor da propriedade autoid.
     * 
     */
    public void setAutoid(boolean value) {
        this.autoid = value;
    }

    public boolean isSetAutoid() {
        return true;
    }

    /**
     * Obtém o valor da propriedade codeModule.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeModule() {
        return codeModule;
    }

    /**
     * Define o valor da propriedade codeModule.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeModule(String value) {
        this.codeModule = value;
    }

    public boolean isSetCodeModule() {
        return (this.codeModule!= null);
    }

    /**
     * Obtém o valor da propriedade displayName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Define o valor da propriedade displayName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    public boolean isSetDisplayName() {
        return (this.displayName!= null);
    }

    /**
     * Obtém o valor da propriedade fieldName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Define o valor da propriedade fieldName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    public boolean isSetFieldName() {
        return (this.fieldName!= null);
    }

    /**
     * Obtém o valor da propriedade fieldSize.
     * 
     */
    public int getFieldSize() {
        return fieldSize;
    }

    /**
     * Define o valor da propriedade fieldSize.
     * 
     */
    public void setFieldSize(int value) {
        this.fieldSize = value;
    }

    public boolean isSetFieldSize() {
        return true;
    }

    /**
     * Obtém o valor da propriedade fieldType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldType() {
        return fieldType;
    }

    /**
     * Define o valor da propriedade fieldType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldType(String value) {
        this.fieldType = value;
    }

    public boolean isSetFieldType() {
        return (this.fieldType!= null);
    }

    /**
     * Obtém o valor da propriedade keyType.
     * 
     */
    public boolean isKeyType() {
        return keyType;
    }

    /**
     * Define o valor da propriedade keyType.
     * 
     */
    public void setKeyType(boolean value) {
        this.keyType = value;
    }

    public boolean isSetKeyType() {
        return true;
    }

    /**
     * Obtém o valor da propriedade maximumValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumValue() {
        return maximumValue;
    }

    /**
     * Define o valor da propriedade maximumValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumValue(String value) {
        this.maximumValue = value;
    }

    public boolean isSetMaximumValue() {
        return (this.maximumValue!= null);
    }

    /**
     * Obtém o valor da propriedade minimumValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumValue() {
        return minimumValue;
    }

    /**
     * Define o valor da propriedade minimumValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumValue(String value) {
        this.minimumValue = value;
    }

    public boolean isSetMinimumValue() {
        return (this.minimumValue!= null);
    }

    /**
     * Obtém o valor da propriedade pattern.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Define o valor da propriedade pattern.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    public boolean isSetPattern() {
        return (this.pattern!= null);
    }

    /**
     * Obtém o valor da propriedade refKey.
     * 
     */
    public boolean isRefKey() {
        return refKey;
    }

    /**
     * Define o valor da propriedade refKey.
     * 
     */
    public void setRefKey(boolean value) {
        this.refKey = value;
    }

    public boolean isSetRefKey() {
        return true;
    }

    /**
     * Obtém o valor da propriedade refMapping.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefMapping() {
        return refMapping;
    }

    /**
     * Define o valor da propriedade refMapping.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefMapping(String value) {
        this.refMapping = value;
    }

    public boolean isSetRefMapping() {
        return (this.refMapping!= null);
    }

    /**
     * Obtém o valor da propriedade required.
     * 
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * Define o valor da propriedade required.
     * 
     */
    public void setRequired(boolean value) {
        this.required = value;
    }

    public boolean isSetRequired() {
        return true;
    }

    /**
     * Obtém o valor da propriedade updateable.
     * 
     */
    public boolean isUpdateable() {
        return updateable;
    }

    /**
     * Define o valor da propriedade updateable.
     * 
     */
    public void setUpdateable(boolean value) {
        this.updateable = value;
    }

    public boolean isSetUpdateable() {
        return true;
    }

}
