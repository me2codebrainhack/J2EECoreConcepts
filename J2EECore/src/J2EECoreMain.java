import collections.list.DoubleLinkedList;
import collections.list.LinkedListDataStructure;
import collections.list.LinkedListExamples;
import collections.maps.HashMapExamples;
import collections.maps.LinkedHashMapExamples;
import collections.queue.PriorityQueueExamples;
import collections.set.HashSetExamples;
import collections.set.LinkedHashSetExamples;
import collections.set.TreeSetExamples;

public class J2EECoreMain {
    public static void main (String[] args){

//        DataTypesOperations dto = new DataTypesOperations();
//        dto.add(1,24);
//        dto.multiply(45,790);
//        dto.subtract(600,300);
//        dto.divide(720,30);
//        dto.check('S');
//        dto.increment(9);
//        dto.decrement(11);
//
//        IfCondition ic = new IfCondition();
//        ic.checkVotingEligibility(19);
//        ic.isNumberPositiveOrNegative(-21);
//        ic.isNumberPositiveOrNegativeOrZero(0);
//        ic.largestNumber(-2,1);
//        ic.evenOrOdd(3);
//
//        ForLoop fl = new ForLoop();
//        fl.printEvenOddNumbers();
//        fl.factorialOfNumber(1);
//        fl.printTablesOf10(5);
//        fl.reverseNumber(909309038);
//        fl.printFibonacciSeries(5);
//
//        WhileLoop wlp = new WhileLoop();
//        wlp.printEvenOddNumbers();
//        wlp.factorialOfNumber(5);
//        wlp.printTablesOf10(13);
//        wlp.reverseNumber(34567);
//
//        int arrayFindLargest[] = new int[]{24,65,99,1};
//        Arrays ays = new Arrays();
//        ays.largestNumberInArray(arrayFindLargest);
//        String movieInTheater[] = new String[] {"Pushpa","Avengers","DoctorStrange"};
//        ays.isMoviePresentInTheater("avenGers",movieInTheater);
//        int sortArrayAscendingOrder[] = new int[]{99,0,24,36,53,52,51,12,13,15,18};
//        ays.insertionSortArrayAscending(sortArrayAscendingOrder);
//        int secondLargestBeforeAfterSortingArray[] = new int[]{99,0,24,36,53,52,51,12,13,15,18};
//        ays.secondLargestElementInArray(secondLargestBeforeAfterSortingArray);
//        int reverseTheArray[] = new int[]{99,0,24,36,53,52,51,12,13,15,18};
//        ays.reverseArray(reverseTheArray);
//
//        ArrayTwoDimensional atd = new ArrayTwoDimensional();
//        int firstArray[][] = new int[][]{{2,3},{3,5}};
//        int secondArray[][] = new int[][]{{5,25},{2,12}};
//        atd.addSubtractTwoDimensionalArray(firstArray,secondArray);
//        int transposeArray[][] = new int[][]{{21,23,21,55},{12,-4,21,-2},{56,-99,3,21 }};
//        atd.transposeMatrix(transposeArray);
//        int addAllMatrix[][] = new int[][]{{2,3,45},{1,2,3},{3,2,1}};
//        atd.addAllMatrix(addAllMatrix);
//
//        Functions fns = new Functions();
//        int cubeNumber = 3;
//        System.out.println("The cube of "+cubeNumber+" is : "+fns.cubeOfNumber(cubeNumber));
//        int factorialNumber = 5;
//        System.out.println("The factorial of "+factorialNumber+" is : "+fns.factorialOfNumber(factorialNumber));
//        int reverseNumber = 25678947;
//        System.out.println("Reverse of the number "+reverseNumber+" is : "+fns.reverseOfNumber(reverseNumber));
//        String isPalindromeOrNot = "liril";
//        System.out.println("The given String "+isPalindromeOrNot+" is palindrome or not : "+fns.checkPalindromeString(isPalindromeOrNot));
//        String reverseString = "How is this Possible!";
//        System.out.println("The reverse of String "+reverseString+" is -> "+fns.reverseString(reverseString));
//        int isEvenOrOdd = 27;
//        System.out.println("The given number "+isEvenOrOdd+" is even or odd : "+fns.isNumberOddOrEven(isEvenOrOdd));
//        int fibonacciSeries = 6;
//        System.out.println("Given Fibonacci Series -> ");
//        int[] fbnSeries = fns.fibonaciSeriesForNumber(fibonacciSeries);
//        for(int i=0;i<fbnSeries.length;i++){
//            System.out.print(" "+fbnSeries[i]);
//        }
//        System.out.println(" ");
//        int isPrimeOrNot = 99;
//        System.out.println("The given number "+isPrimeOrNot+" is prime or not : "+fns.isNumberPrimeOrNot(isPrimeOrNot));
//
//        FunctionsOverloading fol = new FunctionsOverloading();
//        System.out.println("Cube of given integer is -> "+fol.cubeOfNumber(23));
//        System.out.println("Cube of given Double is -> "+fol.cubeOfNumber(2.2));
//        fol.printData(23);
//        fol.printData("Here it is String data");
//
//        ModuleAssignment mag = new ModuleAssignment();
//        System.out.println("Employee Info -> ");
//        mag.displayEmployeeInfo(new int[]{00,02,03,04,05},new String[]{"Divya","Shresta","Charan","Vineet","Jabbar"},new int[]{600000,550000,500000,500000,300000});
//        System.out.println("Employee Info with no salary -> ");
//        mag.displayEmployeeInfo(new int[]{00,02,03,04,05},new String[]{"Divya","Shresta","Charan","Vineet","Jabbar"});
//        System.out.println("Given record for employee name -> ");
//        mag.displayEmployeeInfo("charan",new int[]{00,02,03,04,05},new String[]{"Divya","Shresta","Charan","Vineet","Jabbar"},new int[]{600000,550000,500000,500000,300000});
//
//        ElectionWinner elw = new ElectionWinner();
//        elw.winnerInEachStateInfoAndFinalWinner(new String[]{"Arizona","Florida","Vermont","Texas","Georgia"},new int[][]{{126,152},{32,85},{230,121},{21,125},{200,13}});
//
//        Car c = new Car();
//        Bmw b = new Bmw();
//        Merc m = new Merc();
//        c.display();
//        b.display();
//        m.display();
//
//        Student stud = new Student("Mukesh",3.83,"Graduated",true);
//        stud.semGrade();
//        stud.isAthlete();
//        stud.collegeName();
//        stud.degreeName();
//        stud.isGraduated();
//
//        Employee emp = new Employee("Mukesh");
//        emp.employeeName();
//        emp.CompanyName();
//        emp.TeamName();
//        emp.ProjectName();
//
//        Bank bk = new Bank("msriram",2000.00);
//        bk.displayUserName();
//        bk.displayAmountWithdrawn();
//        bk.remainingBalance();
//
//        CalculateSalary cls = new CalculateSalary("Mukesh");
//
//        Constructors cns = new Constructors(24120166,"Mukesh","IT",8600,500,250,2350);
//
//        Engine engine = new Engine();
//        Lincoln lincoln = new Lincoln(engine);
//        lincoln.setColor("Red_Phantom");
//        lincoln.setEngine("V6_TwinTurbo");
//        lincoln.lincolnInfo();
//
//        System.out.println("Enter the Type of Account you want to create -> Account SbAccount ");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        System.out.println("Enter amount deposited ");
//        double amount = sc.nextDouble();
//        amount=amount+2000.00;
//        CurrentAccountDetails cad = new CurrentAccountDetails(45618329,name,amount);
//        cad.printCurrentAccountDetails();
//
//        Queue queue = new Queue();
//        queue.createQueue();
//        queue.addElement();
//        queue.removeElement();
//
//        UtilClass util = new UtilClass();
//        util.add();
//        util.subtract();
//        util.divide();
//        util.multiply();
//        util.factorial();
//        util.reverseNumber();
//
//        ExceptionClass exception = new ExceptionClass();
//        exception.arrayIndexOutOfBoundsException();
//
//        Threads threads = new Threads();
//        threads.multiTaskingPrintTablesDisplayEvenNumber();

//        ArrayListExamples arrayListExamples = new ArrayListExamples();
//        arrayListExamples.getColorsList();
//        arrayListExamples.iterateListInsertElement();
//        arrayListExamples.getSpecificItemFromList();
//        arrayListExamples.setSpecificItemOnList();
//        arrayListExamples.removeElementFromList();
//        arrayListExamples.searchList();
//        arrayListExamples.sortList();
//        arrayListExamples.copyShuffleReverseContainsSwapSubList();
//        arrayListExamples.joinArrayEmptyList();
//        arrayListExamples.sizeTrimSizeIncreaseList();

//        LinkedListExamples linkedListExamples = new LinkedListExamples();
//        linkedListExamples.appendLinkedList();

//        LinkedListDataStructure ll = new LinkedListDataStructure();
//        ll.insertFirst(3);
//        ll.insertFirst(4);
//        ll.insertFirst(6);
//        ll.insertLast(1);
//        ll.insert(25,2);
//        ll.display();
//
//        DoubleLinkedList dll = new DoubleLinkedList();
//        dll.insertFirst(21);
//        dll.insertLast(2);
//        dll.insertFirst(11);
//        dll.insertLast(32);
//        dll.insertFirst(51);
//        dll.insert(100,2);
//        dll.display();
//        dll.getSize();

//        PriorityQueueExamples priorityQueueExamples = new PriorityQueueExamples();
//        priorityQueueExamples.createQueue();
//
//        HashSetExamples hashSetExamples = new HashSetExamples();
//        hashSetExamples.createSet();
//
//        LinkedHashSetExamples linkedHashSetExamples = new LinkedHashSetExamples();
//        linkedHashSetExamples.createLinkedHashSet();

//        TreeSetExamples treeSetExamples = new TreeSetExamples();
//        treeSetExamples.createTreeSet();

//        HashMapExamples hashMapExamples = new HashMapExamples();
//        hashMapExamples.createHashMap();

        LinkedHashMapExamples linkedHashMapExamples = new LinkedHashMapExamples();
        linkedHashMapExamples.createLinkedHashMap();


    }
}
