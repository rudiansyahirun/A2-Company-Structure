public class SoftwareEngineer extends TechnicalEmployee {
    // declare code access
    public boolean codeAccess;

    public SoftwareEngineer(String name) {
        // Should start without access to code and with 0 code check ins
        super(name);
        // set code access to true
        setCodeAccess(true);
    }
    public boolean getCodeAccess() {
        /*
        * Should return whether this SoftwareEngineer
        * has access to make changes to the code base
        */
        return codeAccess;
    }
    public void setCodeAccess(boolean access) {
        /*
        Should allow an external piece of code to update the
        SoftwareEngineer's code privileges to either true or false
        */
        this.codeAccess = access;
    }
    public int getSuccessfulCheckIns() {
        /*
        Should return the current count of how many times this
        SoftwareEngineer has successfully checked in code
        */
        return checkIns;
    }
    public boolean checkInCode() {
        /*
        Should check if this SoftwareEngineer's manager approves of their check in.
        If the check in is approved their successful checkin count
        should be increased and the method should return "true".
        If the manager does not approve the check in the SoftwareEngineer's code
        access should be changed to false and the method should return "false"
        */
        TechnicalLead manager = (TechnicalLead) this.getManager(); // get manager
        // if manager approves check in
        if (manager.approveCheckIn(this)) {
            this.setCheckIns(); // increase successful check ins by 1 (from super class)
            // return true
            return true;
        } else {
            // change code access to false
            codeAccess = false;
            // return false
            return false;
        }
    }
}
