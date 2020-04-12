class Test2 { 
    static int i; 
    int j; 
    static { 
        i = 10; 
        System.out.println("static block called "); 
    } 
    Test2(){ 
        System.out.println("Constructor called"); 
    } 
}