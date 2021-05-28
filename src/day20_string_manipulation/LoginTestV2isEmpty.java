package day20_string_manipulation;

public class LoginTestV2isEmpty {
    public static void main(String[] args) {

        String expUserName= "cybertek";
        String expPassword = "";

        String userName = "Cybertek";
        String password = "Abc123";

        if(expUserName.isEmpty() || expPassword.isEmpty()){ // either the usename OR password is empty. it returns boolean
            System.out.println("username or password is empty");
        }else if  (!expUserName.equalsIgnoreCase(userName)){
            System.out.println("Incorrect Username");
        }else if(!expPassword.equals(password)){
            System.out.println("Incorrect password");
        }
    }
}


