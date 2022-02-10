package cobaFollowRecordingStage2;

public class Accountant extends Employee {
    protected double bonusBudget;
    private TechnicalLead teamSupported;
    
    public Accountant(String name) {
        /*
        Should start with a bonus budget of 0 and no team they are officially supporting
        */
        super(name, baseSalary);
        this.setBonusBudget(0); // set the budget amount as zero
    }
    private void setBonusBudget(double bonusBudget) {
        /*
        Should set the bonus budget to the given amount
        */
        this.bonusBudget = bonusBudget;
    }
    
    public TechnicalLead getTeamSupported() {
        /*
        Should return a reference to the TechnicalLead that
        this Accountant is currently supporting.
        If they have not been assigned a TechnicalLead, null should be returned
        */
        // return the team supported
        // support team will be assigned by the business lead
        // while addReport
        return teamSupported;
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
        this.teamSupported = lead;
        // set the bonus budget as sum of technical lead's team salary plus 10%
        double budget = 0;
        for (SoftwareEngineer e: lead.getTeam()) { // iterate the TechnicalLead's team
            budget += e.getBaseSalary(); // add their base salary
        }
        budget += budget * 1.1; // 10% = .1, 100% = 1
        this.setBonusBudget(budget);
    }
    
    public boolean approveBonus(double bonus) {
        /*
        Should take in a suggested bonus amount and check if
        there is still enough room in the budget.
        If the bonus is greater than the remaining budget,
        false should be returned, otherwise true.
        If the accountant is not supporting any team false should be returned.
        */
        // check the requested bonus amount is within budget?
        // if yes, then return true, else return false
        if (bonus <= this.getBonusBudget()) {
            return true;
        } else {
            return false;
        }
    }
    private double getBonusBudget() {
        return 0;
    }
    public String employeeStatus() {
        /*
        Should return a String representation of this Accountant
        that includes their ID, name, the size of their currently managed budget
        and the name of the TechnicalLead they are currently supporting.
        Example: "1 Kasey with a budget of 22500.0 is supporting Satya Nadella"
        */
        String result;
        result = super.employeeStatus();
        result += " supporting " + teamSupported.getName();
        return result;
    }
}