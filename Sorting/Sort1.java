/ A sample Java program to demonstrate working of 
// Arrays.sort(). 
// It by default sorts in ascending order. 
import java.util.Arrays; 
  
public class Sort1 { 
    public static void main(String[] args) 
    { 
        int[] arr = { 13, 7, 6, 45, 21, 9, 101, 102 }; 
  
        Arrays.sort(arr); 
  
        System.out.printf("Modified arr[] : %s", 
                          Arrays.toString(arr)); 
    } 
} 