package day54_abstraction;

public class Pizza extends MenuItem{

    public void prepare(){

        System.out.println("Stretch the dough and put sauce, cheese and vegetables then bake it");
    }
    public void serve(){
        System.out.println("Cut to slides and serve in a plate or a box");
    }
}
