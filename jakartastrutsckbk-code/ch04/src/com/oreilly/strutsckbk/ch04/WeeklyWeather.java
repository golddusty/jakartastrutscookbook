package com.oreilly.strutsckbk.ch04;

import java.util.ArrayList;
import java.util.List;

public class WeeklyWeather {
	
	public WeeklyWeather() {
		weekForecast = new ArrayList();
		weekForecast.add(new DailyForecast("Sunday", 70, 1.5f));
		weekForecast.add(new DailyForecast("Monday", 40, 2.0f));
		weekForecast.add(new DailyForecast("Tuesday", 20, 1.0f));
		weekForecast.add(new DailyForecast("Wednesday", 5, 0.2f));
		weekForecast.add(new DailyForecast("Thursday", 50, 0.8f));
		weekForecast.add(new DailyForecast("Friday", 40, 1.0f));
		weekForecast.add(new DailyForecast("Saturday", 90, 3.0f));
	}
	
	public List getWeekForecast() {
		return weekForecast;		
	}

	public float getMaxRainfall() {
		float maxRainfall = 0.0f;
		for (int i=0; i<weekForecast.size(); i++) {
			DailyForecast forecast = (DailyForecast) weekForecast.get(i);
			maxRainfall = forecast.getRainfall() > maxRainfall ? forecast.getRainfall() : maxRainfall;
		}
		return maxRainfall;
	}
	
	private List weekForecast;
}
