public class Foo6
{
    int x =12;

    public void go(final int x)
    {
        System.out.println(x);
    }

    public static void main(String[] args)
    {
        Foo5 f5 = new Foo5();
        f5.go(10);
    }
}