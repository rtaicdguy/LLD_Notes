package design.patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        Person.PersonBuilder personBuilder= Person.builder();
        personBuilder.married(true);
        personBuilder.address("lasan road");
        Person p1=personBuilder.build();
        p1.describe();
    }
}
