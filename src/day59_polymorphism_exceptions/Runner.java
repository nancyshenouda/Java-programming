package day59_polymorphism_exceptions;

public class Runner {
    public static void main(String[] args) {
        //this is not polymorphic way
        Link link = new Link();
        link.click();
        link.sendKeys("java programming");
        link.getText();
        link.getLinkHref();

        //polymorphic way:
        WebElement link2 = new Link();
        link2.click();
        ((Link)link2).getLinkHref();
        String txt = link.getText();
        System.out.println("txt = " + txt);
        link2.sendKeys("Selenium");

        WebElement username = new InputField();
        username.sendKeys("nancy shenouda");
        //System.out.println("username.getText() = " + username.getText());
        //username.click();
        System.out.println("-----------------");
        WebElementUtil.clickElement(link);
        WebElementUtil.clickElement(username);

        WebElement login = WebElementUtil.getLinkWithText("login");
        login.click();
    }
}
