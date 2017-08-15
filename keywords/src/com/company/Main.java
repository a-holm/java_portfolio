package com.company;

public class Main {

    public static void main(String[] args) {
        // a mile is equal to 1.609344 kilometers
        double mile = 100d;
        double kilometers = (mile * 1.609344);
        System.out.println(mile + " miles is " + kilometers + " kilometers.");

        // code blocks and the if then else control statement
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(true, 800, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(true, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("horse", calculateHighScorePosition(1500));
        displayHighScorePosition("maya", calculateHighScorePosition(900));
        displayHighScorePosition("peppi", calculateHighScorePosition(400));
        displayHighScorePosition("hekk", calculateHighScorePosition(50));
    }

    //Methods in Java
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // code blocks and the if then else control statement
        if (gameOver) {
            int finalScore = score + (levelCompleted*bonus);
            finalScore += 1000;
            return finalScore;
        } else return -1;

    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + "!");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000){
            return 2;
        } else if (playerScore >= 100 && playerScore < 500){
            return 3;
        } else {
            return 4;
        }
    }

}
