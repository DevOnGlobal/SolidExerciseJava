package nl.cynetic.solidexercises.services.impl;

import java.util.List;
import java.util.UUID;

import nl.cynetic.solidexercises.entities.Student;
import nl.cynetic.solidexercises.entities.University;
import nl.cynetic.solidexercises.entities.UniversityPackage;
import nl.cynetic.solidexercises.repositories.StudentRepository;
import nl.cynetic.solidexercises.repositories.UniversityRepository;
import nl.cynetic.solidexercises.services.Logger;
import nl.cynetic.solidexercises.services.StudentService;

public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
    private UniversityRepository universityRepository;
    private Logger logger;

    public StudentServiceImpl(StudentRepository studentRepository, UniversityRepository universityRepository,
            Logger logger) {
        this.studentRepository = studentRepository;
        this.universityRepository = universityRepository;
        this.logger = logger;
    }

    public boolean add(String emailAddress, UUID universityId)
    {       
        logger.logMessage("Log: Start add student with email '%s'", emailAddress);
 
        if ("".equals(emailAddress) || emailAddress == null)
        {
            return false;
        }
 
        if (studentRepository.exists(emailAddress))
        {
            return false;
        }
        
        University university = universityRepository.getById(universityId);
        Student student = new Student(emailAddress, universityId, university.getUniversityPackage());
         
        studentRepository.add(student);
 
        logger.logMessage("Log: End add student with email '%s'", emailAddress);
 
        return true;
    }
     
    public List<Student> getStudentsByUniversity()
    {
        //...
        throw new UnsupportedOperationException();
    }
 
    public List<Student> getStudentsByCurrentlyBorrowedEbooks()
    {
        //...
        throw new UnsupportedOperationException();       
    }
}