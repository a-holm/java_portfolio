package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        System.out.println("###################################");
        System.out.println("5'11\" er " + calcFeetAndInchesToCentimeters(5,11));
        System.out.println("5'11\" er " + calcFeetAndInchesToCentimeters(11+5*12));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score*1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score*1000;
    }

    public static int calculateScore() {
        System.out.println("Unnamed player scored no points");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if ((feet < 0) || ((inches < 0) || (inches > 12))) return -1.0d;
        //return centimeters
        return 2.54*(inches + 12*feet);
    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        System.out.println(inches);
        if (inches < 0) return -1.0d;

        int feet = inches / 12;
        inches = inches % 12;
        // return centimeters
        return calcFeetAndInchesToCentimeters(feet, inches);
    }

}
