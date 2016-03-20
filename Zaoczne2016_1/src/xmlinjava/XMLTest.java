package xmlinjava;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import xmlinjava.model.Contact;
import xmlinjava.model.Contacts;

public class XMLTest {

	
	
	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub

		Contact c = new Contact("Jan","Kicha","Okólna 15",7654321);
		JAXBContext context = JAXBContext.newInstance(Contacts.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(c, System.out);
		Contacts contacts = new Contacts();
		contacts.getContact().add(c);
		contacts.getContact().add(new Contact("Anna", "Jurand", "Spychów 15", 677665543));
		marshaller.marshal(contacts, System.out);
		File xmlFile = new File("src/xmlinjava/Contacts.xml");
		Unmarshaller umarshaler = context.createUnmarshaller();
		Contacts contacts2 = (Contacts) umarshaler.unmarshal(xmlFile);
		System.out.println(contacts2);
	}

}
