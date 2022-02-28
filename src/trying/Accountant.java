package trying;

public class Accountant extends BusinessEmployee{
    public TechnicalLead teamSupported;

    public Accountant(String name){
        super(name);
        bonusBudget = 0;
    }

    public TechnicalLead getTeamSupported(){
        // return a reference to the TechnicalLead object that this Accountant is supporting
        return teamSupported;
    }

    public void supportTeam(TechnicalLead lead){
        // allow a reference to a TechnicalLead object to be set
        this.teamSupported = lead;
        for (int i = 0; i < teamSupported.team.size(); i++){ // loop through the teamSupported's team
            this.bonusBudget += lead.team.get(i).getBaseSalary()*1.1;
            // add the base salary of each employee in the teamSupported's team to the bonusBudget
            // 1.1 is the bonus multiplier
        }
    }

    public boolean approveBonus(double bonus){
        // return true if the bonus is approved, false if not
        double requestedBonus = bonus;
        if (getBonusBudget() >= requestedBonus){ // if the bonusBudget is greater than the requested bonus
            return true;
        } else { // if the bonusBudget is less than the requested bonus
            System.out.println(" Rejected because Budget not sufficient");
            return false;
        }
    }

/*------------------------------------------------------------------------*/

    public String employeeStatus(){
        // return the status of this Accountant employee
        return this + " with a budget of " + getBonusBudget() + " and is supporting " + this.getTeamSupported();
    }
}
