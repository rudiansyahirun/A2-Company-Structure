package trying;

public class CompanyStructure {
    public static void main(String[] args) {
        TechnicalEmployee ted = new TechnicalEmployee("Ted");
        TechnicalEmployee ted2 = new TechnicalEmployee("Ted2");
        TechnicalEmployee ted3 = new TechnicalEmployee("Ted3");

        System.out.println(ted.employeeStatus());
    }
}
