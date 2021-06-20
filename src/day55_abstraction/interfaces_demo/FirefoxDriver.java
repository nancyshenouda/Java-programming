package day55_abstraction.interfaces_demo;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("FirefoxDriver - navigating to " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("FirefoxDriver - locating WebElement by "+ locator);
    }

    @Override
    public void quit() {
        System.out.println("FirefoxDriver - quitting the driver");
    }

    @Override
    public String getTitle() {
        return "Firefox spoon";
    }
}
