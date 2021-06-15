package day43_list_custom_classes;

public class Company {

    public static void main(String[] args) {

       Employee emp1= new Employee();
       emp1.name= "Nancy Shenouda";
       emp1.jobTitle= "SDET";
       emp1.work();
       System.out.println("emp1 = " + emp1);

        Employee emp2= new Employee();

        emp2.name="Mariam Rashad";
        emp2.jobTitle="SDET";
        System.out.println("emp2 = " + emp2);
        emp2.work();


    }
}
