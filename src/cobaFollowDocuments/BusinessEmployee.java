package cobaFollowDocuments;
public class BusinessEmployee extends Employee {
    public BusinessEmployee(String name) {
        // Has a default salary of 50000.0
        super(name, 50000.0);
    }
    public double getBonusBudget() {
        /*
        Should establish a running tally of the remaining bonusBudget for the team this employee supports.
        How that budget is determined will depend on which type of Business Employee
        */

    }
    @Override
    public String employeeStatus() {
        /*
        Should return a String representation of this BusinessEmployee
        that includes their ID, name and the size of their currently
        managed budget. Example: "1 Kasey with a budget of 22500.0"
        */
        String result = String.format("%d $s with a budget of %d", this.getEmpolyeeID(), this.getName(), this.getBonusBudget());
        return result;
    }

}
