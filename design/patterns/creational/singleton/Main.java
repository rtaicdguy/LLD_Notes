package design.patterns.creational.singleton;

/**
 * Demonstration of Singleton Pattern
 * 
 * This example shows how to use the Singleton Logger class.
 * No matter how many times we call getInstance(), we always get the same instance.
 */
public class Main {
    public static void main(String[] args) {
        // Get the singleton instance
        Logger logger=Logger.getInstance();
        logger.logFiles();
        
        // Even if we call getInstance() again, we get the same instance
        Logger logger2=Logger.getInstance();
        
        // Verify both references point to the same object
        System.out.println("Are both logger instances same? " + (logger == logger2));
    }
}
