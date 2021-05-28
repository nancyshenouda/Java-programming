package Tasks.Saim_tasks_unit_two;
/*
Given a username and password verify they are valid.
    - The password cannot be less than 5 characters
        -> If it is less print: "Password cannot be less than 5 characters"
        -> If it is more then or equal to 5 print: "Valid password"

    - Also the password should not contain the username
        - If the password has the username in it print:
            "Invalid password, username should not be in it"
            -> Also change the password to have the value: "password"
 */
public class UserNamePasswordVerify {

    public static void main(String[] args) {

        String password = "123nancy467";
        String userName = "nancy";

        if(password.length()<5){
            System.out.println("Password cannot be less than 5 character");

        }else if(password.contains(userName)){
            System.out.println("Invalid password, username should not be in it");

        }else if(password.length()>=5 && !(password.contains(userName))){
            System.out.println("Valid password");
            System.out.println("password = " + password);
        }

    }
}
