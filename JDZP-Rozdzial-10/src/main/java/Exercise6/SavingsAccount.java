package Exercise6;

public class SavingsAccount extends BankAccount{ // konto oszczędnościowe

    boolean statusAcc; // informacja czy konto jest aktywne

    public SavingsAccount(double accountBalance, double annualInterestRate) {
        super(accountBalance, annualInterestRate);
    }

    public boolean isStatusAcc() {
        if(accountBalance < 25){
            statusAcc = false;
        } else {
            statusAcc = true;
        }
        return statusAcc;
    }

    public void setStatusAcc(boolean statusAcc) {
        this.statusAcc = statusAcc;
    }

    public void withdraw(double amountWithdraw){
        if(accountBalance > 25) {
            super.numberOfPayoutsPerMonth++;
            super.accountBalance -= amountWithdraw;
        } else {
            System.out.println("You cannot withdraw cash, the account is inactive.");
        }
        isStatusAcc();
    }

    public void deposit(double amountDeposit){
        if(!statusAcc){
            if(amountDeposit + super.accountBalance > 25) {
                super.numberOfPaymentPerMonth++;
                super.accountBalance += amountDeposit;
                statusAcc = true;

            } else {
                statusAcc = false;
            }
        } else {
            super.numberOfPayoutsPerMonth++;
            super.accountBalance += amountDeposit;
        }

    }

    public void monthlyProcess(){
        if(numberOfPayoutsPerMonth > 4) {
            int numOfExceededPayouts = numberOfPayoutsPerMonth - 4;
            accountBalance = accountBalance - (monthlyPayForAccManagement + (5 * numOfExceededPayouts));
            calcInterest();
            numberOfPaymentPerMonth = 0;
            numberOfPayoutsPerMonth = 0;
            monthlyPayForAccManagement = 0;
            if(accountBalance < 25){
                statusAcc = false;
            }
        } else {
            accountBalance = accountBalance - monthlyPayForAccManagement;
            calcInterest();
            numberOfPaymentPerMonth = 0;
            numberOfPayoutsPerMonth = 0;
            monthlyPayForAccManagement = 0;
            if(accountBalance < 25){
                statusAcc = false;
            }
        }
    }





}
