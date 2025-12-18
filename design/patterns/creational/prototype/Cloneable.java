package design.patterns.creational.prototype;

/**
 * Prototype interface for cloning objects.
 * 
 * This interface defines the contract for objects that can be cloned.
 * Implementing classes must provide their own clone() implementation.
 */
public interface Cloneable {
    /**
     * Creates and returns a copy of this object.
     * 
     * @return a clone of this instance
     */
    Cloneable clone();
}
