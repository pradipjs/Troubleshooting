package troubleshooting.question2.repo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.logging.Level;
import java.util.logging.Logger;
import troubleshooting.question2.listeners.Listener;
import troubleshooting.question2.models.Item;

/**
 *
 * @author Pradip J. Sabhadiya<pradip@oneit.com.au>
 */
public class ItemRepo
{
    private Set<Item> items = new HashSet<>();
    private List<Listener> listerners = new ArrayList<>();
    
    public void addListener(Listener listener)
    {
        listerners.add(listener);
    }
    
    private Runnable putItemRunnable(Item item) throws InterruptedException
    {
        return () -> { actualPutItem(item); };
    }

    public void putItem(Item item, Callable<Void> func) throws InterruptedException, Exception
    {
        Thread  thread  =   new Thread(putItemRunnable(item));
        
        thread.start();
        thread.join();
        
        func.call();
    }
    
    public CompletionStage<Void> putItemAlt(Item item)
    {
        CompletionStage<Void>   stage   =   CompletableFuture.runAsync(() -> { actualPutItem(item); });
        
        ((CompletableFuture) stage).join();
        
        return stage;
    }

    private synchronized void actualPutItem(Item item)
    {
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException ex)
        {
            Logger.getLogger(ItemRepo.class.getName()).log(Level.SEVERE, null, ex);
        }

        Item itemToBeAdded = getItemById(item.getId());

        if (itemToBeAdded == null)
        {
            items.add(item);
        }
        else
        {
            itemToBeAdded.setName(item.getName());
        }
        
        for (Listener listener : listerners)
        {
            listener.itemPut(item);
        }
    }

    public void removeItemById(int itemId)
    {
        Item item = getItemById(itemId);

        if (item != null)
        {
            items.remove(item);
            
            for (Listener listener : listerners)
            {
                listener.itemRemoved(item);
            }
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
