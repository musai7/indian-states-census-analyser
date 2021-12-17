package com.bridgeit.census;

public class StatesCensusInformation {

	private String stateName;
	private String area;
	private String malePopulation;
	private String femalePopulation;
	private String totalPopulation;

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getMalePopulation() {
		return malePopulation;
	}

	public void setMalePopulation(String malePopulation) {
		this.malePopulation = malePopulation;
	}

	public String getFemalePopulation() {
		return femalePopulation;
	}

	public void setFemalePopulation(String femalePopulation) {
		this.femalePopulation = femalePopulation;
	}

	public String getTotalPopulation() {
		return totalPopulation;
	}

	public void setTotalPopulation(String totalPopulation) {
		
		this.totalPopulation = totalPopulation;
	}

	@Override
	public String toString() {
		return "StatesCensusInformation [stateName=" + stateName + ", area=" + area + ", malePopulation="
				+ malePopulation + ", femalePopulation=" + femalePopulation + ", totalPopulation=" + totalPopulation
				+ "]";
	}
}
