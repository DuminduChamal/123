// Java code to illustrate 
// methods of AbstractQueue 
  
import java.util.*; 
import java.util.concurrent.LinkedBlockingQueue; 
  
public class Queue2 { 
    public static void main(String[] argv) 
        throws Exception 
    { 
        // Creating object of AbstractQueue<Integer> 
        AbstractQueue<Integer> 
            AQ = new LinkedBlockingQueue<Integer>(); 
  
        // Populating AQ using add() method 
        AQ.add(10); 
        AQ.add(20); 
        AQ.add(30); 
        AQ.add(40); 
        AQ.add(50); 
  
        // print AQ 
        System.out.println("AbstractQueue contains: "
                           + AQ); 
  
        // Get the head of Queue using element() method 
        System.out.println("Head: " + AQ.element()); 
  
        // Clear the Queue using clear() method 
        AQ.clear(); 
        System.out.println("AbstractQueue: " + AQ); 
    } 
}