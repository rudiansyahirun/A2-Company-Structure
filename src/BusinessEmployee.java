public class BusinessEmployee {
    public BusinessEmployee(String name) {
        // Has a default salary of 50000.0
        this.name = name;
        this.id = id;
        this.salary = 50000.0;
        this.bonusBudget = 0.0;
    }
    public double getBonusBudget() {
        /*
        Should establish a running tally of the remaining bonusBudget for the team this employee supports.
        How that budget is determined will depend on which type of Business Employee
        */
        return 0.0;
    }
    public void setBonusBudget(double bonusBudget) {
        this.bonusBudget = bonusBudget;
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }
    public String employeeStatus() {
        return name + " with ID " + id + " has a budget of " + bonusBudget;
    }
    private String name;
    private String id;
    private double salary;
    private double bonusBudget;
}
//    public String employeeStatus() {
//        /*
//        Should return a String representation of this BusinessEmployee
//        that includes their ID, name and the size of their currently
//        managed budget. Example: "1 Kasey with a budget of 22500.0"
//        */
//
//    }
//
//}
