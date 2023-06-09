package exercise7;

import java.io.Reader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * This program demonstrate reading character-based data as it intended type 
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
		String sourceFile = "dailyRainfallWriter.txt";
		System.out.println("Reading data from " + sourceFile + "\n");
		String dates[] = new String[6];
		double rainfall[] = new double[6];
		double totalRainfall = 0;
		int noOfRecords = 0;
		
		try {

			// 2. Create stream to read data
			  Reader reader = new FileReader(sourceFile);
	            BufferedReader bufferedReader = new BufferedReader(reader);
	            
			// Variables for processing character-based data
			String data = "";
        	int counterDate = 0;
        	int counterRainfall = 0;

			// 3. Process data until end-of-file
			 while ((data = bufferedReader.readLine()) != null) {
	                // Process the data based on its type
	                if (data.contains("/")) {
	                    // It is a date
	                	dates[counterDate] = data;
	                    counterDate++;
	                } else {
	                    // It is rainfall
	                    rainfall[counterRainfall] = Double.parseDouble(data);
	                    counterRainfall++;
	                }
	            }
			// 4. Close stream
			reader.close();
			
			} catch (IOException ex) {
			    ex.printStackTrace();
			}
		
		// Display dates
		for(int counter = 0; counter < dates.length; counter++)
		{
			System.out.print(dates[counter] + "\t");
			noOfRecords ++;

		}
		
		System.out.print("\n");
		
		// Display rain fall
		for(int counter = 0; counter < rainfall.length; counter++)
		{
			System.out.print(rainfall[counter] + "\t\t");
			totalRainfall += rainfall[counter];
		}
		
		System.out.print("\n");
	    
		// Display total rain fall
		String formattedTotal = String.format("%.1f", totalRainfall);

		System.out.print("\nTotal rainfall for " + noOfRecords 
				+ " days: " + formattedTotal + "mm");
		// Calculate average rain fall
		double averageRainfall = totalRainfall / noOfRecords;
		String formattedAverage = String.format("%.1f", averageRainfall);
		System.out.println("\nAverage rainfall for " + noOfRecords 
				+ " days: " + formattedAverage + "mm");

		// Indicate end of program - Could be successful
		System.out.println("\nEnd of program.");	
	}
}
