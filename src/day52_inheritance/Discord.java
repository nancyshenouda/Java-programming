package day52_inheritance;

import day52_inheritance.MobileApp;

public class Discord extends MobileApp {
    public void chat(String someOne){

        System.out.println("I can chat with " + someOne+ " on Discord");
    }
    @Override
    public void useTheApp(int minutes){
        super.useTheApp(minutes);
    }

}
