package Tasks.Saim_tasks_Unit_One;

//Declare and assign these variables according to the most appropriate datatypes: (Use as many datatypes as you can for practice)
//
//        - first name, last name, company name, salary, start day, start month, start year, are they full time, job title, office address,
//
//    Declare new variables and use concatenation from previous variables to set their values
//
//        - full name (first and last name)
//        - full start date (start month date, year)
//        - email (first name + start day @ $company name .com)
//        - Salary after 3 years (base salary + start month * 10000)
//            Ex: base: 100000
//                start day: 2
//                after 3 year: (100000 + (2 * 1000)) = 102000
//
//    Display the values of the variables following given example image
//
//==============================================================================
public class Employee {
    public static void main(String[] args){
        String fullName="Nancy Atef Ayad Shenouda";
        String fullStartDate="March - 7- 2021";
        String email="nancy01@CyberteckSchool.com";
        double basicSalary=200000;
        double salaryAfterThreeYears=(basicSalary+(7*1000));
        boolean fullTime=true;
        String officeLocation="8108 Essex Grove Way";
        System.out.println("***** Tesla New Hire information *****");
        System.out.println(fullName+" welcome to Tesla");
        System.out.println("Your start date as a SDET will be on "+fullStartDate+ ". You are full time: "+ fullTime+ " and will be making " +basicSalary+" per year"+". The office will be located at "+officeLocation);
        System.out.println();
        System.out.println("Official Information:");
        System.out.println("New hire name:     "+ fullName);
        System.out.println("Starts on:         "+ fullStartDate);
        System.out.println("Email generate:    "+email);
        System.out.println("Your expected salary after 3 years: "+ salaryAfterThreeYears);

    }
}
