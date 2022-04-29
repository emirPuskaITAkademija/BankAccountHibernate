package entity;

import java.io.Serializable;

/**
 * DB -> JAVA APP
 * <p>
 *     bank.bankaccount -> BankAccountHibernate.BankAccount
 * </p>
 */
public class BankAccount extends ActiveBankAccount implements Serializable {
    private String accountNumber;
    private Double amount;

    public BankAccount(){

    }

    public BankAccount(String accountNumber, Double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", amount=" + amount +
                '}';
    }
}
