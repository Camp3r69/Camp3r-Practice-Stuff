import java.util.*;
public class RockPaperScissors {
    public static void main(String args[]) throws InterruptedException {
        int neverStop = 1;
        while (neverStop != 2){
            Scanner console = new Scanner(System.in);
            String userInput;
            System.out.println("\nRock, Paper, or Scissors?");
            userInput = console.next();

            Source call = new Source();

            call.gameStart(userInput.toLowerCase());
        }
    }
}
