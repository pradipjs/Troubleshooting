package troubleshooting;

import troubleshooting.models.Staff;
import troubleshooting.models.Student;
import troubleshooting.repo.PersonRepo;

/**
 *
 * @author Pradip J. Sabhadiya<pradip@oneit.com.au>
 */
public class Test6
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
        
        Student filteredStudent =   personRepo.searchByName("Pradip", Student.class);
        Staff   filteredStaff   =   personRepo.searchByName("Sir", Staff.class);
        
        System.out.println(filteredStudent);
        System.out.println(filteredStaff);
    }
}
