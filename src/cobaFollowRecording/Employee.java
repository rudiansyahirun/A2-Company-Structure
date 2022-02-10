package cobaFollowRecording;

public abstract class Employee {
    static int counter = 1;
    private String name;
    private double baseSalary;
    private int employeeID;
    private Employee manager;

    public Employee(String name,double baseSalary) {
        // Construct Employee with two parameters name and base salary
        this.name = name;
        this.baseSalary = baseSalary;
        this.employeeID = counter;
        ++counter;
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
        return this.employeeID + " " + this.name;
    }
    abstract public String employeeStatus();
    //{
        /*
        Should return a String representation of that Employee's
        current status. This will be different for every subclass of Employee
        */
    //}
}
