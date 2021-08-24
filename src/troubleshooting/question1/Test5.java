package troubleshooting.question1;

import troubleshooting.question1.models.Staff;
import troubleshooting.question1.models.Student;
import troubleshooting.question1.repo.PersonRepo;

/**
 *
 * @author Pradip J. Sabhadiya<pradip@oneit.com.au>
 */
public class Test5
{
    public static void main(String[] args)
    {
        PersonRepo  personRepo  =   new PersonRepo();
        Student     student     =   new Student();
        Staff       staff       =   new Staff();
        
        student.setName("Pradip");
        student.setAddress("Surat");
        student.setClazz("Graduated");
        student.setSchool("High School");
        
        staff.setName("Sir");
        staff.setAddress("Surat");
        staff.setClazz("Graduated");
        staff.setSchool("High School");
        
        personRepo.addPerson(student);
        personRepo.addPerson(staff);
    }
}
