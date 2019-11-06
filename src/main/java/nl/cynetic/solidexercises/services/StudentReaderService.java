package nl.cynetic.solidexercises.services;

import java.util.List;

import nl.cynetic.solidexercises.entities.Student;

public interface StudentReaderService {
    List<Student> getStudentsByUniversity();
    List<Student> getStudentsByCurrentlyBorrowedEbooks();
}