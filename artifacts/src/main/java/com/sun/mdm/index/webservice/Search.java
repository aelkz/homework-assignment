
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de search complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="search"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callerInfo" type="{http://webservice.index.mdm.sun.com/}callerInfo" minOccurs="0"/&gt;
 *         &lt;element name="objBean" type="{http://webservice.index.mdm.sun.com/}personBean" minOccurs="0"/&gt;
 *         &lt;element name="searchOptions" type="{http://webservice.index.mdm.sun.com/}eoSearchOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "search", propOrder = {
    "callerInfo",
    "objBean",
    "searchOptions"
})
@XmlRootElement(name = "search")
public class Search
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected CallerInfo callerInfo;
    protected PersonBean objBean;
    protected EoSearchOptions searchOptions;

    /**
     * Obtém o valor da propriedade callerInfo.
     * 
     * @return
     *     possible object is
     *     {@link CallerInfo }
     *     
     */
    public CallerInfo getCallerInfo() {
        return callerInfo;
    }

    /**
     * Define o valor da propriedade callerInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link CallerInfo }
     *     
     */
    public void setCallerInfo(CallerInfo value) {
        this.callerInfo = value;
    }

    public boolean isSetCallerInfo() {
        return (this.callerInfo!= null);
    }

    /**
     * Obtém o valor da propriedade objBean.
     * 
     * @return
     *     possible object is
     *     {@link PersonBean }
     *     
     */
    public PersonBean getObjBean() {
        return objBean;
    }

    /**
     * Define o valor da propriedade objBean.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonBean }
     *     
     */
    public void setObjBean(PersonBean value) {
        this.objBean = value;
    }

    public boolean isSetObjBean() {
        return (this.objBean!= null);
    }

    /**
     * Obtém o valor da propriedade searchOptions.
     * 
     * @return
     *     possible object is
     *     {@link EoSearchOptions }
     *     
     */
    public EoSearchOptions getSearchOptions() {
        return searchOptions;
    }

    /**
     * Define o valor da propriedade searchOptions.
     * 
     * @param value
     *     allowed object is
     *     {@link EoSearchOptions }
     *     
     */
    public void setSearchOptions(EoSearchOptions value) {
        this.searchOptions = value;
    }

    public boolean isSetSearchOptions() {
        return (this.searchOptions!= null);
    }

}
