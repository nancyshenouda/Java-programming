package Tasks.social_media;

import java.util.ArrayList;
import java.util.List;

/*
Facebook User•
Create a class for a facebook user which inherits the Social Media class and has additional instance variables:
username, password, full name, age, number of friends, and posts (ArrayList of Post)•
Encapsulate all the variables.
•Set the platform for "Facebook" using static block
•Create a constructor that will create a Facebook user by taking username and password.
-If the password contains the username then it is not a valid password and should not be saved.
In this case Print “Password contained username. password’” and set the password for the user to the default value.
 */
public class FacebookUser<list> extends SocialMedia{

    private String username;
    private String password;
    private String fullName;
    private int age;
    private int numberOfFriends;
    private List<String> list;

    static{
        platform ="facebook";
    }
    public FacebookUser(String username, String password){

        this.username=username;
       if(password.contains(username)){
           System.out.println("Password contained username. Default password created: " + password);
           this.password=password;
       }else {
           this.password = password;
       }
       }
       /*
-Create and assign the user's person url by using 'facebook.com/' and adding their username
-Create an empty ArrayList of Posts
•Overload the constructor to accept username, password, and the user’s name.
-If the name entered has any characters that are not letters from the alphabet, then the name is invalid.
In this case print “invalid name” and assign the name value to be ‘no name’
•Overload the constructor to accept username,password, the user’s name, age and number of friends.
-Only store the age and number of friends into the variables if they are valid numbers.
The age cannot be a negative number and the number of friends cannot be negative or more than 5000.
If they are invalid print “Invalid (age/number of friends) and keep the values as the default of 0.
Implement all methods coming from Social Media classo
Direct messaging(String username, String message)
-print =%message sent to %username
oPost(String body)
-Should be added to theArrayList of Posts of the user
Notifications()
-Checks the current time.
If the time is between 8 am -5 pm print "Notification", otherwise print "Sleep mode"
Note: use this code to get the current hour: LocalTime.now().getHour()
-The return value will be given in 24 hour format.
•Override the toString method to print all of the information of a Facebook user when they are searched.
•Create a sendFriendRequest method that will accept a Facebook user object and send them a friend request.
The method should return a boolean of if the friend request was sent (true) or if the friend request was not sent (false).
-If your friend list is at the 5000 limit then do not send the request and print “You have reached the limit of friends.”
-If the user you are trying to send the request to has already hit the limit,then print
 “$theUsersName cannot accept any more friend request.
 -If both the user and you are under the limit print “Friend request sent to $theUsersName”
 and increase your number of friends by one.Groups interface
 •Create an interface hasGroups with the following actions:
 -joinGroup(String group);
 -leaveGroup(String group);
 •Add a variable in FacebookUser to count the number of groups they are in and implement the 2 methods from Groups interface.
 -joinGroup prints "%usersName has joined%group" and increment the total number of groups
-leaveGroup prints "%usersName has left %group" and decrement the total number of groups
        */

    public void setPersonalUrl(){
        this.personalUrl= "facebook.com/" + username;
    }
    List<String> posts = new ArrayList<>();

    public FacebookUser(String username, String password, String fullName) {
        this.username = username;
        this.password = password;

        if(Character.isDigit(Integer.parseInt(fullName.substring(0)))){
            System.out.println("invalid name");
            this.fullName="no name";
        }else {
            this.fullName = fullName;
        }
    }
    public FacebookUser(String username, String password, String fullName, int age, int numberOfFriends) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        if(age >0 && age<80){
            this.age = age;
        }else{
            System.out.println("Invalid age");
            this.age=0;
        }
       if(numberOfFriends>0 && numberOfFriends<=5000){
           this.numberOfFriends = numberOfFriends;
       }else{
           System.out.println("Invalid number of friends");
           this.numberOfFriends=0;
       }
    }
    @Override
    public void directMessaging(String username, String message) {
        super.directMessaging(username, message);
        System.out.println(message+  " sent to " + username);
    }

    @Override
    public void post(String body) {
        super.post(body);
        System.out.println("message is " + body);
    }

    @Override
    public void notifications() {
        super.notifications();
    }
}

