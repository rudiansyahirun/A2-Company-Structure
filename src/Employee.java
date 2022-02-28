public abstract class Employee {
//    public double budget;
    public int headCount = 0;
    // declare
    public String name;
    public double baseSalary;
    public double bonus;
    public double bonusBudget;
    public int employeeID;
    // employee's next id
    private static int nextID = 1;
    // employee's manager
    public Employee manager;
    public Accountant accountantSupport;


    public Employee(String name,double baseSalary) {
        // Construct Employee with two parameters name and base salary
        this.name = name;
        this.baseSalary = baseSalary;
        this.employeeID = nextID;
        nextID++; // increment nextID
    }
    public double getBaseSalary() {
        // Should return the employee's base salary
        return this.baseSalary;
    }
    public String getName() {
        // Should return the employee's name
        return this.name;
    }
    public int getEmployeeID() {
        // Should return the employee's ID.
        return this.employeeID;
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
        // Should set this employee's manager to the passed in Employee object.
        this.manager = manager;
    }
    public Accountant getAccountantSupport() {
        // Should return a reference to the Accountant object that
        // represents this employee's accountant support
        return accountantSupport;
    }
    public boolean equals(Employee other) {
        // should return true if the two employee's ID are the same, false otherwise
        return this.getEmployeeID() == other.getEmployeeID();
    }
    public String toString() {
        /*
        Should return a String representation of the employee that
        is a combination of their id followed by their name.
        Example: "1 Kasey"
        */
        return getEmployeeID() + " " + getName();
    }
    // abstract employee's status
    public abstract String employeeStatus();
    // public void getBonus
    public void getBonus() {
    }
}
