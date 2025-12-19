package design.patterns.behavioral.command;

import design.patterns.behavioral.command.commands.Command;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    List<Command> commandList;
    Remote(){
        this.commandList=new ArrayList<>();
    }
    public void addCommand(Command command){
        commandList.add(command);
    }
    public void executeCommand(int index){
        commandList.get(index).execute();
    }

    public void removeCommand(Command command){
        commandList.remove(command);
    }
}
