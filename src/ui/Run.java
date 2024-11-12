package ui;

import common.StaffRole;
import common.StaffType;
import core.application.implementations.StaffServiceImpl;
import core.application.implementations.StudentServiceImpl;
import core.application.interfaces.StaffService;
import core.application.interfaces.StudentService;
import core.domain.Applicant;
import core.domain.Staff;
import infrastructure.DataSource;

import java.util.Scanner;

public class Run {
    public void runApp(){
        DataSource dataSource = new DataSource();
        StudentService studentService = new StudentServiceImpl(dataSource);
        StaffService staffService = new StaffServiceImpl(dataSource, studentService);

        Staff staff1 = new Staff("Emeka", "Ike", StaffType.academic, StaffRole.principal);
        Staff staff2 = new Staff("Mukesh", "Paran", StaffType.academic, StaffRole.teacher);
        Staff staff3 = new Staff("Jane", "Dodo", StaffType.nonAcademic, StaffRole.other);
        dataSource.staff.add(staff1);
        dataSource.staff.add(staff2);
        dataSource.staff.add(staff3);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String input1 = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String input2 = scanner.nextLine();

        System.out.print("Enter your age: ");
        String input3 = scanner.nextLine();

        Applicant applicant = new Applicant(input1, input2, Integer.parseInt(input3));
        dataSource.applicants.add(applicant);

        try {
            staffService.admitStudent(staff1.getId(), applicant);
            System.out.println("Congratulations, you have been admitted!");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
