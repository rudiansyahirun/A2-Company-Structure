import jdk.internal.icu.text.UnicodeSet;

public class BusinessLead {
    private String name;
    private double salary;
    private int headCount;

    public BusinessLead(String name) {
        /*
        Should create a new BusinessLead that is a Manager.
        The BusinessLead's base salary should be twice that of an Accountant.
        They should start with a head count of 10.
        */
        BusinessLead.this.name = name;
        BusinessLead.this.salary = 2 * Accountant.this.salary;
        BusinessLead.this.headCount = 10;
    }
    public boolean hasHeadCount() {
        /*
        should return true if the number of direct reports this manager has
        is less than their headcount.
        */
        UnicodeSet directReports = new UnicodeSet();
        if (directReports.size() < headCount) {
            return true;
        } else {
            return false;
        }
    }
    public boolean addReport(Accountant e, TechnicalLead supportTeam) {
        /*
        Should accept the reference to an Accountant object,
        and if the BusinessLead has head count left
        should add this employee to their list of direct reports.
        If the employee is successfully added to the BusinessLead's direct reports
        true should be returned, false should be returned otherwise.
        Each time a report is added the BusinessLead's bonus budget should be increased
        by 1.1 times that new employee's base salary.
        That employee's team they are supporting should be updated to reflect
        the reference to the TechnicalLead given.
        If the employee is successfully added true should be returned, false otherwise.
        */
        // accept the reference to an Accountant object
        // if the BusinessLead has head count left
        if (headCount > 0) {
            // add this employee to their list of direct reports
            getDirectReports().add((CharSequence) e);
            // If the employee is successfully added to the BusinessLead's direct reports
            if (getDirectReports().contains(e)) {
                // true should be returned
                return true;
            } else {
                // false should be returned otherwise
                return false;
            }
        } else {
            // false should be returned otherwise
            return false;
        }
    }

    private UnicodeSet getDirectReports() {
        /*
        Should return a reference to the list of direct reports.
        */
        return null;
    }

    public boolean requestBonus(Employee e, double bonus) {
        /*
        Should check if the bonus amount requested would fit
        in current BusinessLead's budget.
        If it is, that employee should get that bonus,
        the BusinessLeader's budget should be deducted and true should be returned.
        False should be returned otherwise
        */
        // check if the bonus amount requested would fit in current BusinessLead's budget
        if (bonus <= BusinessLead.this.salary) {
            // If it is, that employee should get that bonus
            e.setBonus(bonus);
            // the BusinessLeader's budget should be deducted
            BusinessLead.this.salary -= bonus;
            // true should be returned
            return true;
        } else {
            // false should be returned otherwise
            return false;
        }
    }
    public boolean approveBonus(Employee e, double bonus) {
        /*
        This function should look through the Accountants the BusinessLead manages,
        and if any of them are supporting the TechnicalLead that is the manager of
        the Employee passed in then the Accountant's budget should be consulted
        to see if the bonus could be afforded.
        If the team can afford the bonus it should be rewarded and true returned, false otherwise.
        */
        // look through the Accountants the BusinessLead manages
        for (Accountant accountant : getDirectReports()) {
            // if any of them are supporting the TechnicalLead that is the manager of
            // the Employee passed in then the Accountant's budget should be consulted
            // to see if the bonus could be afforded
            if (accountant.getTeamSupported().getManager() == e.getManager()) {
                // If the team can afford the bonus it should be rewarded
                accountant.getTeamSupported().setBonus(bonus);
                // true should be returned
                return true;
            }
        }
    }

    public boolean getTeamStatus() {
        // Should return true if the TechnicalLead has any direct reports
        // that are not supporting any other TechnicalLeads, false otherwise.
        // If there are no direct reports, return false.
        if (getDirectReports().size() == 0) {
            return false;
        } else {
            // If there are direct reports, check if any of them are not supporting any other TechnicalLeads
            for (Employee employee : getDirectReports()) {
                // if any of them are not supporting any other TechnicalLeads
                if (employee.getTeamSupported() == null) {
                    // return true
                    return true;
                }
            }
            // return false
            return false;
        }
    }
}
