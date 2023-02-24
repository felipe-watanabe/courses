package com.fwatanabe.patterns.abstractfactory.daofactory;

public class DBDaoFactory implements DaoFactory {

	@Override
	public Dao createDao(String type) {
		Dao d = null;
		
		if (type.equals("dpt"))
			d = new DBDptDao();
		else if (type.equals("emp"))
			d = new DBEmpDao();
		
		return d;
	}

}
