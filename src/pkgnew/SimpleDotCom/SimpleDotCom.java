package pkgnew.SimpleDotCom;

public class SimpleDotComTestDrive {
    int numberOfHits=0;
    int [] locationCells;
    public static void main (String[] args)
    {
        // int[] locationCells = new int[7];
        SimpleDotComTestDrive dot = new SimpleDotComTestDrive();
    }

    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for(int cell : locationCells)
        {
            if(guess==cell)
            {
                result = "hit";
                numberOfHits++;
                break;
            }
        }
        if(numberOfHits == locationCells.length)
        {
            result="kill";
        }
        System.out.println(result);
        return result;
    }

    public void setLocationCells(int[] locs)
    {
        locationCells = locs;
    }
}