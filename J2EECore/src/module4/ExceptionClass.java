package module4;

public class ExceptionClass {

    public void arrayIndexOutOfBoundsException(){
        String[] names = {"mukesh","sriram","great"};
        try{
            System.out.println(names[3].toUpperCase());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception is -> "+e);
        }
    }

}
