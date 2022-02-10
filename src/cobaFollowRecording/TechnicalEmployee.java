package cobaFollowRecording;

public class TechnicalEmployee extends Employee {
    int checkIns;
    public TechnicalEmployee(String name) {
        // Has a default base salary of 75000.0
        super(name, 75000.0);
    }
    @Override
    public String employeeStatus() {
        /*
        Should return a String representation of this TechnicalEmployee
        Example: "1 Kasey has 10 successful check ins"
        */
        // String result = String.format("%d $s has %d successful check ins", this.getEmpolyeeID(), this.getName(), this.checkIns);
        // return result;
        // return "Technical Employee status";
        return this.getEmpolyeeID() + " " + this.getName() + " has " + this.checkIns + " successful check ins";
    }

}
