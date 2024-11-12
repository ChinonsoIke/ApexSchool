package core.application.implementations;

import core.application.interfaces.StaffService;
import core.domain.Applicant;
import infrastructure.DataSource;

public class ApplicantServiceImpl {
    private final DataSource dataSource;

    public ApplicantServiceImpl(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public void addApplicant(String firstName, String lastName, int age){
        Applicant applicant = new Applicant(firstName, lastName, age);
        dataSource.applicants.add(applicant);
    }
}
