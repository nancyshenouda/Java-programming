package day44_custom_class;
//this App class is used as a template for App objects.
//We are describing app properties and behaviour here. Objects will be able to use them
public class App {

    String name = "Uber";
    double version = 3.5;

    public void open(){
        System.out.println("Opening " + name + " app - version " + version);

    }
// this class is used to create objects from App class
    public static class MyApp{
        public static void main(String[] args) {
            String name = "Uber";
            double version = 1.234;
            App app1 = new App();// here we are creating a new object
            System.out.println("App Name = " + app1.name);
            System.out.println("Version = " + app1.version);
            app1.open();

        }
    }
}

