package design.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Shape Cache - Prototype Registry
 * 
 * This class acts as a registry/cache for prototype objects.
 * It stores pre-configured prototype instances and provides clones when requested.
 * 
 * This is a common implementation pattern with Prototype:
 * - Store prototypes in a registry
 * - Clone them when needed instead of creating new instances
 * 
 * Benefits:
 * - Centralized management of prototypes
 * - Easy to add/remove prototypes at runtime
 * - Client code doesn't need to know concrete classes
 */
public class ShapeCache {
    // Map to store prototype shapes by their ID
    private static Map<String, Shape> shapeMap = new HashMap<>();
    
    /**
     * Get a cloned shape from the cache.
     * 
     * This method demonstrates the core benefit of Prototype pattern:
     * Instead of creating a new object from scratch, we clone an existing one.
     * 
     * @param shapeId the ID of the shape to clone
     * @return a cloned Shape object
     */
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        // Clone the cached shape and return the copy
        return (Shape) cachedShape.clone();
    }
    
    /**
     * Load initial prototypes into the cache.
     * 
     * In a real application, these prototypes might be:
     * - Loaded from a database
     * - Read from a configuration file
     * - Created based on user preferences
     * 
     * Once loaded, they can be cloned multiple times without
     * repeating the expensive initialization process.
     */
    public static void loadCache() {
        // Create and configure a Circle prototype
        Circle circle = new Circle();
        circle.setId("1");
        circle.setColor("Red");
        circle.setX(10);
        circle.setY(20);
        circle.setRadius(5);
        shapeMap.put(circle.getId(), circle);
        
        // Create and configure a Rectangle prototype
        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        rectangle.setColor("Blue");
        rectangle.setX(30);
        rectangle.setY(40);
        rectangle.setWidth(10);
        rectangle.setHeight(20);
        shapeMap.put(rectangle.getId(), rectangle);
        
        // Create another Circle prototype with different properties
        Circle largeCircle = new Circle();
        largeCircle.setId("3");
        largeCircle.setColor("Green");
        largeCircle.setX(50);
        largeCircle.setY(60);
        largeCircle.setRadius(15);
        shapeMap.put(largeCircle.getId(), largeCircle);
    }
    
    /**
     * Add a new prototype to the cache.
     * This allows dynamic addition of prototypes at runtime.
     * 
     * @param shape the shape to add as a prototype
     */
    public static void addPrototype(Shape shape) {
        shapeMap.put(shape.getId(), shape);
    }
    
    /**
     * Remove a prototype from the cache.
     * 
     * @param shapeId the ID of the shape to remove
     */
    public static void removePrototype(String shapeId) {
        shapeMap.remove(shapeId);
    }
}
