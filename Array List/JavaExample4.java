import java.util.*;  
class JavaExample4{  
  public static void main(String args[]){  
     ArrayList<String> alist=new ArrayList<String>();  
     alist.add("Gregor Clegane");  
     alist.add("Khal Drogo");  
     alist.add("Cersei Lannister");  
     alist.add("Sandor Clegane"); 
     alist.add("Tyrion Lannister");
  
     //iterating ArrayList
     for(String str:alist)  
        System.out.println(str);  
     }  
}