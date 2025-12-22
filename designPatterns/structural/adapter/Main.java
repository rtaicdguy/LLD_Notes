package designPatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        CollegeStudent collegeStudent=new CollegeStudent("loda","lasan","ll@gmail.com");
        SchoolStudent schoolStudent=new SchoolStudent("dhawal","jain","abc@gmail.com");

        students.add(collegeStudent);
        //students.add(schoolStudent);

        students.add(new SchoolStudentAdapter(schoolStudent));

        for(Student s: students){
            System.out.println(s.toString());
        }

    }
}
