package com.fwatanabe.patterns.templatemethod.computermanufacturer;

public class LaptopManufacturer extends ComputerManufacturer {

	@Override
	public void addHardDisk() {
		System.out.println("Added laptop hard disk");
	}

	@Override
	public void addRAM() {
		System.out.println("Added laptop RAM");
	}

	@Override
	public void addKeyboard() {
		System.out.println("Added laptop keyboard");
	}

}
