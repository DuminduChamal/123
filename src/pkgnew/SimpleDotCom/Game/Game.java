import java.util.ArrayList;

public class Game{
    public static void main (String[] args)
    {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int)(Math.random()*5);
        // String num = String.valueOf(randomNum);
        ArrayList<Integer> locations = new ArrayList<Integer>();
        locations.add(randomNum);
        locations.add(randomNum+1);
        locations.add(randomNum+2);
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while(isAlive== true)
        {
            String guess = helper.getUserInput("Enter a number :");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if(result.equals("kill"))
            {
                isAlive = false;
                System.out.println("You Took "+numOfGuesses+" guesses");
            }
        }
    }
}
