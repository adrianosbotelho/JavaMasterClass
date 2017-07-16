package com.adrianosbotelho;

public class Main {

    public static void main(String[] args) {
	int myIntValue = 5 / 3;
	float myFloatValue = 5f /3f;
	double myDoubleValue = 5d / 3f;

	System.out.println("MyIntValue = " + myIntValue);
	System.out.println("MyFloatValue = " + myFloatValue);
    System.out.println("MyDoubleValue = " + myDoubleValue);

    double myPounds = 200d;//0.45359237d;
    double myKilo = myPounds * 0.45359237d;
    System.out.println("MyKilograms = " + myKilo);
    double pi = 3.141_592_7d;

	}
}
