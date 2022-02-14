package starting;

public class Employee {
    public Employee(String name,double baseSalary) {
        // Construct starting.Employee with two parameters name and base salary

    }
    public double getBaseSalary() {
        // Should return the employee's base salary
    }
    public String getName() {
        // Should return the employee's name
    }
    public int getEmpolyeeID() {
        // Should return the employee's ID.
        /*
        The ID should be issued on behalf of the employee at the
        time they are constructed. The first employee should have
        an ID of "1", the second "2" and so on.
        */
    }
    public Employee getManager() {
        /*
        Should return a reference to the starting.Employee object that
        represents this employee's manager
        */
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
        Should return a String representation of that starting.Employee's
        current status. This will be different for every subclass of starting.Employee
        */
    }
}
