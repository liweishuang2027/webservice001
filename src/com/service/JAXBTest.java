package com.service;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
/**
 * JAXB demo
 * @author lws
 *
 */
public class JAXBTest {
	
	public static void myMarshaller() throws JAXBException
	{
		JAXBContext jAXBContext = JAXBContext.newInstance(Book.class);
		Marshaller marshaller = jAXBContext.createMarshaller();
		
		//marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.setProperty(Marshaller.JAXB_ENCODING, "utf-8");
		
		marshaller.marshal(new Book(11,"java",25.8d), System.out);
	}
	
	public static void unMarshaller() throws JAXBException
	{
		String xmlString = "<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\"?><book><bookName>java</bookName><id>11</id><price>25.8</price></book>";
		JAXBContext jAXBContext = JAXBContext.newInstance(Book.class);
		Unmarshaller unMarshaller = jAXBContext.createUnmarshaller();
		
		Book book = (Book) unMarshaller.unmarshal(new StringReader(xmlString));
		System.out.print(book.toString());
		
	}
	
	public static void main(String[] args) throws JAXBException 
	{
		myMarshaller();
		unMarshaller();
	}

}
