/**
* Student Name: Jordan Tache-Smith(041-114-885)
* Lab Professor: Howard Rosenblum
* Due Date: 2024-03-25
* Description: PartTimeTechnician Class
*/
package application;

/**
 * Class to represent a part-time technician
 */
public class PartTimeTechnician extends BaseTechnician{

/**
 * Constructor for a PartTimeTechnician object
 * @param name: The name of the technician
 * @param tehcnicianId: The ID of the technician
 * @param hourlyRate: The hourly rate of the technician
 */
public PartTimeTechnician(String name, String tehcnicianId, double hourlyRate) {
	super(name, tehcnicianId, 0);
	this.setSalary(hourlyRate);
}
	
/**
 * PartTimeTechnician setSalary Overriden Method
 * @param hourlyRate: The hourly rate to set as salary
 */
@Override
public void setSalary(double hourlyRate) {
	this.salary = hourlyRate;
}

/**
 * calculateSalary Overriden Method(has different return than FullTimeTechnician) 
 * Used to calculate salary based off of 37.5 hours a week.
 * @return calculated salary of the PartTimeTechnician
 */
@Override
public double calculateSalary() {
	return salary*37.5;
}

}
