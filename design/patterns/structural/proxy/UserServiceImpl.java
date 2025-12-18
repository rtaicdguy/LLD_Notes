package design.patterns.structural.proxy;

public class UserServiceImpl implements UserService {

    public UserServiceImpl() {
        // Simulate expensive initialization
        try {
            System.out.println("Initializing UserServiceImpl (DB connection)...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User getUserById(String userId) {
        System.out.println("Fetching user from DB: " + userId);
        return new User(userId, "Rishabh");
    }
}
