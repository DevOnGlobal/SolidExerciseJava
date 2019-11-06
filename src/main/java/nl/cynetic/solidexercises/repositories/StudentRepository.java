package nl.cynetic.solidexercises.repositories;

import nl.cynetic.solidexercises.entities.Student;

public interface StudentRepository {
    void add(Student student);
    boolean exists(String emailAddress);
}