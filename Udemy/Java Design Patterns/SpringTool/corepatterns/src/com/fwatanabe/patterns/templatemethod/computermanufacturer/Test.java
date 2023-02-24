package com.fwatanabe.patterns.templatemethod.computermanufacturer;

public class Test {

	public static void main(String[] args) {
		ComputerManufacturer manufacturer1 = new DesktopManufacturer();
		manufacturer1.buildComputer();

		ComputerManufacturer manufacturer2 = new LaptopManufacturer();
		manufacturer2.buildComputer();
	}

}
