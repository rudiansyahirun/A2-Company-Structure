package cobaFollowRecordingStage2;

import java.util.ArrayList;

public class BusinessLead extends BusinessEmployee {
    // private int headCount;
    public ArrayList<Accountant> team;

    public BusinessLead(String name) {
        /*
        Should create a new BusinessLead that is a Manager.
        The BusinessLead's base salary should be twice that of an Accountant.
        They should start with a head count of 10.
        */
        // the BusinessLead's base salary should be twice of an Accountant
        // set initial headCount as 10
        super(name);
        this.setBaseSalary(getBaseSalary() * 2);
        this.headCount = 10;
        this.team = new ArrayList<Accountant>();
    }
    public boolean hasHeadCount() {
        /*
        should return true if the number of direct reports this manager has
        is less than their headcount.
        */
        return (this.team.size() < this.headCount);
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
        // if BusinessLead has headCount
        //   add accountant to BusinessLead's team
        //   set the BusinessLead as Accountant's manager
        //   set the TechnicalLead as Accountant's support team
        //   set Accountant as TechnicalLead to request bonus
        //   increase the budget amount by 1.1 times of the new employee's base salary
        //   return true
        // else
        //   return false
        if (hasHeadCount()) { // check whether the BusinessLead has the capacity?
            team.add(e); // if yes then add under his/her team
            e.setManager(this); // BusinessLead becomes the manager of the Accountant
            e.supportTeam(supportTeam); // set Accountant's teamSupported
            supportTeam.setAccountant(e); // set the accountant of the technical lead
            this.setBonusBudget (this.getBaseSalary() + (e.getBaseSalary() * 1.1)); // increase the budget
            return true;
        } else {
            return false; // if no capacity, he/she won't accept
        }
    }
    public boolean requestBonus(Employee e, double bonus) {
        /*
        Should check if the bonus amount requested would fit
        in current BusinessLead's budget.
        If it is, that employee should get that bonus,
        the BusinessLeader's budget should be deducted and true should be returned.
        False should be returned otherwise
        */
        // if requested bonus amount within BusinessLead's budget
        //    deduct the bonus amount from budget
        //    return true
        // else
        //    return false
        if (bonus <= this.getBonusBudget()) {
            this.setBonusBudget (this.getBonusBudget() - bonus);
            return true;
        } else {
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
        // if employee's TechnicalLead is supported by the Accountant
        //    and the Accountant is reporting to this BusinessLead
        //    check the Accountant can approveBonus
        //        deduct the bonus amount from Accountant's budget
        //        return true
        // else
        //    return false
        for (int i = 0; i < team.size();) {
            if ((team.get(i).getTeamSupported()).equals(e.manager) && team.get(i).approveBonus(bonus)) {
                e.bonus += bonus;
                team.get(i).bonusBudget -= bonus;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    public String getTeamStatus() {
        if (team.size() == 0) {
            return this.employeeStatus() + " and no direct reports yet.";
        } else {
            String teamStatus = "";
            for (int i = 0; i < team.size(); i++) {
                teamStatus += team.get(i).employeeStatus() + "\n";
            }
            return this.employeeStatus() + " and is managing: \n" + teamStatus;
        }
    }
}
