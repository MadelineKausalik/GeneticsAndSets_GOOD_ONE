package lists.with.generics;

import common.Employee;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ClassExamples {
//    String[] stringList = new String[5];
    //not interchangable
//    ArrayList list = new ArrayList();
    //interchangable more abstract
    //
    public static void main(String[] args) {
        
//        List list = new ArrayList();
            List<String> list = new ArrayList<>();
            //by casting <String> you don't need to cast
            //But you can only have Strings
    
          //Set<String> list = new HashSet<>();
          //Works
            
//ArrayList changes size
    //Creates new array to do that just like the trick Jim showed us
//    list.add("5");
    //can only store objects
    list.add("Beer");
    list.add("Soda");
    list.add("Monster");
    list.add("Chips");
    list.add("Mac and Cheese");
    list.add("Steak Sauce");
    
    //comes out as an object not a string
  //String item = item.get[1];

    //casting tells Java what we want
    //example: new Dog() Java doesn't know what we want
    String item = (String)list.get(0);

//  removes the third item
    list.remove(3);
    
    for(String s2 :  list) {
        s2 += "Item Retrieved " + s2;
        System.out.println(s2);
    }
    //add item to the second position
    list.add(2, "Steak");
    

//  Old way
    for(int i=0; i < list.size(); i++) {
        String s = (String)list.get(i);
        System.out.println(s);
    }

        Employee e1 = new Employee(item, item, item);
        Employee e2 = new Employee(item, item, item);
    }


    
}