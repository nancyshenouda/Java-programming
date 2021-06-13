package day53_inheritance.final_keyword;

public class FinalRunner {
    public static void main(String[] args) {
        System.out.println(TestData.ADMIN_USERNAME);

       // TestData.ADMIN_USERNAME = "Nancy"; ERROR WE CANNOT CHANGE A VALUE OF A FINAL CONSTANT

        final int SSN = 346654321;
      //  SSN = 123456788908;  ERROR we CANNOT assign a new value to a final variable
    }
}
