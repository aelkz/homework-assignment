//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.07.26 às 04:04:44 PM BRT 
//


package com.customer.app;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Person 
 * 
 * <p>Classe Java de Person complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Person"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.app.customer.com}BiologicalEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="systemcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updatetimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="legalname" type="{http://www.app.customer.com}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="alternatename" type="{http://www.app.customer.com}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="spousename" type="{http://www.app.customer.com}PersonName" minOccurs="0"/&gt;
 *         &lt;element name="mothersmaidenname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fathername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mothername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ssn" type="{http://www.app.customer.com}ID" minOccurs="0"/&gt;
 *         &lt;element name="race" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="religion" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="birthaddress" type="{http://www.app.customer.com}BirthAddress" minOccurs="0"/&gt;
 *         &lt;element name="vipflag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="veteranstatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="driverslicensestate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repatriationnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="districtofresidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lgacode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="commentvalue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="maritalstatus" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="ethnicity" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="administrativegender" type="{http://www.app.customer.com}NullableCode" minOccurs="0"/&gt;
 *         &lt;element name="religiousaffiliation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="preferredcontactmethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="primaryhomeaddress" type="{http://www.app.customer.com}Address" minOccurs="0"/&gt;
 *         &lt;element name="primaryhomeemail" type="{http://www.app.customer.com}ContactMechanism" minOccurs="0"/&gt;
 *         &lt;element name="primaryhomephone" type="{http://www.app.customer.com}ContactMechanism" minOccurs="0"/&gt;
 *         &lt;element name="primaryhomephoneextension" type="{http://www.app.customer.com}ContactMechanism" minOccurs="0"/&gt;
 *         &lt;element name="primarycellphone" type="{http://www.app.customer.com}ContactMechanism" minOccurs="0"/&gt;
 *         &lt;element name="primaryhomepager" type="{http://www.app.customer.com}ContactMechanism" minOccurs="0"/&gt;
 *         &lt;element name="workaddress" type="{http://www.app.customer.com}Address" minOccurs="0"/&gt;
 *         &lt;element name="workemail" type="{http://www.app.customer.com}ContactMechanism" minOccurs="0"/&gt;
 *         &lt;element name="workphone" type="{http://www.app.customer.com}ContactMechanism" minOccurs="0"/&gt;
 *         &lt;element name="workphoneextension" type="{http://www.app.customer.com}ContactMechanism" minOccurs="0"/&gt;
 *         &lt;element name="workpager" type="{http://www.app.customer.com}ContactMechanism" minOccurs="0"/&gt;
 *         &lt;element name="temporaryaddress" type="{http://www.app.customer.com}Address" minOccurs="0"/&gt;
 *         &lt;element name="temporaryemail" type="{http://www.app.customer.com}ContactMechanism" minOccurs="0"/&gt;
 *         &lt;element name="temporaryphone" type="{http://www.app.customer.com}ContactMechanism" minOccurs="0"/&gt;
 *         &lt;element name="temporaryphoneextension" type="{http://www.app.customer.com}ContactMechanism" minOccurs="0"/&gt;
 *         &lt;element name="temporarypager" type="{http://www.app.customer.com}ContactMechanism" minOccurs="0"/&gt;
 *         &lt;element name="handicap" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identityrealibilitycode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isidentityunknown" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="istranslatorneeded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="lastupdatefacility" type="{http://www.app.customer.com}ID" minOccurs="0"/&gt;
 *         &lt;element name="livingarrangement" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="livingdependency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billingaddress" type="{http://www.app.customer.com}Address" minOccurs="0"/&gt;
 *         &lt;element name="billingemail" type="{http://www.app.customer.com}ContactMechanism" minOccurs="0"/&gt;
 *         &lt;element name="billingphone" type="{http://www.app.customer.com}ContactMechanism" minOccurs="0"/&gt;
 *         &lt;element name="billingphoneextension" type="{http://www.app.customer.com}ContactMechanism" minOccurs="0"/&gt;
 *         &lt;element name="billingpager" type="{http://www.app.customer.com}ContactMechanism" minOccurs="0"/&gt;
 *         &lt;element name="empistatus" type="{http://www.app.customer.com}Code" minOccurs="0"/&gt;
 *         &lt;element name="PersonalRelationship" type="{http://www.app.customer.com}PersonalRelationship" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Citizenship" type="{http://www.app.customer.com}Citizenship" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ContactParty" type="{http://www.app.customer.com}ContactParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OccupationalHistoryObservation" type="{http://www.app.customer.com}OccupationalHistoryObservation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PersonPension" type="{http://www.app.customer.com}PersonPension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="USUniformedServicesPerson" type="{http://www.app.customer.com}USUniformedServicesPerson" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LanguageCapability" type="{http://www.app.customer.com}LanguageCapability" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AdvanceDirective" type="{http://www.app.customer.com}AdvanceDirective" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person", propOrder = {
    "systemcode",
    "updatetimestamp",
    "localid",
    "birthname",
    "legalname",
    "alternatename",
    "spousename",
    "mothersmaidenname",
    "fathername",
    "mothername",
    "ssn",
    "race",
    "religion",
    "birthaddress",
    "vipflag",
    "veteranstatus",
    "driverslicensestate",
    "repatriationnumber",
    "districtofresidence",
    "lgacode",
    "commentvalue",
    "gender",
    "maritalstatus",
    "ethnicity",
    "administrativegender",
    "religiousaffiliation",
    "preferredcontactmethod",
    "primaryhomeaddress",
    "primaryhomeemail",
    "primaryhomephone",
    "primaryhomephoneextension",
    "primarycellphone",
    "primaryhomepager",
    "workaddress",
    "workemail",
    "workphone",
    "workphoneextension",
    "workpager",
    "temporaryaddress",
    "temporaryemail",
    "temporaryphone",
    "temporaryphoneextension",
    "temporarypager",
    "handicap",
    "identityrealibilitycode",
    "isidentityunknown",
    "istranslatorneeded",
    "lastupdatefacility",
    "livingarrangement",
    "livingdependency",
    "billingaddress",
    "billingemail",
    "billingphone",
    "billingphoneextension",
    "billingpager",
    "empistatus",
    "personalRelationships",
    "citizenships",
    "contactParties",
    "occupationalHistoryObservations",
    "personPensions",
    "usUniformedServicesPersons",
    "languageCapabilities",
    "advanceDirectives"
})
@XmlRootElement(name = "Person")
public class Person
    extends BiologicalEntity
    implements Serializable
{

    private final static long serialVersionUID = 12343L;
    protected String systemcode;
    protected String updatetimestamp;
    protected String localid;
    protected String birthname;
    protected PersonName legalname;
    protected PersonName alternatename;
    protected PersonName spousename;
    protected String mothersmaidenname;
    protected String fathername;
    protected String mothername;
    protected ID ssn;
    protected Code race;
    protected Code religion;
    protected BirthAddress birthaddress;
    protected Boolean vipflag;
    protected Boolean veteranstatus;
    protected String driverslicensestate;
    protected String repatriationnumber;
    protected String districtofresidence;
    protected String lgacode;
    protected String commentvalue;
    protected Code gender;
    protected Code maritalstatus;
    protected Code ethnicity;
    protected NullableCode administrativegender;
    protected String religiousaffiliation;
    protected String preferredcontactmethod;
    protected Address primaryhomeaddress;
    protected ContactMechanism primaryhomeemail;
    protected ContactMechanism primaryhomephone;
    protected ContactMechanism primaryhomephoneextension;
    protected ContactMechanism primarycellphone;
    protected ContactMechanism primaryhomepager;
    protected Address workaddress;
    protected ContactMechanism workemail;
    protected ContactMechanism workphone;
    protected ContactMechanism workphoneextension;
    protected ContactMechanism workpager;
    protected Address temporaryaddress;
    protected ContactMechanism temporaryemail;
    protected ContactMechanism temporaryphone;
    protected ContactMechanism temporaryphoneextension;
    protected ContactMechanism temporarypager;
    protected String handicap;
    protected String identityrealibilitycode;
    protected Boolean isidentityunknown;
    protected Boolean istranslatorneeded;
    protected ID lastupdatefacility;
    protected Code livingarrangement;
    protected String livingdependency;
    protected Address billingaddress;
    protected ContactMechanism billingemail;
    protected ContactMechanism billingphone;
    protected ContactMechanism billingphoneextension;
    protected ContactMechanism billingpager;
    protected Code empistatus;
    @XmlElement(name = "PersonalRelationship")
    protected List<PersonalRelationship> personalRelationships;
    @XmlElement(name = "Citizenship")
    protected List<Citizenship> citizenships;
    @XmlElement(name = "ContactParty")
    protected List<ContactParty> contactParties;
    @XmlElement(name = "OccupationalHistoryObservation")
    protected List<OccupationalHistoryObservation> occupationalHistoryObservations;
    @XmlElement(name = "PersonPension")
    protected List<PersonPension> personPensions;
    @XmlElement(name = "USUniformedServicesPerson")
    protected List<USUniformedServicesPerson> usUniformedServicesPersons;
    @XmlElement(name = "LanguageCapability")
    protected List<LanguageCapability> languageCapabilities;
    @XmlElement(name = "AdvanceDirective")
    protected List<AdvanceDirective> advanceDirectives;

    /**
     * Obtém o valor da propriedade systemcode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemcode() {
        return systemcode;
    }

    /**
     * Define o valor da propriedade systemcode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemcode(String value) {
        this.systemcode = value;
    }

    /**
     * Obtém o valor da propriedade updatetimestamp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatetimestamp() {
        return updatetimestamp;
    }

    /**
     * Define o valor da propriedade updatetimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatetimestamp(String value) {
        this.updatetimestamp = value;
    }

    /**
     * Obtém o valor da propriedade localid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalid() {
        return localid;
    }

    /**
     * Define o valor da propriedade localid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalid(String value) {
        this.localid = value;
    }

    /**
     * Obtém o valor da propriedade birthname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthname() {
        return birthname;
    }

    /**
     * Define o valor da propriedade birthname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthname(String value) {
        this.birthname = value;
    }

    /**
     * Obtém o valor da propriedade legalname.
     * 
     * @return
     *     possible object is
     *     {@link PersonName }
     *     
     */
    public PersonName getLegalname() {
        return legalname;
    }

    /**
     * Define o valor da propriedade legalname.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *     
     */
    public void setLegalname(PersonName value) {
        this.legalname = value;
    }

    /**
     * Obtém o valor da propriedade alternatename.
     * 
     * @return
     *     possible object is
     *     {@link PersonName }
     *     
     */
    public PersonName getAlternatename() {
        return alternatename;
    }

    /**
     * Define o valor da propriedade alternatename.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *     
     */
    public void setAlternatename(PersonName value) {
        this.alternatename = value;
    }

    /**
     * Obtém o valor da propriedade spousename.
     * 
     * @return
     *     possible object is
     *     {@link PersonName }
     *     
     */
    public PersonName getSpousename() {
        return spousename;
    }

    /**
     * Define o valor da propriedade spousename.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonName }
     *     
     */
    public void setSpousename(PersonName value) {
        this.spousename = value;
    }

    /**
     * Obtém o valor da propriedade mothersmaidenname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMothersmaidenname() {
        return mothersmaidenname;
    }

    /**
     * Define o valor da propriedade mothersmaidenname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMothersmaidenname(String value) {
        this.mothersmaidenname = value;
    }

    /**
     * Obtém o valor da propriedade fathername.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFathername() {
        return fathername;
    }

    /**
     * Define o valor da propriedade fathername.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFathername(String value) {
        this.fathername = value;
    }

    /**
     * Obtém o valor da propriedade mothername.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMothername() {
        return mothername;
    }

    /**
     * Define o valor da propriedade mothername.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMothername(String value) {
        this.mothername = value;
    }

    /**
     * Obtém o valor da propriedade ssn.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getSsn() {
        return ssn;
    }

    /**
     * Define o valor da propriedade ssn.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setSsn(ID value) {
        this.ssn = value;
    }

    /**
     * Obtém o valor da propriedade race.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getRace() {
        return race;
    }

    /**
     * Define o valor da propriedade race.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setRace(Code value) {
        this.race = value;
    }

    /**
     * Obtém o valor da propriedade religion.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getReligion() {
        return religion;
    }

    /**
     * Define o valor da propriedade religion.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setReligion(Code value) {
        this.religion = value;
    }

    /**
     * Obtém o valor da propriedade birthaddress.
     * 
     * @return
     *     possible object is
     *     {@link BirthAddress }
     *     
     */
    public BirthAddress getBirthaddress() {
        return birthaddress;
    }

    /**
     * Define o valor da propriedade birthaddress.
     * 
     * @param value
     *     allowed object is
     *     {@link BirthAddress }
     *     
     */
    public void setBirthaddress(BirthAddress value) {
        this.birthaddress = value;
    }

    /**
     * Obtém o valor da propriedade vipflag.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVipflag() {
        return vipflag;
    }

    /**
     * Define o valor da propriedade vipflag.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVipflag(Boolean value) {
        this.vipflag = value;
    }

    /**
     * Obtém o valor da propriedade veteranstatus.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVeteranstatus() {
        return veteranstatus;
    }

    /**
     * Define o valor da propriedade veteranstatus.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVeteranstatus(Boolean value) {
        this.veteranstatus = value;
    }

    /**
     * Obtém o valor da propriedade driverslicensestate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverslicensestate() {
        return driverslicensestate;
    }

    /**
     * Define o valor da propriedade driverslicensestate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverslicensestate(String value) {
        this.driverslicensestate = value;
    }

    /**
     * Obtém o valor da propriedade repatriationnumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepatriationnumber() {
        return repatriationnumber;
    }

    /**
     * Define o valor da propriedade repatriationnumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepatriationnumber(String value) {
        this.repatriationnumber = value;
    }

    /**
     * Obtém o valor da propriedade districtofresidence.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictofresidence() {
        return districtofresidence;
    }

    /**
     * Define o valor da propriedade districtofresidence.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictofresidence(String value) {
        this.districtofresidence = value;
    }

    /**
     * Obtém o valor da propriedade lgacode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgacode() {
        return lgacode;
    }

    /**
     * Define o valor da propriedade lgacode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgacode(String value) {
        this.lgacode = value;
    }

    /**
     * Obtém o valor da propriedade commentvalue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentvalue() {
        return commentvalue;
    }

    /**
     * Define o valor da propriedade commentvalue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentvalue(String value) {
        this.commentvalue = value;
    }

    /**
     * Obtém o valor da propriedade gender.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getGender() {
        return gender;
    }

    /**
     * Define o valor da propriedade gender.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setGender(Code value) {
        this.gender = value;
    }

    /**
     * Obtém o valor da propriedade maritalstatus.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getMaritalstatus() {
        return maritalstatus;
    }

    /**
     * Define o valor da propriedade maritalstatus.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setMaritalstatus(Code value) {
        this.maritalstatus = value;
    }

    /**
     * Obtém o valor da propriedade ethnicity.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getEthnicity() {
        return ethnicity;
    }

    /**
     * Define o valor da propriedade ethnicity.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setEthnicity(Code value) {
        this.ethnicity = value;
    }

    /**
     * Obtém o valor da propriedade administrativegender.
     * 
     * @return
     *     possible object is
     *     {@link NullableCode }
     *     
     */
    public NullableCode getAdministrativegender() {
        return administrativegender;
    }

    /**
     * Define o valor da propriedade administrativegender.
     * 
     * @param value
     *     allowed object is
     *     {@link NullableCode }
     *     
     */
    public void setAdministrativegender(NullableCode value) {
        this.administrativegender = value;
    }

    /**
     * Obtém o valor da propriedade religiousaffiliation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReligiousaffiliation() {
        return religiousaffiliation;
    }

    /**
     * Define o valor da propriedade religiousaffiliation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReligiousaffiliation(String value) {
        this.religiousaffiliation = value;
    }

    /**
     * Obtém o valor da propriedade preferredcontactmethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredcontactmethod() {
        return preferredcontactmethod;
    }

    /**
     * Define o valor da propriedade preferredcontactmethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredcontactmethod(String value) {
        this.preferredcontactmethod = value;
    }

    /**
     * Obtém o valor da propriedade primaryhomeaddress.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getPrimaryhomeaddress() {
        return primaryhomeaddress;
    }

    /**
     * Define o valor da propriedade primaryhomeaddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setPrimaryhomeaddress(Address value) {
        this.primaryhomeaddress = value;
    }

    /**
     * Obtém o valor da propriedade primaryhomeemail.
     * 
     * @return
     *     possible object is
     *     {@link ContactMechanism }
     *     
     */
    public ContactMechanism getPrimaryhomeemail() {
        return primaryhomeemail;
    }

    /**
     * Define o valor da propriedade primaryhomeemail.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMechanism }
     *     
     */
    public void setPrimaryhomeemail(ContactMechanism value) {
        this.primaryhomeemail = value;
    }

    /**
     * Obtém o valor da propriedade primaryhomephone.
     * 
     * @return
     *     possible object is
     *     {@link ContactMechanism }
     *     
     */
    public ContactMechanism getPrimaryhomephone() {
        return primaryhomephone;
    }

    /**
     * Define o valor da propriedade primaryhomephone.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMechanism }
     *     
     */
    public void setPrimaryhomephone(ContactMechanism value) {
        this.primaryhomephone = value;
    }

    /**
     * Obtém o valor da propriedade primaryhomephoneextension.
     * 
     * @return
     *     possible object is
     *     {@link ContactMechanism }
     *     
     */
    public ContactMechanism getPrimaryhomephoneextension() {
        return primaryhomephoneextension;
    }

    /**
     * Define o valor da propriedade primaryhomephoneextension.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMechanism }
     *     
     */
    public void setPrimaryhomephoneextension(ContactMechanism value) {
        this.primaryhomephoneextension = value;
    }

    /**
     * Obtém o valor da propriedade primarycellphone.
     * 
     * @return
     *     possible object is
     *     {@link ContactMechanism }
     *     
     */
    public ContactMechanism getPrimarycellphone() {
        return primarycellphone;
    }

    /**
     * Define o valor da propriedade primarycellphone.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMechanism }
     *     
     */
    public void setPrimarycellphone(ContactMechanism value) {
        this.primarycellphone = value;
    }

    /**
     * Obtém o valor da propriedade primaryhomepager.
     * 
     * @return
     *     possible object is
     *     {@link ContactMechanism }
     *     
     */
    public ContactMechanism getPrimaryhomepager() {
        return primaryhomepager;
    }

    /**
     * Define o valor da propriedade primaryhomepager.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMechanism }
     *     
     */
    public void setPrimaryhomepager(ContactMechanism value) {
        this.primaryhomepager = value;
    }

    /**
     * Obtém o valor da propriedade workaddress.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getWorkaddress() {
        return workaddress;
    }

    /**
     * Define o valor da propriedade workaddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setWorkaddress(Address value) {
        this.workaddress = value;
    }

    /**
     * Obtém o valor da propriedade workemail.
     * 
     * @return
     *     possible object is
     *     {@link ContactMechanism }
     *     
     */
    public ContactMechanism getWorkemail() {
        return workemail;
    }

    /**
     * Define o valor da propriedade workemail.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMechanism }
     *     
     */
    public void setWorkemail(ContactMechanism value) {
        this.workemail = value;
    }

    /**
     * Obtém o valor da propriedade workphone.
     * 
     * @return
     *     possible object is
     *     {@link ContactMechanism }
     *     
     */
    public ContactMechanism getWorkphone() {
        return workphone;
    }

    /**
     * Define o valor da propriedade workphone.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMechanism }
     *     
     */
    public void setWorkphone(ContactMechanism value) {
        this.workphone = value;
    }

    /**
     * Obtém o valor da propriedade workphoneextension.
     * 
     * @return
     *     possible object is
     *     {@link ContactMechanism }
     *     
     */
    public ContactMechanism getWorkphoneextension() {
        return workphoneextension;
    }

    /**
     * Define o valor da propriedade workphoneextension.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMechanism }
     *     
     */
    public void setWorkphoneextension(ContactMechanism value) {
        this.workphoneextension = value;
    }

    /**
     * Obtém o valor da propriedade workpager.
     * 
     * @return
     *     possible object is
     *     {@link ContactMechanism }
     *     
     */
    public ContactMechanism getWorkpager() {
        return workpager;
    }

    /**
     * Define o valor da propriedade workpager.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMechanism }
     *     
     */
    public void setWorkpager(ContactMechanism value) {
        this.workpager = value;
    }

    /**
     * Obtém o valor da propriedade temporaryaddress.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getTemporaryaddress() {
        return temporaryaddress;
    }

    /**
     * Define o valor da propriedade temporaryaddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setTemporaryaddress(Address value) {
        this.temporaryaddress = value;
    }

    /**
     * Obtém o valor da propriedade temporaryemail.
     * 
     * @return
     *     possible object is
     *     {@link ContactMechanism }
     *     
     */
    public ContactMechanism getTemporaryemail() {
        return temporaryemail;
    }

    /**
     * Define o valor da propriedade temporaryemail.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMechanism }
     *     
     */
    public void setTemporaryemail(ContactMechanism value) {
        this.temporaryemail = value;
    }

    /**
     * Obtém o valor da propriedade temporaryphone.
     * 
     * @return
     *     possible object is
     *     {@link ContactMechanism }
     *     
     */
    public ContactMechanism getTemporaryphone() {
        return temporaryphone;
    }

    /**
     * Define o valor da propriedade temporaryphone.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMechanism }
     *     
     */
    public void setTemporaryphone(ContactMechanism value) {
        this.temporaryphone = value;
    }

    /**
     * Obtém o valor da propriedade temporaryphoneextension.
     * 
     * @return
     *     possible object is
     *     {@link ContactMechanism }
     *     
     */
    public ContactMechanism getTemporaryphoneextension() {
        return temporaryphoneextension;
    }

    /**
     * Define o valor da propriedade temporaryphoneextension.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMechanism }
     *     
     */
    public void setTemporaryphoneextension(ContactMechanism value) {
        this.temporaryphoneextension = value;
    }

    /**
     * Obtém o valor da propriedade temporarypager.
     * 
     * @return
     *     possible object is
     *     {@link ContactMechanism }
     *     
     */
    public ContactMechanism getTemporarypager() {
        return temporarypager;
    }

    /**
     * Define o valor da propriedade temporarypager.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMechanism }
     *     
     */
    public void setTemporarypager(ContactMechanism value) {
        this.temporarypager = value;
    }

    /**
     * Obtém o valor da propriedade handicap.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandicap() {
        return handicap;
    }

    /**
     * Define o valor da propriedade handicap.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandicap(String value) {
        this.handicap = value;
    }

    /**
     * Obtém o valor da propriedade identityrealibilitycode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityrealibilitycode() {
        return identityrealibilitycode;
    }

    /**
     * Define o valor da propriedade identityrealibilitycode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityrealibilitycode(String value) {
        this.identityrealibilitycode = value;
    }

    /**
     * Obtém o valor da propriedade isidentityunknown.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsidentityunknown() {
        return isidentityunknown;
    }

    /**
     * Define o valor da propriedade isidentityunknown.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsidentityunknown(Boolean value) {
        this.isidentityunknown = value;
    }

    /**
     * Obtém o valor da propriedade istranslatorneeded.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIstranslatorneeded() {
        return istranslatorneeded;
    }

    /**
     * Define o valor da propriedade istranslatorneeded.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIstranslatorneeded(Boolean value) {
        this.istranslatorneeded = value;
    }

    /**
     * Obtém o valor da propriedade lastupdatefacility.
     * 
     * @return
     *     possible object is
     *     {@link ID }
     *     
     */
    public ID getLastupdatefacility() {
        return lastupdatefacility;
    }

    /**
     * Define o valor da propriedade lastupdatefacility.
     * 
     * @param value
     *     allowed object is
     *     {@link ID }
     *     
     */
    public void setLastupdatefacility(ID value) {
        this.lastupdatefacility = value;
    }

    /**
     * Obtém o valor da propriedade livingarrangement.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getLivingarrangement() {
        return livingarrangement;
    }

    /**
     * Define o valor da propriedade livingarrangement.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setLivingarrangement(Code value) {
        this.livingarrangement = value;
    }

    /**
     * Obtém o valor da propriedade livingdependency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLivingdependency() {
        return livingdependency;
    }

    /**
     * Define o valor da propriedade livingdependency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLivingdependency(String value) {
        this.livingdependency = value;
    }

    /**
     * Obtém o valor da propriedade billingaddress.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getBillingaddress() {
        return billingaddress;
    }

    /**
     * Define o valor da propriedade billingaddress.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setBillingaddress(Address value) {
        this.billingaddress = value;
    }

    /**
     * Obtém o valor da propriedade billingemail.
     * 
     * @return
     *     possible object is
     *     {@link ContactMechanism }
     *     
     */
    public ContactMechanism getBillingemail() {
        return billingemail;
    }

    /**
     * Define o valor da propriedade billingemail.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMechanism }
     *     
     */
    public void setBillingemail(ContactMechanism value) {
        this.billingemail = value;
    }

    /**
     * Obtém o valor da propriedade billingphone.
     * 
     * @return
     *     possible object is
     *     {@link ContactMechanism }
     *     
     */
    public ContactMechanism getBillingphone() {
        return billingphone;
    }

    /**
     * Define o valor da propriedade billingphone.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMechanism }
     *     
     */
    public void setBillingphone(ContactMechanism value) {
        this.billingphone = value;
    }

    /**
     * Obtém o valor da propriedade billingphoneextension.
     * 
     * @return
     *     possible object is
     *     {@link ContactMechanism }
     *     
     */
    public ContactMechanism getBillingphoneextension() {
        return billingphoneextension;
    }

    /**
     * Define o valor da propriedade billingphoneextension.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMechanism }
     *     
     */
    public void setBillingphoneextension(ContactMechanism value) {
        this.billingphoneextension = value;
    }

    /**
     * Obtém o valor da propriedade billingpager.
     * 
     * @return
     *     possible object is
     *     {@link ContactMechanism }
     *     
     */
    public ContactMechanism getBillingpager() {
        return billingpager;
    }

    /**
     * Define o valor da propriedade billingpager.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactMechanism }
     *     
     */
    public void setBillingpager(ContactMechanism value) {
        this.billingpager = value;
    }

    /**
     * Obtém o valor da propriedade empistatus.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getEmpistatus() {
        return empistatus;
    }

    /**
     * Define o valor da propriedade empistatus.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setEmpistatus(Code value) {
        this.empistatus = value;
    }

    /**
     * Gets the value of the personalRelationships property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personalRelationships property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonalRelationships().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonalRelationship }
     * 
     * 
     */
    public List<PersonalRelationship> getPersonalRelationships() {
        if (personalRelationships == null) {
            personalRelationships = new ArrayList<PersonalRelationship>();
        }
        return this.personalRelationships;
    }

    /**
     * Gets the value of the citizenships property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citizenships property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitizenships().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Citizenship }
     * 
     * 
     */
    public List<Citizenship> getCitizenships() {
        if (citizenships == null) {
            citizenships = new ArrayList<Citizenship>();
        }
        return this.citizenships;
    }

    /**
     * Gets the value of the contactParties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactParties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactParties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactParty }
     * 
     * 
     */
    public List<ContactParty> getContactParties() {
        if (contactParties == null) {
            contactParties = new ArrayList<ContactParty>();
        }
        return this.contactParties;
    }

    /**
     * Gets the value of the occupationalHistoryObservations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occupationalHistoryObservations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccupationalHistoryObservations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OccupationalHistoryObservation }
     * 
     * 
     */
    public List<OccupationalHistoryObservation> getOccupationalHistoryObservations() {
        if (occupationalHistoryObservations == null) {
            occupationalHistoryObservations = new ArrayList<OccupationalHistoryObservation>();
        }
        return this.occupationalHistoryObservations;
    }

    /**
     * Gets the value of the personPensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personPensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonPensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonPension }
     * 
     * 
     */
    public List<PersonPension> getPersonPensions() {
        if (personPensions == null) {
            personPensions = new ArrayList<PersonPension>();
        }
        return this.personPensions;
    }

    /**
     * Gets the value of the usUniformedServicesPersons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usUniformedServicesPersons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUSUniformedServicesPersons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link USUniformedServicesPerson }
     * 
     * 
     */
    public List<USUniformedServicesPerson> getUSUniformedServicesPersons() {
        if (usUniformedServicesPersons == null) {
            usUniformedServicesPersons = new ArrayList<USUniformedServicesPerson>();
        }
        return this.usUniformedServicesPersons;
    }

    /**
     * Gets the value of the languageCapabilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languageCapabilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguageCapabilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageCapability }
     * 
     * 
     */
    public List<LanguageCapability> getLanguageCapabilities() {
        if (languageCapabilities == null) {
            languageCapabilities = new ArrayList<LanguageCapability>();
        }
        return this.languageCapabilities;
    }

    /**
     * Gets the value of the advanceDirectives property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the advanceDirectives property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdvanceDirectives().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdvanceDirective }
     * 
     * 
     */
    public List<AdvanceDirective> getAdvanceDirectives() {
        if (advanceDirectives == null) {
            advanceDirectives = new ArrayList<AdvanceDirective>();
        }
        return this.advanceDirectives;
    }

	@Override
	public String toString() {
		return "Person [systemcode=" + systemcode + ", updatetimestamp=" + updatetimestamp + ", localid=" + localid
				+ ", birthname=" + birthname + ", legalname=" + legalname + ", alternatename=" + alternatename
				+ ", spousename=" + spousename + ", mothersmaidenname=" + mothersmaidenname + ", fathername="
				+ fathername + ", mothername=" + mothername + ", ssn=" + ssn + ", race=" + race + ", religion="
				+ religion + ", birthaddress=" + birthaddress + ", vipflag=" + vipflag + ", veteranstatus="
				+ veteranstatus + ", driverslicensestate=" + driverslicensestate + ", repatriationnumber="
				+ repatriationnumber + ", districtofresidence=" + districtofresidence + ", lgacode=" + lgacode
				+ ", commentvalue=" + commentvalue + ", gender=" + gender + ", maritalstatus=" + maritalstatus
				+ ", ethnicity=" + ethnicity + ", administrativegender=" + administrativegender
				+ ", religiousaffiliation=" + religiousaffiliation + ", preferredcontactmethod="
				+ preferredcontactmethod + ", primaryhomeaddress=" + primaryhomeaddress + ", primaryhomeemail="
				+ primaryhomeemail + ", primaryhomephone=" + primaryhomephone + ", primaryhomephoneextension="
				+ primaryhomephoneextension + ", primarycellphone=" + primarycellphone + ", primaryhomepager="
				+ primaryhomepager + ", workaddress=" + workaddress + ", workemail=" + workemail + ", workphone="
				+ workphone + ", workphoneextension=" + workphoneextension + ", workpager=" + workpager
				+ ", temporaryaddress=" + temporaryaddress + ", temporaryemail=" + temporaryemail + ", temporaryphone="
				+ temporaryphone + ", temporaryphoneextension=" + temporaryphoneextension + ", temporarypager="
				+ temporarypager + ", handicap=" + handicap + ", identityrealibilitycode=" + identityrealibilitycode
				+ ", isidentityunknown=" + isidentityunknown + ", istranslatorneeded=" + istranslatorneeded
				+ ", lastupdatefacility=" + lastupdatefacility + ", livingarrangement=" + livingarrangement
				+ ", livingdependency=" + livingdependency + ", billingaddress=" + billingaddress + ", billingemail="
				+ billingemail + ", billingphone=" + billingphone + ", billingphoneextension=" + billingphoneextension
				+ ", billingpager=" + billingpager + ", empistatus=" + empistatus + ", personalRelationships="
				+ personalRelationships + ", citizenships=" + citizenships + ", contactParties=" + contactParties
				+ ", occupationalHistoryObservations=" + occupationalHistoryObservations + ", personPensions="
				+ personPensions + ", usUniformedServicesPersons=" + usUniformedServicesPersons
				+ ", languageCapabilities=" + languageCapabilities + ", advanceDirectives=" + advanceDirectives + "]";
	}

    
}
