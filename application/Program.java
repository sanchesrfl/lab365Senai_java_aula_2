package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    
    public static void main(String[] args) {

               
        //testando Override com método withdraw

        //primeiro uma conta genérica

        Account acc1 = new Account(1111, "Shiva", 1000.0);
        acc1.withdraw(250);

        System.out.println(

                "Saldo da Conta Genérica (Mother) " + acc1.getBalance()

        );


        //testando a sobrescrita

        Account acc2 = new SavingsAccount(2222, "Ganesha", 1000.0, 1.0);
        acc2.withdraw(250.0);
        System.out.println(

                "The balance of Savings Account is : " + acc2.getBalance()

        );

        //testando sobrescrita com super em conta PJ

        Account acc3 = new BusinessAccount(3333, "Krishna", 1000.0, 1000.0);
        acc3.withdraw(250.0);
        System.out.println(

                "The balance of the Business Account is: "  + acc3.getBalance()

        );


    }


}