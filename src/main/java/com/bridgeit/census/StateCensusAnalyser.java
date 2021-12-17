package com.bridgeit.census;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StateCensusAnalyser {

	static List<StatesCensusInformation> censusList = new ArrayList<>();

	@SuppressWarnings("resource")
	public void addStateCensus() {
		StatesCensusInformation censusInformation;
		Scanner scanner = new Scanner(System.in);

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
	}
	
	public long countEntries() throws IOException {
		long entries =0;
		entries = Files.lines(new File(CSVStateCensus.CSV_FILE).toPath()).count();
		return entries-1;
	}
}
