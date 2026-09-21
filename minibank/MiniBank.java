package minibank;
import java.util.Scanner;

public class MiniBank {
    record BankInfo(String name,String branch)
    {}
     enum MenuOption {
        OPEN_ACCOUNT,
        DEPOSIT,
        WITHDRAW,
        TRANSFER,
        EXIT
    }

public static void main(String [] args)
{
BankInfo bank=new BankInfo("Minibank"," nadiad");

System.out.println(bank);

Scanner sc=new Scanner(System.in);
boolean running = true;

while(running)
{
    System.out.println("\n===== MiniBank =====");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");

            int choice=sc.nextInt();

           String message= switch (choice)
           {
            case 1 -> "Open Account";
                case 2 -> "Deposit";
                case 3 -> "Withdraw";
                case 4 -> "Transfer";
                case 5 -> "Goodbye!";
                default -> "Invalid choice!";

           };

           System.out.println(message);
           if (choice == 5) {
                running = false;
            }


}
        System.out.println("Thank you for using MiniBank!!!");

        sc.close();


}
    
}
