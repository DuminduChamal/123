class Test { 
    static int i; 
    int j; 
    static { 
        i = 10; 
        System.out.println("static block called "); 
    } 
    Test(){ 
        System.out.println("Constructor called"); 
    } 
}