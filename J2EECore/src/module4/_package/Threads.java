package module4._package;

public class Threads extends Thread{


    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("5 * "+i+" = "+5*i);
        }
    }

    public void multiTaskingPrintTablesDisplayEvenNumber(){
        Threads t = new Threads();
        for(int i=0;i<=40;i++){
            System.out.println(i);
        }
        t.start();
    }
}
