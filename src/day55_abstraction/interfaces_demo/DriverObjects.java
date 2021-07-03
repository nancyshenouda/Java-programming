package day55_abstraction.interfaces_demo;

public class DriverObjects {
    public static void main(String[] args) {

        ChromeDriver chromeDriver = new ChromeDriver();
        System.out.println("chromeDriver Title() = " + chromeDriver.getTitle());
        // also we can use polymorphism here
        WebDriver driver = new ChromeDriver();
        driver.get("www.google.com");


        FirefoxDriver firefoxDriver = new FirefoxDriver();
        System.out.println("firefoxDriver Title() = " + firefoxDriver.getTitle());
    }
}
