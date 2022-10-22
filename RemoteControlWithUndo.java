

public class RemoteControlWithUndo{
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	public RemoteControlWithUndo(){
	onCommands= new Command[7];
	offCommands= new Command[7];
	Command noCommand= new noCommand();
	for(int i=0; i<7;i++){
		onCommands[i]= noCommand;
		offCommands[i]=noCommand;
	
	}
	
	}
	
	public void setCommand(int slot,Command onCommand, Command offCommand){
		onCommands[slot]= onCommand;
		offCommands[slot]= offCommand;
		}
		public void onButtonWasPushed(int slot){
			onCommands[slot].execute();
			undoCommand =onCommands[slot];
		}
		public void offButtonWasPushed(int slot){
			offCommands[slot].execute();
						undoCommand =offCommands[slot];

		}
		public void undoButtonWasPushed(){
			undoCommand.undo();
		}
	public String toString(){
		StringBuffer strinBuff = new StringBuffer();
		strinBuff.append("\n-remote control-\n");
		for(int i=0; i<offCommands.length;i++){
			strinBuff.append("[slot"+i+"]" + offCommands[i].getClass().getName()+""+offCommands[i].getClass().getName()+	"\n"	);

			
}
                        return  strinBuff.toString();

}
}
