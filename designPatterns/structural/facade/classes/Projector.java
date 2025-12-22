package designPatterns.structural.facade.classes;

/**
 * Subsystem class - Projector
 * Part of the complex home theater subsystem
 */
public class Projector {
    private String description;
    private StreamingPlayer player;

    public Projector(String description, StreamingPlayer player) {
        this.description = description;
        this.player = player;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void wideScreenMode() {
        System.out.println(description + " in widescreen mode (16x9 aspect ratio)");
    }

    public void tvMode() {
        System.out.println(description + " in tv mode (4x3 aspect ratio)");
    }

    @Override
    public String toString() {
        return description;
    }
}
