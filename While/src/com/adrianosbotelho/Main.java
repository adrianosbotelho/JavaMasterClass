package com.adrianosbotelho;

public class Main {

    public static void main(String[] args) {
//	    int count = 0;
//	    while(count != 5)
//        {
//            System.out.println("Count value is "+count);
//            count ++;
//        }
//
//        count = 1;
//        do {
//            System.out.println("Count value was "+count);
//            count ++;
//        } while(count !=6 );

        int number = 6;
        int countEvenNumber = 0;
        int FinishNumber = 20;
        while ((number <= FinishNumber) && countEvenNumber < 5){
            if(!isEvenNumber(number)){
                number++;
                continue;
            }else {
                countEvenNumber ++;
            }
            System.out.println("Even number "+number);
            number++;
        }
        System.out.println("Count even number "+countEvenNumber);


    }

    public static boolean isEvenNumber (int number)
    {
        if ((number % 2) == 0)
        {
            return  true;
        } else {
            return false;
        }
    }


}
