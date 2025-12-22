package designPatterns.creational.prototype;

public class UserProfile implements Prototype<UserProfile>{
    private String userId;
    private String name;
    private Integer age;
    private String theme;


    UserProfile(String userId){
        UserProfile userProfile=NosqlDatabase.fetchDataFromDb(userId);
        this.userId=userProfile.userId;
        this.name=userProfile.name;
        this.age=userProfile.age;
        this.theme=userProfile.theme;
    }

    UserProfile(String userId,String name, Integer age, String theme){
        this.userId=userId;
        this.age=age;
        this.name=name;
        this.theme=theme;
    }

    UserProfile(UserProfile userProfile){
        this.age=userProfile.age;
        this.name=userProfile.name;
        this.theme=userProfile.theme;
        this.userId=userProfile.userId;
    }

    public void setTheme(String theme){
        this.theme=theme;
    }

    public void describeUser(){
        System.out.println("User with id: "+userId+" with theme: "+theme);
    }

    @Override
    public UserProfile clone() {
        return new UserProfile(this);
    }
}
