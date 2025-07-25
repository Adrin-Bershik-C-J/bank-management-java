# 💳 Bank Management System (Java - CLI Based)

## 📁 Project Structure

Directory structure:
└── adrin-bershik-c-j-bank-management-java/
    ├── pom.xml
    └── src/
        ├── main/
        │   └── java/
        │       └── com/
        │           └── bank/
        │               ├── App.java
        │               ├── main/
        │               │   └── Main.java
        │               ├── models/
        │               │   └── Bank.java
        │               └── services/
        │                   └── BankServices.java
        └── test/
            └── java/
                └── com/
                    └── bank/
                        └── AppTest.java


## 📌 Overview

This is a **console-based Java application** that simulates basic bank account operations such as:

- ✅ Creating a new account
- 💰 Depositing money
- 🏧 Withdrawing money
- 📈 Checking account balance

It is structured using **Object-Oriented Programming principles** and organizes code via packages for **models**, **services**, and **main logic**.

---

## 🚀 Features

- Auto-generated account numbers
- Enforces a minimum deposit amount of ₹10
- Deposit and withdrawal with validations
- Graceful error handling for invalid input types
- Simple menu-driven interface

---

## 🛠️ Tech Stack

- **Java 8+**
- **Maven** (for build & dependency management)

---

## 🧱 Module Breakdown

### `Main.java`
- Entry point for the application
- Contains menu and interaction logic via `Scanner`
- Calls methods from `BankServices`

### `Bank.java`
- A model class that represents a single bank account
- Stores: `accountNumber`, `name`, and `balance`
- Provides methods to deposit and withdraw funds

### `BankServices.java`
- Service class that manages account creation and operations
- Uses a `HashMap<Integer, Bank>` to store and retrieve accounts
- Methods:
  - `createAccount(name, initialDeposit)`
  - `deposit(accountNumber, amount)`
  - `withdraw(accountNumber, amount)`
  - `getBalance(accountNumber)`
  - `getAccount(accountNumber)`

---

## 🧪 Sample Run

```bash
1. Create account
2. Deposit
3. Withdraw
4. Check Balance
5. Exit
Enter choice: 1
Enter your name: Adrin
Enter initial deposit: 500
Account created with account Number: 1

Enter choice: 2
Enter account number: 1
Enter amount: 200
Amount deposited successfully.

Enter choice: 4
Enter account Number: 1
Current Balance: 700.0
