package com.fwatanabe.patterns.command.television;

public class OffCommand implements Command {
	
	private Television receiver;
	
	public OffCommand(Television receiver) {
		this.receiver = receiver;
	}
	
	public void execute() {
		receiver.off();
	}
}
