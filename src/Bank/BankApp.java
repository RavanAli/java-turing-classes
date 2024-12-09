package Bank;

import ClassReplacement.VusalinSinifiApp;

public class BankApp {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[5];
        accounts[0] = new SavingsAccount("Vusal",154,4565,3.6);
        accounts[1] = new SavingsAccount("Adem",1234, 2345,1.7);
        accounts[2] = new CurrentAccount("Elesger",456,7698,4);
        accounts[3] = new CurrentAccount("Vusale", 222,3476,2);
        accounts[4] = new BankAccount("Elesgere",333,7654);

        for (BankAccount account : accounts) {
            account.displayInfo();
            System.out.println();
        }

        accounts[0].deposit(500);
        accounts[1].withdraw(300);
        accounts[2].withdraw(600);
        accounts[3].withdraw(2000);
        accounts[4].withdraw(100);

        accounts[0].transfer(accounts[2], 200);

        ((SavingsAccount) accounts[0]).applyInterest();
        ((CurrentAccount) accounts[2]).withdraw(2000);

    }
}
