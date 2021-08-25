package troubleshooting.question2.listeners;

import troubleshooting.question2.models.Item;

/**
 *
 * @author Pradip J. Sabhadiya<pradip@oneit.com.au>
 */
public interface Listener
{
    void itemPut(Item item);

    void itemRemoved(Item item);
}
