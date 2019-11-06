package nl.cynetic.solidexercises.entities;

import java.util.UUID;

public abstract class LimitedStudent extends Student implements BonusAllowable {
    protected final int STANDARD_ALLOWANCE = 10;

    private int monthlyEbookAllowance;
        
    protected LimitedStudent(String emailAddress, UUID universityId) {
        super(emailAddress, universityId);
    }

    public int getMonthlyEbookAllowance() {
        return this.monthlyEbookAllowance;
    }

    protected void setMonthlyEbookAllowance(int allowance) {
        this.monthlyEbookAllowance = allowance;
    }

    public abstract void increaseBonusAllowance();
}