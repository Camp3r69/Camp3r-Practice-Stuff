import javax.swing.text.Element;
import java.util.*;
public class startEvaluate {

    public static void checkString(String userInput){

        if(userInput.equals("linear")) {
            System.out.println("User Selected Linear:\n");
            Linear();
        }
        else if(userInput.equals("binary")){
            System.out.println("User Selected Binary:\n");
            Binary();
        }
        else{
            System.out.println("Error not valid: Closing program");
            System.exit(0);
        }
    }

    private static void Linear(){
        Scanner console = new Scanner(System.in);
        int findValue, howMany;
        System.out.println("How many values do you want in an Array?");
        howMany = console.nextInt();

        int ElementsL[] = new int[howMany];

        for(int i = 0; i<howMany; i++){

            ElementsL[i] = (int) (Math.random() * 50) + 1;
        }

        System.out.println(Arrays.toString(ElementsL));

        System.out.println("\nWhat value do you want to find?");
        findValue = console.nextInt();

        linearFind(ElementsL, findValue);

        if(linearFind(ElementsL, findValue) != -1)
        System.out.println("Value " + findValue + " is found at index " + linearFind(ElementsL, findValue));
        else
            System.out.println("Cannot Find Value");
    }


    private static void Binary(){
        Scanner console = new Scanner(System.in);
        int findValue, howMany;
        System.out.println("How many values do you want in an Array?");
        howMany = console.nextInt();

        int ElementsB[] = new int[howMany];

        for(int i = 0; i<howMany; i++){

            ElementsB[i] = (int) (Math.random() * 50) + 1;
        }

        Arrays.sort(ElementsB);

        System.out.println(Arrays.toString(ElementsB));

        System.out.println("\nWhat value do you want to find?");
        findValue = console.nextInt();

        binaryFind(ElementsB, findValue);

        if(linearFind(ElementsB, findValue) != -1)
            System.out.println("Value " + findValue + " is found at index " + linearFind(ElementsB, findValue));
        else
            System.out.println("Cannot Find Value");
        }

        private static int linearFind(int arrayL[], int value){

        for(int i = 0; i < arrayL.length; i++){
            if(arrayL[i] == value)
                return i;
        }
        return -1;
        }

        private static int binaryFind(int arrayB[], int value){
        int left = 0;
        int right = arrayB.length - 1;

        for(int i = 0; i < arrayB.length; i++){
            int middle = (right + left) / 2;

            if(middle > value)
                left = middle + 1;
            else if(middle < value)
                right = middle - 1;
            else if(middle == value)
                return i;
        }
        return -1;
        }
    }

