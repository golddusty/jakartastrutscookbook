package com.oreilly.strutsckbk.ch04;

public class DailyForecast {
	
	/**
	 * @return Returns the rainfall.
	 */
	public float getRainfall() {
		return rainfall;
	}
	/**
	 * @param rainfall The rainfall to set.
	 */
	public void setRainfall(float rainfall) {
		this.rainfall = rainfall;
	}
	public DailyForecast(String day, int chanceOfPrecip) {
		this.day = day;
		this.chancePrecip = chanceOfPrecip;
	}

	public DailyForecast(String day, int chanceOfPrecip, float rainfall) {
		this.day = day;
		this.chancePrecip = chanceOfPrecip;
		this.rainfall = rainfall;
	}
	public int getChancePrecip() {
		return chancePrecip;
	}

	public void setChancePrecip(int chancePrecip) {
		this.chancePrecip = chancePrecip;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}

	private String day;
	private int chancePrecip;
	private float rainfall;
}
