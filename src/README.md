# 💰 SOA Account App

Welcome to **SOA Account App** – your go-to solution for managing accounts, making deposits, and withdrawing funds (virtually, of course! 😉). Built with Java, this app demonstrates the power of a layered architecture with DAO and Service layers.

## 🎯 Features
- Create an account with an ID, IBAN, name, SSN, and balance.
- Deposit funds (no, you can't deposit negative amounts! 💀).
- Withdraw funds (only if you have enough, no magic overdrafts here! 🏦).
- Search for accounts by ID, IBAN, name, or SSN.
- Fully object-oriented and exception-handling ready!

## 🛠️ Tech Stack
- **Language**: Java ☕
- **Paradigm**: Object-Oriented Programming
- **Architecture**: DAO (Data Access Object) & Service Layers

## 🚀 Getting Started
### 1️⃣ Clone the Repo
```sh
 git clone https://github.com/ScoopySnack/soa-account-app.git
 cd soa-account-app
```

### 2️⃣ Run the App
Compile and run the Java files:
```sh
 javac Main.java
 java Main
```

### 3️⃣ Play Around
- Create an account
- Deposit and withdraw funds
- Handle exceptions like a pro!

## ⚠️ Exception Handling
| Exception                      | When it Occurs                                   |
|--------------------------------|--------------------------------------------------|
| `NegativeAmountException`      | If you try to deposit/withdraw a negative amount |
| `InsufficientBalanceException` | If you try to withdraw more than your balance    |
| `SsnNotValidException`         | If the SSN doesn’t match                         |


## 📜 License
This project is open-source. Feel free to use it, learn from it, and improve it! 🚀
