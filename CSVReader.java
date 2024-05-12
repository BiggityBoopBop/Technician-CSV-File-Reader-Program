/**
* Student Name: Jordan Tache-Smith(041-114-885)
* Lab Professor: Howard Rosenblum
* Due Date: 2024-03-25
* Description: CSVReader file used to import data from an excel file and sort it by FT/PT constructors
* which afterwards is put into an arraylist. This course should be called Csv Oriented Programming COP
*/
package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * CSVReader Class
 */
public class CSVReader {

	/**
	 * Read Technicians Method
     * @param filePath: Path to CSV file
     * @return technicians: Returns arraylist of created technicians
	 */
	public static ArrayList<BaseTechnician> readTechnicians(String filePath){
		ArrayList<BaseTechnician> technicians = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
			String line;
			
//Starts to read the file
				while ((line = br.readLine()) != null){
					String[] data = line.split(",");
					
//Sorts data into proper variables
					String type = data[0].trim();
					String name = data[1].trim();
					String id = data[2].trim();
					double salary = Double.parseDouble(data[3]);

//Creates FT/PT techs based off of String type variable
					BaseTechnician technician;
					if (type.equalsIgnoreCase("FullTime")) {
						technician = new FullTimeTechnician(name, id, salary);
					} else {
						technician = new PartTimeTechnician(name, id, salary);
					}
					
//Adds completed technicians objects to arraylist
					technicians.add(technician);
				}
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
		
//Reeturns completed(all data from csvfile) arraylist of technicians
		return technicians;
		
	}

}
