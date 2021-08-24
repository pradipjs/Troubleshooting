package troubleshooting.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import troubleshooting.models.Person;

/**
 *
 * @author Pradip J. Sabhadiya<pradip@oneit.com.au>
 */
public class PersonRepo
{
    private Map<Class<? extends Person>, List<? extends Person>>  data    =   new HashMap<>();

    public <T extends Person> void addPerson(T person)
    {
        List<T> personsList =   (List<T>) data.getOrDefault(person.getClass(), new ArrayList<T>());
        
        personsList.add(person);
        
        data.put(person.getClass(), personsList);
    }
}
