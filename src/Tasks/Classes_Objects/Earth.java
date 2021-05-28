package Tasks.Classes_Objects;
/*
Create a class Earth
-Create AnimalSpeciesobjects,
call the getInfo and getmethods of the objects
 */
public class Earth {
    public static void main(String[] args) {

        AnimalSpecies dogs = new AnimalSpecies();

        dogs.setInfo("dogs", 2,10);
        System.out.println("info about the dogs species = name: " +  dogs.getName() + " the population is " +
                + dogs.getPopulation() + " million " + " and the growth rate is " + dogs.getGrowthRate() + "%");

        AnimalSpecies lions = new AnimalSpecies();

        lions.setInfo("lions",5,20);
        System.out.println(lions);

        AnimalSpecies birds = lions; // birds object is refering to the same value of the object lions
        System.out.println(birds);

        birds.setInfo("birds", 50, 200);
        System.out.println(birds);


    }
}
