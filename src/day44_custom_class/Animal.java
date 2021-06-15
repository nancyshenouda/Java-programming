package day44_custom_class;

public class Animal {

    String type = "lion";


    public void eat(){

        System.out.println(type + " is Eating");
    }
    public void eat (String food)
    {
        System.out.println(type + " is not Eating " + food);
    }
    public void speak(){

        System.out.println(type + " is not Speaking");
    }

}



