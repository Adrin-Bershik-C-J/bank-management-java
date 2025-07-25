package com.bank.main;

import com.bank.models.Bank;
import com.bank.services.BankServices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankServices bank = new BankServices();
        try {
            while (true) {
                System.out.println("1. Create account");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Check Balance");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                int ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        System.out.print("Enter your name: ");
                        sc.nextLine();
                        String name = sc.nextLine();
                        System.out.print("Enter initial deposit: ");
                        double deposit = sc.nextDouble();
                        if (deposit < 10) {
                            System.out.println(
                                    "Deposit amount should be atleat 10. Try creating account again with minimal balance!");
                            break;
                        }
                        Bank account = bank.createAccount(name, deposit);
                        System.out.println("Account created with account Number: " + account.getAccountNumber());
                        break;
                    case 2:
                        System.out.print("Enter account number: ");
                        int accNum1 = sc.nextInt();
                        System.out.print("Enter amount: ");
                        double depAmt = sc.nextDouble();
                        if (depAmt < 10) {
                            System.out.println(
                                    "Deposit amount should be atleat 10. Try again with minimal balance!");
                            break;
                        }
                        if (bank.deposit(accNum1, depAmt))
                            System.out.println("Amount deposited successfully.");
                        else
                            System.out.println("Deposit failed.");
                        break;
                    case 3:
                        System.out.print("Enter account Number: ");
                        int accNum2 = sc.nextInt();
                        System.out.print("Enter amount to withdraw: ");
                        double withAmt = sc.nextDouble();
                        if (bank.withdraw(accNum2, withAmt))
                            System.out.println("Withdrawal successful.");
                        else
                            System.out.println("Withdrawal failed!");
                        break;
                    case 4:
                        System.out.print("Enter account Number: ");
                        int accNum3 = sc.nextInt();
                        Double balance = bank.getBalance(accNum3);
                        if (balance != null)
                            System.out.println("Current Balance: " + balance);
                        else
                            System.out.println("Account not found.");
                        break;
                    case 5:
                        System.out.println("Exiting!");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Enter valid input");
        }
    }
}
