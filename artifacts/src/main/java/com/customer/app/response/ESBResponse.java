//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.07.26 às 04:04:44 PM BRT 
//


package com.customer.app.response;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{http://www.response.app.customer.com}MessageId"/&gt;
 *         &lt;element ref="{http://www.response.app.customer.com}RecordIdentifier"/&gt;
 *         &lt;element ref="{http://www.response.app.customer.com}MessageType"/&gt;
 *         &lt;element ref="{http://www.response.app.customer.com}Publisher"/&gt;
 *         &lt;element ref="{http://www.response.app.customer.com}Destination"/&gt;
 *         &lt;element ref="{http://www.response.app.customer.com}BusinessKey"/&gt;
 *         &lt;element ref="{http://www.response.app.customer.com}EUID"/&gt;
 *         &lt;element ref="{http://www.response.app.customer.com}ProviderID"/&gt;
 *         &lt;element ref="{http://www.response.app.customer.com}FacilityID"/&gt;
 *         &lt;element ref="{http://www.response.app.customer.com}ESBMessageSignature"/&gt;
 *         &lt;element ref="{http://www.response.app.customer.com}ESBProcessDate"/&gt;
 *         &lt;element ref="{http://www.response.app.customer.com}Published"/&gt;
 *         &lt;element ref="{http://www.response.app.customer.com}Comment"/&gt;
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
    "messageId",
    "recordIdentifier",
    "messageType",
    "publisher",
    "destination",
    "businessKey",
    "euid",
    "providerID",
    "facilityID",
    "esbMessageSignature",
    "esbProcessDate",
    "published",
    "comment"
})
@XmlRootElement(name = "ESBResponse")
public class ESBResponse
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    @XmlElement(name = "MessageId", required = true)
    protected String messageId;
    @XmlElement(name = "RecordIdentifier", required = true)
    protected String recordIdentifier;
    @XmlElement(name = "MessageType", required = true)
    protected String messageType;
    @XmlElement(name = "Publisher", required = true)
    protected String publisher;
    @XmlElement(name = "Destination", required = true)
    protected String destination;
    @XmlElement(name = "BusinessKey", required = true)
    protected String businessKey;
    @XmlElement(name = "EUID", required = true)
    protected String euid;
    @XmlElement(name = "ProviderID", required = true)
    protected String providerID;
    @XmlElement(name = "FacilityID", required = true)
    protected String facilityID;
    @XmlElement(name = "ESBMessageSignature", required = true)
    protected String esbMessageSignature;
    @XmlElement(name = "ESBProcessDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar esbProcessDate;
    @XmlElement(name = "Published")
    protected boolean published;
    @XmlElement(name = "Comment", required = true)
    protected String comment;

    /**
     * Obtém o valor da propriedade messageId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Define o valor da propriedade messageId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Obtém o valor da propriedade recordIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordIdentifier() {
        return recordIdentifier;
    }

    /**
     * Define o valor da propriedade recordIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordIdentifier(String value) {
        this.recordIdentifier = value;
    }

    /**
     * Obtém o valor da propriedade messageType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Define o valor da propriedade messageType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

    /**
     * Obtém o valor da propriedade publisher.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Define o valor da propriedade publisher.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisher(String value) {
        this.publisher = value;
    }

    /**
     * Obtém o valor da propriedade destination.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Define o valor da propriedade destination.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Obtém o valor da propriedade businessKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessKey() {
        return businessKey;
    }

    /**
     * Define o valor da propriedade businessKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessKey(String value) {
        this.businessKey = value;
    }

    /**
     * Obtém o valor da propriedade euid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEUID() {
        return euid;
    }

    /**
     * Define o valor da propriedade euid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEUID(String value) {
        this.euid = value;
    }

    /**
     * Obtém o valor da propriedade providerID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderID() {
        return providerID;
    }

    /**
     * Define o valor da propriedade providerID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderID(String value) {
        this.providerID = value;
    }

    /**
     * Obtém o valor da propriedade facilityID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityID() {
        return facilityID;
    }

    /**
     * Define o valor da propriedade facilityID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityID(String value) {
        this.facilityID = value;
    }

    /**
     * Obtém o valor da propriedade esbMessageSignature.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESBMessageSignature() {
        return esbMessageSignature;
    }

    /**
     * Define o valor da propriedade esbMessageSignature.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESBMessageSignature(String value) {
        this.esbMessageSignature = value;
    }

    /**
     * Obtém o valor da propriedade esbProcessDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getESBProcessDate() {
        return esbProcessDate;
    }

    /**
     * Define o valor da propriedade esbProcessDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setESBProcessDate(XMLGregorianCalendar value) {
        this.esbProcessDate = value;
    }

    /**
     * Obtém o valor da propriedade published.
     * 
     */
    public boolean isPublished() {
        return published;
    }

    /**
     * Define o valor da propriedade published.
     * 
     */
    public void setPublished(boolean value) {
        this.published = value;
    }

    /**
     * Obtém o valor da propriedade comment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Define o valor da propriedade comment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
