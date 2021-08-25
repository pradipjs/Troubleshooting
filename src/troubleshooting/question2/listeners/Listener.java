package troubleshooting.question2.listeners;

import java.io.Closeable;
import troubleshooting.question2.models.Item;

/**
 *
 * @author Pradip J. Sabhadiya<pradip@oneit.com.au>
 */
public interface Listener extends Closeable
{
    void itemPut(Item item);

    void itemRemoved(Item item);
}
