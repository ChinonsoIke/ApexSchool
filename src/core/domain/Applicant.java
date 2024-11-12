package core.domain;

public class Applicant extends BaseEntity {
    private String firstName;
    private String lastName;
    private int age;

    public int getAge(){
        return age;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public Applicant(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
