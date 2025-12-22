package designPatterns.creational.prototype;

public class Main {
    public static void main(String[] args) {
        UserProfile u1=UserProfileRegistry.getUserProfile("123");
        u1.setTheme("abc");
        UserProfile u2=UserProfileRegistry.getUserProfile("123");
        u2.setTheme("def");
        u1.describeUser();
        u2.describeUser();
    }
}
