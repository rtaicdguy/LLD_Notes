package design.patterns.behavioral.command.commands;

import design.patterns.behavioral.command.functions.Light;

public class LightCommand implements Command {
    public boolean on;
    private Light light;
    public LightCommand(Light light){
        on=false;
        this.light=light;
    }
    @Override
    public void execute() {
        if(on){
            light.turnOff();
            on=false;
        } else {
            light.turnOn();
            on=true;
        }
    }
}
