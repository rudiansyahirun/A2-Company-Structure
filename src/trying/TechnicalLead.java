package trying;

import java.util.ArrayList;

public class TechnicalLead extends TechnicalEmployee {
    public ArrayList<SoftwareEngineer> team;

    public TechnicalLead(String name) {
        super(name);
        this.baseSalary = this.baseSalary * 1.3;
        this.team = new ArrayList<SoftwareEngineer>();
        headCount = 4;
    }

    public boolean hasHeadCount() {
        return this.team.size() < headCount;
    }

    public boolean addReport(SoftwareEngineer e) {
        if (this.hasHeadCount()) {
            this.team.add(e);
            e.setManager(this);
            return true;
        }
        return false;
    }

    public boolean approveCheckIn(SoftwareEngineer e) {
        super.checkIns++;
        return e.getManager()equals(this);
    }
}
