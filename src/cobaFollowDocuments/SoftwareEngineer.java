package cobaFollowDocuments;
public class SoftwareEngineer {
    public SoftwareEngineer(String name) {
        // Should start without access to code and with 0 code check ins

    }
    public boolean getCodeAccess() {
        /*
        * Should return whether this SoftwareEngineer
        * has access to make changes to the code base
        */

    }
    public void setCodeAccess(boolean access) {
        /*
        Should allow an external piece of code to update the
        SoftwareEngineer's code privileges to either true or false
        */

    }
    public int getSuccessfulCheckIns() {
        /*
        Should return the current count of how many times this
        SoftwareEngineer has successfully checked in code
        */

    }
    public boolean checkInCode() {
        /*
        Should check if this SoftwareEngineer's manager approves of their check in.
        If the check in is approved their successful checkin count
        should be increased and the method should return "true".
        If the manager does not approve the check in the SoftwareEngineer's code
        access should be changed to false and the method should return "false"
        */
        boolean managerApproval = false;
        Employee manager = this.getManager();
        if (manager == null) { // Can't checkin if didn't report to any TechnicalLead
            return true;
        }
        TechnicalLead tl = (TechnicalLead) manager; // Upcasting to TechnicalLead
        if (managerApproval && this.getCodeAccess()){ // Checkin only when TechnicalLead approves SoftwareEngineer's checkin and has code access
            this.setCheckIns(this.getSuccessfulCheckIns()+1);
            return true;
        } else {
            return false;
        }
    }

}
