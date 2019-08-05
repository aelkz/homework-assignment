
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de commentBean complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="commentBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="commentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="commentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="commentText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enterDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commentBean", propOrder = {
    "commentCode",
    "commentId",
    "commentText",
    "enterDate"
})
public class CommentBean
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String commentCode;
    protected String commentId;
    protected String commentText;
    protected String enterDate;

    /**
     * Obtém o valor da propriedade commentCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentCode() {
        return commentCode;
    }

    /**
     * Define o valor da propriedade commentCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentCode(String value) {
        this.commentCode = value;
    }

    public boolean isSetCommentCode() {
        return (this.commentCode!= null);
    }

    /**
     * Obtém o valor da propriedade commentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * Define o valor da propriedade commentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentId(String value) {
        this.commentId = value;
    }

    public boolean isSetCommentId() {
        return (this.commentId!= null);
    }

    /**
     * Obtém o valor da propriedade commentText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentText() {
        return commentText;
    }

    /**
     * Define o valor da propriedade commentText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentText(String value) {
        this.commentText = value;
    }

    public boolean isSetCommentText() {
        return (this.commentText!= null);
    }

    /**
     * Obtém o valor da propriedade enterDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterDate() {
        return enterDate;
    }

    /**
     * Define o valor da propriedade enterDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterDate(String value) {
        this.enterDate = value;
    }

    public boolean isSetEnterDate() {
        return (this.enterDate!= null);
    }

}
