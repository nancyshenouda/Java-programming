package Tasks.Replit;

public abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void getName(String name){
        this.name = name;
    }
    public String setName(){
        return this.name;
    }
    public void getAge(int age){
        this.age=age;
    }

    public int setAge(){
        return this.age;
    }
    public abstract int getAgeInHumanYears();

    public boolean equals(String name, int age){
        if(name.equals(this.name) || age==this.age){

        }
        return true;
    }
}
