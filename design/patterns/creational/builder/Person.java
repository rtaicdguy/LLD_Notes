package design.patterns.creational.builder;

public class Person {

    private final String name;
    private final Integer age;
    private final Gender gender;
    private final String address;
    private final String phoneNumber;
    private final String profession;
    private final boolean married;

    private Person(PersonBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
        this.profession = builder.profession;
        this.married = builder.married;
    }

    public void describe() {
        System.out.println("My name is: " + name);
        System.out.println("My age is: " + age);
        System.out.println("My gender is: " + gender);
        System.out.println("My address is: " + address);
        System.out.println("My phone number is: " + phoneNumber);
        System.out.println("My profession is: " + profession);
        System.out.println("My marital status is: " + married);
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {
        private String name;
        private Integer age;
        private Gender gender;
        private String address;
        private String phoneNumber;
        private String profession;
        private boolean married;

        private PersonBuilder() {}

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
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

        public Person build() {
            return new Person(this);
        }
    }
}
