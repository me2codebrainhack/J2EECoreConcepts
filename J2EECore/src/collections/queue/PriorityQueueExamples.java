package collections.queue;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class PriorityQueueExamples {

    public void createQueue(){

        PriorityQueue<String> customerQueue = new PriorityQueue<>();
        customerQueue.add("Mukesh");
        customerQueue.add("Venkat");
        customerQueue.add("Rama");
        customerQueue.add("Vijayapal");
        System.out.println(customerQueue);

        System.out.println(customerQueue.peek());
        System.out.println(customerQueue.poll());
        System.out.println("After first customer done remaining customer -> "+customerQueue);

        for(String customers : customerQueue){
            System.out.print(customers+" After this -> ");
        }

        System.out.println();

        Iterator iterator = customerQueue.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" -> ");
        }

        System.out.println();

        Queue<String> linkedQueue = new LinkedBlockingDeque<>();
        linkedQueue.add("Mukesh");
        linkedQueue.offer("Lipin");
        System.out.println(linkedQueue);

        PriorityQueue<Integer> firstTen = new PriorityQueue<>();
        for(int i=10;i>=1;i--){
            firstTen.add(i);
        }
        System.out.println(firstTen);

    }
}
