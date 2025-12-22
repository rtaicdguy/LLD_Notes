package designPatterns.structural.proxy;

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
        //We do this so that we avoid creating UserServiceImpl() object if not require
        //and hence prevent expensive db call if not required.
        if (realService == null) {
            realService = new UserServiceImpl();
        }

        return realService.getUserById(userId);
    }
}
