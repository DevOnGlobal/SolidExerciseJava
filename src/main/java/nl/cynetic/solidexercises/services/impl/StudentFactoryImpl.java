package nl.cynetic.solidexercises.services.impl;

import nl.cynetic.solidexercises.entities.*;
import nl.cynetic.solidexercises.services.StudentFactory;

public class StudentFactoryImpl implements StudentFactory {
    
    @Override
    public Student createStudent(String emailAddress, University university) {
        
        if (university.getUniversityPackage() == UniversityPackage.PREMIUM) {
            return new PremiumStudent(emailAddress, university.getId());
        }

        return new StandardStudent(emailAddress, university.getId());
    }
}