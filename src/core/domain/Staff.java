package core.domain;

import common.StaffRole;
import common.StaffType;

public class Staff extends BaseEntity {
    private String firstName;
    private String lastName;
    private StaffType type;
    private StaffRole role;

    public StaffRole getRole(){
        return role;
    }

    public Staff(String firstName, String lastName, StaffType type, StaffRole role){
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
        this.role = role;
    }
}
