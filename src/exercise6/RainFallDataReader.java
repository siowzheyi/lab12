package exercise6;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * This program demonstrate reading byte-based data as it intended type 
 * it is using DataInputStream.
 * 
 * The data represents represents rain fall in two stations in each district in Melaka.
 * 
 * The program calculates the average rain fall and display it on the console.
 * 
 * @author Siow Zhe Yi
 *
 */
public class RainFallDataReader {

	public static void main(String[] args) {

		// 1. Declare output file 
		String sourceFile = "dailyRainfallTwoStations.txt";
		System.out.println("***************  Reading data from " + sourceFile + "  ***************\n");

		try {

			// 2. Create stream to read data
			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));

			// Variables for processing byte-based data
			double totalRainfall = 0;
			int noOfRecords = 0;
			String days[] = new String[6];
			String stationId[] = new String[6];
			String stationName[] = new String[6];
			double rainfallDay1[] = new double[6];
			double rainfallDay2[] = new double[6];
			double rainfallDay3[] = new double[6];
			double rainfallDay4[] = new double[6];
			double rainfallDay5[] = new double[6];
			double rainfallDay6[] = new double[6];
			double totalRainFall[] = new double[6];
			double averageRainFall[] = new double[6];

			// 3. Read data until end-of-file and store into arrays
			for(int counter = 0; counter < 6; counter++) {
				
				// Read data
				days[counter] = dis.readUTF();
				stationId[counter] = dis.readUTF();
				stationName[counter] = dis.readUTF();

				rainfallDay1[counter] = dis.readDouble();
				rainfallDay2[counter] = dis.readDouble();
				rainfallDay3[counter] = dis.readDouble();
				rainfallDay4[counter] = dis.readDouble();
				rainfallDay5[counter] = dis.readDouble();
				rainfallDay6[counter] = dis.readDouble();

				noOfRecords ++;
			}
			
			// Get the size of date array
			int dateSize = days.length;
			
			/***
			 ***	Display rainfall data in Alor Gajah district
			 ***/
			System.out.println("Rain fall in Alor Gajah");
			System.out.print("\n\t\t\t");

			// display date
			for(int counter = 0; counter < dateSize; counter++) {
				System.out.print(days[counter] + "\t");
			}
			System.out.print("\n");

			// display data
			for(int counter = 0; counter < 2; counter++) {
				
				System.out.print(stationId[counter] + "\t");
				System.out.print(stationName[counter] + "\t");
				System.out.print(rainfallDay1[counter] + "\t\t");
				System.out.print(rainfallDay2[counter] + "\t\t");
				System.out.print(rainfallDay3[counter] + "\t\t");
				System.out.print(rainfallDay4[counter] + "\t\t");
				System.out.print(rainfallDay5[counter] + "\t\t");
				System.out.print(rainfallDay6[counter] + "\n\n");
				
				// calculate average rain fall for both station
				totalRainFall[counter] = rainfallDay1[counter] + rainfallDay2[counter] + 
						rainfallDay3[counter] + rainfallDay4[counter] + 
						rainfallDay5[counter] + rainfallDay6[counter];
				averageRainFall[counter] = totalRainFall[counter] / dateSize;
			}
			
			for(int counter = 0; counter < 2; counter++)
			{
				System.out.print("\nTotal rain fall in " + stationName[counter] + ": ");
				String formattedTotal = String.format("%.1f", totalRainFall[counter]);

				System.out.println(formattedTotal + "mm. ");
				String formattedAverage = String.format("%.1f", averageRainFall[counter]);

				System.out.print("Average rain fall in " + stationName[counter] + ": ");
				System.out.println(formattedAverage + "mm. ");
			}
			
			// display divider
			System.out.print("\n--------------------------------------");
			System.out.print("--------------------------------------");
			System.out.print("--------------------------------------\n");

			/***
			 ***	Display rainfall data in Jasin district
			 ***/
			System.out.println("Rain fall in Jasin");
			System.out.print("\n\t\t\t");

			// display date
			for(int counter = 0; counter < 6; counter++) {
				System.out.print(days[counter] + "\t");
			}
			System.out.print("\n");

			// display data
			for(int counter = 2; counter < 4; counter++) {
				
				System.out.print(stationId[counter] + "\t");
				System.out.print(stationName[counter] + "\t");
				System.out.print(rainfallDay1[counter] + "\t\t");
				System.out.print(rainfallDay2[counter] + "\t\t");
				System.out.print(rainfallDay3[counter] + "\t\t");
				System.out.print(rainfallDay4[counter] + "\t\t");
				System.out.print(rainfallDay5[counter] + "\t\t");
				System.out.print(rainfallDay6[counter] + "\n\n");
				
				
				// calculate average rain fall for both station
				totalRainFall[counter] = rainfallDay1[counter] + rainfallDay2[counter] + 
						rainfallDay3[counter] + rainfallDay4[counter] + 
						rainfallDay5[counter] + rainfallDay6[counter];
				averageRainFall[counter] = totalRainFall[counter] / dateSize;
			}
			
			for(int counter = 2; counter < 4; counter++)
			{
				System.out.print("\nTotal rain fall in " + stationName[counter] + ": ");
				String formattedTotal = String.format("%.1f", totalRainFall[counter]);

				System.out.println(formattedTotal + "mm. ");
				String formattedAverage = String.format("%.1f", averageRainFall[counter]);

				System.out.print("Average rain fall in " + stationName[counter] + ": ");
				System.out.println(formattedAverage + "mm. ");
			}
			
			// display divider
			System.out.print("\n--------------------------------------");
			System.out.print("--------------------------------------");
			System.out.print("--------------------------------------\n");
			
			/***
			 ***	Display rainfall data in Melaka Tengah district
			 ***/
			System.out.println("Rain fall in Melaka Tengah");
			System.out.print("\n\t\t\t");

			// display date
			for(int counter = 0; counter < 6; counter++) {
				System.out.print(days[counter] + "\t");
			}
			System.out.print("\n");

			// display data
			for(int counter = 4; counter < 6; counter++) {
				
				System.out.print(stationId[counter] + "\t");
				System.out.print(stationName[counter] + "\t");
				System.out.print(rainfallDay1[counter] + "\t\t");
				System.out.print(rainfallDay2[counter] + "\t\t");
				System.out.print(rainfallDay3[counter] + "\t\t");
				System.out.print(rainfallDay4[counter] + "\t\t");
				System.out.print(rainfallDay5[counter] + "\t\t");
				System.out.print(rainfallDay6[counter] + "\n\n");
				
				
				// calculate average rain fall for both station
				totalRainFall[counter] = rainfallDay1[counter] + rainfallDay2[counter] + 
						rainfallDay3[counter] + rainfallDay4[counter] + 
						rainfallDay5[counter] + rainfallDay6[counter];
				averageRainFall[counter] = totalRainFall[counter] / dateSize;
			}
			
			for(int counter = 4; counter < 6; counter++)
			{
				System.out.print("\nTotal rain fall in " + stationName[counter] + ": ");
				String formattedTotal = String.format("%.1f", totalRainFall[counter]);

				System.out.println(formattedTotal + "mm. ");
				String formattedAverage = String.format("%.1f", averageRainFall[counter]);

				System.out.print("Average rain fall in " + stationName[counter] + ": ");
				System.out.println(formattedAverage + "mm. ");
			}
			
			
			// 4. Close stream
			dis.close();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}

		// Indicate end of program - Could be successful
		System.out.print("\n\n*******************");
		System.out.print("********************  END OF PROGRAM  ********************");
		System.out.println("*******************");

	}

}
