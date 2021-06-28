package Tasks.social_media;

/*
Social Media
•Create an abstract class for Social Media that has the following features:
-Direct messaging(String username, String message)
-Post(String body)
-Notifications()•
The Social Media will also have the following fields:
-Personal URl (String)
-Account length (int)
-Platform (static String)
 */


public abstract class SocialMedia {

     String personalUrl;
     int accountLength;
     static String platform;

// we don't need implementation... We need to make the methods abstract
    public void directMessaging(String username, String message) {
        System.out.println(username + " sent this message " + message);
    }
    public void post(String body){
        System.out.println("body of the post is " + body);
    }
public void notifications(){
    System.out.println("notifications on the post");
}

}
