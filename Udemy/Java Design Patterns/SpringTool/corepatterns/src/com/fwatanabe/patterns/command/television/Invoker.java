package com.fwatanabe.patterns.command.television;

public class Invoker {
	private Command command;
	
	public Invoker(Command command) {
		this.command = command;
	}
	
	public void perform() {
		command.execute();
	}
}
