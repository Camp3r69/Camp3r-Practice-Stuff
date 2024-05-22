import java.util.*;
import javax.swing.JOptionPane;
public class Game {
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);

        String userInput;
        int endLess = 0;
        while(endLess != 1) {
            userInput = JOptionPane.showInputDialog("What's your 'Yes or No' question?");

            RNGGenerator startGame = new RNGGenerator();

            if(userInput.equals("End") || userInput.equals("end"))
                System.exit(0);

            startGame.programStartRNG();
        }
    }
}
