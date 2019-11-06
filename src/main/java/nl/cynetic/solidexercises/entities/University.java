package nl.cynetic.solidexercises.entities;

import java.util.UUID;

public class University {
    private UUID id;
    private String name;
    private UniversityPackage universityPackage;

    public University() {
        this.id = UUID.randomUUID();
        this.name = "";
        this.universityPackage = UniversityPackage.STANDARD;
    }

    public UUID getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public UniversityPackage getUniversityPackage() {
        return this.universityPackage;
    }
}