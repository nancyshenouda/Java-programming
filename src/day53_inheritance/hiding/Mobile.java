package day53_inheritance.hiding;

public class Mobile extends Phone{

    String type = "Mobile phone";
    /**
     static methods
     we are hiding use() static method
     not overriding
     */
    public static void use(){
        System.out.println("Using mobile phone");
    }
    public void text(){
        use();
        System.out.println(" and sending a text message");
    }

    public void call(){
        use();
        System.out.println(" and calling on mobile phone");
    }

}
