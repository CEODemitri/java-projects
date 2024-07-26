public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Green Lantern", 20000);

        bankAccount.withdraw(400);
        bankAccount.deposit(4000);

        System.out.println(bankAccount.getOwner());
        System.out.println(bankAccount.getBalance());

    }
}
