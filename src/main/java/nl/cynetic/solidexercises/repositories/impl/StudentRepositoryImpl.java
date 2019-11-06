package nl.cynetic.solidexercises.repositories.impl;

import nl.cynetic.solidexercises.entities.Student;
import nl.cynetic.solidexercises.repositories.StudentRepository;

public class StudentRepositoryImpl implements StudentRepository {
    
    @Override
    public void add(Student student)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean exists(String emailAddress)
    {
        throw new UnsupportedOperationException();
    }
}