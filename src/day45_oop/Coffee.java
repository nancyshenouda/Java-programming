package day45_oop;

public class Coffee {
    int amount;
    String type;

    public void reFill(){
       amount = 100;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }

    public void drink(int someAmount){
        amount -= someAmount;
    }
    public int getAmount(){
        return amount;
    }
    public void setType(String newType){
        type = newType;

    }
    public String getType(){
        return type;
    }
}
