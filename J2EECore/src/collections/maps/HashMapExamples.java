package collections.maps;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExamples {

    public void createHashMap(){

        HashMap<Integer,String> employee = new HashMap<>();
        employee.put(1,"Mukesh Sriram");
        employee.put(2,"Mukesh");
        employee.put(3,"Sriram");

        System.out.println(employee);
        System.out.println("Keys of map -> "+employee.keySet());
        System.out.println("Values of map -> "+employee.values());
        System.out.println("Mapping of map ->"+employee.entrySet());

        for(Integer key : employee.keySet()){
            System.out.println(key);
        }

        for(String names : employee.values()){
            System.out.println(names);
        }

        for(Entry<Integer,String> emp : employee.entrySet()){
            System.out.println("Key -> "+emp.getKey()+" value -> "+emp.getValue());
        }

        System.out.println("Employee for key 1 -> "+employee.get(1));

        int i=0;

        for(Entry<Integer,String> entry : employee.entrySet()){
            entry.setValue(entry.getValue()+i);
            i++;
        }
        System.out.println("Updated new Map -> "+employee);
        employee.forEach((key,value)->{
            value=value+1;
            System.out.println("For the key "+key+" Value is : "+value);
        });
        employee.remove(3);
        System.out.println("After removing "+employee);

        HashMap<Integer,String> employeeMore = new HashMap<>(employee);
        employeeMore.put(4,"Sriram");
        System.out.println("After combining maps -> "+employeeMore);
    }
}
