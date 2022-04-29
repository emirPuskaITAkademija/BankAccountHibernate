import entity.BankAccount;

public class App {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber("1234567889999999");
        bankAccount.setAmount(2000.0);
        bankAccount.save();
    }
}
