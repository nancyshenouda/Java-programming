package Tasks.social_media;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
Post class
•Create a class that has the following instance variable:
String body, and String dateTime
-Encapsulate body.
Provide a public getter and setter(update)
-Make dateTime final and read only (getter)
•Create a constructor that will take the body and initialize the body instance variable.
 Upon creation of the post the current date and time should be taken and stored into the dateTime variable
 Note:
 Since we didn’t learn this class use the follow code:
 this.dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a"));
 Need to have these two imports for the above code:
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
 */
public class Post {
    private String body;
    private String dateTime;

    public Post(String body){
        this.body=body;
        this.dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a"));

    }
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public final String getDateTime() {
        return dateTime;
    }

    public  void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
