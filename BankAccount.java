
/**
 * The BankAccount class shows an account and models its functions like
 * balance, deposit, withdrawals, etc.
 *
 * @author Janhavi Jere
 * @version v1.0
 * @since 10/19/2025
 */
public class BankAccount {
    private double balance;
    private double deposit;
    private double withdraw;
    private double interest;
    private double monthlyIntRate;

    public BankAccount() {
        monthlyIntRate = 0.044 / 12;
    }

    public BankAccount(int inBalance, double intRate) {
        balance = inBalance;
        monthlyIntRate = (intRate / 100) / 12;
    }

    public BankAccount(double inBalance, double intRate) {
        balance = inBalance;
        monthlyIntRate = (intRate / 100) / 12;
    }

    public void makeDeposit(double add) {
        balance += add;
        deposit += add;
    }

    public void makeDeposit(int add) {
        makeDeposit((double) add);
    }

    public void makeWithdraw(double sub) {
        balance -= sub;
        withdraw += sub;
    }

    public void makeWithdraw(int sub) {
        makeWithdraw((double) sub);
    }

    public void calcInterest() {
        if (balance > 0) {
            double monthlyInterest = balance * monthlyIntRate;
            interest += monthlyInterest;
            balance += monthlyInterest;
        }
    }

    public double getBalance() {
        return balance;
    }

    public double getDeposit() {
        return deposit;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public double getInterest() {
        return interest;
    }
}
