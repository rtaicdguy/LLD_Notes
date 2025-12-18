package design.patterns.structural.proxy;

public class Main {

    public static void main(String[] args) {

        UserService adminService = new UserServiceProxy(true);
        //UserService adminService = new UserServiceImpl();

        User user = adminService.getUserById("U123");
        System.out.println(user);

        // Uncomment to see protection proxy in action
        // UserService userService = new UserServiceProxy(false);
        // userService.getUserById("U124");
    }
}
