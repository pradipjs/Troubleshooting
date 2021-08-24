package troubleshooting.repo;

import java.util.ArrayList;
import java.util.List;
import troubleshooting.models.Person;
import troubleshooting.utils.Utils;

/**
 *
 * @author Pradip J. Sabhadiya<pradip@oneit.com.au>
 */
public class PersonRepo<T extends Person>
{
    private List<T> data    = new ArrayList<>();

    public void add(T t)
    {
        data.add(t);
    }
    
    public T searchByName(String name)
    {
        for (T t : data)
        {
            if (Utils.equalsIgnoreCase(name, t.getName()))
            {
                return t;
            }
        }
        
        return null;
    }
}
