package core.application.implementations;

import common.Consts;
import common.StaffRole;
import core.application.interfaces.StaffService;
import core.application.interfaces.StudentService;
import core.domain.Applicant;
import core.domain.Staff;
import infrastructure.DataSource;

import java.util.UUID;

public class StaffServiceImpl implements StaffService {
    private final DataSource dataSource;
    private final StudentService studentService;

    public StaffServiceImpl(DataSource dataSource, StudentService studentService){
        this.dataSource = dataSource;
        this.studentService = studentService;
    }

    public void admitStudent(UUID staffId, Applicant applicant) throws Exception {
        Staff staff = null;
        for (Staff s : dataSource.staff){
            if(s.getId() == staffId) staff = s;
        }

        if(staff == null) throw new Exception("Staff not found");
        if(staff.getRole() != StaffRole.principal) throw new Exception("Action is forbidden");
        if(!isApplicantEligible(applicant)) throw new Exception("Applicant is less than minimum age");

        studentService.addStudent(applicant.getFirstName(), applicant.getLastName(), applicant.getAge());
    }

    private boolean isApplicantEligible(Applicant applicant) {
        return applicant.getAge() >= Consts.MINIMUM_AGE;
    }
}
