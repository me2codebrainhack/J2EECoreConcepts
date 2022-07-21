package module4._package;

import java.util.Scanner;

public class UtilPackage {

    public void subtract(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int number1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int number2 = sc.nextInt();
        int result = number1-number2;
        System.out.println("The result of subtracting two given numbers is : "+result);
    }

    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int number1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int number2 = sc.nextInt();
        int result = number1+number2;
        System.out.println("The result of adding two given numbers is : "+result);
    }

    public void divide(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int number1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int number2 = sc.nextInt();
        try {
            int result = number1 / number2;
            System.out.println("The result of dividing two given numbers is : "+result);
        }catch (Exception e){
            System.out.println("Exception is -> "+e);
        }
    }

    public void multiply(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int number1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int number2 = sc.nextInt();
        int result = number1*number2;
        System.out.println("The result of multiplying two given numbers is : "+result);
    }

    public void factorialOfNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for its factorial");
        int factNumber = sc.nextInt();
        int result=1;
        for(int i=factNumber;i>1;i--){
            result = result*i;
        }
        System.out.println("Factorial of given number "+factNumber+" is : "+result);
    }

    public void reverseNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want to reverse");
        int revNumber = sc.nextInt();
        System.out.println("Reverse of given number "+revNumber+" is : ");
        int result=0;
        if(revNumber<10){
            result=revNumber;
        }else{
            while(revNumber/10!=0){
                result = revNumber % 10 + (result * 10);
                revNumber = revNumber/10;
            }
            result=(result * 10)+revNumber;
        }
        System.out.println(result);
    }
}
