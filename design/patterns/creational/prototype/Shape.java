package design.patterns.creational.prototype;

/**
 * PROTOTYPE DESIGN PATTERN
 * 
 * Purpose: Creates new objects by copying existing objects (prototypes) rather than
 * creating new instances from scratch. This is useful when object creation is expensive.
 * 
 * Use Cases:
 * - When object creation is costly (e.g., involves database calls, complex calculations)
 * - When you need many similar objects with slight variations
 * - When you want to avoid subclasses of an object creator (like Factory pattern)
 * - When instances of a class can have only a few different combinations of state
 * 
 * Benefits:
 * 1. Reduces the cost of creating objects
 * 2. Hides the complexity of creating new instances
 * 3. Allows adding/removing objects at runtime
 * 4. Reduces subclassing
 * 
 * This abstract class represents a Shape that can be cloned.
 */
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;
    private String color;
    private int x;
    private int y;
    
    /**
     * Getters and setters for shape properties
     */
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getType() {
        return type;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * Abstract method to draw the shape.
     * Each concrete shape will implement its own drawing logic.
     */
    public abstract void draw();
    
    /**
     * Clone method - creates a copy of this shape.
     * This is the core of the Prototype pattern.
     * 
     * @return a cloned Shape object
     */
    @Override
    public abstract Cloneable clone();
    
    /**
     * Display shape information
     */
    public void displayInfo() {
        System.out.println("Shape: " + type);
        System.out.println("ID: " + id);
        System.out.println("Color: " + color);
        System.out.println("Position: (" + x + ", " + y + ")");
    }
}
