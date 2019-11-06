package nl.cynetic.solidexercises.services;

import java.util.List;
import java.util.UUID;

import nl.cynetic.solidexercises.entities.Student;

public interface StudentService {
    boolean add(String emailAddress, UUID universityId);
    void addBonusAllowances();
    List<Student> getStudentsByUniversity();
    List<Student> getStudentsByCurrentlyBorrowedEbooks();
}