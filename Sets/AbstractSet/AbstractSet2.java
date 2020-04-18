// Java code to illustrate 
// methods of AbstractSet 
  
import java.util.*; 
  
public class AbstractSet2 { 
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
            System.out.println("AbstractSet before "
                               + "removeAll() operation : "
                               + abs_set); 
  
            // Creating another object of ArrayList<Integer> 
            Collection<Integer> 
                arrlist2 = new ArrayList<Integer>(); 
            arrlist2.add(1); 
            arrlist2.add(2); 
            arrlist2.add(3); 
  
            // print arrlist2 
            System.out.println("Collection Elements"
                               + " to be removed : "
                               + arrlist2); 
  
            // Removing elements from AbstractSet 
            // specified in arrlist2 
            // using removeAll() method 
            abs_set.removeAll(arrlist2); 
  
            // print arrlist1 
            System.out.println("AbstractSet after "
                               + "removeAll() operation : "
                               + abs_set); 
        } 
  
        catch (NullPointerException e) { 
            System.out.println("Exception thrown : " + e); 
        } 
    } 
}