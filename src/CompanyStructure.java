public class CompanyStructure {
    public static void main(String[] args) {
        // testing code that use to see if things are set up properly:

        TechnicalLead CTO = new TechnicalLead("Satya Natella");
        SoftwareEngineer seA = new SoftwareEngineer("Kasey");
        SoftwareEngineer seB = new SoftwareEngineer("Breana");
        SoftwareEngineer seC = new SoftwareEngineer("Eric");
        CTO.addReport(seA);
        CTO.addReport(seB);
        CTO.addReport(seC);

        // set code access true
        seA.setCodeAccess(true);
        seB.setCodeAccess(true);
        seC.setCodeAccess(true);

        // check in code
        seA.checkInCode();
        seB.checkInCode();
        seC.checkInCode();

        System.out.println(CTO.getTeamStatus());

        TechnicalLead VPofENG = new TechnicalLead("Bill Gates");
        SoftwareEngineer seD = new SoftwareEngineer("Winter");
        SoftwareEngineer seE = new SoftwareEngineer("Libby");
        SoftwareEngineer seF = new SoftwareEngineer("Giza");
        SoftwareEngineer seG = new SoftwareEngineer("Zayn");
        VPofENG.addReport(seD);
        VPofENG.addReport(seE);
        VPofENG.addReport(seF);
        VPofENG.addReport(seG);

        // set code access true
        seD.setCodeAccess(true);
        seE.setCodeAccess(true);
        seF.setCodeAccess(true);
        seG.setCodeAccess(true);

        // check in code
        seD.checkInCode();
        seE.checkInCode();
        seF.checkInCode();
        seG.checkInCode();

        System.out.println(VPofENG.getTeamStatus());

        BusinessLead CFO = new BusinessLead("Amy Hood");
        Accountant actA = new Accountant("Nicky");
        Accountant actB = new Accountant("Andrew");
        CFO.addReport(actA, CTO);
        CFO.addReport(actB, VPofENG);

        System.out.println(CFO.getTeamStatus());
    }
}
