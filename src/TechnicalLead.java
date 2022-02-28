import java.util.ArrayList;

public class TechnicalLead extends TechnicalEmployee {
    public ArrayList<SoftwareEngineer> team;

    public TechnicalLead(String name) {
        /*
        Should create a new TechnicalLead that is a Manager.
        The TechnicalLead's base salary should be 1.3 times that of a
        TechnicalEmployee. TechnicalLeads should have a default head count of 4
        */
        super(name);
        this.team = new ArrayList<SoftwareEngineer>();
        // base salary * 1.3
        this.baseSalary *= 1.3;
        // default head count of 4
        this.headCount = 4;
    }
    public boolean hasHeadCount() {
        /*
        Should return true if the number of direct reports this manager has
        is less than their headcount.
        */
        return team.size() < headCount;
    }
    public boolean addReport(SoftwareEngineer e) {
        /*
        Should accept the reference to a SoftwareEngineer object,
        and if the TechnicalLead has head count left
        should add this employee to their list of direct reports.
        If the employee is successfully added to the TechnicalLead's direct reports
        true should be returned, false should be returned otherwise
        */
        if (hasHeadCount()) { // if head count is less than 4
            team.add(e); // add to team
            e.setManager(this);
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
        super.checkIns++; // increment checkIns
        return e.getManager() == this && e.getCodeAccess(); // if manager is this and code access is true
    }
    public boolean requestBonus(Employee e, double bonus) {
        /*
        Should check if the bonus amount requested would be approved by
        the BusinessLead supporting this TechnicalLead.
        If it is, that employee should get that bonus and true should be returned.
        False should be returned otherwise
        */
        BusinessLead businessLead = (BusinessLead)getAccountantSupport().getManager(); // get business lead
        return businessLead.approveBonus(e, bonus); // if business lead approves bonus
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
        if (team.size() == 0) { // if team size is 0
            return this.employeeStatus() + " and no direct reports yet"; // return employee status and no direct reports
        } else { // if team size is not 0
            String teamStatus = ""; // initialize team status
            for (int i = 0; i < team.size(); i++) { // for each team member
                teamStatus += team.get(i).employeeStatus() + "\n"; // add team member status to team status
            }
            return this.employeeStatus() + " is managing: \n" + teamStatus; // return employee status and team status
        }
    }
}
