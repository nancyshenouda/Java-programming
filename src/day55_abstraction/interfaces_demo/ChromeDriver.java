package day55_abstraction.interfaces_demo;

public class ChromeDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("ChromeDriver - navigating to " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("ChromeDriver - locating WebElement by "+ locator);
    }

    @Override
    public void quit() {
        System.out.println("ChromeDriver - quitting the driver");
    }

    @Override
    public String getTitle() {
        return "Wooden Spoon";
    }
}
