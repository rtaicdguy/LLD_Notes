package design.patterns.structural.proxy;

public class UserServiceProxy implements UserService {

    private UserServiceImpl realService;
    private boolean isAdmin;

    public UserServiceProxy(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public User getUserById(String userId) {

        // Protection proxy
        if (!isAdmin) {
            throw new RuntimeException("Access Denied!");
        }

        // Virtual proxy (lazy initialization)
        if (realService == null) {
            realService = new UserServiceImpl();
        }

        return realService.getUserById(userId);
    }
}
