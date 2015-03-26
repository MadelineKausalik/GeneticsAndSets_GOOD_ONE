package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LabActivity4 {
    
    public static void main(String[] args) {
        
        Set set = new HashSet();
        
        set.add(new Employee("Doe","John","222-22-2222"));
        set.add(new Employee("Doe","Jane","333-33-3333"));
        set.add(new Employee("Smith","Dave","444-44-4444"));
        set.add(new Employee("Doe","Jane","333-33-3333"));
        
        for(Object ob : set) {
                System.out.println("   Employee: " + ob.toString());
                }
    }
}