package com.fwatanabe.patterns.abstractfactory.daofactory;

public class XMLDptDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving department to XML.");
	}

}
