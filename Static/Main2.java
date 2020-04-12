class Main2 { 
    public static void main(String args[]) { 
  
       // Although we have two objects, static block is executed only once. 
       Test t1 = new Test(); 
       Test t2 = new Test(); 
    } 
}