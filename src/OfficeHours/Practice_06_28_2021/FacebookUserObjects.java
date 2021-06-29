package OfficeHours.Practice_06_28_2021;

public class FacebookUserObjects {
    public static void main(String[] args) throws InterruptedException {

        FacebookUsers userOne = new FacebookUsers("jamesbond", "jamesbond123");
        System.out.println(userOne);

        FacebookUsers userTwo = new FacebookUsers("adam3223", "3211123", "Adam James", 12, 4000);
        System.out.println(userTwo);

        userOne.sendFriendRequest(userTwo);
        // this -> userOne
        // other -> userTwo

        System.out.println(userOne);
        System.out.println(userTwo);

        userOne.post("This is my first post!");

        Thread.sleep(10000);

        userOne.post("I like this app");

        System.out.println(userOne.getAllPosts());

        // ArrayList<FacebookUser>

    }
}