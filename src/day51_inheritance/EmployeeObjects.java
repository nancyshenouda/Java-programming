package day51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee developer = new Employee();
        System.out.println("developer.calculateSalary(55) = " + developer.calculateSalary(55));
        developer.jobTitle = "java Developer";


        //double annualSalary = developer.calculateSalary(55);
        //System.out.println(Math.round(annualSalary)); // to remove the fractions

        Contractor sdetContractor = new Contractor();
        System.out.println("sdetContractor.calculateSalary(55) = " + sdetContractor.calculateSalary(55));
        sdetContractor.jobTitle = "SDET";

        System.out.println(developer.toString());
        System.out.println(sdetContractor);


    }
}
