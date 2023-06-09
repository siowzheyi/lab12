package exercise7;

import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * This program demonstrate writing character-based data using java.io.Writer.
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
		String outFile = "dailyRainfallWriter.txt";
		
		// Data declaration
		String dates[] = {"31/05/2023", "01/06/2023", "02/06/2023", "03/06/2023", "04/06/2023", 
				"05/06/2023"};
		double rainFall[] = {5.0, 0.0, 0.0, 4.0, 1.0, 0.0};
		
		try {
			
			// 2. Create stream to read data
			PrintWriter pw = new PrintWriter(new FileOutputStream(outFile));
			
			// Process data
			for (int index = 0; index < dates.length; index++) {
				
				// 3. Write data into data stream
				pw.print(dates[index]);
				pw.write("\n");

				pw.print(rainFall[index]);
				pw.write("\n");

				// 4. Flush for each writing
				pw.flush();
			}
			
			// 5. Close stream
			pw.close();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
		// Indicate end of program - Could be successful
		System.out.println("End of program. Check out " + outFile); 
	}

}
