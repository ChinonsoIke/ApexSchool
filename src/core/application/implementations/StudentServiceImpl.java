package core.application.implementations;

import core.application.interfaces.StudentService;
import core.domain.Student;
import infrastructure.DataSource;

public class StudentServiceImpl implements StudentService {
    private DataSource dataSource;

    public StudentServiceImpl(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public void addStudent(String firstName, String lastName, int age){
        Student student = new Student(firstName, lastName, age);
        dataSource.students.add(student);
        System.out.println();
    }
}
