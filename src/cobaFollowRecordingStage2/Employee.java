package cobaFollowRecordingStage2;

public abstract class Employee {
    private String name;
    protected double baseSalary;
    private int employeeID;
    protected Employee manager;
    private static int counter;
    protected Accountant accountant;
    protected int headCount=0;
    protected double bonusBudget;
    protected double bonus;

    public Employee(String name,double baseSalary) {
        // Construct Employee with two parameters name and base salary
        this.name = name;
        this.baseSalary = baseSalary;
        this.employeeID = ++counter;
    }


    public double getBaseSalary() {
        // Should return the employee's base salary
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        // Should set the employee's base salary
        this.baseSalary = baseSalary;
    }
    

    public String getName() {
        // Should return the employee's name
        return name;
    }
    public int getEmpolyeeID() {
        // Should return the employee's ID.
        return employeeID;
        /*
        The ID should be issued on behalf of the employee at the
        time they are constructed. The first employee should have
        an ID of "1", the second "2" and so on.
        */
    }


    public Employee getManager() {
        /*
        Should return a reference to the Employee object that
        represents this employee's manager
        */
        return manager;
    }
    public void setManager(Employee manager) {
        /*
        Should set this employee's manager to the passed in
        Employee object.
        */
        this.manager = manager;
    }

    public Accountant getAccountantSupport() {
        /*
        Should return a reference to the Accountant object that
        represents this employee's accountant support
        */
        return accountantSupport;
    }

    public boolean equals(Employee other) {
        // should return true if the two employee's ID are the same, false otherwise
        if (this.employeeID == other.employeeID) {
            return true;
        } else {
            return false;
        }
    }
    public String toString() {
        /*
        Should return a String representation of the employee that
        is a combination of their id followed by their name.
        Example: "1 Kasey"
        */
        return employeeID + " " + name;
    }
    public String employeeStatus() {
        // TODO Auto-generated method stub
        return null;
    }
    //{
        /*
        Should return a String representation of that Employee's
        current status. This will be different for every subclass of Employee
        */
    //}


    public boolean approveBonus(double bonus) {
        return false;
    }
}
