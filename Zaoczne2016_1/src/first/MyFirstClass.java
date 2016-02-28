package first;

import java.util.Date;

public class MyFirstClass {

	private String name;
	private int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFirstClass object = new MyFirstClass();
		object.name = "Adolf";
		object.age=23;

		System.out.println(object.name + " age: "+object.age);
		System.out.println(object.yearOfBirth());
		Person p = new Person("Anna","Dwornik",1974,5,25);
		System.out.println(p.dateOfBirth());
		Person persons[] = new Person[3];
		System.out.println("============================");
		for (int i=0; i<persons.length; i++){
			persons[i]=new Person("John", "Doe"+i);
		}
		for (int i=0; i<persons.length; i++){	
			System.out.println(persons[i]);
		}
		System.out.println("============================");
		for (Person elem : persons){	
			System.out.println(elem);
		}

	}

	public int yearOfBirth(){
		Date data = new Date();
		//System.out.println(data.getYear());
		return data.getYear()-age + 1900;
	}



}

class Person{
	private String name;
	private String surname;
	private long dateOfBirth;

	public Person(String name, String surname, long dateOfBirth) {
		super();
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
	}

	public Person(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = 0;
	}

	public Person(String name, String surname, int year, int month, int day){
		this(name,surname);
		Date d = new Date(year-1900,month-1,day);
		this.dateOfBirth = d.getTime();
	}

	public String dateOfBirth(){
		Date d = new Date(dateOfBirth);
		return d.toString();
	}

	/** (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%s %s, %s",
				name, surname, dateOfBirth());
	}

}