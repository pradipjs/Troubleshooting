package troubleshooting.models;

/**
 *
 * @author Pradip J. Sabhadiya<pradip@oneit.com.au>
 */
public class Student extends Person
{
    private double fee;

    public double getFee()
    {
        return fee;
    }

    public void setFee(double fee)
    {
        this.fee = fee;
    }
}
