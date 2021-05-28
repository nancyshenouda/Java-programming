package day47_constructors;

public class AddressList {
    public static void main(String[] args) {

        Address cybertekAddress = new Address();
        cybertekAddress.setStreet("7925 Jones Branch Dr Suites 3300");
        cybertekAddress.setCity("McLean");
        cybertekAddress.setState("Va");
        cybertekAddress.setZipCode("22182");

        System.out.println("CybertekSchool address: " + cybertekAddress.toString());

        cybertekAddress.setStreet("7925 Jones Branch Dr Suites 3000");
        System.out.println("Address after update: " + cybertekAddress);
        System.out.println("Street info: " + cybertekAddress.getStreet());

        Address newAddress = new Address(); // calling the first constructor
        System.out.println("Address after constructor: " + newAddress.toString());

        Address papaJohnPizza = new Address("8501 Tyco Rd Ste 1A", "Vienna", "VA", "22182");
        System.out.println("Papa John pizza = " + papaJohnPizza.toString());

    }
}
