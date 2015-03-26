package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LabActivity1 {
    
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
            list1.add("Video Gaming");
            list1.add("Writing");
            list1.add("Baking");
            list1.add("Drawing");
            list1.add("Satanic Rituals");
            list1.add("Knitting");
            list1.add("Yoga");
            list1.add("Homebrewing");
            String hobby = (String)list1.get(0);
        
            list1.remove(6);
            // not approved by my congregation
            list1.remove(4);
            list1.add(4, "Candle Making");
            
                for(int i=0; i < list1.size(); i++) {
                 String thing = (String)list1.get(i);
                 System.out.println("Array Place: " + i + "   Hobby: " + thing);
                }
    }
    
}