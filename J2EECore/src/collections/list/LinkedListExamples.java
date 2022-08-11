package collections.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExamples {

    public void appendLinkedList(){
        LinkedList<String> list = new LinkedList<String>();
        list.add("Orange");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        System.out.println(list);

        for(String str : list){
            System.out.println("For Each -> "+str);
        }

        ListIterator iterator = list.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

        list.addFirst("PineApple");
        list.addLast("Lemons");

        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("First Element -> "+list.getFirst());
        System.out.println("Last Element -> "+list.getLast());

        System.out.println("Index of Element -> "+list.indexOf("PineApple"));
        System.out.println("Index of Element -> "+list.lastIndexOf("Banana"));

        Collections.sort(list);
        System.out.println("Sorted List -> "+list);

        Collections.reverse(list);
        System.out.println("Reversed List -> "+list);

        Collections.shuffle(list);
        System.out.println("Shuffle List -> "+list);

        LinkedList<String> newList = new LinkedList<String>();
        newList.add("Beer");
        newList.add("Coke");
        newList.add("Water");

        list.addAll(newList);
        System.out.println("After Adding new list -> "+list);
        System.out.println("Last Element using peek -> "+list.peekLast());
        System.out.println("First Element using peek first -> "+list.peekFirst());
    }

}
