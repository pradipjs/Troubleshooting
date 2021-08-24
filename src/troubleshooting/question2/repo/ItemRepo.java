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
        Item    itemToBeAdded   =   getItemById(item.getId());
        
        if (itemToBeAdded == null)
        {
            items.add(item);
        }
        else
        {
            itemToBeAdded.setName(item.getName());
        }
        
        System.out.println(items);
    }

    public void removeItemById(int itemId)
    {
        Item    item    =   getItemById(itemId);
        
        if (item != null)
        {
            items.remove(item);
        }
    }

    public Item getItemById(int itemId)
    {
        for (Item item : items)
        {
            if (item.getId() == itemId)
            {
                return item;
            }
        }
        
        return null;
    }
}
