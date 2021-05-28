package day37_methods_overloading;
/*
method:
    loginVoid
params:
    String username, String password
return type:
    VOID
in the method:
    Declare : String secretUsername ="cybertekStudent", secretPassword = "abc123"
if(both match)
    PRINT:
        Login Successful, welcome cybertekStudent
ELSE
    PRINT:
        Incorrect username or password
 */
public class WarmUpMethod {
    public static void main(String[] args) {
        //loginVoid statements:
        loginVoid("cybertekStudent", "Abc123"); // this is called positive test (sunny day)
        // when you enter a valid input to test if it is valid or not

        loginVoid("cybertek", "answer");// negative test is when you enter an invalid input (rainy day)

        //login statements:  // we need to give it a println statement order to execute
        System.out.println(login("cybertekStudent", "Abc123"));  // true

        boolean isLoginSuccess = login("Nadir", "mountain"); // negative test
        System.out.println("is login success: " + isLoginSuccess);

        if(login("cybertekStudent", "Abc123")){
            System.out.println("welcome to Canvas");
        }else{
            System.out.println("Invalid credentials");
        }
    }
    public static void loginVoid(String userName, String password) {
        String secretUsername = "cybertekStudent";
        String secretPassword = "Abc123";


        if (userName.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)) {
            System.out.println("Login Successful, welcome Cybertek Student");
        } else {
            System.out.println("Incorrect username or password");
        }
    }

    public static boolean login(String userName, String password) {
        String secretUsername = "cybertekStudent";
        String secretPassword = "Abc123";

       // return (userName.equalsIgnoreCase(secretUsername) && password.equals(secretPassword));
        if (userName.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)) {
            return true;

        } else {
            return false;

        }
    }

}