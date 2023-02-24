package com.fwatanabe.patterns.adapter.weatherfinder;

public class WeatherUI {

	public static void main(String[] args) {
		WeatherAdapter adapter = new WeatherAdapter();
		System.out.println(adapter.findTemperature(123));
		System.out.println(adapter.findTemperature(456));
	}

}
