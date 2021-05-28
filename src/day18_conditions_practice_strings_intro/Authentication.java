package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String [] args) {

        int last4SSN = 1234;
        int pinCode = 1111;

        int expLast4SSN = 9999;
        int expPinCode = 0000;


        if (last4SSN == expLast4SSN && pinCode == expPinCode) {
            System.out.println(" Authentication success");
        } else {
            System.out.println("Authentication failed");
            if (last4SSN != expLast4SSN)
                System.out.println("last 4 SSN is incorrect");

        if ( pinCode != expPinCode)
            System.out.println("pincode is incorrect");
        }
}

}
