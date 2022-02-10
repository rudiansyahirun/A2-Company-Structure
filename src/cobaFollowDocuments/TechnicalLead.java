package cobaFollowDocuments;
public class TechnicalLead extends TechnicalEmployee {
    public int headCount;
    private ArrayList<SoftwareEngineer> team = new ArrayList<>();

    public TechnicalLead(String name) {
        /*
        Should create a new TechnicalLead that is a Manager.
        The TechnicalLead's base salary should be 1.3 times that of a
        TechnicalEmployee. TechnicalLeads should have a default head count of 4
        */
        super(name);
        this.setBaseSalary(this.getBaseSalary()*1.3);
        this.headCount = 4;
    }
    public boolean hasHeadCount() {
        /*
        Should return true if the number of direct reports this manager has
        is less than their headcount.
        */
        if (team.size() < this.headCount) {
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
        if (hasHeadCount()) { // check whether the TechnicalLead has the capacity?
            team.add(e); // if yes then add under his/her team
            e.setManager(this); // TechnicalLead becomes the manager of the SoftwareEngineer
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
        // Reporting SoftwareEngineers are collected using ArrayList team
        // ArrayList is used to collect multiple objects
        // If the array list contains the parameter SoftwareEngineer e
        // then we can conclude that the SoftwareEngineer e is reporting to this TechnicalLead
        if ((team.contains(e)) && (e.getCodeAccess())) {
            this.setCheckIns(this.getCheckIns()+1);
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

    }
}
