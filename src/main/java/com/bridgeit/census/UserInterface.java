package com.bridgeit.census;

import java.io.IOException;
import java.util.Scanner;

public class UserInterface {

	@SuppressWarnings("resource")
	public int showUserMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter \n 1. to add state census \n 2.write data into CSV file \n 3.read data from CSV file "
				+ "\n 4.to print states census \n 5. count no of entries \n "+ App.QUIT +".  quit ");
		int check = scanner.nextInt();
		return check;
	}

	public void printIndianStateCensus() {

		System.out.println(StateCensusAnalyser.censusList);
	}
	public void printCountEntries() {
		StateCensusAnalyser censusAnalyser = new StateCensusAnalyser();
		try {
			System.out.println(censusAnalyser.countEntries());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
