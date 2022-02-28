package trying;

public class TechnicalEmployee extends Employee {
    private int checkIns;

    public TechnicalEmployee(String name) {
        // has a default base salary of 75000
        super(name, 75000);
        checkIns = 0;
    }
/*------------------------------------------------------------*/
    public int getCheckIns() { // getter
        return checkIns;
    }

    public void setCheckIns(int checkIns) { // setter
        this.checkIns = checkIns;
    }
    public void checkIn() {
        checkIns++;
    }
/*------------------------------------------------------------*/
    public String employeeStatus() {
        // return a String representation of this TechnicalEmployee
        return super.toString() + " has " + checkIns + " successful check ins";
    }

}
