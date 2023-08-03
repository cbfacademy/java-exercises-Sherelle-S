package com.cbfacademy;

// import com.cbfacademy.cars.Cars;
import com.cbfacademy.accounts.Account;
import com.cbfacademy.accounts.CurrentAccount;
import com.cbfacademy.accounts.SavingsAccount;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World! cars");

        Account account = new Account(1500, 875093);

        System.out.println("Your  account balance is £" + account.getBalance());  
        account.depositFunds(120);
        account.withdrawFunds(2000);

        CurrentAccount currentAccount = new CurrentAccount(200, 875093, 1000);
        System.out.println("Your current account balance is £" +currentAccount.getBalance());
        currentAccount.setOverdraftLimit(2000.00);
        currentAccount.withdrawFunds(3500);
        
        SavingsAccount savingsAccount = new SavingsAccount(1500, 875093);
        System.out.println("Your savings account balance is £"+ savingsAccount.getBalance()+".");
        savingsAccount.depositFunds(1.25);

        
        // // Cars myCar = new Cars();

        // Cars car = new Cars();
        // // System.out.println(myCar.model);
        // System.out.println(car.toString());
        // car.getDetals();
        // // myCar.getModel();
    }
}