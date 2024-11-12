package core.domain;

public class Student extends BaseEntity {
    private String firstName;
    private String lastName;
    private int age;

    public Student(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
