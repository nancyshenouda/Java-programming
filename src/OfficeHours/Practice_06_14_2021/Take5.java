package OfficeHours.Practice_06_14_2021;
/*
Create a class Take5 [Child class]

    * Inherits Candy class

    * constructor that invokes the parent constructor

    * extra: static hiding, final
    Twix is a Candy => IS-A relationship
    Twix is an Object =>  IS-A relationship
    Twix has a brand => HAS-A relationship
    Twix has a quantity => HAS-A relationship
 */
public class Take5 extends Candy {
    public Take5( int quantity, boolean hasPeanuts) {
        super("Reese", quantity, hasPeanuts);
    }

}
