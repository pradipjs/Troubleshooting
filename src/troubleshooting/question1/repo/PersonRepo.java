package troubleshooting.question1.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import troubleshooting.question1.models.Person;
import troubleshooting.utils.Utils;

/**
 *
 * @author Pradip J. Sabhadiya<pradip@oneit.com.au>
 */
public class PersonRepo
{
    private Map<Class, List<? extends Person>>  data    =   new HashMap<>();

    public <T extends Person> void addPerson(T person)
    {
        List<T> personsList =   getPersons((Class<T>) person.getClass());

        personsList.add(person);

        data.put(person.getClass(), personsList);
    }
    
    protected <T extends Person> List<T> getPersons(Class<T> kind)
    {
        if (!data.containsKey(kind))
        {
            data.put(kind, new ArrayList<T>());
        }
        
        return (List<T>) data.get(kind);
    }

    public <T extends Person> T searchByName(String name, Class<T> kind)
    {
        List<T> personsList =   getPersons(kind);
        
        for (T t : personsList)
        {
            if (Utils.equalsIgnoreCase(name, t.getName()))
            {
                return t;
            }
        }
        
        return null;
    }
}
