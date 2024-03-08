public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void credit(double amount) {
        // Add the given amount to the balance
        balance += amount;
    }

    public boolean debit(double amount) {
        // Subtract the given amount from the balance if sufficient funds are available
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient funds");
            return false;
        }
    }

    public boolean transferTo(Account anotherAccount, double amount) {
        // Transfer the given amount from this account to another account
        if (debit(amount)) {
            anotherAccount.credit(amount);
            System.out.printf("Transfer of %.2f successful from Account %s to Account %s\n", amount, accountNumber, anotherAccount.getAccountNumber());
            return true;
        } else {
            System.out.println("Transfer failed. Insufficient funds.");
            return false;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        //Account Class
        Account account1 = new Account("123456", 1000.0);
        Account account2 = new Account("654321", 500.0);

        // Performing credit and debit operations
        account1.credit(200.0);
        account2.debit(100.0);

        // Transferring funds between accounts
        account1.transferTo(account2, 300.0);

        // Printing the balances of both accounts
        System.out.println("Balance of Account 1: " + account1.getBalance());
        System.out.println("Balance of Account 2: " + account2.getBalance());
    }
}
