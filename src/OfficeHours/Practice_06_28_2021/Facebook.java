package OfficeHours.Practice_06_28_2021;

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

import java.util.List;

public class Facebook extends SocialMedia{

    private String username;
    private String password;
    private String fullName;
    private int age;
    private int numberOfFriends;
    private List<Post> allPosts; // Encapsulated to allow indirect access to them via getters/setters

    static{
        platform = "Facebook";
    }

    public Facebook(String username, String password){
        this.username=username;
        setPassword(password);

    }
    @Override
    public void directMessaging(String username, String body) {

    }

    @Override
    public void post(String body) {

    }

    @Override
    public void notifications() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.contains(username)){
            System.out.println("Password contained username");
            this.password = "password";
        }else{
            this.password=password;
        }

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    public List<Post> getAllPosts() {
        return allPosts;
    }

    public void setAllPosts(List<Post> allPosts) {
        this.allPosts = allPosts;
    }
}
