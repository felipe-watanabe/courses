package com.fwatanabe.patterns.adapter.weatherfinder;

public class WeatherAdapter {

	public int findTemperature(int zipCode) {
		WeatherFinderImpl finder = new WeatherFinderImpl();
		
		if (zipCode == 123)
			return finder.find("Sao Paulo");
		else
			return finder.find("Other");
	}
	
}
