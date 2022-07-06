package module2._functions;

public class FunctionsOverloading {

    public int cubeOfNumber(int givenNumber){
        return givenNumber*givenNumber*givenNumber;
    }

    public double cubeOfNumber(double givenNumber){
        return givenNumber*givenNumber*givenNumber;
    }

    public void printData(int givenData){
        System.out.println("Given Integer Data -> "+givenData);
    }

    public void printData(String givenData){
        System.out.println("Given String Data -> "+givenData);
    }
}
