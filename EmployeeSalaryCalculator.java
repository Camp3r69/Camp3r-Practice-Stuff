import java.util.*;
public class EmployeeSalaryCalculator {
    public static void main(String args []){
        Scanner console = new Scanner(System.in);
        double grossSalary = 0, taxDeduct, takeHomeSalary;
        System.out.println("Name: ");
        String userName = console.nextLine();

        System.out.println("Select a Position:\n1: Manager\n2: Developer\n3: Analyst");
        int positionValue = console.nextInt();

        if(positionValue == 1)
            System.out.println("Position: Manager");
        else if(positionValue == 2)
            System.out.println("Position: Developer");
        else if(positionValue == 3)
            System.out.println("Position: Analyst");
        else{
            System.out.println("Invalid Position:");
            System.exit(0);
        }

        int workHours = 0;

        int repeat = 0;
        while(repeat != 1) {
            System.out.println("Enter Number of Hours Worked:");
            workHours = console.nextInt();
            if(workHours > 0)
                repeat = 1;
        }

        switch(positionValue){
            case 1:
                grossSalary = workHours * 50;
                break;
            case 2:
                grossSalary = workHours * 40;
                break;
            case 3:
                grossSalary = workHours * 35;
                break;
        }

        if(grossSalary > 50000)
            taxDeduct = grossSalary * 0.30;
        else if(grossSalary <= 50000 && grossSalary > 30000)
            taxDeduct = grossSalary * 0.20;
        else
            taxDeduct = grossSalary * 0.10;

        takeHomeSalary = grossSalary - taxDeduct;

        System.out.println("\nSalary Breakdown for " + userName);
        System.out.println("Gross Salary = $" + grossSalary);
        System.out.println("Tax Deduction = $" + taxDeduct);
        System.out.println("Take-Home Salary = $" + takeHomeSalary);

    }
}
