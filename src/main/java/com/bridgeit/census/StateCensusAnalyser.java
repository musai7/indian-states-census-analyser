package com.bridgeit.census;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StateCensusAnalyser {

	static List<StatesCensusInformation> censusList = new ArrayList<>();

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		StatesCensusInformation censusInformation;
		CSVStateCensus csvSensus = new CSVStateCensus();
		Scanner scanner = new Scanner(System.in);
		int check = 0;
		while (check != 4) {
			System.out.println(
					"enter \n 1. to add state census \n 2.write data into CSV file \n 3.read data from CSV file "
							+ "\n 4 quit ");
			check = scanner.nextInt();
			switch (check) {
			case 1:
				censusInformation = new StatesCensusInformation();
				System.out.println("enter State Name :");
				censusInformation.setStateName(scanner.next());
				System.out.println("enter State Area in m^2 :");
				censusInformation.setArea(scanner.next());
				System.out.println("enter male population :");
				censusInformation.setMalePopulation(scanner.next());
				System.out.println("enter female population :");
				censusInformation.setFemalePopulation(scanner.next());

				long totalPopulation = Long.parseLong(censusInformation.getFemalePopulation())
						+ Long.parseLong(censusInformation.getMalePopulation());
				String string = String.valueOf(totalPopulation);

				censusInformation.setTotalPopulation(string);
				censusList.add(censusInformation);
				break;
			case 2:
				csvSensus.writeCensusToCSVFile();
				break;
			case 3:
				csvSensus.readCensusFromCSVFile();
				break;
			case 4:
				System.out.println("...........closed census book............");
				break;
			}
		}
	}
}
