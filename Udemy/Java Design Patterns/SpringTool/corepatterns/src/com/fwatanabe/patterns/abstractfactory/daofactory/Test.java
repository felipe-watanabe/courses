package com.fwatanabe.patterns.abstractfactory.daofactory;

public class Test {

	public static void main(String[] args) {

		DaoFactory factory1 = DaoFactoryProducer.produce("xml");
		DaoFactory factory2 = DaoFactoryProducer.produce("db");
		
		Dao dao1 = factory1.createDao("dpt");
		Dao dao2 = factory1.createDao("emp");
		
		Dao dao3 = factory2.createDao("dpt");
		Dao dao4 = factory2.createDao("emp");
		
		dao1.save();
		dao2.save();
		
		dao3.save();
		dao4.save();
	}

}
