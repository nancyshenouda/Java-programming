package OfficeHours.Practice_06_28_2021;

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

    /**
     abstract because this is the parent class and we don't care about the How/implementation
      we just care about the What or the idea
      the sub classes will do the action or the how
     */
    public abstract void directMessaging(String username, String body);

    public abstract void post(String body);

    public abstract void notifications();
}
