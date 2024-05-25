import java.io.PushbackReader;
import java.util.*;
import javax.swing.JOptionPane;
public class MainProgram {
    public static void main(String args[]) {
        String userGenerate;
        Scanner console = new Scanner(System.in);

        Source startGenerate = new Source();

            userGenerate = JOptionPane.showInputDialog(null, "Ready to challenge yourself?\nType 'Yes' to Start\nType 'No' to End");

            if(userGenerate.equals("No") || userGenerate.equals("no"))
                System.exit(0);
            else if(userGenerate.equals("Yes") || userGenerate.equals("yes"))
            startGenerate.characterGeneration();
    }
}
