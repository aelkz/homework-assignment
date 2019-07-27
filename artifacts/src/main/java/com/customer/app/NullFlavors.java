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
 * <p>Classe Java de NullFlavors.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="NullFlavors"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="askedbutunknown"/&gt;
 *     &lt;enumeration value="derived"/&gt;
 *     &lt;enumeration value="invalid"/&gt;
 *     &lt;enumeration value="masked"/&gt;
 *     &lt;enumeration value="negativeinfinity"/&gt;
 *     &lt;enumeration value="noinformation"/&gt;
 *     &lt;enumeration value="notapplicable"/&gt;
 *     &lt;enumeration value="notasked"/&gt;
 *     &lt;enumeration value="positiveinfinity"/&gt;
 *     &lt;enumeration value="sufficientquantity"/&gt;
 *     &lt;enumeration value="temporarilyunavailable"/&gt;
 *     &lt;enumeration value="trace"/&gt;
 *     &lt;enumeration value="unencoded"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NullFlavors")
@XmlEnum
public enum NullFlavors {

    @XmlEnumValue("askedbutunknown")
    ASKEDBUTUNKNOWN("askedbutunknown"),
    @XmlEnumValue("derived")
    DERIVED("derived"),
    @XmlEnumValue("invalid")
    INVALID("invalid"),
    @XmlEnumValue("masked")
    MASKED("masked"),
    @XmlEnumValue("negativeinfinity")
    NEGATIVEINFINITY("negativeinfinity"),
    @XmlEnumValue("noinformation")
    NOINFORMATION("noinformation"),
    @XmlEnumValue("notapplicable")
    NOTAPPLICABLE("notapplicable"),
    @XmlEnumValue("notasked")
    NOTASKED("notasked"),
    @XmlEnumValue("positiveinfinity")
    POSITIVEINFINITY("positiveinfinity"),
    @XmlEnumValue("sufficientquantity")
    SUFFICIENTQUANTITY("sufficientquantity"),
    @XmlEnumValue("temporarilyunavailable")
    TEMPORARILYUNAVAILABLE("temporarilyunavailable"),
    @XmlEnumValue("trace")
    TRACE("trace"),
    @XmlEnumValue("unencoded")
    UNENCODED("unencoded"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    NullFlavors(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NullFlavors fromValue(String v) {
        for (NullFlavors c: NullFlavors.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
