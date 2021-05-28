package day34_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("------ Starting ETSY Search Smoke Test-------");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("----- Etsy Search Smoke Test completed----");
    }
    public static void openBrowser(){
        System.out.println("Launching Chrome browser");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("Navigating to https://www.etsy.com");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("Pass: verify Etsy home page is displayed");
        System.out.println("type wooden Spoon in search field and press enter");

    }
    public static void verifyResultsAreDisplayed(){
        System.out.println("Pass: Search Results are successfully displayed");
    }
}
