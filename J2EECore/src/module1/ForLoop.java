package module1;

public class ForLoop {
    public void printEvenOddNumbers(){
        System.out.println("10 even numbers");
        for(int i=1;i<=20;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("10 odd numbers");
        for(int i=1;i<=20;i++){
            if(!(i%2==0)){
                System.out.println(i);
            }
        }
    }

    public void factorialOfNumber(int number){
        int result = 1;
        for(int i=number;i>1;i--){
            if(i==number){
                result = number * (number-1);
            }else{
                result = result * (i-1);
            }
        }
        System.out.println("Factorial of given number is "+result);
    }

    public void printTablesOf10(int number){
        for(int i=1;i<=10;i++){
            System.out.println(number + " * " + i+" = "+(number * i));
        }
    }

    public void reverseNumber(int number){
        int temp;
        int newNumber=0;
        for(int i=number;number/10>1||number%10>1;){
            temp = number % 10;
            newNumber = (newNumber*10)+temp;
            number = number/10;
        }
        System.out.println("Revers of given number is "+newNumber);
    }

    public void printFibonacciSeries(int number){
        System.out.println("Fibonacci series for given number is ");
        int fibonacciNumberF=0;
        int fibonacciNumberS=1;
        int fibonacciSum;
        System.out.print(0);
        System.out.print(1);
        for (int i=1;i<=number;i++){
            fibonacciSum = fibonacciNumberF + fibonacciNumberS;
            System.out.print(fibonacciSum);
            fibonacciNumberF = fibonacciNumberS;
            fibonacciNumberS = fibonacciSum;
        }

    }
}
