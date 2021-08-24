package troubleshooting;

/**
 * 2. Looking at the above defined classes we can notice that there are a lot in common between them, is such a redundancy a bad or good practice? why?
 * @author Pradip J. Sabhadiya<pradip@oneit.com.au>
 */
public class Test2
{
    public static void main(String[] args)
    {
        System.out.println("Question : Looking at the above defined classes we can notice that there are a lot in common between them, is such a redundancy a bad or good practice? why?");
        System.out.println("Answer : Redundancy is NOT a good practice. ");
        System.out.println("Reasons why redundant code is not a good practice : ");
        System.out.println("1. Lengthy code : Sometimes It doesn't make any difference in terms of performance but lesser line of code, easy to understand.");
        System.out.println("2. Poor code quality : When you need enhancement, you need to remember to do the same elsewhere too.");
        System.out.println("3. Easy to maintain : If you fix it at one place and it works elsewhere too.");
    }
}
