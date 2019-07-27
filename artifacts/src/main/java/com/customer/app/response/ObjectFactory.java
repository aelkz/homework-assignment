//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.07.26 às 04:04:44 PM BRT 
//


package com.customer.app.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.customer.app.response package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MessageId_QNAME = new QName("http://www.response.app.customer.com", "MessageId");
    private final static QName _RecordIdentifier_QNAME = new QName("http://www.response.app.customer.com", "RecordIdentifier");
    private final static QName _MessageType_QNAME = new QName("http://www.response.app.customer.com", "MessageType");
    private final static QName _Publisher_QNAME = new QName("http://www.response.app.customer.com", "Publisher");
    private final static QName _Destination_QNAME = new QName("http://www.response.app.customer.com", "Destination");
    private final static QName _BusinessKey_QNAME = new QName("http://www.response.app.customer.com", "BusinessKey");
    private final static QName _EUID_QNAME = new QName("http://www.response.app.customer.com", "EUID");
    private final static QName _ProviderID_QNAME = new QName("http://www.response.app.customer.com", "ProviderID");
    private final static QName _FacilityID_QNAME = new QName("http://www.response.app.customer.com", "FacilityID");
    private final static QName _ESBMessageSignature_QNAME = new QName("http://www.response.app.customer.com", "ESBMessageSignature");
    private final static QName _ESBProcessDate_QNAME = new QName("http://www.response.app.customer.com", "ESBProcessDate");
    private final static QName _Published_QNAME = new QName("http://www.response.app.customer.com", "Published");
    private final static QName _Comment_QNAME = new QName("http://www.response.app.customer.com", "Comment");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.customer.app.response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ESBResponse }
     * 
     */
    public ESBResponse createESBResponse() {
        return new ESBResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.response.app.customer.com", name = "MessageId")
    public JAXBElement<String> createMessageId(String value) {
        return new JAXBElement<String>(_MessageId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.response.app.customer.com", name = "RecordIdentifier")
    public JAXBElement<String> createRecordIdentifier(String value) {
        return new JAXBElement<String>(_RecordIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.response.app.customer.com", name = "MessageType")
    public JAXBElement<String> createMessageType(String value) {
        return new JAXBElement<String>(_MessageType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.response.app.customer.com", name = "Publisher")
    public JAXBElement<String> createPublisher(String value) {
        return new JAXBElement<String>(_Publisher_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.response.app.customer.com", name = "Destination")
    public JAXBElement<String> createDestination(String value) {
        return new JAXBElement<String>(_Destination_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.response.app.customer.com", name = "BusinessKey")
    public JAXBElement<String> createBusinessKey(String value) {
        return new JAXBElement<String>(_BusinessKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.response.app.customer.com", name = "EUID")
    public JAXBElement<String> createEUID(String value) {
        return new JAXBElement<String>(_EUID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.response.app.customer.com", name = "ProviderID")
    public JAXBElement<String> createProviderID(String value) {
        return new JAXBElement<String>(_ProviderID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.response.app.customer.com", name = "FacilityID")
    public JAXBElement<String> createFacilityID(String value) {
        return new JAXBElement<String>(_FacilityID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.response.app.customer.com", name = "ESBMessageSignature")
    public JAXBElement<String> createESBMessageSignature(String value) {
        return new JAXBElement<String>(_ESBMessageSignature_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.response.app.customer.com", name = "ESBProcessDate")
    public JAXBElement<XMLGregorianCalendar> createESBProcessDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ESBProcessDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.response.app.customer.com", name = "Published")
    public JAXBElement<Boolean> createPublished(Boolean value) {
        return new JAXBElement<Boolean>(_Published_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.response.app.customer.com", name = "Comment")
    public JAXBElement<String> createComment(String value) {
        return new JAXBElement<String>(_Comment_QNAME, String.class, null, value);
    }

}
