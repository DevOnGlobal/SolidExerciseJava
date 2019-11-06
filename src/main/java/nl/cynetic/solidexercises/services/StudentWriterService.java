package nl.cynetic.solidexercises.services;

import java.util.UUID;

public interface StudentWriterService {
    void add(String emailAddress, UUID universityId) throws BusinessServiceException;
    void addBonusAllowances();
}