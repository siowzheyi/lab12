package exercise6;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * This program demonstrate writing byte-based data using DataOuputStream.
 * The data is written in its original type into the stream.  
 * 
 * The data represents rain fall in two stations in each district in Melaka.
 * 
 * @author Siow Zhe Yi
 *
 */
public class RainFallDataGenerator {

	public static void main(String[] args) {
		
		
		// 1. Declare output file 
		String outFile = "dailyRainfallTwoStations.txt";
		
		// Data declaration
		// common: date
		String dates[] = {"1/06/2023", "02/06/2023", "03/06/2023", "04/06/2023", "05/06/2023", 
		"06/06/2023"};
		
		String stationId[] = {"2421003", "2322006", "2225044", "2324033", "2223023", 
		"2222033"};
		String stationName[] = {"Simpang Ampat", "Melaka Pindah", "Telok Rimba", "Hospital Jasin", "Sg. Duyong", 
		"Batu Hampar"};
		double rainFallDay1[] = {0.0, 0.0, 13.0, 22.0, 37.0, -9999.0};
		double rainFallDay2[] = {0.0, 0.0, 0.0, 0.0, 0.0, -9999.0};
		double rainFallDay3[] = {4.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		double rainFallDay4[] = {1.0, 0.0, 1.0, 14.0, 3.0, 2.5};
		double rainFallDay5[] = {0.0, 0.0, 1.0, 0.0, 0.0, 0.0};
		double rainFallDay6[] = {6.0, 2.0, 69.0, 11.0, 43.0, 30.0};

		try {
			
			// 2. Create stream to read data
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
			
			// Process data
			for (int index = 0; index < dates.length; index++) {
				
				// 3. Write data into data stream
				dos.writeUTF(dates[index]);
				dos.writeUTF(stationId[index]);
				dos.writeUTF(stationName[index]);
				dos.writeDouble(rainFallDay1[index]);
				dos.writeDouble(rainFallDay2[index]);
				dos.writeDouble(rainFallDay3[index]);
				dos.writeDouble(rainFallDay4[index]);
				dos.writeDouble(rainFallDay5[index]);
				dos.writeDouble(rainFallDay6[index]);

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
