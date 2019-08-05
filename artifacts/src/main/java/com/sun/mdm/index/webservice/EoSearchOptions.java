
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de eoSearchOptions complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="eoSearchOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="filterDeactivatedRecords" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="filterMergedRecords" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="maxElements" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="minimumWeight" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="queryTimeout" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="searchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="simulateMatch" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eoSearchOptions", propOrder = {
    "filterDeactivatedRecords",
    "filterMergedRecords",
    "maxElements",
    "minimumWeight",
    "queryTimeout",
    "searchId",
    "simulateMatch"
})
public class EoSearchOptions
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected boolean filterDeactivatedRecords;
    protected boolean filterMergedRecords;
    protected int maxElements;
    protected Float minimumWeight;
    protected int queryTimeout;
    protected String searchId;
    protected boolean simulateMatch;

    /**
     * Obtém o valor da propriedade filterDeactivatedRecords.
     * 
     */
    public boolean isFilterDeactivatedRecords() {
        return filterDeactivatedRecords;
    }

    /**
     * Define o valor da propriedade filterDeactivatedRecords.
     * 
     */
    public void setFilterDeactivatedRecords(boolean value) {
        this.filterDeactivatedRecords = value;
    }

    public boolean isSetFilterDeactivatedRecords() {
        return true;
    }

    /**
     * Obtém o valor da propriedade filterMergedRecords.
     * 
     */
    public boolean isFilterMergedRecords() {
        return filterMergedRecords;
    }

    /**
     * Define o valor da propriedade filterMergedRecords.
     * 
     */
    public void setFilterMergedRecords(boolean value) {
        this.filterMergedRecords = value;
    }

    public boolean isSetFilterMergedRecords() {
        return true;
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
     * Obtém o valor da propriedade minimumWeight.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinimumWeight() {
        return minimumWeight;
    }

    /**
     * Define o valor da propriedade minimumWeight.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinimumWeight(Float value) {
        this.minimumWeight = value;
    }

    public boolean isSetMinimumWeight() {
        return (this.minimumWeight!= null);
    }

    /**
     * Obtém o valor da propriedade queryTimeout.
     * 
     */
    public int getQueryTimeout() {
        return queryTimeout;
    }

    /**
     * Define o valor da propriedade queryTimeout.
     * 
     */
    public void setQueryTimeout(int value) {
        this.queryTimeout = value;
    }

    public boolean isSetQueryTimeout() {
        return true;
    }

    /**
     * Obtém o valor da propriedade searchId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchId() {
        return searchId;
    }

    /**
     * Define o valor da propriedade searchId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchId(String value) {
        this.searchId = value;
    }

    public boolean isSetSearchId() {
        return (this.searchId!= null);
    }

    /**
     * Obtém o valor da propriedade simulateMatch.
     * 
     */
    public boolean isSimulateMatch() {
        return simulateMatch;
    }

    /**
     * Define o valor da propriedade simulateMatch.
     * 
     */
    public void setSimulateMatch(boolean value) {
        this.simulateMatch = value;
    }

    public boolean isSetSimulateMatch() {
        return true;
    }

}
