package design.patterns.structural.facade;

import design.patterns.structural.facade.classes.*;

/**
 * Facade Pattern Demo - Home Theater Example
 * 
 * This example demonstrates the Facade Pattern from Head First Design Patterns.
 * 
 * The Facade Pattern provides a unified interface to a set of interfaces in a subsystem.
 * Facade defines a higher-level interface that makes the subsystem easier to use.
 * 
 * Benefits:
 * 1. Simplifies the interface for the client
 * 2. Decouples the client from the subsystem components
 * 3. Reduces the number of objects the client deals with
 * 4. Makes the subsystem easier to use
 * 
 * Without Facade: Client needs to interact with 7+ different components
 * With Facade: Client calls simple methods like watchMovie() and endMovie()
 */
public class Main {
    public static void main(String[] args) {
        // Create all the components of the home theater
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        StreamingPlayer player = new StreamingPlayer("Top-O-Line Streaming Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", player);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        // Create the facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
            amp, tuner, player, projector, screen, lights, popper
        );

        System.out.println("=== WITHOUT FACADE (Complex) ===");
        System.out.println("To watch a movie, you would need to:");
        System.out.println("1. Turn on the popcorn popper");
        System.out.println("2. Start popping");
        System.out.println("3. Dim the lights");
        System.out.println("4. Put the screen down");
        System.out.println("5. Turn on the projector");
        System.out.println("6. Set projector to widescreen");
        System.out.println("7. Turn on the amplifier");
        System.out.println("8. Set amplifier to streaming player");
        System.out.println("9. Set amplifier to surround sound");
        System.out.println("10. Set amplifier volume");
        System.out.println("11. Turn on streaming player");
        System.out.println("12. Play the movie");
        System.out.println("\nThat's a lot of steps!\n");

        System.out.println("=== WITH FACADE (Simple) ===");
        // Now with the facade, watching a movie is simple!
        homeTheater.watchMovie("The Avengers");

        System.out.println("\n--- Enjoying the movie... ---\n");

        // Ending the movie is also simple
        homeTheater.endMovie();

        System.out.println("\n=== ANOTHER FEATURE ===");
        // The facade can provide other simplified operations too
        homeTheater.listenToRadio(98.5);

        System.out.println("\n--- Listening to music... ---\n");

        homeTheater.endRadio();

        System.out.println("\n=== KEY POINTS ===");
        System.out.println("1. Facade simplifies complex subsystems");
        System.out.println("2. Client code is much cleaner and easier to maintain");
        System.out.println("3. Subsystem classes are still accessible if needed");
        System.out.println("4. Facade doesn't add new functionality, just simplifies access");
        System.out.println("5. Follows the Principle of Least Knowledge (Law of Demeter)");
    }
}
