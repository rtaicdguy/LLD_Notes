package designPatterns.creational.builder;

/**
 * BUILDER DESIGN PATTERN
 * 
 * Purpose: Separates the construction of a complex object from its representation,
 * allowing the same construction process to create different representations.
 * 
 * Use Cases:
 * - Objects with many optional parameters (like this Person class)
 * - Immutable objects that need complex construction
 * - Objects that require step-by-step construction
 * - Avoiding telescoping constructors (constructors with many parameters)
 * 
 * Benefits:
 * 1. Readable code - method chaining makes it clear what's being set
 * 2. Immutability - all fields are final, object can't be modified after creation
 * 3. Flexibility - can set only the fields you need
 * 4. No need for multiple constructors with different parameter combinations
 */
public class Person {

    // All fields are final - making the Person object immutable once created
    private final String name;
    private final Integer age;
    private final Gender gender;
    private final String address;
    private final String phoneNumber;
    private final String profession;
    private final boolean married;

    /**
     * Private constructor - can only be called by the Builder.
     * This ensures objects are created only through the builder pattern.
     * Takes the builder as parameter and copies all values from it.
     */
    private Person(PersonBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
        this.profession = builder.profession;
        this.married = builder.married;
    }


    /**
     * Method to display person details.
     */
    public void describe() {
        System.out.println("My name is: " + name);
        System.out.println("My age is: " + age);
        System.out.println("My gender is: " + gender);
        System.out.println("My address is: " + address);
        System.out.println("My phone number is: " + phoneNumber);
        System.out.println("My profession is: " + profession);
        System.out.println("My marital status is: " + married);
    }

    /**
     * Static factory method to get a new Builder instance.
     * This is the entry point for creating a Person object.
     */
    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    /**
     * Static inner Builder class.
     * 
     * Key characteristics:
     * - Contains the same fields as the outer class (but mutable)
     * - Each setter method returns 'this' to enable method chaining
     * - build() method creates and returns the final immutable Person object
     */
    public static class PersonBuilder {
        // Builder fields are mutable - they can be changed until build() is called
        private String name;
        private Integer age;
        private Gender gender;
        private String address;
        private String phoneNumber;
        private String profession;
        private boolean married;

        /**
         * Private constructor - ensures builder is created only via Person.builder()
         */
        private PersonBuilder() {}

        /**
         * Setter methods that return 'this' for method chaining.
         * This allows fluent API: builder.name("John").age(30).build()
         */
        public PersonBuilder name(String name) {
            this.name = name;
            return this;  // Returns builder instance for chaining
        }

        public PersonBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public PersonBuilder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public PersonBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public PersonBuilder profession(String profession) {
            this.profession = profession;
            return this;
        }

        public PersonBuilder married(boolean married) {
            this.married = married;
            return this;
        }

        /**
         * Final step - creates the immutable Person object.
         * After this, the Person object cannot be modified.
         * You can add validation logic here before creating the object.
         */
        public Person build() {
            // Could add validation here, e.g.:
            // if (name == null) throw new IllegalStateException("Name is required");
            return new Person(this);
        }
    }
}
