import module1.DataTypesOperations;
import module1.ForLoop;
import module1.IfCondition;
import module1.WhileLoop;
import module2._arrays.ArrayTwoDimensional;
import module2._arrays.Arrays;
import module2._functions.Functions;
import module2._functions.FunctionsOverloading;
import module2.problem_statement.ElectionWinner;
import module2.problem_statement.ModuleAssignment;
import module3._classes_objects.Bank;
import module3._classes_objects.CalculateSalary;
import module3._classes_objects.Employee;
import module3._classes_objects.Student;
import module3._constructors.Constructors;
import module3._isA_hasA_relation.Engine;
import module3._isA_hasA_relation.Lincoln;
import module3._methods_overriding.Bmw;
import module3._methods_overriding.Car;
import module3._methods_overriding.Merc;
import module3._problem_statement.CurrentAccountDetails;

import java.util.Scanner;

public class J2EECoreMain {
    public static void main (String[] args){

        DataTypesOperations dto = new DataTypesOperations();
        dto.add(1,24);
        dto.multiply(45,790);
        dto.subtract(600,300);
        dto.divide(720,30);
        dto.check('S');
        dto.increment(9);
        dto.decrement(11);

        IfCondition ic = new IfCondition();
        ic.checkVotingEligibility(19);
        ic.isNumberPositiveOrNegative(-21);
        ic.isNumberPositiveOrNegativeOrZero(0);
        ic.largestNumber(-2,1);
        ic.evenOrOdd(3);

        ForLoop fl = new ForLoop();
        fl.printEvenOddNumbers();
        fl.factorialOfNumber(1);
        fl.printTablesOf10(5);
        fl.reverseNumber(909309038);
        fl.printFibonacciSeries(5);

        WhileLoop wlp = new WhileLoop();
        wlp.printEvenOddNumbers();
        wlp.factorialOfNumber(5);
        wlp.printTablesOf10(13);
        wlp.reverseNumber(34567);

        int arrayFindLargest[] = new int[]{24,65,99,1};
        Arrays ays = new Arrays();
        ays.largestNumberInArray(arrayFindLargest);
        String movieInTheater[] = new String[] {"Pushpa","Avengers","DoctorStrange"};
        ays.isMoviePresentInTheater("avenGers",movieInTheater);
        int sortArrayAscendingOrder[] = new int[]{99,0,24,36,53,52,51,12,13,15,18};
        ays.insertionSortArrayAscending(sortArrayAscendingOrder);
        int secondLargestBeforeAfterSortingArray[] = new int[]{99,0,24,36,53,52,51,12,13,15,18};
        ays.secondLargestElementInArray(secondLargestBeforeAfterSortingArray);
        int reverseTheArray[] = new int[]{99,0,24,36,53,52,51,12,13,15,18};
        ays.reverseArray(reverseTheArray);

        ArrayTwoDimensional atd = new ArrayTwoDimensional();
        int firstArray[][] = new int[][]{{2,3},{3,5}};
        int secondArray[][] = new int[][]{{5,25},{2,12}};
        atd.addSubtractTwoDimensionalArray(firstArray,secondArray);
        int transposeArray[][] = new int[][]{{21,23,21,55},{12,-4,21,-2},{56,-99,3,21 }};
        atd.transposeMatrix(transposeArray);
        int addAllMatrix[][] = new int[][]{{2,3,45},{1,2,3},{3,2,1}};
        atd.addAllMatrix(addAllMatrix);

        Functions fns = new Functions();
        int cubeNumber = 3;
        System.out.println("The cube of "+cubeNumber+" is : "+fns.cubeOfNumber(cubeNumber));
        int factorialNumber = 5;
        System.out.println("The factorial of "+factorialNumber+" is : "+fns.factorialOfNumber(factorialNumber));
        int reverseNumber = 25678947;
        System.out.println("Reverse of the number "+reverseNumber+" is : "+fns.reverseOfNumber(reverseNumber));
        String isPalindromeOrNot = "liril";
        System.out.println("The given String "+isPalindromeOrNot+" is palindrome or not : "+fns.checkPalindromeString(isPalindromeOrNot));
        String reverseString = "How is this Possible!";
        System.out.println("The reverse of String "+reverseString+" is -> "+fns.reverseString(reverseString));
        int isEvenOrOdd = 27;
        System.out.println("The given number "+isEvenOrOdd+" is even or odd : "+fns.isNumberOddOrEven(isEvenOrOdd));
        int fibonacciSeries = 6;
        System.out.println("Given Fibonacci Series -> ");
        int[] fbnSeries = fns.fibonaciSeriesForNumber(fibonacciSeries);
        for(int i=0;i<fbnSeries.length;i++){
            System.out.print(" "+fbnSeries[i]);
        }
        System.out.println(" ");
        int isPrimeOrNot = 99;
        System.out.println("The given number "+isPrimeOrNot+" is prime or not : "+fns.isNumberPrimeOrNot(isPrimeOrNot));

        FunctionsOverloading fol = new FunctionsOverloading();
        System.out.println("Cube of given integer is -> "+fol.cubeOfNumber(23));
        System.out.println("Cube of given Double is -> "+fol.cubeOfNumber(2.2));
        fol.printData(23);
        fol.printData("Here it is String data");

        ModuleAssignment mag = new ModuleAssignment();
        System.out.println("Employee Info -> ");
        mag.displayEmployeeInfo(new int[]{00,02,03,04,05},new String[]{"Divya","Shresta","Charan","Vineet","Jabbar"},new int[]{600000,550000,500000,500000,300000});
        System.out.println("Employee Info with no salary -> ");
        mag.displayEmployeeInfo(new int[]{00,02,03,04,05},new String[]{"Divya","Shresta","Charan","Vineet","Jabbar"});
        System.out.println("Given record for employee name -> ");
        mag.displayEmployeeInfo("charan",new int[]{00,02,03,04,05},new String[]{"Divya","Shresta","Charan","Vineet","Jabbar"},new int[]{600000,550000,500000,500000,300000});

        ElectionWinner elw = new ElectionWinner();
        elw.winnerInEachStateInfoAndFinalWinner(new String[]{"Arizona","Florida","Vermont","Texas","Georgia"},new int[][]{{126,152},{32,85},{230,121},{21,125},{200,13}});

        Car c = new Car();
        Bmw b = new Bmw();
        Merc m = new Merc();
        c.display();
        b.display();
        m.display();

        Student stud = new Student("Mukesh",3.83,"Graduated",true);
        stud.semGrade();
        stud.isAthlete();
        stud.collegeName();
        stud.degreeName();
        stud.isGraduated();

        Employee emp = new Employee("Mukesh");
        emp.employeeName();
        emp.CompanyName();
        emp.TeamName();
        emp.ProjectName();

        Bank bk = new Bank("msriram",2000.00);
        bk.displayUserName();
        bk.displayAmountWithdrawn();
        bk.remainingBalance();

        CalculateSalary cls = new CalculateSalary("Mukesh");

        Constructors cns = new Constructors(24120166,"Mukesh","IT",8600,500,250,2350);

        Lincoln lcn = new Lincoln();
        Engine V6 = new Engine();
        V6.setEngine("V6_Powerful");
        lcn.setColor("Red_Phantom");
        lcn.setEgne(V6);
        lcn.lincolnInfo();

        System.out.println("Enter the Type of Account you want to create -> Account SbAccount ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Enter amount deposited ");
        double amount = sc.nextDouble();
        amount=amount+2000.00;
        CurrentAccountDetails cad = new CurrentAccountDetails(45618329,name,amount);
        cad.printCurrentAccountDetails();

    }
}
