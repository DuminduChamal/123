import java.util.List;
import java.util.ArrayList;
public class Example4 {
   public static void main(String[] args) {
      List<String> names = new ArrayList<String>();
      names.add("Maggie"); 
      names.add("Michonne");
      names.add("Rick");
      names.add("Merle");
      names.add("Governor"); 
      //forEach - the output would be in any order
      System.out.println("Print using forEach");
      names.stream() 
     .filter(f->f.startsWith("M"))
     .parallel() 
     .forEach(n->System.out.println(n)); 

     
     System.out.println("Print using forEachOrdered"); 
     names.stream()  
     .filter(f->f.startsWith("M"))  
     .parallel() 
     .forEachOrdered(n->System.out.println(n));
   }
}