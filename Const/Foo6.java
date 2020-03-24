public class Foo6
{
    int x =12;

    public void go(final int x)
    {
        System.out.println(x);
    }

    public static void main(String[] args)
    {
        Foo6 f6 = new Foo6();
        f6.go(10);
    }
}