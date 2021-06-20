package OfficeHours.Practice_06_15_2021;

public class Email {

    final String ADDRESS; // final means that this variable cannot be changed
                        // it shows error because it needs to be given a value.
                        // the normal convention of naming a final variable is all UPPERCASE
    int numberOfEmail;
    static String domain; // static means that all the objects from the class Email will share the same value of domain.

    static{           // to initiate value to the static variable. It runs ONE TIME only at the beginning
       domain = "generic";
    }

    public Email(String address, int numberOfEmil){
        this.ADDRESS = address;
        this.numberOfEmail = numberOfEmil;

    }

    @Override
    public String toString() {
        return "Email{" +
                "address='" + ADDRESS + '\'' +
                ", numberOfEmail=" + numberOfEmail + " domain=" + domain +
                '}';
    }
}
