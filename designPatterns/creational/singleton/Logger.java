package designPatterns.creational.singleton;

/**
 * SINGLETON DESIGN PATTERN
 * 
 * Purpose: Ensures that a class has only ONE instance throughout the application
 * and provides a global point of access to that instance.
 * 
 * Use Cases:
 * - Logger classes (like this one)
 * - Database connections
 * - Configuration managers
 * - Thread pools
 * - Cache managers
 * 
 * Implementation: Thread-Safe Double-Checked Locking
 * This implementation uses the "Double-Checked Locking" pattern with volatile keyword
 * to ensure thread safety while minimizing synchronization overhead.
 */
public class Logger {
    // volatile keyword ensures visibility of changes across threads
    // prevents instruction reordering by the compiler
    private static volatile Logger logger;

    /**
     * Private constructor prevents direct instantiation from outside the class.
     * Also prevents reflection-based instantiation by throwing an exception
     * if someone tries to create a second instance.
     */
    private Logger(){
        if(logger!=null){
            throw new RuntimeException("Use getInstance()");
        }
    }

    /**
     * Thread-safe getInstance method using Double-Checked Locking pattern.
     * 
     * How it works:
     * 1. First check (without synchronization) - for performance optimization
     * 2. If null, enter synchronized block - ensures only one thread creates instance
     * 3. Second check (inside synchronized block) - ensures instance wasn't created 
     *    by another thread while waiting for the lock
     * 
     * @return the single Logger instance
     */
    public static Logger getInstance(){
        if(logger==null){  // First check - no locking overhead if instance exists
            synchronized (Logger.class){  // Lock only when creating instance
                if(logger==null){  // Second check - inside synchronized block
                    logger=new Logger();
                }
            }
        }
        return logger;
    }
    
    /**
     * Business logic method - logs files to the system.
     * Since there's only one Logger instance, all parts of the application
     * use the same logger, ensuring consistent logging behavior.
     */
    public void logFiles(){
        System.out.println("Logging the files");
    }
}
