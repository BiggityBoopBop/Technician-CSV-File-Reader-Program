/**
* Student Name: Jordan Tache-Smith(041-114-885)
* Lab Professor: Howard Rosenblum
* Due Date: 2024-03-25
* Description: TechDetail Interface class 
*/
package application;

/**
 * Interface for technician details and methods
 */
public interface TechDetail{
	
/**
 * TechDetail displayDetails Method
 * Used to display technicians info
 */
	public void displayDetails();
	
/**
 * TechDetail calculateSalary Method
 * Used to calculate salary
 * @return the calculated salary
 */
	public double calculateSalary();
	
/**
 * TechDetail setSalary Method
 * Used to set the salary variable
 * @param salary to set
 */
	public void setSalary(double salary);
}
