package module1;

public class WhileLoop {

    public void printEvenOddNumbers(){
        int i=1;
        System.out.println("");
        System.out.println("10 even numbers");
        while(i<=10){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
        i=0;
        System.out.println("10 odd numbers");
        while(i<=10){
            if(i%2!=0){
                System.out.println(i);
            }
            i++;
        }
    }

    public void factorialOfNumber(int number){
       int result = number;
       while(number>1){
           result = result * (number-1);
           number--;
       }
        System.out.println("The Factorial of given number is "+result);
    }

    public void printTablesOf10(int number){
        int i =1;
        while(i<=10){
            System.out.println(number+" * "+i+" = "+number*i);
            i++;
        }
    }

    public void reverseNumber(int number){
        int temp;
        int newNumber=0;
        while(number/10>0||number%10>0){
            temp = number%10;
            newNumber = newNumber*10+temp;
            number = number/10;
        }
        System.out.println("Reverse for given number is "+newNumber);
    }
}
