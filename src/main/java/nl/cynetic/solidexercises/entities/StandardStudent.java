package nl.cynetic.solidexercises.entities;

import java.util.UUID;

public class StandardStudent extends Student {
    public StandardStudent(String emailAddress, UUID universityId) {
        super(emailAddress, universityId);
        this.setMonthlyEbookAllowance(STANDARD_ALLOWANCE);
    }

    public void addBonusAllowance() {
        this.setMonthlyEbookAllowance(this.getMonthlyEbookAllowance() + 5);
    }
}