public class Account {
    private String accountNumber;
    private String accountHolder;
    private String openDate;
    private double balance;
    
    public Account(String accNumber, String accHolder, String date, double accBalance) {
        this.accountNumber = accNumber;
        this.accountHolder = accHolder;
        this.openDate = date;
        this.balance = accBalance;
    }
    
    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }
    
    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }
    
    public void transfer (Account a, double amount) {
        this.withdraw(amount);
        a.deposit(amount);
    }
    
    public String getAccountHolder() {
        return this.accountHolder;
    }
    
    public String getOpenDate() {
        return this.openDate;
    }
    public double getBalance() {
        return this.balance;
    }
    @Override
    public String toString() {
        return this.accountNumber;
    }
}
