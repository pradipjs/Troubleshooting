package troubleshooting.question2;

import troubleshooting.question2.models.Item;
import troubleshooting.question2.repo.ItemRepo;

/**
 *
 * @author Pradip J. Sabhadiya<pradip@oneit.com.au>
 */
public class Test2
{
    public static void main(String[] args)
    {
        ItemRepo repo = new ItemRepo();
        repo.putItem(new Item(1001, "Joe"));
        // Name 'Joe' was wrong name so we want to fix it as 'Jonathan'
        repo.putItem(new Item(1001, "Jonathan"));
        
        System.out.println("Question : Did statement on line 4 fix the name inserted item at line 2 or we have now a duplicate item? If we have duplicate item then how can we fix this problem? we need to have any two items with same id be treated as same one.");
        System.out.println("Anwser : We will have a duplicate item.");
        System.out.println("Solution 1 : You can call getItemById() method to get the existing first and If you find it, update in it.");
        System.out.println("Solution 2 : Manage using the putItem() function. First it will internally call the getItemById() method. If it finds any record, it will update in same, otherwise It will add a new one.");
    }
}
