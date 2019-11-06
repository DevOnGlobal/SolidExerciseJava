package nl.cynetic.solidexercises.services;

import nl.cynetic.solidexercises.entities.Student;
import nl.cynetic.solidexercises.entities.University;

public interface StudentFactory {
    Student createStudent(String emailAddress, University university);
}