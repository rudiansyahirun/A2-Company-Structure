import java.util.ArrayList;
import java.util.List;

public class TechnicalLead {
    private String name;
    private double baseSalary;
    private int headCount;
    private Employee manager;
    private double bonusBudget;

    public TechnicalLead(String name) {
        /*
        Should create a new TechnicalLead that is a Manager.
        The TechnicalLead's base salary should be 1.3 times that of a
        TechnicalEmployee. TechnicalLeads should have a default head count of 4
        */
        TechnicalLead.this.name = name;
        TechnicalLead.this.baseSalary = 1.3 * TechnicalEmployee.this.baseSalary;
        TechnicalLead.this.headCount = 4;
    }
    public boolean hasHeadCount() {
        /*
        Should return true if the number of direct reports this manager has
        is less than their headcount.
        */
        if (getDirectReports().size() < headCount) {
            return true;
        } else {
            return false;
        }
    }
    public boolean addReport(SoftwareEngineer e) {
        /*
        Should accept the reference to a SoftwareEngineer object,
        and if the TechnicalLead has head count left
        should add this employee to their list of direct reports.
        If the employee is successfully added to the TechnicalLead's direct reports
        true should be returned, false should be returned otherwise
        */
        if (hasHeadCount()) {
            return true;
        } else {
            return false;
        }
    }
    public boolean approveCheckIn(SoftwareEngineer e) {
        /*
        Should see if the employee passed in does report to this
        manager and if their code access is currently set to "true".
        If both those things are true, true is returned,
        otherwise false is returned.
        */
        if (e.getManager() == TechnicalLead.this && e.getCheckIn() == true) {
            return true;
        } else {
            return false;
        }
    }
    public boolean requestBonus(Employee e, double bonus) {
        /*
        Should check if the bonus amount requested would be approved by
        the BusinessLead supporting this TechnicalLead.
        If it is, that employee should get that bonus and true should be returned.
        False should be returned otherwise
        */
        if (bonus > BusinessLead.this.getBonusBudget()) {
            return false;
        } else {
            return true;
        }
    }

    public String getTeamStatus() {
        /*
        Should return a String that gives insight into this Manager and all their direct reports.
        It should return a string that is a combination of the TechnicalLead's employee status
        followed by each of their direct employee's status on subsequent lines.
        If the TechnicalLead has no reports it should print their employee status
        followed by the text " and no direct reports yet ".
        Example: "10 Kasey has 5 successful check ins and no direct reports yet".
        If the TechnicalLead does have reports, it might look something like
        "10 Kasey has 5 successful check ins and is managing: 5 Niky has 2 successful check ins"
        */
        // return a String that gives insight to this Manager and all their direct reports.
        return this.name + " has " + this.getSuccessfulCheckIns() + " successful check ins and is managing: " + this.getDirectReports();
    }

    private String getSuccessfulCheckIns() {
        /*
        Should return the number of successful check ins this TechnicalLead has had.
        */
        int successfulCheckIns = 0;
        for (SoftwareEngineer e : getDirectReports()) {
            successfulCheckIns += e.getSuccessfulCheckIns();
        }
        return Integer.toString(successfulCheckIns);
    }

    public List<SoftwareEngineer> getDirectReports() {
        /*
        Should return a list of all the direct reports of this TechnicalLead.
        */
        List<SoftwareEngineer> directReports = new ArrayList<>();
        for (Employee e : Employee.getAllEmployees()) {
            if (e instanceof SoftwareEngineer) {
                if (e.getManager() == this) {
                    directReports.add((SoftwareEngineer) e);
                } else {
                    continue;
                }
            } else {
                continue;
            }
        } return directReports;
    }

    public String getName() {
        /*
        Should return the name of this TechnicalLead.
        */
        return this.name;
    }

    public Employee getManager() {
        /*
        Should return the reference to the manager of this TechnicalLead.
        */
        return this.manager;
    }

    public void setBonus(double bonus) {
        /*
        Should set the bonus budget of this TechnicalLead to the bonus parameter.
        */
        this.bonusBudget = bonus;
    }
}