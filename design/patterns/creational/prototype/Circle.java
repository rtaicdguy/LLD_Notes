package design.patterns.creational.prototype;

/**
 * Concrete Prototype: Circle
 * 
 * This class extends Shape and provides its own implementation of the clone method.
 * When cloned, it creates a new Circle object with the same properties.
 */
public class Circle extends Shape {
    private int radius;
    
    public Circle() {
        this.type = "Circle";
    }
    
    public int getRadius() {
        return radius;
    }
    
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    /**
     * Draw method specific to Circle
     */
    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }
    
    /**
     * Clone method - creates a deep copy of this Circle.
     * 
     * This is where the Prototype pattern magic happens!
     * Instead of using 'new Circle()' and setting all properties,
     * we copy an existing object.
     * 
     * @return a cloned Circle object
     */
    @Override
    public Cloneable clone() {
        Circle clone = new Circle();
        // Copy all properties from the original to the clone
        clone.setId(this.getId());
        clone.setColor(this.getColor());
        clone.setX(this.getX());
        clone.setY(this.getY());
        clone.setRadius(this.radius);
        return clone;
    }
}
