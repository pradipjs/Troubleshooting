package troubleshooting.mysql;

/**
 * Recreate the query that returned the 10 rows of data supplied. Speculate on tables that would be needed that are not shown here
 * 
 * @author Pradip J. Sabhadiya<pradip@oneit.com.au>
 */
public class Test2
{
    public static void main(String[] args)
    {
        System.out.println("Query :: I have used full join for getting 10 records");
        System.out.println("SELECT user.user_firstname, user.user_lastname, skill.skill_name FROM user, user_skill, skill WHERE user.id = user_skill.user_id AND skill.id = user_skill.skill_id LIMIT 10");
    }
}
