package day05_primitives_concatanation;

public class Movie {
    public static void main(String[] args){
        String name="Interview with a vampire";
        String genre="horror";
        double duration=3.5;
        String releaseDate="03 March 1999";
        String rating="PG";
        boolean sequels=false;
        int rottenTomatoesRating=95;
        Boolean DVD=true;
        System.out.println("------Welcome to the Cinema-------");
        System.out.println("Tonight we are streaming "+"\""+ name + "\"" + " which was released on "+releaseDate+". This "+genre+" movie got a "+rottenTomatoesRating+" on Rotten Tomatoes. The Rating is "+rating+" and it runs for "+duration+" hours. This is a sequel "+sequels+ " and is on DVD "+DVD);


    }
}
