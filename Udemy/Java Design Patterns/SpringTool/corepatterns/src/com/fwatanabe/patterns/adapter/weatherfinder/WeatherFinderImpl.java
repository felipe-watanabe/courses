package com.fwatanabe.patterns.adapter.weatherfinder;

public class WeatherFinderImpl implements WeatherFinder {

	@Override
	public int find(String city) {
		if (city.equalsIgnoreCase("Sao Paulo"))
			return 22;
		return 25;
	}

}
