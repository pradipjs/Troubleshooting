package troubleshooting.question2.repo;

import java.util.HashSet;
import java.util.Set;
import troubleshooting.question2.models.Item;

/**
 *
 * @author Pradip J. Sabhadiya<pradip@oneit.com.au>
 */
public class ItemRepo
{
    private Set<Item> items = new HashSet<>();

    public void putItem(Item item)
    {
        items.add(item);
    }

    public void removeItemById(int itemId)
    {
        // TODO
    }

    public Item getItemById(int itemId)
    {
        // TODO
    }
}
