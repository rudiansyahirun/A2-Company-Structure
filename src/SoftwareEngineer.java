public class SoftwareEngineer {
    private boolean codeAccess;
    private int successfulCheckIns;

    public SoftwareEngineer(String name) {
        // Should start without access to code and with 0 code check ins
        this.codeAccess = false;
        this.successfulCheckIns = 0;
    }
    public boolean getCodeAccess() {
        /*
        * Should return whether this SoftwareEngineer
        * has access to make changes to the code base
        */
        return this.codeAccess;
    }
    public void setCodeAccess(boolean access) {
        /*
        Should allow an external piece of code to update the
        SoftwareEngineer's code privileges to either true or false
        */
        this.codeAccess = access;
        if (access) {
            this.successfulCheckIns++;
        }
    }
    public int getSuccessfulCheckIns() {
        /*
        Should return the current count of how many times this
        SoftwareEngineer has successfully checked in code
        */
        return this.successfulCheckIns;
    }
    public boolean checkInCode() {
        /*
        Should check if this SoftwareEngineer's manager approves of their check in.
        If the check in is approved their successful checkin count
        should be increased and the method should return "true".
        If the manager does not approve the check in the SoftwareEngineer's code
        access should be changed to false and the method should return "false"
        */
        return SoftwareEngineer.this.codeAccess;
    }

    public double getBaseSalary() {
        /*
        Should return the base salary for this SoftwareEngineer
        */
        return SoftwareEngineer.this.getBaseSalary();
    }

    public TechnicalLead getManager() {
        /*
        Should return the manager for this SoftwareEngineer
        */
        return SoftwareEngineer.this.getManager();
    }

    public boolean getCheckIn() {
        /*
        Should return whether this SoftwareEngineer has access to make changes to the code base
        */
        return SoftwareEngineer.this.getCheckIn();
    }
}
