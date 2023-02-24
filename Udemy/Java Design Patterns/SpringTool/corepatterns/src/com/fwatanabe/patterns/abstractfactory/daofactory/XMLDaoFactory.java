package com.fwatanabe.patterns.abstractfactory.daofactory;

public class XMLDaoFactory implements DaoFactory {

	@Override
	public Dao createDao(String type) {
		Dao d = null;
		
		if (type.equals("dpt"))
			d = new XMLDptDao();
		else if (type.equals("emp"))
			d = new XMLEmpDao();
		
		return d;
	}

}
