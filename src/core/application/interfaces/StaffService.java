package core.application.interfaces;

import core.domain.Applicant;

import java.util.UUID;

public interface StaffService {
    void admitStudent(UUID staffId, Applicant applicant) throws Exception;
}
