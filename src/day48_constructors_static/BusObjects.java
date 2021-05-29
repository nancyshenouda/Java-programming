package day48_constructors_static;

public class BusObjects {
    public static void main(String[] args) {
        
        Bus bus = new Bus();
        bus.driver = new Driver("John");
        bus.engine = new Engine(10);

        System.out.println(bus.toString());

        Bus metroBus = new Bus();
        metroBus.driver = new Driver("Kevin");
        metroBus.engine = new Engine(12);
        System.out.println(metroBus.toString());

        // print driver name of metroBus

        System.out.println(metroBus.driver.getName());

    }
}
