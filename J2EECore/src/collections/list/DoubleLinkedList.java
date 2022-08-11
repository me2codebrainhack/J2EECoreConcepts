package collections.list;

import java.util.LinkedList;

public class DoubleLinkedList {

    private Node head;
    private Node tail;
    private int size;
    public DoubleLinkedList(){
        this.size=0;
    }

    public void getSize(){
        System.out.println(size);
    }

    private class Node{
        private int data;
        private Node previous;
        private Node next;
        public Node(int data){
            this.data = data;
        }
        public Node(int data,Node previous, Node next){
            this.data = data;
            this.previous = previous;
            this.next = next;
        }
    }

    public void insertFirst(int data){
        Node node = new Node(data);
        node.previous = null;
        node.next = head;
        if(head!=null){
            head.previous = node;
        }
        head = node;
        if(tail==null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int data){
        Node node = new Node(data);
        node.previous = tail;
        node.next = null;
        tail.next = node;
        tail = node;
        if(tail==null){
            tail = head;
        }
        size++;
    }

    public void insert(int data, int index){
        if(index==0){
            insertFirst(data);
            return;
        }
        if(index==size){
            insertLast(data);
            return;
        }
        Node temp = head;
        for (int i=1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(data,temp.previous,temp.next);
        temp.next=node;
        size++;
    }

    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("END");
    }

}
