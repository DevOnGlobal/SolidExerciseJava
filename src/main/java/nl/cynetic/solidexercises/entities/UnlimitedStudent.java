package nl.cynetic.solidexercises.entities;

import java.util.UUID;

public class UnlimitedStudent extends Student
{
    public UnlimitedStudent(String emailAddress, UUID universityId)
    {
        super(emailAddress, universityId);
        this.setMonthlyEbookAllowance(0);
    }
     
    @Override
    public void addBonusAllowance()
    {
        throw new UnsupportedOperationException();
    }
}