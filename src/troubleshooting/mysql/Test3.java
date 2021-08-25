package troubleshooting.mysql;

/**
 * Given the following query, how could it be optimized? List all assumptions:
 *      select c.* FROM companies AS c JOIN users AS u USING(companyid) JOIN jobs AS j USING(userid) JOIN
 *      useraccounts AS ua USING(userid) WHERE j.jobid = 123;
 * @author Pradip J. Sabhadiya<pradip@oneit.com.au>
 */
public class Test3
{
    public static void main(String[] args)
    {
        System.out.println("Answer : ");
        System.out.println("SELECT companies.* FROM companies LEFT JOIN users ON users.companyid = companies.companyid LEFT JOIN jobs ON jobs.userid = users.userid WHERE jobs.jobid = 123");
        System.out.println("SELECT companies.* FROM companies WHERE companies.companyid IN (SELECT users.companyid FROM users WHERE users.userid IN (SELECT jobs.userid FROM jobs WHERE jobs.jobid = 123))");
        System.out.println("SELECT companies.* FROM companies, users, useraccounts, jobs WHERE companies.companyid = users.companyid AND user.userid = jobs.userid AND useraccounts.userid = users.userid AND jobs.jobid = 123");
    }
}
