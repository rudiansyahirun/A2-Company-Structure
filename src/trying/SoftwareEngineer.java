package trying;

public class SoftwareEngineer extends TechnicalEmployee{
    public boolean codeAccess;

    public SoftwareEngineer(String name) {
        super(name);
        setCodeAccess(true);
    }

    public boolean getCodeAccess() {
        // return whether this SoftwareEngineer has access to the code
        return this.codeAccess;
    }

    public void setCodeAccess(boolean access) {
        // allow or disallow this SoftwareEngineer from working on code
        this.codeAccess = access;
    }

    public int getSuccessfulCheckIns() {
        // return the number of successful check ins for this SoftwareEngineer
        return checkIns;
    }

    public boolean checkInCode() {
        // check if this SoftwareEngineer's manager approves their check in
        TechnicalLead manager = (TechnicalLead) this.getManager();
        if (manager.approveCheckIn(this)) {
            this.setCheckIns(); // increment the number of check ins
            return true;
        } else {
            codeAccess = false; // disallow this SoftwareEngineer from working on code
            return false;
        }
    }
}
