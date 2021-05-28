package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[]args){
        String brand="Apple";
        String model="iPhone 8 Plus";
        String color="RoseGold";
        double price=699.0;
        int storage=256;
        boolean hasCamera=true;
        System.out.println(brand+'\n'+ model +'\n'+ color+'\n'+ price+ '\n'+ storage + '\n'+hasCamera);
        System.out.println("Brand:    "+brand);
        System.out.println("model:    "+model);
        System.out.println("Color:    "+color);
        System.out.println("Price:    $"+price);
        System.out.println("Storage:  "+storage+ "GB");
        System.out.println("Has Camera? "+hasCamera);


        String city = "Baku";
        System.out.println("City is " + city);
    }
}
