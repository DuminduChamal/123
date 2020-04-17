// Java code to illustrate AbstractSet 
  
import java.util.*; 
  
public class AbstractSet1 { 
    public static void main(String[] args) throws Exception 
    { 
  
        try { 
  
            // Creating object of AbstractSet<Integer> 
            AbstractSet<Integer> 
                abs_set = new TreeSet<Integer>(); 
  
            // Populating abs_set 
            abs_set.add(1); 
            abs_set.add(2); 
            abs_set.add(3); 
            abs_set.add(4); 
            abs_set.add(5); 
  
            // print abs_set 
            System.out.println("AbstractSet: "
                               + abs_set); 
        } 
        catch (Exception e) { 
            System.out.println(e); 
        } 
    } 
}