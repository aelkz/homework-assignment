
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de callerInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="callerInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="application" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="applicationFunction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="executionCycleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="system" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callerInfo", propOrder = {
    "application",
    "applicationFunction",
    "authPassword",
    "authUser",
    "executionCycleId",
    "system",
    "user"
})
public class CallerInfo
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String application;
    protected String applicationFunction;
    protected String authPassword;
    protected String authUser;
    protected String executionCycleId;
    protected String system;
    protected String user;

    /**
     * Obtém o valor da propriedade application.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplication() {
        return application;
    }

    /**
     * Define o valor da propriedade application.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplication(String value) {
        this.application = value;
    }

    public boolean isSetApplication() {
        return (this.application!= null);
    }

    /**
     * Obtém o valor da propriedade applicationFunction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationFunction() {
        return applicationFunction;
    }

    /**
     * Define o valor da propriedade applicationFunction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationFunction(String value) {
        this.applicationFunction = value;
    }

    public boolean isSetApplicationFunction() {
        return (this.applicationFunction!= null);
    }

    /**
     * Obtém o valor da propriedade authPassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthPassword() {
        return authPassword;
    }

    /**
     * Define o valor da propriedade authPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthPassword(String value) {
        this.authPassword = value;
    }

    public boolean isSetAuthPassword() {
        return (this.authPassword!= null);
    }

    /**
     * Obtém o valor da propriedade authUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthUser() {
        return authUser;
    }

    /**
     * Define o valor da propriedade authUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthUser(String value) {
        this.authUser = value;
    }

    public boolean isSetAuthUser() {
        return (this.authUser!= null);
    }

    /**
     * Obtém o valor da propriedade executionCycleId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutionCycleId() {
        return executionCycleId;
    }

    /**
     * Define o valor da propriedade executionCycleId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutionCycleId(String value) {
        this.executionCycleId = value;
    }

    public boolean isSetExecutionCycleId() {
        return (this.executionCycleId!= null);
    }

    /**
     * Obtém o valor da propriedade system.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystem() {
        return system;
    }

    /**
     * Define o valor da propriedade system.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystem(String value) {
        this.system = value;
    }

    public boolean isSetSystem() {
        return (this.system!= null);
    }

    /**
     * Obtém o valor da propriedade user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Define o valor da propriedade user.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    public boolean isSetUser() {
        return (this.user!= null);
    }

}
