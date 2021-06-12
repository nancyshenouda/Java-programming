package day52_inheritance;

public class MobileAppObjects {
    public static void main(String[] args) {
        MobileApp mobileApp = new MobileApp();
        mobileApp.name = "YouTube";
        mobileApp.useTheApp(10);
        Instagram insta = new Instagram();
        insta.name = "Instagram";
        insta.useTheApp(20);

        Discord discord = new Discord();
        discord.chat("Mariam");
        discord.name ="Discord";
        discord.useTheApp(100);
    }
}
