package troubleshooting.repo;

import java.util.ArrayList;
import java.util.List;
import troubleshooting.models.Staff;
import troubleshooting.utils.Utils;

/**
 *
 * @author Pradip J. Sabhadiya<pradip@oneit.com.au>
 */
public class StaffRepo
{
    private List<Staff> staffs = new ArrayList<>();

    public void addStaff(Staff s)
    {
        staffs.add(s);
    }

    public Staff searchByName(String name)
    {
        for (Staff staff : staffs)
        {
            if (Utils.equalsIgnoreCase(name, staff.getName()))
            {
                return staff;
            }
        }
        
        return null;
    }
}
