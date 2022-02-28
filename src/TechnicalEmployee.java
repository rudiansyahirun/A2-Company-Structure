public class TechnicalEmployee extends Employee {
    public int checkIns;

    public TechnicalEmployee(String name) {
        // Has a default base salary of 75000.0
        super(name, 75000);
        checkIns = 0; // Initialize checkIns to 0
    }

    public String employeeStatus() {
        /*
        Should return a String representation of this TechnicalEmployee
        Example: "1 Kasey has 10 successful check ins"
        */
        return super.toString() + " has " + this.checkIns + " successful check ins";
    }

    public void setCheckIns() {
        checkIns++;
    }
}
