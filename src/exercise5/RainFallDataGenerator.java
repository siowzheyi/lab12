package exercise5;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * This program demonstrate writing byte-based data using DataOuputStream.
 * The data is written in its original type into the stream.  
 * 
 * The data represents rain fall in Simpang Ampat of Alor Gajah.
 * 
 * @author Siow Zhe Yi
 *
 */
public class RainFallDataGenerator {

	public static void main(String[] args) {
		
		
		// 1. Declare output file 
		String outFile = "dailyRainfall.txt";
		
		// Data declaration
		String dates[] = {"31/05/2023", "01/06/2023", "02/06/2023", "03/06/2023", "04/06/2023", 
				"05/06/2023"};
		double rainFall[] = {5.0, 0.0, 0.0, 4.0, 1.0, 0.0};
		
		try {
			
			// 2. Create stream to read data
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
			
			// Process data
			for (int index = 0; index < dates.length; index++) {
				
				// 3. Write data into data stream
				dos.writeUTF(dates[index]);
				dos.writeDouble(rainFall[index]);
				
				// 4. Flush for each writing
				dos.flush();
			}
			
			// 5. Close stream
			dos.close();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
		// Indicate end of program - Could be successful
		System.out.println("End of program. Check out " + outFile); 
	}

}
