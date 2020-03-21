package pkgnew.SimpleDotCom;

public class SimpleDotCom{
    int numberOfHits=0;
    int [] locationCells;

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