public class TechnicalEmployee {
    public TechnicalEmployee(String name) {
        // Has a default base salary of 75000.0
        this.name = name;
        this.successfulCheckIns = 0;
        this.baseSalary = 75000.0;
    }
    public String employeeStatus() {
        /*
        Should return a String representation of this TechnicalEmployee
        Example: "1 Kasey has 10 successful check ins"
        */
        return this.employeeID + " " + this.name + " has " + this.successfulCheckIns + " successful check ins";
    }
    public void setCheckIn(int checkIn) {
        this.successfulCheckIns = checkIn;
    }
    public int getCheckIn() {
        return this.successfulCheckIns;
    }
    public String getName() {
        return this.name;
    }
    public String getEmployeeID() {
        return this.employeeID;
    }
    public double getBaseSalary() {
        return this.baseSalary;
    }
    public double getSalary() {
        return this.baseSalary + (this.successfulCheckIns * 200);
    }
    private String name;
    private String employeeID;
    private int successfulCheckIns;
    private double baseSalary;
}
