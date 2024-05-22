public class Source {
    private int randomValue;
    private String programRNG;
    private int userVS;
    public Source(){
        this.randomValue = (int) (Math.random() * 3) + 1;
    }

    public void gameStart(String userInput) throws InterruptedException {
        if(userInput.equals("rock"))
            this.userVS = 1;
        else if(userInput.equals("paper"))
            this.userVS = 2;
        else if(userInput.equals("scissors") || userInput.equals("scissor"))
            this.userVS = 3;
        else {
            System.out.println("Error: word not valid");
            Thread.sleep(1000);
            System.out.println("Program Closed");
            System.exit(0);
        }

        rngGame();
    }

    public void rngGame(){
        switch(this.randomValue){
            case(1):
                System.out.println("Program: I picked Rock!");
                this.programRNG = "Rock";
                break;
            case(2):
                System.out.println("Program: I picked Paper!");
                this.programRNG = "Paper";
                break;
            case(3):
                System.out.println("Program: I picked Scissors!");
                this.programRNG = "Scissors";
                break;
        }
        checkFight();
    }

    public void checkFight(){
        if(userVS == randomValue) // rock = 1 paper = 2 scissors = 3
            System.out.println("Tie!");
        else if (userVS == 1 && randomValue == 3) // rock beats scissors
            System.out.println("You won!");
        else if (userVS == 2 && randomValue == 1) //paper beats rock
            System.out.println("You won!");
        else if (userVS == 3 && randomValue == 2) //scissors beat paper
            System.out.println("You won!");
        else
            System.out.println("You lost!");

    }
}
