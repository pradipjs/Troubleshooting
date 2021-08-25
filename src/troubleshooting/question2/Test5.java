package troubleshooting.question2;

import java.util.concurrent.CompletionStage;
import troubleshooting.question2.models.Item;
import troubleshooting.question2.repo.ItemRepo;

/**
 * 5. Provide an alternative implementation putItemAlt(Item item) to use a java.util.concurrent.CompletionStage as return value instead of using a callback parameter to inform caller about the completion of the operation.
 * @author Pradip J. Sabhadiya<pradip@oneit.com.au>
 */
public class Test5
{
    public static void main(String[] args)
    {
        ItemRepo repo = new ItemRepo();
        
        CompletionStage<Void>   itemToBeAdded   =   repo.putItemAlt(new Item(1001, "Joe"));
        itemToBeAdded.thenRun(() ->
        {
            System.out.println("Item added successfully.");
        });
    }
}
