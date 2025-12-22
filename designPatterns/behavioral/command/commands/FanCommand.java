package designPatterns.behavioral.command.commands;

import designPatterns.behavioral.command.functions.Fan;

public class FanCommand implements Command {
    public boolean on;
    private Fan fan;
    public FanCommand(Fan fan){
        on=false;
        this.fan=fan;
    }
    @Override
    public void execute() {
        if(on){
            fan.turnOff();
            on=false;
        } else {
            fan.turnOn();
            on=true;
        }
    }
}
