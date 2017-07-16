package com.adrianosbotelho;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = "+result);
        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + "- 1 = "+result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + "* 10 = "+result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + "/ 5 = "+result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + "%3 = "+result);

        result = result + 1;
        System.out.println("Result now is = "+result);
        result++;
        System.out.println("Result now is = "+result);
        result--;
        System.out.println("Result now is = "+result);
        result += 2;
        System.out.println("Result now is = "+result);
        result *= 10;
        System.out.println("Result now is = "+result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an Alien");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score");

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less then 100");

        if ((topScore > 90) || (secondTopScore <=90))
            System.out.println("One of these tests is true");

        boolean isCar  = true;
        if (isCar == true)
            System.out.println("This is not supposed to happen");

        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");

        double mydouble20 = 20;
        double mydouble80 = 80;

        double total = (mydouble20 + mydouble80) * 25;
        System.out.println("Total = " + total);
        total %= 40;
        if (total <= 20)
            System.out.println("Total was over the limit = " + total);





    }
}
