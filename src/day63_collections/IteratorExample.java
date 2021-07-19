package day63_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("john");
        list.add("jamie");
        list.add("george");
        System.out.println(list);

        Iterator<String> it = list.iterator();
        it.next(); // pointing to the first element
        it.remove(); // removes the element that next(); was pointing to (john)
        System.out.println(list);

        Set<String> names = new HashSet<>();

        names.add("james");
        names.add("kinga");
        names.add("Nancy");
        names.add("Mariam");
        names.add("mj");

        //names.remove(2); // it doesnt remove here, it has to be inside for loop
        System.out.println(names);

        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            String currentName = iterator.next();
            System.out.println(currentName);

            if(currentName.length() < 3){
                iterator.remove();
            }

        }
        System.out.println(names);
    }
}
