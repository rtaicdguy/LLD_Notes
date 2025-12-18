package design.patterns.creational.prototype;

/**
 * Concrete Prototype: Rectangle
 * 
 * Another concrete implementation of Shape that can be cloned.
 * Demonstrates how different shapes can implement the Prototype pattern.
 */
public class Rectangle extends Shape {
    private int width;
    private int height;
    
    public Rectangle() {
        this.type = "Rectangle";
    }
    
    public int getWidth() {
        return width;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    /**
     * Draw method specific to Rectangle
     */
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with width: " + width + " and height: " + height);
    }
    
    /**
     * Clone method - creates a deep copy of this Rectangle.
     * 
     * @return a cloned Rectangle object
     */
    @Override
    public Cloneable clone() {
        Rectangle clone = new Rectangle();
        // Copy all properties from the original to the clone
        clone.setId(this.getId());
        clone.setColor(this.getColor());
        clone.setX(this.getX());
        clone.setY(this.getY());
        clone.setWidth(this.width);
        clone.setHeight(this.height);
        return clone;
    }
}
