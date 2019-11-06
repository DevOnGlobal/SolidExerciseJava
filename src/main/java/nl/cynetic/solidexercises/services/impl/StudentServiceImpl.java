package nl.cynetic.solidexercises.services.impl;

import java.util.List;
import java.util.UUID;

import nl.cynetic.solidexercises.entities.Student;
import nl.cynetic.solidexercises.entities.University;
import nl.cynetic.solidexercises.entities.UniversityPackage;
import nl.cynetic.solidexercises.repositories.StudentRepository;
import nl.cynetic.solidexercises.repositories.UniversityRepository;
import nl.cynetic.solidexercises.services.StudentService;

public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;
    private UniversityRepository universityRepository;

    public StudentServiceImpl(StudentRepository studentRepository, UniversityRepository universityRepository) {
        this.studentRepository = studentRepository;
        this.universityRepository = universityRepository;
    }

    public boolean add(String emailAddress, UUID universityId)
    {       
        System.console().writer().println(String.format("Log: Start add student with email '%s'", emailAddress));
 
        if ("".equals(emailAddress) || emailAddress == null)
        {
            return false;
        }
 
        if (studentRepository.exists(emailAddress))
        {
            return false;
        }
        
        University university = universityRepository.getById(universityId);
 
        Student student = new Student(emailAddress, universityId);
         
        if (university.getUniversityPackage() == UniversityPackage.STANDARD)
        {
            student.setMonthlyEbookAllowance(10);
        }
        else if (university.getUniversityPackage() == UniversityPackage.PREMIUM)
        {
            student.setMonthlyEbookAllowance(10 * 2);
        }                           
         
        studentRepository.add(student);
 
        System.console().writer().println(String.format("Log: End add student with email '%s'", emailAddress));
 
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