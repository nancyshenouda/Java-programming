package OfficeHours.Practice_06_15_2021;

public class EmailObject {
    public static void main(String[] args) {

        Email email = new Email("Shenouda.nancy", 13);
        //email.ADDRESS = "email";  it doesnt work because ADDRESS variable is final

        System.out.println(email);

        System.out.println(Email.domain);
        System.out.println(Gmail.domain);

        Gmail gmail = new Gmail("Mariam.rashad", 20);
        System.out.println(gmail);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);
        System.out.println();

        Yahoo yahoo = new Yahoo("ramy.heaven", 30);
        System.out.println(Yahoo.domain);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);

        Email email2 = new Email("random@email", 4);
        System.out.println(Email.domain);
        System.out.println(Yahoo.domain);
        System.out.println(Gmail.domain);
        //




    }
}
