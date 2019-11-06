package nl.cynetic.solidexercises.services;

import java.util.UUID;

public interface StudentWriterService {
    boolean add(String emailAddress, UUID universityId);
    void addBonusAllowances();
}