package collections.maps;

import java.util.*;
import java.util.Map.Entry;

public class LinkedHashMapExamples {

    public void createLinkedHashMap(){
        LinkedHashMap<Integer,String> errorCodes = new LinkedHashMap<>();
        errorCodes.put(500,"InternalServerError");
        errorCodes.put(404,"PageNotFound");
        errorCodes.put(401,"UnAuthorized");
        System.out.println("Printing all Error Codes used in project ->");
        for (Integer errorCode : errorCodes.keySet()){
            System.out.println(errorCode);
        }
        System.out.println("Printing all Error Names used in project ->");
        for (String errorName : errorCodes.values()){
            System.out.println(errorName);
        }
        System.out.println("Error Code for Each Error Name ->");
        for(Entry<Integer,String> entry : errorCodes.entrySet()){
            System.out.println("For Error Name -> "+entry.getValue()+" Error Code is "+entry.getKey());
        }
        LinkedHashMap<Integer,String> newErrorCodes = new LinkedHashMap<>(errorCodes);
        newErrorCodes.put(400,"BadRequest");
        newErrorCodes.put(403,"Forbidden");

        System.out.println("After Adding more Errors new Error Code List -> ");
        newErrorCodes.values().forEach(val-> System.out.println(val));




    }
}
