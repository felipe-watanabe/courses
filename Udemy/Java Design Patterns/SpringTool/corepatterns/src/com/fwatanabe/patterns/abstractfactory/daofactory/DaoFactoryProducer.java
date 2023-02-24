package com.fwatanabe.patterns.abstractfactory.daofactory;

public class DaoFactoryProducer {

	public static DaoFactory produce(String daoType) {
		DaoFactory df = null;
		
		if (daoType.equals("xml"))
			df = new XMLDaoFactory();
		else if (daoType.equals("db"))
			df = new DBDaoFactory();
		
		return df;
	}
}
