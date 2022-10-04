package Exercise6;

public class Main {
    public static void main(String[] args) {

        SavingsAccount savingsAccount1 = new SavingsAccount(3000,10);

        //stan konta
        System.out.println(savingsAccount1.accountBalance);
        //1 wypłata
        savingsAccount1.withdraw(100);
        System.out.println(savingsAccount1.accountBalance);
        //2 wypłata
        savingsAccount1.withdraw(2890);
        System.out.println(savingsAccount1.accountBalance);
        //próba 3 wypłaty
        savingsAccount1.withdraw(20);
        System.out.println(savingsAccount1.accountBalance);

        //sprawdzenie czy konto jest aktywne
        System.out.println(savingsAccount1.statusAcc);

        //1 wpłata na konto
        savingsAccount1.deposit(1500);

        //sprawdzenie czy konto jest aktywne po wpłacie
        System.out.println(savingsAccount1.statusAcc);

        //sprawdzenie ilości wypłat z konta
        System.out.println(savingsAccount1.numberOfPayoutsPerMonth);

        //sprawdzenie ilości wpłat na konto
        System.out.println(savingsAccount1.numberOfPaymentPerMonth);

        //sprawdzenie naliczania kosztów po 4 wypłacie z konta
        //sprawdzenie stanu konta
        System.out.println(savingsAccount1.accountBalance);

        //1 wypłata
        savingsAccount1.withdraw(100);
        //2 wypłata
        savingsAccount1.withdraw(100);
        //3 wypłata
        savingsAccount1.withdraw(100);
        //4 wypłata
        savingsAccount1.withdraw(100);
        //5 wypłata
        savingsAccount1.withdraw(100);

        //sprawdzenie stanu konta
        System.out.println(savingsAccount1.accountBalance);

        //naliczanie odsetek oraz kosztów związanych z prowadzeniem konta i tranzakcji
        savingsAccount1.monthlyProcess();

        //sprawdzenie stanu konta po procesie
        System.out.printf("%.2f\n", savingsAccount1.accountBalance);

        //sprawdzenie ilości wpłat
        System.out.println(savingsAccount1.numberOfPaymentPerMonth);
        //sprawdzenie ilości wypłat
        System.out.println(savingsAccount1.numberOfPayoutsPerMonth);
        //sprawdzenie statusu konta
        System.out.println(savingsAccount1.statusAcc);
    }
}
