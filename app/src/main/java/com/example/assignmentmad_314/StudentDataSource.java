package com.example.assignmentmad_314;

import java.util.ArrayList;
import java.util.List;

public class StudentDataSource {

    //SINGLETON PATTERN
    private static StudentDataSource instance = null;
    private List<Student> Students = new ArrayList<Student>();

    private StudentDataSource() {
        Student student = new Student();
        student.Id = 1;
        student.name = "Neha";
        student.password ="Wecome1";

        this.Students.add(student);
    }


    public static StudentDataSource getInstance() {
        if (instance == null) {
            instance = new StudentDataSource();
        }
        return instance;
    }

    public void addAnimal(Student student) { this.Students.add(student);
    }

    public List<Student> getStudent() {
        return this.Students;
    }
}
