package designPatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class UserProfileRegistry {
    private static Map<String,UserProfile> cache=new HashMap<>();

    public static UserProfile getUserProfile(String userId){
        if(!cache.containsKey(userId)){
            cache.put(userId,new UserProfile(userId));
        }
        return cache.get(userId);
    }
}
