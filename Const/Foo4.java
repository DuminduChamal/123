public class Foo4
{
    static final int x =12;

    public void go()
    {
        System.out.println(x);
    }

    public static void main(String[] args)
    {
        Foo4 f4 = new Foo4();
        f4.go();
    }
}