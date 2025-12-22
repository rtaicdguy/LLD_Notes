package designPatterns.creational.prototype;

public class NosqlDatabase {
    public static UserProfile fetchDataFromDb(String userId) {
        try {
            Thread.sleep(5000);
        } catch (Exception e){}

        return new UserProfile(userId,"Rishabh",35,null);
    }
}
