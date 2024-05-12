/**
* Student Name: Jordan Tache-Smith(041-114-885)
* Lab Professor: Howard Rosenblum
* Due Date: 2024-03-25
* Description: BaseTechnician abstract class which holds base info and methods for PartTimeTechnician and FullTimeTechnician
*/
package application;

/**
 * Abstract class to represent a default technician
 */
public abstract class BaseTechnician implements TechDetail{
	
//Instance variables
protected String name; //Name of the technician
protected String technicianId; // Technician ID
protected double salary; // Technician's salary

/**
 * Constructor for creating a BaseTechnician object
 * @param name: of the technician
 * @param technicianId: the ID of the technician
 * @param salary: the salary of the technician
 */
public BaseTechnician(String name, String technicianId, double salary) {
	this.name = name;
	this.technicianId = technicianId;
	this.salary = salary;
}

/**
 * BaseTechnician displayDetails Overriden Method
 * Outputs details
 */
@Override
public void displayDetails() {
System.out.println("Name: " + name);
System.out.println("Technician ID: " + technicianId);
System.out.println("Salary: " + salary);
}




}
