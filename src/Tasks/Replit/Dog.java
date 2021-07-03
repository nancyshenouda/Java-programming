package Tasks.Replit;

public class Dog extends Animal{
    String breed;
    int humanYears;

    public Dog(String name, int age, String breed){
        super(name, age);
        this.name=name;
        this.age=age;
        this.breed=breed;
        calculateAgeInHumanYears();
    }

    public String toString(){
        return "Name: " + name +"\n"
                + "Breed: "+ breed + "\n"
                + "Age in calendar years: "+ age + "\n"
                + "Age in human years: "+ humanYears;}

    @Override
    public int getAgeInHumanYears(){
        return humanYears;
    }
    public int calculateAgeInHumanYears(){
        if(age<=2){
            humanYears = age*11;
        }else{
            humanYears=22 +((age-2) * 5);
        }
        return age;
    }
    @Override
    public boolean equals(String name, int age){

        if(this.name.equals(name) || this.age==age || this.breed.equals(breed)){
            return true;
        }else{

        }
        return true;

    }
}
