package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LabActivity2 {

    public static void main(String[] args) {
                
                
                List<Employee> list = new ArrayList<>();
                
                list.add(new Employee("Doe","John","222-22-2222"));
                list.add(new Employee("Doe","Jane","333-33-3333"));
                list.add(new Employee("Smith","Dave","444-44-4444"));            
                for(int i=0; i < list.size(); i++) {
                Employee thing = (Employee)list.get(i);
                System.out.println("Array Place: " + i + "   Employee: " + thing.toString());
                }
        
    }
}