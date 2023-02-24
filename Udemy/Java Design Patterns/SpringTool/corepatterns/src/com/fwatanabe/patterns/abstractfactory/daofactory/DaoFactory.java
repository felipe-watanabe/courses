package com.fwatanabe.patterns.abstractfactory.daofactory;

public interface DaoFactory {

	Dao createDao(String type);
}
