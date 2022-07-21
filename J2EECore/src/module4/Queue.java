package module4;

import module4.QueueInterface;

import java.util.Scanner;

public class Queue implements QueueInterface {

    Scanner sc = new Scanner(System.in);

    @Override
    public void createQueue() {
        System.out.println("Enter the size of Queue");
        int size = sc.nextInt();
        int queueArray[] = new int[size];
        for(int i=0; i<queueArray.length; i++){
            System.out.println("Enter "+i+" Element");
            queueArray[i]= sc.nextInt();
        }
        System.out.println("Created Queue Array is");
        for(int i=0; i<queueArray.length; i++){
            System.out.print(queueArray[i]);
        }
        System.out.println("");
    }

    @Override
    public void addElement() {
        int[] array = {1,2,3,4};
        System.out.println("Queue before Adding");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println("");
        System.out.println("Enter the number to add in queue");
        int add = sc.nextInt();
        int[] array1 = new int[5];
        for(int i=0; i<array1.length; i++){
            if(i!=4){
                array1[i]=array[i];
            }else{
                array1[i]=add;
            }
        }
        for(int i=0; i<array1.length; i++){
            System.out.print(array1[i]);
        }
        System.out.println("");
    }

    @Override
    public void removeElement() {
        int[] array = {1,2,3,4};
        System.out.println("Queue before Removing");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println("");
        System.out.println("Removing an element from queue");
        int[] array1 = new int[3];
        for(int i=0; i<array.length; i++){
            if(i!=0)
                array1[i-1]=array[i];
        }
        for(int i=0; i<array1.length; i++){
            System.out.print(array1[i]);
        }
    }
}
