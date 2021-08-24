package troubleshooting.models;

/**
 *
 * @author Pradip J. Sabhadiya<pradip@oneit.com.au>
 */
public class Staff
{
    private String name;
    private String address;
    private String school;
    private String clazz;
    private double sallary;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getSchool()
    {
        return school;
    }

    public void setSchool(String school)
    {
        this.school = school;
    }

    public String getClazz()
    {
        return clazz;
    }

    public void setClazz(String clazz)
    {
        this.clazz = clazz;
    }

    public double getSallary()
    {
        return sallary;
    }

    public void setSallary(double sallary)
    {
        this.sallary = sallary;
    }
}
