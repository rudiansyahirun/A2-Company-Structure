public class Employee {
    public Employee(String name,double baseSalary) {

    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public String getName() {
        return name;
    }
    public int getEmpolyeeID() {
        return empolyeeID;
    }
    public Employee getManager() {
        return manager;
    }
    public boolean equals(Employee other) {
        // should return true if the two employee's ID are the same, false otherwise

    }
    public String toString() {
        /*
        Should return a String representation of the employee that
        is a combination of their id followed by their name.
        Example: "1 Kasey"
        */

    }
    public String employeeStatus() {
        /*
        Should return a String representation of that Employee's
        current status. This will be different for every subclass of Employee
        */

    }
}
