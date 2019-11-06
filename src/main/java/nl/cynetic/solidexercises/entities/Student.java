package nl.cynetic.solidexercises.entities;

import java.util.UUID;

public abstract class Student {
    protected final int STANDARD_ALLOWANCE = 10;

    private String emailAddress;
    private UUID universityId;
    private int monthlyEbookAllowance;
    private int currentlyBorrowedEbooks;
    
    public Student(String emailAddress, UUID universityId) {
        this.emailAddress = emailAddress;
        this.universityId = universityId;
        this.currentlyBorrowedEbooks = 0;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public UUID getUniversityId() {
        return this.universityId;
    }

    public int getMonthlyEbookAllowance() {
        return this.monthlyEbookAllowance;
    }

    protected void setMonthlyEbookAllowance(int allowance) {
        this.monthlyEbookAllowance = allowance;
    }

    public int getCurrentlyBorrowedEbooks() {
        return this.currentlyBorrowedEbooks;
    }

    public abstract void addBonusAllowance();
}