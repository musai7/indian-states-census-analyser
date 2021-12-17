package com.bridgeit.census;

import java.io.IOException;

public class App {

	public static final int QUIT = 6;

	public static void main(String[] args) throws IOException {

		StateCensusAnalyser censusAnalyser = new StateCensusAnalyser();
		CSVStateCensus csvSensus = new CSVStateCensus();
		UserInterface userInterface = new UserInterface();
		int check = 0;
		while (check != QUIT) {
			check = userInterface.showUserMenu();
			switch (check) {
			case 1:
				censusAnalyser.addStateCensus();
				break;
			case 2:
				csvSensus.writeCensusToCSVFile();
				break;
			case 3:
				csvSensus.readCensusFromCSVFile();
				break;
			case 4:
				userInterface.printIndianStateCensus();
				break;
			case 5:
				censusAnalyser.countEntries();
			case 6:
				System.out.println("...........closed census book............");
				break;
			}
		}
	}
}
