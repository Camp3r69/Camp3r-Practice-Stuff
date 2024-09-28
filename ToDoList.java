import java.util.*;
public class ToDoList {
    public static void main(String args []){
        Scanner console = new Scanner(System.in);

        String program = "loop";

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();

        System.out.println("To-Do-List Program:");
        System.out.println("Do you want to add or select a list?\ntype 'add' or 'select' or 'completed'"); //place here because repetition of this is annoying.
        while(program.equals("loop")){

            String userDecision = console.nextLine();

            userDecision.toLowerCase();

            if(userDecision.equals("add")){
                System.out.println("Enter Task Here:");
                String taskInput = console.nextLine();

                list.add(taskInput);
            }

            else if(userDecision.equals("select")){
                if(list.isEmpty()) {
                    System.out.println("List is empty");
                }
                else{
                    int listLoop = 0;
                    while(listLoop != 1){
                        System.out.println("Select a number from the list:");
                        for(int i = 0; i< list.size(); i++){
                            System.out.println("Number: " + i + " "+ list.get(i));
                        }

                        int userNumber = console.nextInt();

                        System.out.println("You have selected: " + userNumber + " " + list.get(userNumber));

                        System.out.println("Is the task completed? Yes / No");
                        String taskDec = console.next();
                        taskDec.toLowerCase();

                        if(taskDec.equals("yes")){
                            System.out.println("Task Completed!");
                            listC.add(list.get(userNumber));
                            list.remove(userNumber);
                        }

                        System.out.println("Continue Selecting?\n\nType '1' if NO\nType '0' if YES");
                        listLoop = console.nextInt();
                        if(listLoop == 0) {
                            System.out.println("CONTINUED:");
                            if(list.isEmpty()){
                                System.out.println("List is empty\nDefault 1:\nDo you want to add or select a list? type 'add' or 'select' or 'completed'");
                                listLoop = 1;
                            }
                        }
                        else if(listLoop == 1)
                            System.out.println("Do you want to add or select a list? type 'add' or 'select' or 'completed'");
                        else
                            System.out.println("Default 1:\nDo you want to add or select a list? type 'add' or 'select' or 'completed'");
                    }
                }
            }
            else if(userDecision.equals("completed")){
                if(listC.isEmpty()){
                    System.out.println("Completed List is Empty.");
                }
                else{
                    int listCLoop = 0;
                    while(listCLoop != 1){
                    System.out.println("Select a number from the list:");
                    for(int i = 0; i< listC.size(); i++) {
                        System.out.println("Number: " + i + " " + listC.get(i));
                    }
                    int userNumber = console.nextInt();

                        System.out.println("You have selected: " + userNumber + " " + listC.get(userNumber));
                        System.out.println("Do you want to undo the completion? Yes or No.");
                        String userCDec = console.next();
                        userCDec.toLowerCase();

                        if(userCDec.equals("yes")){
                            System.out.println("'" + listC.get(userNumber) + "' has been added back to the list.");
                            list.add(listC.get(userNumber));
                            listC.remove(userNumber);
                        }

                        System.out.println("Do you want to continue?\n\nType '1' if NO\nType '0' if YES");
                        listCLoop = console.nextInt();
                        if(listCLoop == 1)
                            System.out.println("Do you want to add or select a list? type 'add' or 'select' or 'completed'");
                        else if(listCLoop == 0){
                            System.out.println("CONTINUED:");
                            if(listC.isEmpty()){
                                System.out.println("Completed List is Empty.\nDefault 1:\nDo you want to add or select a list? type 'add' or 'select' or 'completed'");
                                listCLoop = 1;
                            }
                        }
                        else
                            System.out.println("Default 1:\nDo you want to add or select a list? type 'add' or 'select' or 'completed'");

                    }
                }
            }
        }

    }
}
