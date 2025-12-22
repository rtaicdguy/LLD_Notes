package designPatterns.structural.adapter;

public class SchoolStudentAdapter implements Student{
    SchoolStudent schoolStudent;
    SchoolStudentAdapter(SchoolStudent schoolStudent){
        this.schoolStudent=schoolStudent;
    }
    @Override
    public String getName() {
        return schoolStudent.getFirstName();
    }

    @Override
    public String getSurname() {
        return schoolStudent.getLastName();
    }

    @Override
    public String getEmail() {
        return schoolStudent.getEmailId();
    }
}
