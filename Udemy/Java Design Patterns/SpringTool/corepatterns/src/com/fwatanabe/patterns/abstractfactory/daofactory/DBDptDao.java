package com.fwatanabe.patterns.abstractfactory.daofactory;

public class DBDptDao implements Dao {

	@Override
	public void save() {
		System.out.println("Saving department to DB.");
	}

}
