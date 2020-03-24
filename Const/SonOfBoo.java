public class SonOfBoo extends Boo
{
    // public SonOfBoo()
    // {
    //     super("boo");
    // }
    public SonOfBoo()
    {
        System.out.println("SonOFBoo created");
    }
    
    
    public SonOfBoo(int i)
    {
        super("Fred");
    }

    public SonOfBoo(String s)
    {
        super(42);
    }

    // public SonOfBoo(int i, String s)
    // {

    // }

    // public SonOfBoo(String a, String b, String c)
    // {
    //     super(a, b);
    // }

    public SonOfBoo(int i, int j)
    {
        super("Man", j);
    }

    // public SonOfBoo(int i, int x, int y)
    // {
    //     super(i, "Star");
    // }

    public static void main(String[] args)
    {
        SonOfBoo s = new SonOfBoo();
    }

}