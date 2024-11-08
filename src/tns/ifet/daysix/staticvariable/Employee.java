//Program to demonstrate static variable
package tns.ifet.daysix.staticvariable;

public class Employee {
	// Declare instance variables.
	private String name;
	private int id;
//	private String companyName;
	
	// Declare a static variable companyName with data type String and assign value
	// TNS which is common for all the objects.
	static String companyName = "TNS";

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	// Declare a two-parameter constructor with parameters named n and i.
	Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", Company= "+companyName+"]";
	}

	

}
