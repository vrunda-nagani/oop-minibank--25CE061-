package minibank;

import java.util.Scanner;

public class MiniBank {

    record BankInfo(String name, String branch) {
    }

    enum MenuOption {
        OPEN_ACCOUNT,
        DEPOSIT,
        WITHDRAW,
        TRANSFER,
        EXIT
    }

    public static void main(String[] args) {

        BankInfo bank = new BankInfo("MiniBank", "Nadiad");
        System.out.println(bank);

        Account[] accounts = {
            new Account("Vrunda", 1000),
            new Account("Rahul", 2000),
            new Account("Priya")
        };

        accounts[0].deposit(500);
        accounts[1].deposit(1000);
        accounts[2].deposit(3000);

        accounts[0].withdraw(200);
        accounts[1].withdraw(500);
        accounts[2].withdraw(1000);

        System.out.println("\n===== Account Details =====");

        for (Account account : accounts) {
            System.out.println(
                account.getAccountNumber() + " - " +
                account.getOwnerName() + " - Rs." +
                account.getBalance()
            );
        }

        Scanner sc = new Scanner(System.in);

        boolean running = true;

        while (running) {

            System.out.println("\n===== MiniBank Menu =====");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            String message = switch (choice) {
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

        System.out.println("Thank you for using MiniBank!");

        sc.close();
    }
}

