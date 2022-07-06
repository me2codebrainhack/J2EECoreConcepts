package module2._functions;

public class Functions {

    public int cubeOfNumber(int givenNumber){
        return givenNumber*givenNumber*givenNumber;
    }

    public int factorialOfNumber(int givenNumber){
        int result=1;
        while(givenNumber>0){
            result = result *givenNumber;
            givenNumber--;
        }
        return result;
    }

    public int reverseOfNumber(int givenNumber){
        int result=0;
        while(givenNumber>0){
            result=result*10+givenNumber%10;
            givenNumber = givenNumber/10;
        }
        return result;
    }

    public boolean checkPalindromeString(String givenString){
        boolean isPalindrome = true;
        int counter=givenString.length()-1;
        for(int i=0;i<givenString.length();i++){
            if(givenString.charAt(i)!=givenString.charAt(counter)){
                isPalindrome = false;
                break;
            }
            counter--;
        }
        return isPalindrome;
    }

    public StringBuffer reverseString(String givenString){
        StringBuffer reverseString = new StringBuffer();
        for(int i=givenString.length()-1;i>=0;i--){
            reverseString.append(String.valueOf(givenString.charAt(i)));
        }
        return reverseString;
    }

    public String isNumberOddOrEven(int givenNumber){
        String result=null;
        if(givenNumber%2==0){
            result  = "Even Number";
        }else{
            result = "Odd Number";
        }
        return result;
    }

    public int[] fibonaciSeriesForNumber(int givenNumber){
        int[] fibonaci = new int[givenNumber+1];
        fibonaci[0]=0;
        fibonaci[1]=1;
        for(int i=2;i<=givenNumber;i++){
            fibonaci[i]=fibonaci[i-2]+fibonaci[i-1];
        }
        return fibonaci;
    }

    public String isNumberPrimeOrNot(int givenNumber){
        String isPrime = "Yes";
        if(givenNumber==0&&givenNumber==1){
            isPrime = "No";
        }else{
            for(int i=2;i<givenNumber;i++){
                if(givenNumber%i==0){
                    isPrime = "No";
                    break;
                }
            }
        }
        return isPrime;
    }

}
