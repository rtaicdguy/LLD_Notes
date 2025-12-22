package designPatterns.behavioral.command;

import designPatterns.behavioral.command.commands.FanCommand;
import designPatterns.behavioral.command.commands.LightCommand;
import designPatterns.behavioral.command.functions.Fan;
import designPatterns.behavioral.command.functions.Light;

public class Main {
    public static void main(String[] args) {
        Light light=new Light();
        Fan fan=new Fan();
        LightCommand lightCommand=new LightCommand(light);
        FanCommand fanCommand=new FanCommand(fan);

        Remote remote=new Remote();
        remote.addCommand(lightCommand);
        remote.addCommand(fanCommand);

        remote.executeCommand(0);
        remote.executeCommand(0);
        remote.executeCommand(1);
        remote.executeCommand(1);


    }
}
