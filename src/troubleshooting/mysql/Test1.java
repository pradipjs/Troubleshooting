package troubleshooting.mysql;

/**
 * Assuming that the data stored in skill_name in the user_skill table might be repeated for different users, what changes would you make to the database to normalize the skill_name and reduce repeat storage? Show the structure of the new table(s)
 * 
 * @author Pradip J. Sabhadiya<pradip@oneit.com.au>
 */
public class Test1
{
    public static void main(String[] args)
    {
        System.out.println("We will go with creating 3 tables");
        System.out.println("\n\n1. skill");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Field\t\t\t Type\t\t Null\t Key");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("id\t\t\t int(11) \t \t PRIMARY KEY");
        System.out.println("date_created\t\t datetime \t YES \t");
        System.out.println("last_modified\t\t timestamp(14) \t YES \t");
        System.out.println("skill_name\t\t char(255) \t YES \t");
        
        System.out.println("\n\n2. user");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Field\t\t\t Type\t\t Null\t Key");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("id\t\t\t int(11) \t \t PRIMARY KEY");
        System.out.println("date_created\t\t datetime \t YES \t");
        System.out.println("last_modified\t\t timestamp(14) \t YES \t");
        System.out.println("user_firstname\t\t char(255) \t YES \t");
        System.out.println("user_lastname\t\t char(255) \t YES \t");
        
        System.out.println("\n\n3. user_skill");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Field\t\t\t Type\t\t Null\t Key");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("user_id\t\t\t int(11) \t \t COMPOSITE KEY");
        System.out.println("skill_id\t\t int(11) \t \t COMPOSITE KEY");
        System.out.println("date_created\t\t datetime \t YES \t");
        System.out.println("last_modified\t\t timestamp(14) \t YES \t");
        System.out.println("skill_level\t\t char(255) \t YES \t");
        System.out.println("skill_usage\t\t char(255) \t YES \t");
        System.out.println("skill_last_used\t\t char(255) \t YES \t");
        System.out.println("user_skill_endorsed\t tinyint(1) \t YES \t");
    }
}
