package nl.cynetic.solidexercises.entities;

import java.util.UUID;

public class Student {
    private final int STANDARD_ALLOWANCE = 10;

    private String emailAddress;
    private UUID universityId;
    private int monthlyEbookAllowance;
    private int currentlyBorrowedEbooks;
    
    public Student(String emailAddress, UUID universityId, UniversityPackage universityPackage) {
        this.emailAddress = emailAddress;
        this.universityId = universityId;
        this.currentlyBorrowedEbooks = 0;

        if (universityPackage == UniversityPackage.STANDARD)
        {
            this.monthlyEbookAllowance = STANDARD_ALLOWANCE;
        }
        else if (universityPackage == UniversityPackage.PREMIUM)
        {
            this.monthlyEbookAllowance = STANDARD_ALLOWANCE * 2;
        } 
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

    public void setMonthlyEbookAllowance(int allowance) {
        this.monthlyEbookAllowance = allowance;
    }

    public int getCurrentlyBorrowedEbooks() {
        return this.currentlyBorrowedEbooks;
    }
}