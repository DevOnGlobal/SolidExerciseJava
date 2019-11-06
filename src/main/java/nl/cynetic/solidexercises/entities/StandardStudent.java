package nl.cynetic.solidexercises.entities;

import java.util.UUID;

public class StandardStudent extends LimitedStudent {
    public StandardStudent(String emailAddress, UUID universityId) {
        super(emailAddress, universityId);
        this.setMonthlyEbookAllowance(STANDARD_ALLOWANCE);
    }

    public void increaseBonusAllowance() {
        this.setMonthlyEbookAllowance(this.getMonthlyEbookAllowance() + 5);
    }
}