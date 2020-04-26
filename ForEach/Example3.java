import java.util.List;
import java.util.ArrayList;
public class Example3 {
   public static void main(String[] args) {
      List<String> names = new ArrayList<String>();
      names.add("Maggie");
      names.add("Michonne");
      names.add("Rick");
      names.add("Merle");
      names.add("Governor");
      names.stream() //creating stream 
     .filter(f->f.startsWith("M")) //filtering names that starts with M 
     .forEach(System.out::println); //displaying the stream using forEach
   }
}