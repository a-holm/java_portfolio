package com.jaholm;

import com.sun.deploy.util.ArrayUtil;

import java.sql.Driver;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        System.out.println("The average is " + getAverage(myIntegers) + ".");
        System.out.println("##############################################");
        int[] sortedArray = sortArray(myIntegers);
        printArray(reverseArray(sortedArray));


    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", typed value was " + array[i]);
        }
    }

    public static double getAverage(int[] array) {
        int sumTotal = 0;
        for (int i = 0; i < array.length; i++) {
            sumTotal += array[i];
        }

        return (double) sumTotal / (double)array.length;
    }

    public static int[] sortArray(int[] array) {
        int[] outputArray = new int[array.length];
        int max = getMax(array)+1;
        int[] countArray = new int[max];
        //calculate histogram of key frequencies:
        for (int i = 0; i < array.length; i++) {
            countArray[array[i]-1] += 1;
        }
        int total = 0;
        int oldCount;
        //calculate the starting index for each key
        for (int i = 0; i <max ; i++) {
            oldCount = countArray[i];
            countArray[i] = total;
            total += oldCount;
        }

        for (int i = 0; i < array.length ; i++) {
            outputArray[countArray[array[i]]-1] = array[i];
            countArray[array[i]] -= 1;
        }
        return outputArray;
    }

    public static int[] reverseArray(int[] array){
        //swap items up until it reaches the midpoint
        for(int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;

    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

}
