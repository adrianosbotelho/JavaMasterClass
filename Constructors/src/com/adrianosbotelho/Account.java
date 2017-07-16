package com.adrianosbotelho;

/**
 * Created by adriano on 01/07/17.
 */
public class Account {

    private int accountnumber ;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    //constructor
    public Account (){
        this(123,0.01,"default name","email@email.com","15-3221-1111" );
        System.out.println("Constructor...");
    }


    public Account(int accountnumber, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Account constructor with parameters called. ");
        this.accountnumber = accountnumber;
        this.balance = balance;
        this.customerName = customerName;
        this. email = email;
        this.phoneNumber = phoneNumber;

    }

    public Account(String customerName, String email, String phoneNumber) {
        this(999,0.02,customerName,email,phoneNumber);
    }

    //set
    public void setAccountnumber(int accountnumber){
        this.accountnumber = accountnumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    //get
    public int getAccountnumber(){
        return this.accountnumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }


    public void Deposit (double value){
        this.balance += value;
        System.out.println("Saldo atual "+ this.balance);
    }

    public void WithDrawal (double value){

        if (this.balance - value < 0) {
            System.out.println("Only  "+this.balance + " available. WithDrawal not processed." );
        }else {
            this.balance -= value;
            System.out.println("WithDrawal was processed. "+this.balance );
        }
    }
    public void getAccountStatus(){
        System.out.println("AccountNumber   : "+this.accountnumber);
        System.out.println("Customer Name   : "+this.customerName);
        System.out.println("Customer e-mail : "+this.email);
        System.out.println("Customer phoneNumber : "+this.phoneNumber);
        System.out.println("Saldo Atual : "+this.balance);
    }


}
