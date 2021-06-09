package day51_inheritance;

public class Employee {
    String jobTitle;

    public double calculateSalary(double hourlyRate){

        return 52*40* hourlyRate * 1.1;
    }

    @Override
    //why @Override is added here?
    // the reason is that this parent class is extending from another Parent Main Bigger class called Object (Like Adam)
    //compiler already adds it from import.java.lang.*;
    //Object class has several methods that are inherited to every class
    //most popular is .toString();
    //
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
