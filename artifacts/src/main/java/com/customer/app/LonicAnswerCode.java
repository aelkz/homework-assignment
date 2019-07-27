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
import javax.xml.bind.annotation.XmlType;


/**
 * A specialization of Code which contains properties necessary to support LOINC-coded answers to assessment questions.
 * 
 * <p>Classe Java de LonicAnswerCode complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="LonicAnswerCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.app.customer.com}NullableCode"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="laccode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="laccodesystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="laccodesystemname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="laccodesystemversion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="score" type="{http://www.app.customer.com}Real" minOccurs="0"/&gt;
 *         &lt;element name="sequencenumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="answer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LonicAnswerCode", propOrder = {
    "laccode",
    "laccodesystem",
    "laccodesystemname",
    "laccodesystemversion",
    "score",
    "sequencenumber",
    "answer"
})
@XmlRootElement(name = "LonicAnswerCode")
public class LonicAnswerCode
    extends NullableCode
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String laccode;
    protected String laccodesystem;
    protected String laccodesystemname;
    protected String laccodesystemversion;
    protected Real score;
    protected Integer sequencenumber;
    protected String answer;

    /**
     * Obtém o valor da propriedade laccode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaccode() {
        return laccode;
    }

    /**
     * Define o valor da propriedade laccode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaccode(String value) {
        this.laccode = value;
    }

    /**
     * Obtém o valor da propriedade laccodesystem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaccodesystem() {
        return laccodesystem;
    }

    /**
     * Define o valor da propriedade laccodesystem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaccodesystem(String value) {
        this.laccodesystem = value;
    }

    /**
     * Obtém o valor da propriedade laccodesystemname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaccodesystemname() {
        return laccodesystemname;
    }

    /**
     * Define o valor da propriedade laccodesystemname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaccodesystemname(String value) {
        this.laccodesystemname = value;
    }

    /**
     * Obtém o valor da propriedade laccodesystemversion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaccodesystemversion() {
        return laccodesystemversion;
    }

    /**
     * Define o valor da propriedade laccodesystemversion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaccodesystemversion(String value) {
        this.laccodesystemversion = value;
    }

    /**
     * Obtém o valor da propriedade score.
     * 
     * @return
     *     possible object is
     *     {@link Real }
     *     
     */
    public Real getScore() {
        return score;
    }

    /**
     * Define o valor da propriedade score.
     * 
     * @param value
     *     allowed object is
     *     {@link Real }
     *     
     */
    public void setScore(Real value) {
        this.score = value;
    }

    /**
     * Obtém o valor da propriedade sequencenumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequencenumber() {
        return sequencenumber;
    }

    /**
     * Define o valor da propriedade sequencenumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequencenumber(Integer value) {
        this.sequencenumber = value;
    }

    /**
     * Obtém o valor da propriedade answer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Define o valor da propriedade answer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswer(String value) {
        this.answer = value;
    }

}
