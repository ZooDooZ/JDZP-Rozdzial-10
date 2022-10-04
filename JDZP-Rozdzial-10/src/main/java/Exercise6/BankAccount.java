package Exercise6;

public abstract class BankAccount {

    double accountBalance; // stan kotna
    int numberOfPaymentPerMonth; // ilość wpłat w miesiacu
    int numberOfPayoutsPerMonth; // ilość wypłat
    double annualInterestRatePerYear; // roczne oprocentowanie
    double monthlyPayForAccManagement; // miesięczne opłaty za prowadzenie konta

    public BankAccount(double accountBalance, double annualInterestRate) {
        this.accountBalance = accountBalance;
        this.annualInterestRatePerYear = annualInterestRate / 100;
    }

    public void deposit(double amountDeposit){
        numberOfPaymentPerMonth++;
        accountBalance += amountDeposit;
    }

    public void withdraw(double amountWithdraw){
        numberOfPayoutsPerMonth++;
        accountBalance -= amountWithdraw;
    }

    public double calcInterest(){
        double annualInterestRatePerMonth = annualInterestRatePerYear /12;
        double monthlyInterest = accountBalance * annualInterestRatePerMonth;
        accountBalance = accountBalance + monthlyInterest;
        return accountBalance;
    }

    public void monthlyProcess(){
        accountBalance = accountBalance - monthlyPayForAccManagement;
        calcInterest();
        numberOfPaymentPerMonth = 0;
        numberOfPayoutsPerMonth = 0;
        monthlyPayForAccManagement = 0;

    }




}
