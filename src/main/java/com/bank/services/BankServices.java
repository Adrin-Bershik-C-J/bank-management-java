package com.bank.services;

import com.bank.models.Bank;

import java.util.HashMap;
import java.util.Map;

public class BankServices {
    private Map<Integer, Bank> map = new HashMap<>();
    private static int count = 1;

    public Bank createAccount(String name, double initialDeposit) {
        int accNum = count++;
        Bank account = new Bank(accNum, name, initialDeposit);
        map.put(accNum, account);
        return account;
    }

    public boolean deposit(int accNum, double amount) {
        Bank acc = map.get(accNum);
        if (acc != null && amount > 0) {
            acc.deposit(amount);
            return true;
        }
        return false;
    }

    public boolean withdraw(int accNum, double amount) {
        Bank acc = map.get(accNum);
        if (acc != null) {
            return acc.withdraw(amount);
        }
        if (acc == null) {
            System.out.print("Account doesn't exist! ");
        }
        return false;
    }

    public Double getBalance(int accNum) {
        Bank acc = map.get(accNum);
        return acc != null ? acc.getBalance() : null;
    }

    public Bank getAccount(int accNum) {
        return map.get(accNum);
    }
}
