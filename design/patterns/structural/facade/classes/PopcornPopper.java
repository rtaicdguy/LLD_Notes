package design.patterns.structural.facade.classes;

/**
 * Subsystem class - PopcornPopper
 * Part of the complex home theater subsystem
 */
public class PopcornPopper {
    private String description;

    public PopcornPopper(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void pop() {
        System.out.println(description + " popping popcorn!");
    }

    @Override
    public String toString() {
        return description;
    }
}
