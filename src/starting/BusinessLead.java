package starting;

public class BusinessLead {
    public BusinessLead(String name) {
        /*
        Should create a new starting.BusinessLead that is a Manager.
        The starting.BusinessLead's base salary should be twice that of an starting.Accountant.
        They should start with a head count of 10.
        */

    }
    public boolean hasHeadCount() {
        /*
        should return true if the number of direct reports this manager has
        is less than their headcount.
        */

    }
    public boolean addReport(Accountant e, TechnicalLead supportTeam) {
        /*
        Should accept the reference to an starting.Accountant object,
        and if the starting.BusinessLead has head count left
        should add this employee to their list of direct reports.
        If the employee is successfully added to the starting.BusinessLead's direct reports
        true should be returned, false should be returned otherwise.
        Each time a report is added the starting.BusinessLead's bonus budget should be increased
        by 1.1 times that new employee's base salary.
        That employee's team they are supporting should be updated to reflect
        the reference to the starting.TechnicalLead given.
        If the employee is successfully added true should be returned, false otherwise.
        */

    }
    public boolean requestBonus(Employee e, double bonus) {
        /*
        Should check if the bonus amount requested would fit
        in current starting.BusinessLead's budget.
        If it is, that employee should get that bonus,
        the BusinessLeader's budget should be deducted and true should be returned.
        False should be returned otherwise
        */

    }
    public boolean approveBonus(Employee e, double bonus) {
        /*
        This function should look through the Accountants the starting.BusinessLead manages,
        and if any of them are supporting the starting.TechnicalLead that is the manager of
        the starting.Employee passed in then the starting.Accountant's budget should be consulted
        to see if the bonus could be afforded.
        If the team can afford the bonus it should be rewarded and true returned, false otherwise.
        */

    }
}
