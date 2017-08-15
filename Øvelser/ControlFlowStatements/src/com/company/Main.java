package com.company;

public class Main {

    //Switch statements
    public static void main(String[] args) {
        //Switch statements
        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("The value was 1");
                break;
            case 2:
                System.out.println("The value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("was a 3, 4 or 5.");
                System.out.println("It was " + switchValue);
                break;
            default:
                System.out.println("The value was not 1, 2, 3, 4 or 5");
                break;
        }

        char charValue = 'E';

        switch (charValue) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Value found, the character was: " + charValue);
                break;
            default:
                System.out.println("not found");
                break;
        }
        System.out.println("##############for loops###############");

        //For loops
//        for(init; termination; increment)
        double interest = 8.0d;
        for (; interest >= 2; interest--) {
            System.out.println("$10,000 at " + interest + "% interest = "
                    + calculateInterest(10000, interest));
        }

        int countPrimesFound = 0;

        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                countPrimesFound++;
                System.out.println(i + " is a prime and there are " + countPrimesFound + " primes before it.");
            }
            if (countPrimesFound >= 3) {
                break;
            }
        }

        System.out.println("#############while & do loops################");
        //while
        int count = 0;
        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

/*        count = 0;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count < 5);*/

        count = 5;
        int totalEven = 0;
        while (count <= 20) {
            if (isEvenNumber(count)) {
                totalEven++;
                System.out.println(count + " is even. Total " + totalEven + " even numbers found.");
                if (totalEven >= 5) break;
            }
            count++;
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isEvenNumber(int n) {
        if ((n % 2) == 0) return true;
        return false;
    }
}
