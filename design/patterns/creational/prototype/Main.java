package design.patterns.creational.prototype;

/**
 * Demonstration of Prototype Design Pattern
 * 
 * This example shows how to use the Prototype pattern to create new objects
 * by cloning existing prototypes instead of creating them from scratch.
 * 
 * Key Concepts Demonstrated:
 * 1. Cloning objects instead of creating new instances
 * 2. Using a registry/cache to store and manage prototypes
 * 3. Creating variations of objects by cloning and modifying
 * 4. Performance benefits when object creation is expensive
 */
public class Main {
    public static void main(String[] args) {
        // Load prototypes into the cache
        // In real applications, this might involve expensive operations like:
        // - Database queries
        // - File I/O
        // - Complex calculations
        // - Network calls
        System.out.println("=== Loading Prototypes into Cache ===");
        ShapeCache.loadCache();
        System.out.println("Prototypes loaded successfully!\n");
        
        // Now we can get clones of these prototypes without repeating
        // the expensive initialization process
        
        System.out.println("=== Cloning Shapes from Cache ===\n");
        
        // Get a clone of the Circle prototype (ID: 1)
        System.out.println("1. Cloning Circle (ID: 1):");
        Shape clonedCircle1 = ShapeCache.getShape("1");
        clonedCircle1.displayInfo();
        clonedCircle1.draw();
        System.out.println();
        
        // Get another clone of the same Circle prototype
        // This creates a new object, but it's much faster than creating from scratch
        System.out.println("2. Cloning another Circle (ID: 1):");
        Shape clonedCircle2 = ShapeCache.getShape("1");
        clonedCircle2.displayInfo();
        clonedCircle2.draw();
        System.out.println();
        
        // Verify that clones are different objects (not the same reference)
        System.out.println("Are both circles the same object? " + (clonedCircle1 == clonedCircle2));
        System.out.println("(False means they are different objects - cloning worked!)\n");
        
        // Get a clone of the Rectangle prototype (ID: 2)
        System.out.println("3. Cloning Rectangle (ID: 2):");
        Shape clonedRectangle = ShapeCache.getShape("2");
        clonedRectangle.displayInfo();
        clonedRectangle.draw();
        System.out.println();
        
        // Get a clone of the large Circle prototype (ID: 3)
        System.out.println("4. Cloning Large Circle (ID: 3):");
        Shape clonedLargeCircle = ShapeCache.getShape("3");
        clonedLargeCircle.displayInfo();
        clonedLargeCircle.draw();
        System.out.println();
        
        // Demonstrate modifying a clone without affecting the prototype
        System.out.println("=== Modifying a Clone ===\n");
        System.out.println("5. Cloning Circle and modifying it:");
        Shape modifiedCircle = ShapeCache.getShape("1");
        modifiedCircle.setColor("Yellow");
        modifiedCircle.setX(100);
        modifiedCircle.setY(200);
        System.out.println("Modified clone:");
        modifiedCircle.displayInfo();
        System.out.println();
        
        // Verify that the original prototype is unchanged
        System.out.println("6. Getting original Circle again to verify prototype is unchanged:");
        Shape originalCircle = ShapeCache.getShape("1");
        originalCircle.displayInfo();
        System.out.println("(Notice the color and position are still the original values!)\n");
        
        // Demonstrate adding a new prototype at runtime
        System.out.println("=== Adding New Prototype at Runtime ===\n");
        Rectangle customRectangle = new Rectangle();
        customRectangle.setId("4");
        customRectangle.setColor("Purple");
        customRectangle.setX(70);
        customRectangle.setY(80);
        customRectangle.setWidth(25);
        customRectangle.setHeight(35);
        ShapeCache.addPrototype(customRectangle);
        
        System.out.println("7. Cloning newly added Rectangle (ID: 4):");
        Shape clonedCustomRectangle = ShapeCache.getShape("4");
        clonedCustomRectangle.displayInfo();
        clonedCustomRectangle.draw();
        
        System.out.println("\n=== Summary ===");
        System.out.println("The Prototype pattern allows us to:");
        System.out.println("1. Create new objects by copying existing ones");
        System.out.println("2. Avoid expensive initialization when creating similar objects");
        System.out.println("3. Add/remove prototypes dynamically at runtime");
        System.out.println("4. Hide the complexity of object creation from client code");
    }
}
