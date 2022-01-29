import java.util.List;

public class Accountant {
    private String name;
    private double bonusBudget;
    private Object teamSupported;

    public Accountant(String name) {
        /*
        Should start with a bonus budget of 0 and no team they are officially supporting
        */
        this.name = name;
        this.bonusBudget = 0.0;
        this.teamSupported = null;
    }
    public TechnicalLead getTeamSupported() {
        /*
        Should return a reference to the TechnicalLead that
        this Accountant is currently supporting.
        If they have not been assigned a TechnicalLead, null should be returned
        */
        if (this.teamSupported == null) {
            return null;
        } else {
            return (TechnicalLead) this.teamSupported;
        }
    }
    public void supportTeam(TechnicalLead lead) {
        /*
        Should allow a reference to a TechnicalLead to be passed and saved.
        Once this happens the Accountant's bonus budget should be updated to be
        the total of each SoftwareEngineer's base salary
        that reports to that TechnicalLead plus 10%.
        For example, if the TechnicalLead supports 2 SoftwareEngineers,
        each with a salary of 75000, the Accountant's budget
        should be 150000 + 15000 for a total of 165000
        */
        // reference to the TechnicalLead that this Accountant is supporting
        this.teamSupported = lead;
        // the bonus budget for this Accountant
        double bonusBudget = 0.0;
        // the list of SoftwareEngineers that this Accountant is supporting
        List<SoftwareEngineer> list = lead.getDirectReports();
        // iterate through the list of SoftwareEngineers
        for (SoftwareEngineer engineer : list) {
            // add the base salary of each SoftwareEngineer to the bonus budget
            bonusBudget += engineer.getBaseSalary();
        }
        // add 10% of the bonus budget to the bonus budget
        bonusBudget += (bonusBudget * 0.1);
        // set the bonus budget for this Accountant
        this.bonusBudget = bonusBudget;
    }
    public boolean approveBonus(double bonus) {
        /*
        Should take in a suggested bonus amount and check if
        there is still enough room in the budget.
        If the bonus is greater than the remaining budget,
        false should be returned, otherwise true.
        If the accountant is not supporting any team false should be returned.
        */
        // take in a suggested bonus amount and check if there is still enough room in the budget
        if (bonus > this.bonusBudget) {
            return false;
        } else {
            return true;
        }
    }
    public String employeeStatus() {
        /*
        Should return a String representation of this Accountant
        that includes their ID, name, the size of their currently managed budget
        and the name of the TechnicalLead they are currently supporting.
        Example: "1 Kasey with a budget of 22500.0 is supporting Satya Nadella"
        */
        // the String representation of this Accountant
        String status = "";
        // the ID of this Accountant
        status += this.getEmployeeID();
        // the name of this Accountant
        status += " " + this.getName();
        // the budget of this Accountant
        status += " with a budget of " + this.getBonusBudget();
        // the name of the TechnicalLead that this Accountant is supporting
        status += " is supporting " + this.getTeamSupported().getName();
        return status;
    }

    private String getBonusBudget() {
        return String.valueOf(this.bonusBudget);
    }

    private String getName() {
        return this.name;
    }

    private String getEmployeeID() {
        return "1";
    }
}