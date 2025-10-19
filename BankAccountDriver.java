import java.util.Scanner;
/**
 * BankAccountDriver tests the BankAccount class by using currency/dollar mode, deposits,
 * withdrawals, etc.
 *
 * @author Janhavi Jere
 * @version v1.0
 * @since 10/19/2025
 */


public class BankAccountDriver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int choice = 0;

        
        while (choice != 1 && choice != 2) {
            System.out.print("Press 1 to use whole dollars or 2 to use currency: ");
            choice = keyboard.nextInt();
        }

    
        if (choice == 1)
            useWholeDollarMode();
        else
            useCurrencyMode();
    }

    /**
    * useWholeDollarMode asks the user for the starting balance, the interest, and
    the number of months to process. A BankAccount object is created with balance and interest
    rates as args. A loop runs based on number of months to process. For each month deposits,
    withdraws, and interest rate is calculated. After the loop processes, ending balance,
    total deposits, total withdraws, and total interest is displayed.
    */
    public static void useWholeDollarMode() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your starting balance: $");
        int balance = keyboard.nextInt();
        System.out.print("What is your interest rate? (ie enter 3.5 for 3.5%): ");
        double intRate = keyboard.nextDouble();
        System.out.print("How many months do you want to calculate? ");
        int counter = keyboard.nextInt();

        System.out.println("===============================");

        BankAccount bankAccount = new BankAccount(balance, intRate);

        for (int i = 1; i <= counter; i++) {
            System.out.print("Enter Month " + i + " deposits $");
            bankAccount.makeDeposit(keyboard.nextInt());
            System.out.print("Enter Month " + i + " withdraws $");
            bankAccount.makeWithdraw(keyboard.nextInt());
            bankAccount.calcInterest();
        }

        System.out.printf("\nEnding balance: $%,.2f", bankAccount.getBalance());
        System.out.printf("\nTotal deposits: $%,.2f", bankAccount.getDeposit());
        System.out.printf("\nTotal withdraw: $%,.2f", bankAccount.getWithdraw());
        System.out.printf("\nTotal interest: $%,.2f", bankAccount.getInterest());
    }

    /**
    useCurrencyMode asks the user for the starting balance, the interest, and the number of 
    months to process. A BankAccount object is created with balance and interest rates as
    args. A loop runs based on number of months to process. For each month deposits,
    withdraws, and interest rate is calculated. After the loop processes, ending balance,
    total deposits, total withdraws, and total interest is displayed.
    */
    public static void useCurrencyMode() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your starting balance: $");
        double balance = keyboard.nextDouble();
        System.out.print("What is your interest rate? (ie enter 3.5 for 3.5%): ");
        double intRate = keyboard.nextDouble();
        System.out.print("How many months do you want to calculate? ");
        int counter = keyboard.nextInt();

        System.out.println("===============================");

        BankAccount bankAccount = new BankAccount(balance, intRate);

        for (int i = 1; i <= counter; i++) {
            System.out.print("Enter Month " + i + " deposits $");
            bankAccount.makeDeposit(keyboard.nextDouble());
            System.out.print("Enter Month " + i + " withdraws $");
            bankAccount.makeWithdraw(keyboard.nextDouble());
            bankAccount.calcInterest();
        }

        System.out.printf("\nEnding balance: $%,.2f", bankAccount.getBalance());
        System.out.printf("\nTotal deposits: $%,.2f", bankAccount.getDeposit());
        System.out.printf("\nTotal withdraw: $%,.2f", bankAccount.getWithdraw());
        System.out.printf("\nTotal interest: $%,.2f", bankAccount.getInterest());
    }
}
