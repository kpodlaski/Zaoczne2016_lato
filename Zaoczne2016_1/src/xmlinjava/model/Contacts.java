package xmlinjava.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Contacts {

	private Date dateOfCreation = new Date();
	/**
	 * @return the dateOfCreation
	 */
	@XmlAttribute(name="date")
	public Date getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(Date date) {
		dateOfCreation = date;
	}
	private List<Contact> contact = new ArrayList<>();
	
	/**
	 * @return the contact
	 */
	@XmlElement(name="person")
	public List<Contact> getContact() {
		return contact;
	}

	/**
	 * @param contact the contact to set
	 */
	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}

	public Contacts(){}
	
	public String toString(){
		String result = "============================\n";
		result+="Creation date: "+dateOfCreation+"\n";
		for( Contact c : contact){
			result+=c+"\n";
		}
		result += "============================\n";
		return result;
	}
	
}
