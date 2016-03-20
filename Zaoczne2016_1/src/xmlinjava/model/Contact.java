package xmlinjava.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Contact {
	
	private String name;
	private String surname;
	private String address;
	private long phone;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the phone
	 */
	public long getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Contact(String name, String surname, String address, long phone) {
		super();
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.phone = phone;
	}
	
	public Contact(){}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		return String.format(
				"%s %s, %s, phone:%s", name,surname, address, phone);
	}
	

}
