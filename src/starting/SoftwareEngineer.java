package starting;

public class SoftwareEngineer {
    public SoftwareEngineer(String name) {
        // Should start without access to code and with 0 code check ins

    }
    public boolean getCodeAccess() {
        /*
        * Should return whether this starting.SoftwareEngineer
        * has access to make changes to the code base
        */

    }
    public void setCodeAccess(boolean access) {
        /*
        Should allow an external piece of code to update the
        starting.SoftwareEngineer's code privileges to either true or false
        */

    }
    public int getSuccessfulCheckIns() {
        /*
        Should return the current count of how many times this
        starting.SoftwareEngineer has successfully checked in code
        */

    }
    public boolean checkInCode() {
        /*
        Should check if this starting.SoftwareEngineer's manager approves of their check in.
        If the check in is approved their successful checkin count
        should be increased and the method should return "true".
        If the manager does not approve the check in the starting.SoftwareEngineer's code
        access should be changed to false and the method should return "false"
        */

    }

}
