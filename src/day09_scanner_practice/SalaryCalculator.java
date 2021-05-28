package day09_scanner_practice;
//import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);

        System.out.println("Enter hourly rate: ");
        double hourlyRate= 50;
        double weeklyRate=(hourlyRate*40);
        double monthlyRate=(weeklyRate *52/12);
        double annualRate=(monthlyRate*12);
        System.out.println("Hourly Rate: $"+ hourlyRate);
        System.out.println("Weekly Rate: $"+ weeklyRate);
        System.out.println("Monthly rate: $" + monthlyRate);
        System.out.println("Annual rate: $" + annualRate);






    }
}
