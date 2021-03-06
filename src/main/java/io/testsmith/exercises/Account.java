package io.testsmith.exercises;

import java.util.ArrayList;
import java.util.List;

public class Account {

    /* 1 */

    // Add three properties to this Account class:
    // - one that represents the balance (for now, assume that a balance is expressed in whole euros (no cents))
    // - one that represents the account number (a number value)
    // - one that stores the type of account (either 'checking' or 'savings')
    // What data types do these properties have?

    private int balance;
    private int accountNumber;
    private String accountType;

    /* 2 */

    // Add a constructor that enables you to pass
    // a value for the properties as arguments

    // Add a no-argument constructor
    // Specify a default value for each property
    // The account number can be a fixed value for now, but if you want,
    // you can generate a random number between 1 and 100 (for example) by using
    // (int) (Math.random() * (101 - 1)) + 1;
    // Feel free to use that to generate a random account number between 10000 and 99999

    public Account(int balance, int accountNumber, String accountType) {

        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    public Account() {

        this.balance = 0;
        this.accountNumber = (int) (Math.random() * (100000 - 10000)) + 10000;
        this.accountType = "checking";
    }

    /* 3 */

    // Add a method getAccountNumber() that returns the account number
    // Do you need parameters?
    // What is the return type of the method?

    public int getAccountNumber() {

        return this.accountNumber;
    }

    // Write a method deposit() that allows you to deposit money (whole euros only, again) into an account
    // Do you need parameters?
    // What is the return type of the method?

    public void deposit(int amountToDeposit) {

        this.balance += amountToDeposit;
    }

    // Write a method withdraw() that allows you to withdraw money (whole euros only, again) from an account
    // Do you need parameters?
    // What is the return type of the method?

    public void withdraw(int amountToWithdraw) {

        this.balance -= amountToWithdraw;
    }

    // Write a method toString() that returns a description of the account in the form
    // The account with number <account number> is of type '<account type>' and has a balance of <balance>
    // Use either string concatenation ("" + "") or String.format()
    // Do you need parameters?
    // What is the return type of the method?

    public String toString() {

        return String.format("The account with number %d is of type '%s' and has a balance of %d",
                this.accountNumber, this.accountType, this.balance);
    }

    /* 4 */

    // Write a method anArrayOfAccounts() that creates and fills an array of accounts
    // Three elements is enough!
    // You can use any balance, type and account number you want

    public void anArrayOfAccounts() {

        Account[] accountArray = new Account[3];

        accountArray[0] = new Account(100, 12345, "checking");
        accountArray[1] = new Account(999, 54321, "checking");
        accountArray[2] = new Account(999999, 78789, "savings");

        for (Account account : accountArray ) {
            System.out.println(account.toString());
        }
    }

    // Write a method that creates and fills a list of accounts
    // Three elements is enough!
    // You can use any balance, type and account number you want

    public void aListOfAccounts() {

        List<Account> accountList = new ArrayList<Account>();

        accountList.add(new Account(100, 12345, "checking"));
        accountList.add(new Account(999, 54321, "checking"));
        accountList.add(new Account(999999, 78789, "savings"));

        for(Account account: accountList) {
            System.out.println(account.toString());
        }
    }

    /* 5 */

    // Add an enhanced loop to both methods from section 4
    // Iterate over the array and the list and print the result of the toString()
    // method to the standard output for each account in the array c.q. the list.
}
