package nl.cynetic.solidexercises.services.impl;

import java.util.List;
import java.util.UUID;

import nl.cynetic.solidexercises.entities.LimitedStudent;
import nl.cynetic.solidexercises.entities.Student;
import nl.cynetic.solidexercises.entities.University;
import nl.cynetic.solidexercises.repositories.StudentRepository;
import nl.cynetic.solidexercises.repositories.UniversityRepository;
import nl.cynetic.solidexercises.services.Logger;
import nl.cynetic.solidexercises.services.StudentFactory;
import nl.cynetic.solidexercises.services.StudentWriterService;

public class StudentWriterServiceImpl implements StudentWriterService {

    private StudentRepository studentRepository;
    private UniversityRepository universityRepository;
    private Logger logger;
    private StudentFactory studentFactory;

    public StudentWriterServiceImpl(StudentRepository studentRepository, UniversityRepository universityRepository,
            StudentFactory studentFactory, Logger logger) {
        this.studentRepository = studentRepository;
        this.universityRepository = universityRepository;
        this.studentFactory = studentFactory;
        this.logger = logger;
    }

    @Override
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
        Student student = studentFactory.createStudent(emailAddress, university);
         
        studentRepository.add(student);
 
        logger.logMessage("Log: End add student with email '%s'", emailAddress);
 
        return true;
    }
    
    @Override
    public void addBonusAllowances()
    {
        for (Student student : getStudents())
        {
            if (student instanceof LimitedStudent) {
                LimitedStudent limitedStudent = (LimitedStudent)student;
                limitedStudent.increaseBonusAllowance();
            }
        }
    }

    private List<Student> getStudents() {
        //...
        throw new UnsupportedOperationException();
    }
}