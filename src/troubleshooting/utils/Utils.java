package troubleshooting.utils;

/**
 *
 * @author Pradip J. Sabhadiya<pradip@oneit.com.au>
 */
public class Utils
{
    public static boolean equalsIgnoreCase(String s1, String s2)
    {
        if (s1 == null)
        {
            return s2 == null;
        }
        else
        {
            return s1.equalsIgnoreCase(s2);
        }
    }
}
