package troubleshooting.repo;

import java.util.ArrayList;
import java.util.List;
import troubleshooting.models.Student;
import troubleshooting.utils.Utils;

/**
 *
 * @author Pradip J. Sabhadiya<pradip@oneit.com.au>
 */
public class StudentRepo
{
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s)
    {
        students.add(s);
    }

    public Student searchByName(String name)
    {
        for (Student student : students)
        {
            if (Utils.equalsIgnoreCase(name, student.getName()))
            {
                return student;
            }
        }
        
        return null;
    }
}
