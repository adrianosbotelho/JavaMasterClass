package com.adrianosbotelho;

public class Main {

    public static void main(String[] args) {

//        Account conta = new Account();//new Account(1234,0.00,"Bob","myemail.bob.com","(15)3221-2405");
//        conta.WithDrawal(50.0);
//        conta.Deposit(100.0);
//        conta.WithDrawal(50.0);
//        conta.getAccountStatus();
//
//        Account novaconta = new Account("Adriano","adrianosbotelho@gmail.com","1532212405");
//        novaconta.getAccountStatus();

        VipCustomer vipcustomer = new VipCustomer("Priscila",1000.0,"priscila@yahoo.com.br");
        System.out.println(vipcustomer.getName());
        System.out.println(vipcustomer.getCreditLimit());
        System.out.println(vipcustomer.getEmail());

    }
}
