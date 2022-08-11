package collections.set;

import java.util.HashSet;

public class HashSetExamples {

    public void createSet(){
        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(29);
        evenNumbers.add(6);
        evenNumbers.add(4);

        System.out.println(evenNumbers);

        for (Integer numbers : evenNumbers){
            System.out.println(numbers);
        }
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.addAll(evenNumbers);
        System.out.println("union of set -> "+numbers);
        numbers.retainAll(evenNumbers);
        System.out.println("Intersection of set -> "+numbers);

        HashSet<String> names = new HashSet<>();
        names.add("Vinay");
        names.add("Aravind");
        System.out.println(names);
    }
}
