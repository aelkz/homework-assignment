//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.07.26 às 04:04:44 PM BRT 
//


package com.customer.app;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Person Participate in Pension Scheme
 * 
 * <p>Classe Java de PersonPension complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PersonPension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pensionnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pensionexpirationdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonPension", propOrder = {
    "pensionnumber",
    "pensionexpirationdate"
})
@XmlRootElement(name = "PersonPension")
public class PersonPension
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String pensionnumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pensionexpirationdate;

    /**
     * Obtém o valor da propriedade pensionnumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPensionnumber() {
        return pensionnumber;
    }

    /**
     * Define o valor da propriedade pensionnumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPensionnumber(String value) {
        this.pensionnumber = value;
    }

    /**
     * Obtém o valor da propriedade pensionexpirationdate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPensionexpirationdate() {
        return pensionexpirationdate;
    }

    /**
     * Define o valor da propriedade pensionexpirationdate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPensionexpirationdate(XMLGregorianCalendar value) {
        this.pensionexpirationdate = value;
    }

}
