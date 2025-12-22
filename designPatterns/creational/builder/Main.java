package designPatterns.creational.builder;

/**
 * Demonstration of Builder Pattern
 * 
 * Shows different ways to use the Builder pattern:
 * 1. Step-by-step building (storing builder in a variable)
 * 2. Method chaining (fluent API style)
 */
public class Main {
    public static void main(String[] args) {
        // Method 1: Step-by-step building
        // Useful when you need to conditionally set properties
        System.out.println("=== Method 1: Step-by-step building ===");
        Person.PersonBuilder personBuilder= Person.builder();
        personBuilder.married(true);
        personBuilder.address("lasan road");
        Person p1=personBuilder.build();
        p1.describe();
        
        System.out.println("\n=== Method 2: Method chaining (Fluent API) ===");
        // Method 2: Method chaining - more concise and readable
        // This is the preferred way when you know all values upfront
        Person p2 = Person.builder()
                .name("Rishabh")
                .age(28)
                .gender(Gender.MALE)
                .address("Mumbai, India")
                .phoneNumber("+91-9876543210")
                .profession("Software Engineer")
                .married(false)
                .build();
        p2.describe();
        
        System.out.println("\n=== Method 3: Partial building (only required fields) ===");
        // Method 3: You can set only the fields you need
        Person p3 = Person.builder()
                .name("Anonymous")
                .age(25)
                .build();
        p3.describe();
    }
}
