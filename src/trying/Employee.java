package trying;

import org.jetbrains.annotations.NotNull;

public abstract class Employee {
    protected String name;
    protected double baseSalary;
    protected int employeeID;
    static int nextID = 1;
    protected Employee manager;

    public Employee(String name, double baseSalary){
        // parameters
        this.name = name;
        this.baseSalary = baseSalary;
        // employeeId should be issued on behalf of the company at the time they are constructed
        this.employeeID = nextID;
        ++nextID;
    }
    public String getName(){ // getter
        return name;
    }
    public double getBaseSalary(){ // getter
        return baseSalary;
    }
    public int getEmployeeID(){ // getter
        // employeeId should be issued on behalf of the company at the time they are constructed
        // the first employee should have employeeId 1, the second 2, and so on
        return employeeID;
    }

    public Employee getManager(){ // getter
        return manager;
    }
    public void setManager(Employee manager){ // setter
        this.manager = manager;
    }

    public boolean equals(Employee other){ // overrides Object.equals()
        // return true if this object is the same as other
        return this.getEmployeeID() == other.getEmployeeID();
    }
    public String toString(){ // overrides Object.toString()
        // return a string representation of this object
        // combination of their id followed by their name
        // example: "1 Kassey
        return employeeID + " " + name;
    }

    public abstract String employeeStatus(); // abstract method
    public void getBonus(){
    }
}
