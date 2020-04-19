// Java program to demonstrate ConcurrentSkipListSet 
  
import java.util.concurrent.ConcurrentSkipListSet; 
  
class ConcurrentSkipListSetLastExample1 { 
    public static void main(String[] args) 
    { 
  
        // Initializing the set using ConcurrentSkipListSet() 
        ConcurrentSkipListSet<Integer> 
            set = new ConcurrentSkipListSet<Integer>(); 
  
        // Adding elements to this set 
        set.add(78); 
        set.add(64); 
        set.add(12); 
        set.add(45); 
        set.add(8); 
  
        // Printing the ConcurrentSkipListSet 
        System.out.println("ConcurrentSkipListSet: "
                           + set); 
  
        // Initializing the set using 
        // ConcurrentSkipListSet(Collection) 
        ConcurrentSkipListSet<Integer> 
            set1 = new ConcurrentSkipListSet<Integer>(set); 
  
        // Printing the ConcurrentSkipListSet1 
        System.out.println("ConcurrentSkipListSet1: "
                           + set1); 
    } 
}