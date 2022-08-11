package collections.set;

import java.util.TreeSet;

public class TreeSetExamples {

    public void createTreeSet(){
        TreeSet<String> schoolNames = new TreeSet<>();
        schoolNames.add("Raman");
        schoolNames.add("Bishop");
        schoolNames.add("Adharsha");
        System.out.println(schoolNames);
        schoolNames.forEach(snames-> System.out.println(snames));


        System.out.println(schoolNames.subSet("Bishop",true,"Raman",true));
        System.out.println(schoolNames.subSet("Bishop",true,"Bishop",true).ceiling("Bishop"));
        System.out.println(schoolNames.subSet("Bishop",true,"Bishop",true).floor("Bishop"));
        System.out.println(schoolNames.headSet("Bishop"));
        System.out.println(schoolNames.tailSet("Bishop"));
        System.out.println(schoolNames.higher("Adharsha"));
        System.out.println(schoolNames.lower("Adharsha"));

    }
}
