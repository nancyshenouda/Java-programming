package Tasks.String_Practice;
/*
[Initials]
Given a person's name in a String (first and last name), then prints out the initials of the user.
The initials should be uppercase.Ex:
input: james bond
output: your initials are JB
 */
public class InitialsV2 {
    public static void main(String[] args) {

        String fullName = "nancy shenouda";

        String first = fullName.toUpperCase().substring(0,1);
        char last = fullName.toUpperCase().charAt((fullName.indexOf(" ")+1));
        System.out.println(first);
        System.out.println(last);
        System.out.println("your initials are " + first + last);


    }
}
