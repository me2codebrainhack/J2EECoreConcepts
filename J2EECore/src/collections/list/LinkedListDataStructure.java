package collections.list;

public class LinkedListDataStructure {

    private Node head;
    private Node tail;
    private int size;
    public LinkedListDataStructure(){
        this.size = 0;
    }

    private class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
        }
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public void insertFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int data){
        if(tail == null){
            insertFirst(data);
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int data, int index){
        if(index==0){
            insertFirst(index);
            return;
        }
        if(index==size){
            insertLast(index);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(data,temp.next);
        temp.next = node;

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
