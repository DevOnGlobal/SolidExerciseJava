package nl.cynetic.solidexercises.repositories;

import java.util.UUID;
import nl.cynetic.solidexercises.entities.University;

public interface UniversityRepository {
    University getById(UUID universityId);
}