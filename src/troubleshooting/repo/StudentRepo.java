package troubleshooting.repo;

import java.util.ArrayList;
import java.util.List;
import troubleshooting.models.Student;

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
        // TODO
    }
}
