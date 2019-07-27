//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.07.26 às 04:04:44 PM BRT 
//


package com.customer.app;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ContactMechanismType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactMechanismType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="workphone"/&gt;
 *     &lt;enumeration value="homephone"/&gt;
 *     &lt;enumeration value="cellphone"/&gt;
 *     &lt;enumeration value="homefax"/&gt;
 *     &lt;enumeration value="officefax"/&gt;
 *     &lt;enumeration value="personalemail"/&gt;
 *     &lt;enumeration value="officalemail"/&gt;
 *     &lt;enumeration value="pager"/&gt;
 *     &lt;enumeration value="website"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContactMechanismType")
@XmlEnum
public enum ContactMechanismType {

    @XmlEnumValue("workphone")
    WORKPHONE("workphone"),
    @XmlEnumValue("homephone")
    HOMEPHONE("homephone"),
    @XmlEnumValue("cellphone")
    CELLPHONE("cellphone"),
    @XmlEnumValue("homefax")
    HOMEFAX("homefax"),
    @XmlEnumValue("officefax")
    OFFICEFAX("officefax"),
    @XmlEnumValue("personalemail")
    PERSONALEMAIL("personalemail"),
    @XmlEnumValue("officalemail")
    OFFICALEMAIL("officalemail"),
    @XmlEnumValue("pager")
    PAGER("pager"),
    @XmlEnumValue("website")
    WEBSITE("website");
    private final String value;

    ContactMechanismType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactMechanismType fromValue(String v) {
        for (ContactMechanismType c: ContactMechanismType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
