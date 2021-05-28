package Tasks.Classes_Objects;

public class Coffee {
    String coffeeType;
    int amount;

    public int getAmount(){
      return amount;
    }
    public void refill(){
        amount = 100;
    }
    public int drink(int someAmount){
      return amount-=someAmount;
    }
    public void setType(String newType){
        coffeeType = newType;
    }
    public String getType(){
        return coffeeType;
    }
}
