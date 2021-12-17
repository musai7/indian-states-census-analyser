package com.bridgeit.census;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class CSVStateCensus {

	public static final String CSV_FILE = "C:\\Users\\musai\\rfp-java\\practice\\shankar_rpf-80\\indian-states-census-analyser\\data\\indianCensus.csv";
	StateCensusAnalyser censusAnalyser = new StateCensusAnalyser();

	public void writeCensusToCSVFile() throws IOException {

		List<String[]> list = new ArrayList<>();
		PrintWriter printWriter = new PrintWriter(CSV_FILE);
		CSVWriter csvWriter = new CSVWriter(printWriter);
		list.add(new String[] { "StateName", "Area", "MalePopulation", "femalePopulation", "totalPopulation" });
		StateCensusAnalyser.censusList.stream().forEach(cen -> {
			list.add(new String[] { cen.getStateName(), cen.getArea(), cen.getMalePopulation(),
					cen.getFemalePopulation(), cen.getTotalPopulation() });
		});
		csvWriter.writeAll(list);
		csvWriter.close();
		System.out.println("....successfully Write into csv file....");
	}

	public void readCensusFromCSVFile() throws IOException {

		@SuppressWarnings("resource")
		BufferedReader bufferedReader = new BufferedReader(new FileReader(CSV_FILE));
		String line = "";
		int i=0;
		while ((line = bufferedReader.readLine()) != null) {
			if(i==0) {
				i++;
				continue;
			}
			String[] censusArray = line.split(",");
			System.out.println("Census [StateName = " + censusArray[0] + ", Area = " + censusArray[1]
					+ ", MalePopulation = " + censusArray[2] + ", FemalePopulation = " + censusArray[3]
					+ ", TotalPopulation = " + censusArray[4] + " ]");
		}
	}
}
