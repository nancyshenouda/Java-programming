package Tasks.Interview_Codes;

/*
1. Write a return method that can verify if a password is valid or not.
requirements:
 1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns  false

 */
public class PasswordVerification {
    public static void main(String[] args) {
        System.out.println("verifyPassword(\"ZMasdrAq12**\") = " + verifyPassword("ZMasdr Aq12**"));
    }
    public static boolean verifyPassword(String password) {

        String upperCase = "(.*[A-Z].*)";
        String lowerCase = "(.*[a-z].*)";
        String digit = "(.*[0-9].*)";
        String specialChar = "(.*[ -/, :-@].*)";

        boolean hasUpper = password.matches(upperCase),
                hasLower = password.matches(lowerCase),
                hasDigit = password.matches(digit),
                hasSpecial = password.matches(specialChar),
                valid = false;

        if (password.length() >= 6 && !password.contains(" "))
            if (hasUpper && hasLower && hasDigit && hasSpecial)
                valid = true;

        return valid;
    }
}
