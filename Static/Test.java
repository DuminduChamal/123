class Test { 
    static int i; 
    int j; 
      
    // start of static block  
    static { 
        i = 10; 
        System.out.println("static block called "); 
    } 
    // end of static block  
} 