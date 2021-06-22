package OfficeHours.Practice_06_22_2021;
/*
Create an interface Shipping
    - Declare an abstract methods:
        payForShipping(price) that return boolean

An interface is not a class and not having any objects.
It is another way of java to achieve abstraction.
 it is still can have variables and methods
 */
public interface Shipping {

    public abstract boolean payForShipping(double price);
    // public abstract is grey because it is extra and the methods by default in interface to be public abstract




}
