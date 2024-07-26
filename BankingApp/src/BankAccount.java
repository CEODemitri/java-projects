public class BankAccount {
//    use private to make immutable from instance
    private String owner;
    private double balance;

//    constructor of BankAccount class for instance usage
    public BankAccount(String owner, int startingBalance) {
        this.owner = owner;
        this.balance = Math.max(startingBalance, 0);
    }

//    retrieve attribute values from instance without access to original variable
    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

//    method for owner to deposit in account: function 1
    public double deposit(double amt) {
//        if added amount is over 0 (not negative), add amt to current balance
        if (amt > 0) {
            this.balance = this.balance + amt;
            return amt;
        }

        return 0;
    }

//    method for owner to withdraw from account: function 2
    public double withdraw(double amt) {
//        if amount to withdraw is less or equal to current balance, subtract amt from balance
        if (amt <= this.balance) {
            this.balance = this.balance - amt;
            return amt;
        }

        return 0;
    }
}

//Encapsulation Example eEcho
// encapsulate the owner and balance of bankaccount
