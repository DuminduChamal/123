import java.util.ArrayList;
public class JavaExample2 {
   public static void main(String[] args) {
      ArrayList<String> names = new ArrayList<String>();
      names.add("Jim");
      names.add("Jack");
      names.add("Ajeet");
      names.add("Chaitanya");
      names.set(0, "Lucy");
      System.out.println(names);
   }
}