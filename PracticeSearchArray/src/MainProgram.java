import java.util.*;

public class MainProgram {
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);

        String choice;
        System.out.println("Linear or Binary?");
        choice = console.next();

        startEvaluate.checkString(choice.toLowerCase());
    }
}
