package troubleshooting.question2;

import java.util.concurrent.CompletionStage;
import troubleshooting.question2.listeners.Listener;
import troubleshooting.question2.models.Item;
import troubleshooting.question2.repo.ItemRepo;

/**
 * 6. Add a method addListener(Listener listener) to ItemRepo that adds a listener (multiple listeners can be added) to the repo. Do proper modifications so that listeners would be informed about all put/remove events.
 * @author Pradip J. Sabhadiya<pradip@oneit.com.au>
 */
public class Test6
{
    public static void main(String[] args)
    {
        ItemRepo repo = new ItemRepo();
        
        repo.addListener(new Listener()
        {
            @Override
            public void itemPut(Item item)
            {
                System.out.println("Listender handled item put.");
            }

            @Override
            public void itemRemoved(Item item)
            {
                System.out.println("Listender handled item removed.");
            }
        });
        
        CompletionStage<Void>   itemToBeAdded   =   repo.putItemAlt(new Item(1001, "Joe"));
        itemToBeAdded.thenRun(() ->
        {
            System.out.println("Item added successfully.");
        });
    }
}
