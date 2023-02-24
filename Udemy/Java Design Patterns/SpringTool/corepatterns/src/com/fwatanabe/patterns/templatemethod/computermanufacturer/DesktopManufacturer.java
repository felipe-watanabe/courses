package com.fwatanabe.patterns.templatemethod.computermanufacturer;

public class DesktopManufacturer extends ComputerManufacturer {

	@Override
	public void addHardDisk() {
		System.out.println("Added desktop hard disk");
	}

	@Override
	public void addRAM() {
		System.out.println("Added desktop RAM");
	}

	@Override
	public void addKeyboard() {
		System.out.println("Added desktop keyboard");
	}

}
