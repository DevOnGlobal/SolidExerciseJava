package nl.cynetic.solidexercises.entities;

import java.util.UUID;

public abstract class Student {
    private String emailAddress;
    private UUID universityId;
    private int currentlyBorrowedEbooks;
    
    protected Student(String emailAddress, UUID universityId) {
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

    public int getCurrentlyBorrowedEbooks() {
        return this.currentlyBorrowedEbooks;
    }
}