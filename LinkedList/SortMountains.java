import java.util.*;

public class SortMountains
{
    LinkedList<Mountain> mtn = new LinkedList<Mountain>();

    class nameCompare implements Comparator<Mountain>
    {
        public int compare(Mountain one, Mountain two)
        {
            return one.name.compareTo(two.name);
        }
    }

    class HeightCompare implements Comparator<Mountain>
    {
        public int compare(Mountain one, Mountain two)
        {
            return (two.height-one.height);
        }
    }

    public static void main(String[] args) {
        new SortMountains().go();
    }

    public void go()
    {
        
    }
}