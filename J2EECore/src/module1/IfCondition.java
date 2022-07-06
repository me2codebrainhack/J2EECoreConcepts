package module1;

public class IfCondition {
    public void checkVotingEligibility(int age){
        if(age > 18){
            System.out.println("Eligible to Vote");
        } else{
            System.out.println("Not Eligible to Vote");
        }
    }

    public void isNumberPositiveOrNegative(int number){
        if(number > 0){
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is Negative");
        }
    }

    public void isNumberPositiveOrNegativeOrZero(int number){
        if(number > 0){
            System.out.println("Number is Positive");
        } else if (number == 0){
            System.out.println("Number is Zero");
        } else {
            System.out.println("Number is Negative");
        }
    }

    public void largestNumber (int a, int b){
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }else{
            System.out.println(b+" is greater than "+a);
        }
    }

    public void evenOrOdd(int a){
        if(a%2==0){
            System.out.println(a+" is Even");
        }else{
            System.out.println(a+" is Odd");
        }
    }
}
