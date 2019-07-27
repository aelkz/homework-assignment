package com.customer.app;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class ObjectToXML {

	public static void main(String[] args)
    {
		PersonName personName =  new  PersonName();
		personName.setGiven("Curumim");
		personName.setFamily("Cunha");
        //Java object. We will convert it to XML.
        Person person = new Person();
        person.setFathername("Angelo");
        person.setAge(30);
        person.setLegalname(personName);
        
        //Method which uses JAXB to convert object to XML
        jaxbObjectToXML(person);
    }
 
    private static void jaxbObjectToXML(Person employee)
    {
        try
        {
            //Create JAXB Context
            JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
             
            //Create Marshaller
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
 
            //Required formatting??
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
 
            //Print XML String to Console
            StringWriter sw = new StringWriter();
             
            //Write XML to StringWriter
            jaxbMarshaller.marshal(employee, sw);
             
            //Verify XML Content
            String xmlContent = sw.toString();
            System.out.println( xmlContent );
 
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
