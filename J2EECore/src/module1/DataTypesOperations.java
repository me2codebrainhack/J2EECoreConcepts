package module1;

public class DataTypesOperations {

    public void add (int a, int b){
        System.out.println("Sum of the number are : "+(a+b));
    }

    public void subtract (int a, int b){
        System.out.println("Difference of numbers are : "+(a-b));
    }

    public void multiply (int a, int b){
        System.out.println("Product of the numbers are : "+(a*b));
    }

    public void divide (int a, int b){
        System.out.println("Divisions of the numbers are : "+(a/b));
    }

    public void check (char a){
        if (a=='S'){
            System.out.println("Initials are matching with user");
        }
    }

    public void increment(int a){
        a++;
        System.out.println("on increment the number is : "+a);
    }

    public void decrement(int a){
        a--;
        System.out.println("on decrement the number is : "+a);
    }

}
