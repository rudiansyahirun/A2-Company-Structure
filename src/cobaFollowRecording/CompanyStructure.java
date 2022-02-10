package cobaFollowRecording;

public class CompanyStructure {
    public static void main(String[] args) {
        // need to instantiate the abstract class

        Employee john = new BusinessEmployee ("John");
        Employee peter = new TechnicalEmployee ("Peter");
        Employee jo = john;

        System.out.println(john.getEmpolyeeID());
        System.out.println(peter.getEmpolyeeID());
        System.out.println(john.getBaseSalary());
        System.out.println(peter.getBaseSalary());
        System.out.println(john.employeeStatus());
        System.out.println(peter.employeeStatus());

        System.out.println(john.equals(peter));

        System.out.println(john);
        System.out.println(peter);

        System.out.println(jo.equals(john));
    }
}
