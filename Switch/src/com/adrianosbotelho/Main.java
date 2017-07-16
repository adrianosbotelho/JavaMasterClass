package com.adrianosbotelho;

public class Main {

    public static void main(String[] args) {

        int switchValue = 3;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4:case 5:
                System.out.println("Value was 3 or 4 or 5");
                break;

            default:
                System.out.println("Value not 1 or 2");
                break;
        }

        char switchCharValue = 'A';
        switch (switchCharValue){
            case 'A':
                System.out.println("Value was a");
                break;
            case 'B':
                System.out.println("Value was b");
                break;
            case 'C': case 'D': case'E':
                System.out.println(switchCharValue + " value was found");
                break;
            default:
                System.out.println("Value not found");
                break;

        }


    }
}
