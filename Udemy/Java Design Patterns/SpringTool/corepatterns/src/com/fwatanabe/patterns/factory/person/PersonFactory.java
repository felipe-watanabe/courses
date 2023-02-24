package com.fwatanabe.patterns.factory.person;

public class PersonFactory {

	public static Person createPerson(String sex) {
		Person p = null;
		
		if (sex.equals("male"))
			p = new Male();
		else if (sex.equals("female"))
			p = new Female();
		
		return p;
	}
}
