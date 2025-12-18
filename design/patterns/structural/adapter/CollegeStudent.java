package design.patterns.structural.adapter;

public class CollegeStudent implements Student{
    String name;
    String surname;
    String email;

    CollegeStudent(String name,String surname,String email){
        this.name=name;
        this.surname=surname;
        this.email=email;

    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
