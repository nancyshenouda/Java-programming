package Tasks.Saim_tasks_Unit_One;

public class BookGenre {
    public static void main(String[] args) {
        String genre = "Detective";
        int pagelength = 0;
        int profit = 0;
        int sequels = 0;
        int countries = 0;

        switch (genre) {
            case "Fantasy":
                pagelength = 500;
                profit = 1000000;
                sequels = 5;
                countries = 50;
                System.out.println(genre + " book type has " + pagelength + " papers" + " makes " + profit + " has "
                        + sequels + " and can be published in " + countries + " countries");
                break;
            case "Detective":
                pagelength = 350;
                profit = 700000;
                sequels = 3;
                countries = 45;
                System.out.println(genre + " book type has " + pagelength + " papers" + " makes " + profit + " has "
                        + sequels + " and can be published in " + countries + " countries");
                break;
            case "Science Fiction":
                pagelength = 720;
                profit = 900500;
                sequels = 4;
                countries = 30;
                System.out.println(genre + " book type has " + pagelength + " papers" + " makes " + profit + " has "
                        + sequels + " and can be published in " + countries + " countries");
                break;
            case "Short Story":
                pagelength = 150;
                profit = 300000;
                sequels = 1;
                countries = 40;
                System.out.println(genre + " book type has " + pagelength + " papers" + " makes " + profit + " has "
                        + sequels + " and can be published in " + countries + " countries");


        }
    }
}

