package Tasks.String_Practice;
/*
[Initials]
Given a person's name in a String (first and last name), then prints out the initials of the user.
The initials should be uppercase.
Ex:
input: james bond
output: your initials are JB
 */
public class Initials {
    public static void main(String[] args) {

        String name= "james bond";
        char first = name.toUpperCase().charAt(0);
        char last= name.toUpperCase().charAt(name.indexOf(" ")+1);

        System.out.println(first+ ""+ last);

    }
}
