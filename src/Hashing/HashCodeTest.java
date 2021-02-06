package Hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashCodeTest{

    public static void main(String[] args){

        Map<Employee, String> empMap = new HashMap<Employee, String>();

        Employee emp1 = new Employee("John", 23, "Bangalore");
        Employee emp2 = new Employee("Max", 29, "Chennai");
        empMap.put(emp1, "John details");
        empMap.put(emp2, "Max details");
        System.out.println(emp1);
        System.out.println(emp2);
        Employee emp3 = new Employee("John", 23, "Bangalore");
        System.out.println(empMap.get(emp3));

        for (Map.Entry<Employee, String> e : empMap.entrySet()){

            System.out.println("1 " +e.getKey().getName() + " : "+ e.getValue());
        }
    }



}
