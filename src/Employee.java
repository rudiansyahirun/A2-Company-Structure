public class Employee {
    private final String name;
    private double baseSalary;
    private int employeeID;
    private static int nextID = 1;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.employeeID = nextID;
        nextID++;
    }

    public static Employee[] getAllEmployees() {
        return new Employee[0];
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary() {
        return baseSalary;
    }

    public String toString() {
        return String.format("%s %s %.2f", getClass().getName(), name, baseSalary);
    }

    public int getSuccessfulCheckIns() {
        return 0;
    }

    public Employee getManager() {
        return null;
    }

    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other == this) {
            return true;
        }
        if (!(other instanceof Employee)) {
            return false;
        }
        Employee otherEmployee = (Employee) other;
        return this.employeeID == otherEmployee.employeeID;
    }
    public int hashCode() {
        return employeeID;
    }
    public void setBonus(double bonus) {
        baseSalary += bonus;
    }

    public boolean getTeamSupported() {
        if (getManager() == null) {
            return false;
        } else {
            return getManager().getTeamSupported();
        }
    }
}
//
//    public Employee(String name, double baseSalary) {
//        this.name = name;
//        this.baseSalary = baseSalary;
//    }
//    public double getBaseSalary() {
//        return baseSalary;
//    }
//    public String getName() {
//        return name;
//    }
//    public int getEmployeeID() {
//        return employeeID;
//    }
//    public Employee getManager() {
//        return manager;
//    }
//    public boolean equals(Employee other) {
//        // should return true if the two employee's ID are the same, false otherwise
//        if (this.employeeID == other.employeeID) {
//            return true; // if the two employee's ID are the same, return true
//        }
//        else { // if the two employee's ID are not the same, return false
//            return false;
//    }
//    public String toString() {
//        /*
//        Should return a String representation of the employee that
//        is a combination of their id followed by their name.
//        Example: "1 Kasey"
//        */
//        return this.empolyeeID + " " + this.name;
//    }
//    public String employeeStatus() {
//        /*
//        Should return a String representation of that Employee's
//        current status. This will be different for every subclass of Employee
//        */
//
//    }
//}
