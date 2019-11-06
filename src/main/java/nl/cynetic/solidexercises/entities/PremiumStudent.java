package nl.cynetic.solidexercises.entities;

import java.util.UUID;

public class PremiumStudent extends LimitedStudent {
    public PremiumStudent(String emailAddress, UUID universityId) {
        super(emailAddress, universityId);
        this.setMonthlyEbookAllowance(STANDARD_ALLOWANCE * 2);
    }

    public void increaseBonusAllowance() {
        this.setMonthlyEbookAllowance(this.getMonthlyEbookAllowance() + 10);
    }
}