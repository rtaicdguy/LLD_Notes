package design.patterns.structural.facade;

import design.patterns.structural.facade.classes.*;

/**
 * Facade Pattern - Home Theater Example (Head First Design Patterns)
 * 
 * The Facade provides a simplified interface to a complex subsystem.
 * It wraps multiple subsystem components and provides a unified interface
 * that makes the subsystem easier to use.
 */
public class HomeTheaterFacade {
    private Amplifier amp;
    private Tuner tuner;
    private StreamingPlayer player;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp,
                            Tuner tuner,
                            StreamingPlayer player,
                            Projector projector,
                            Screen screen,
                            TheaterLights lights,
                            PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.player = player;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;
    }

    /**
     * Simplified method to watch a movie
     * Hides the complexity of interacting with multiple subsystems
     */
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setStreamingPlayer(player);
        amp.setSurroundSound();
        amp.setVolume(5);
        player.on();
        player.play(movie);
    }

    /**
     * Simplified method to end the movie
     */
    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        player.stop();
        player.off();
    }

    /**
     * Listen to radio
     */
    public void listenToRadio(double frequency) {
        System.out.println("Tuning in the airwaves...");
        tuner.on();
        tuner.setFrequency(frequency);
        amp.on();
        amp.setVolume(5);
        amp.setTuner(tuner);
    }

    /**
     * End radio listening
     */
    public void endRadio() {
        System.out.println("Shutting down the tuner...");
        tuner.off();
        amp.off();
    }
}
