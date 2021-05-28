package day47_constructors;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country = "USA";

    // constructor: it is a special method- no return type- same name as class name-
    // it is called automatically in the main method
    public Address (){
        System.out.println("Address constructor");
        street= "123 unknown st";
        city = "Java";
        state = "WS";
        zipCode= "00000";

    }
    // second constructor, overloaded constructor --> provides shortcut to initialize variables in the same statement
    public Address(String street, String city, String state, String zipCode) {
        setStreet(street);//reuse the code in the setter method
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }


    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {

        if(street.isEmpty() || street.length() > 50) {
            System.out.println("ERROR: Invalid street");
            //System.exit(0);
        } else {
            this.street = street;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
