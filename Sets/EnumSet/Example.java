// Java program to illustrate working of EnumSet and 
// its functions. 
import java.util.EnumSet; 
     
enum test  
{ 
    CODE, LEARN, CONTRIBUTE, QUIZ, MCQ 
}; 
public class Example 
{ 
    public static void main(String[] args)  
    { 
        // Creating a set 
        EnumSet<test> set1, set2, set3, set4; 
  
        // Adding elements 
        set1 = EnumSet.of(test.QUIZ, test.CONTRIBUTE,  
                          test.LEARN, test.CODE); 
        set2 = EnumSet.complementOf(set1); 
        set3 = EnumSet.allOf(test.class); 
        set4 = EnumSet.range(test.CODE, test.CONTRIBUTE); 
        System.out.println("Set 1: " + set1); 
        System.out.println("Set 2: " + set2); 
        System.out.println("Set 3: " + set3); 
        System.out.println("Set 4: " + set4); 
    } 
}