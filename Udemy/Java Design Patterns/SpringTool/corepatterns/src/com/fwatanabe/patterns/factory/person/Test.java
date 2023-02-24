package com.fwatanabe.patterns.factory.person;

public class Test {

	public static void main(String[] args) {
		Person p = PersonFactory.createPerson("male");
		
		p.wish("Hi");
	}

}
