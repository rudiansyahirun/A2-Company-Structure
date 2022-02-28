package trying;

public class BusinessEmployee extends Employee {
    private double bonusBudget;

    public BusinessEmployee(String name) {
        // has a default salary of 50000
        super(name, 50000);
        this.bonusBudget = 0;
    }

    public double getBonusBudget() { // getter
        // establish a running tally of the remaining bonusBuget
        // for the team this employee supports
        // the budget is determined will depend on which type of BusinessEmployee
        return this.bonusBudget;
    }

    public void setBonusBudget(double bonusBudget) { // setter
        this.bonusBudget = bonusBudget;
    }
/*-------------------------------------------------------------------*/

    public String employeeStatus() {
        // reduce the double to 2 decimals
        String convert = String.format("%.2f", bonusBudget);
        return this + " with a budget of " + convert;
    }
}
