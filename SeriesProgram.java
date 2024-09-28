import java.util.*;
public class SeriesProgram {
    public static void main(String args []){
        Scanner console = new Scanner(System.in);

        //About: This program performs addition and subtraction operation alternately.

        System.out.print("Enter value of n:");
        int n = console.nextInt();

        int arrayList [] = new int [n];

        System.out.println("Enter " + n + " integers:");

        for(int i = 0; i < arrayList.length; i++){
            arrayList[i] = console.nextInt();
        }

        int sumValue = 0;

        for(int i = 0; i < arrayList.length; i++){

            if(i == 0){
                sumValue = sumValue + arrayList[i];
            }
            else if(i % 2 == 0){
                sumValue = sumValue - arrayList[i];
            }
            else {
                sumValue = sumValue + arrayList[i];
            }
        }

        System.out.println("Answer: " + sumValue);

    }
}
