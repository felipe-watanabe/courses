package com.fwatanabe.patterns.command.television;

public class OnCommand implements Command {
	
	private Television receiver;
	
	public OnCommand(Television receiver) {
		this.receiver = receiver;
	}
	
	public void execute() {
		receiver.on();
	}
}
