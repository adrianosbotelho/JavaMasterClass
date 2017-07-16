package com.adrianosbotelho;

/**
 * Created by adriano on 01/07/17.
 */
public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer (){
        this("default name", 100.0,"email@email.com1");
        System.out.println("Constructor empty...");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name,creditLimit,"myemail@myemail.com2");
        System.out.println("Constructor with 2 parameters...");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("Constructor with all parmeters...");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }


    public String getEmail() {
        return email;
    }

}
