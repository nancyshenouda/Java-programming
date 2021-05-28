package Tasks.Classes_Objects;
/*
[AnimalSpecies] Create a class AnimalSpecies
-Create these variables in the class: name (String),
population (int  -for practice we can consider 1 unit as 1 million. Ex: population = 20 would represent 20 million ),
growth rate (int -percent number)
-Create these methods (non-static):
-setInfo()-parameters: name, population, and growth rate (Do not name the parameters the same as your class variable names).
 -returns: void-action: assigns the name, population, and growth rate  of the object given from the parameters.
 -getName()-no parameters, returns the name variable -getPopulation ()-no parameters, returns the population variable
 -getGrowthRate()-no parameters, returns the growth rate variable
 -toString() generate the toString method as shown in class.
 See Murodil_only for screenshots of steps
-Create a class Earth
-Create AnimalSpeciesobjects,
call the getInfo and getmethods of the objects
 */


public class AnimalSpecies {
    String name;
    int population;
    int growthRate;

    public void setInfo(String nameInfo, int populationInfo, int growthRateInfo){
        name = nameInfo;
        population= populationInfo;
        growthRate= growthRateInfo;

        }
    public String getName(){

        if(name==null){
            System.out.println("No name defined");
        }
        return name;
    }
    public int getPopulation (){
        return population;
    }
    public int getGrowthRate(){
        return growthRate;
    }

    @Override
    public String toString() {
        return "AnimalSpecies{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", growthRate=" + growthRate +
                '}';
    }
}
