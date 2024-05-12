/*** Student Name: Jordan Tache-Smith(041-114-885)
* Lab Professor: Howard Rosenblum
* Due Date: 2024-03-25
* Description: TechnicianDriver Main Class 
*/	
package application;

import java.util.ArrayList;

/**
 * Main Method to execute program
 */
public class TechnicianDriver {

	/**
	 * Main Method
	 * @param args: Command Line Args
	 */
	public static void main(String[] args) {
		
/**
 * Imports technicians info from the CSV file
 * Sorts technicians into FT/PT constructors based on String type
 */
ArrayList<BaseTechnician> technicians = CSVReader.readTechnicians("/C:/CST8116 Homework/CST8116 Eclipse Workspace/CST8132Assignment2/Data/technicians.csv/");

//Displays technicians info
for (BaseTechnician technician : technicians) {
	technician.displayDetails();
	System.out.println("Calculated Salary: $" + technician.calculateSalary());
	System.out.println();
}
	}

}
