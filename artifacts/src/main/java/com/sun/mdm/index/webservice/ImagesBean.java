
package com.sun.mdm.index.webservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de imagesBean complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="imagesBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imageAddDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imageDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imageUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imagesId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "imagesBean", propOrder = {
    "image",
    "imageAddDate",
    "imageDescription",
    "imageName",
    "imageType",
    "imageUpdateDate",
    "imagesId"
})
public class ImagesBean
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String image;
    protected String imageAddDate;
    protected String imageDescription;
    protected String imageName;
    protected String imageType;
    protected String imageUpdateDate;
    protected String imagesId;

    /**
     * Obtém o valor da propriedade image.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImage() {
        return image;
    }

    /**
     * Define o valor da propriedade image.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImage(String value) {
        this.image = value;
    }

    public boolean isSetImage() {
        return (this.image!= null);
    }

    /**
     * Obtém o valor da propriedade imageAddDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageAddDate() {
        return imageAddDate;
    }

    /**
     * Define o valor da propriedade imageAddDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageAddDate(String value) {
        this.imageAddDate = value;
    }

    public boolean isSetImageAddDate() {
        return (this.imageAddDate!= null);
    }

    /**
     * Obtém o valor da propriedade imageDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageDescription() {
        return imageDescription;
    }

    /**
     * Define o valor da propriedade imageDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageDescription(String value) {
        this.imageDescription = value;
    }

    public boolean isSetImageDescription() {
        return (this.imageDescription!= null);
    }

    /**
     * Obtém o valor da propriedade imageName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageName() {
        return imageName;
    }

    /**
     * Define o valor da propriedade imageName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageName(String value) {
        this.imageName = value;
    }

    public boolean isSetImageName() {
        return (this.imageName!= null);
    }

    /**
     * Obtém o valor da propriedade imageType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageType() {
        return imageType;
    }

    /**
     * Define o valor da propriedade imageType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageType(String value) {
        this.imageType = value;
    }

    public boolean isSetImageType() {
        return (this.imageType!= null);
    }

    /**
     * Obtém o valor da propriedade imageUpdateDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageUpdateDate() {
        return imageUpdateDate;
    }

    /**
     * Define o valor da propriedade imageUpdateDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageUpdateDate(String value) {
        this.imageUpdateDate = value;
    }

    public boolean isSetImageUpdateDate() {
        return (this.imageUpdateDate!= null);
    }

    /**
     * Obtém o valor da propriedade imagesId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagesId() {
        return imagesId;
    }

    /**
     * Define o valor da propriedade imagesId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagesId(String value) {
        this.imagesId = value;
    }

    public boolean isSetImagesId() {
        return (this.imagesId!= null);
    }

}
