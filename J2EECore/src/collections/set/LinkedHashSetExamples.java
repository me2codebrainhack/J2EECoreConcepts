package collections.set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExamples {

    public void createLinkedHashSet(){
        ArrayList<String> heroes = new ArrayList<>();
        heroes.add("BAvenger-1");
        heroes.add("Avenger-2");
        heroes.add("Avenger-1");
        System.out.println("List has some redundant data, converting it to linked hash set to remove duplicates");
        LinkedHashSet<String> heroesNoDuplicate = new LinkedHashSet<>(heroes);
        System.out.println("With Duplicates -> "+heroes);
        System.out.println("No Duplicates -> "+heroesNoDuplicate);

        heroesNoDuplicate.add("Batman");
        Iterator iterator = heroesNoDuplicate.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        heroesNoDuplicate.remove("Batman");
        System.out.println(heroesNoDuplicate);
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Vinay");
        names.add("Aravind");
        System.out.println(names);

    }
}
