package exercise5;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * This program demonstrate reading byte-based data as it intended type 
 * it is using DataInputStream.
 * 
 * The data represents represents rain fall in Simpang Ampat of Alor Gajah.
 * 
 * The program calculates the average rain fall and display it on the console.
 * 
 * @author Siow Zhe Yi
 *
 */
public class RainFallDataReader {

	public static void main(String[] args) {

		// 1. Declare output file 
		String sourceFile = "dailyRainfall.txt";
		System.out.println("Reading data from " + sourceFile + "\n");

		try {

			// 2. Create stream to read data
			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));

			// Variables for processing byte-based data
			double rainfall = 0;
			double totalRainfall = 0;
			int noOfRecords = 0;
			String days = "";
			
			// 3. Process data until end-of-file
			while(dis.available() > 0) {
				
				// Read data
				days = dis.readUTF();
				rainfall = dis.readDouble();
				System.out.println( days + "\t" + rainfall);
				
				// Calculate total rain fall
				totalRainfall += rainfall;
				noOfRecords ++;
			}
			
			// 4. Close stream
			dis.close();
			
			// Calculate average rain fall
			double averageRainfall = totalRainfall / noOfRecords;
			String formattedAverage = String.format("%.1f", averageRainfall);
			System.out.print("\nAverage rainfall for " + noOfRecords 
					+ " days: " + formattedAverage + "mm");
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}

		// Indicate end of program - Could be successful
		System.out.println("\nEnd of program.");
		

	}

}
