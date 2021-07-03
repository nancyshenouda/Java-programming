package day59_polymorphism_exceptions;

public class InputField implements WebElement{

    public static final String TAG_NAME= "input";

    public String getValue(){
        System.out.println("Getting value in input field");
        return "Selenium";
    }
    @Override
    public void sendKeys(String txt) {
        System.out.println("Typing into input  field - " + txt);
    }
    @Override
    public void click() {
        System.out.println("clicking enter");
    }

    @Override
    public String getText() {
        System.out.println("getting text of input field");
        return null;

    }


}
