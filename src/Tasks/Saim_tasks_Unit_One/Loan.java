package Tasks.Saim_tasks_Unit_One;
/*
[Eligible to get Loan]

Given two values: yearly salary and credit score determine if you can get a loan.

    To be approve for the loan, print: "Loan Approved":
        Salary: above 60,000
        Credit Score: above 650
    Otherwise print: "Loan Denied"

 */
public class Loan {
    public static void main(String[] args) {

        double Salary = 70000;
        int creditScore = 450;
        String Loan ;

        Loan = (Salary > 60000)&& (creditScore > 650 )? "Loan Approved" : "Loan Denied";

        System.out.println(Loan);
    }
}
