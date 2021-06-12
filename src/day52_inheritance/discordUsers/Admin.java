package day52_inheritance.discordUsers;

public class Admin extends User {

    public Admin(){
        super(); // call super class /User no-args constructor
        System.out.println("Admin class constructor");
    }

    public Admin(String name, int id ){
        super("Admin", name,id);
        System.out.println("Admin with 2 args constructor");
    }
    @Override
    public String toString(){

        return "Admin{" +
                "role='" + getRole() + '\'' +
                ", name='" + getName() + '\'' +
                ", id=" + getId() +
                '}';
    }
}
