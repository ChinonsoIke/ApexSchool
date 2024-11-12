package infrastructure;

import core.domain.Applicant;
import core.domain.Course;
import core.domain.Staff;
import core.domain.Student;

import java.util.ArrayList;

public class DataSource {
    public ArrayList<Staff> staff = new ArrayList<>();
    public ArrayList<Applicant> applicants = new ArrayList<>();
    public ArrayList<Course> courses = new ArrayList<>();
    public ArrayList<Student> students = new ArrayList<>();
}
