/**
* Student Name: Jordan Tache-Smith(041-114-885)
* Lab Professor: Howard Rosenblum
* Due Date: 2024-03-25
* Description: FullTimeTechnician class
*/
package application;

/**
 * Class to represent a full-time technician
 */
public class FullTimeTechnician extends BaseTechnician {

/**
 * Constructor for creating a FullTimeTechnician object
 * @param name: The name of the technician
 * @param tehcnicianId: The ID of the technician
 * @param salary: The salary of the technician
 */
	public FullTimeTechnician(String name, String tehcnicianId, double salary) {
		super(name, tehcnicianId, salary);
	}

/**
 * FullTimeTechnician calculateSalary Overriden Method 
 * Not really used for FullTimeTech as there's nothing to calculate
 * @return salary of the FullTimeTechnician
 */
@Override
public double calculateSalary() {
	return salary;
}

/**
 * FullTimeTechnician setSalary Overriden Method
 * @param salary: sets salary
 */
@Override
public void setSalary(double salary) {
this.salary = salary;
}

}
