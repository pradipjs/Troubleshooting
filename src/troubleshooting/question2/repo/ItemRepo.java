package troubleshooting.question2.repo;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import troubleshooting.question2.models.Item;

/**
 *
 * @author Pradip J. Sabhadiya<pradip@oneit.com.au>
 */
public class ItemRepo
{
    private Set<Item> items = new HashSet<>();

    public void putItem(Item item, Callable<Void> func) throws InterruptedException, Exception
    {
        Runnable r = () ->
        {
            try
            {
                actualPutItem(item);
            }
            catch (InterruptedException ex)
            {
                Logger.getLogger(ItemRepo.class.getName()).log(Level.SEVERE, null, ex);
            }
        };
        
        Thread t    =   new Thread(r);
        t.start();
        t.join();
        
        func.call();
    }

    private synchronized void actualPutItem(Item item) throws InterruptedException
    {
        // Simulate an expensive operation
        Thread.sleep(2000);

        Item itemToBeAdded = getItemById(item.getId());

        if (itemToBeAdded == null)
        {
            items.add(item);
        } else
        {
            itemToBeAdded.setName(item.getName());
        }
    }

    public void removeItemById(int itemId)
    {
        Item item = getItemById(itemId);

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
