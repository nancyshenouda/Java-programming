package day09_scanner_practice;

import java.util.Scanner;
public class SalaryCalculatorV2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter hourly rate: ");
        double hourlyRate= scan.nextDouble();
        double weeklyRate=(hourlyRate*40);
        double monthlyRate=(weeklyRate *52/12);
        double annualRate=(monthlyRate*12);
        double annualAfterTaxes=(annualRate%1);
        System.out.println("Hourly Rate: $"+ hourlyRate);
        System.out.println("Weekly Rate: $"+ weeklyRate);
        System.out.println("Monthly rate: $" + monthlyRate);
        System.out.println("Annual rate: $" + annualRate);
        System.out.println("Annual rate after taxes: $" + annualAfterTaxes);
    }
}
