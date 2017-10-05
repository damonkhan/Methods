package com.damonkhan;

public class Main {

  public static void main(String[] args) {

    if (args.length != 3) {
      System.out.println("Usage: score levelCompleted bonus");
      return;
    }

    boolean gameOver = true;
    int score = Integer.parseInt(args[0]);
    int levelCompleted = Integer.parseInt(args[1]);
    int bonus =  Integer.parseInt(args[2]);

    int finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
    System.out.println("Your final score was " + finalScore);

    score = 10000;
    levelCompleted = 8;
    bonus =  200;

    finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
    System.out.println("Your final score was " + finalScore);

    // Display high score table
    int position = calculateHighScorePosition(1500);
    displayHighScorePosition("Damon", position);
    position = calculateHighScorePosition(900);
    displayHighScorePosition("Jasmin", position);
    position = calculateHighScorePosition(400);
    displayHighScorePosition("Tim", position);
    position = calculateHighScorePosition(50);
    displayHighScorePosition("Terry", position);

  }

  public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

    if (gameOver) {
        int finalScore = score + (levelCompleted * bonus);
        finalScore += 1000;
        return finalScore;
    }

    return -1;

  }

  public static int calculateHighScorePosition(int score) {

    if (score >= 1000) {
      return 1;
    } else if (score >= 500 && score < 1000) {
      return 2;
    } else if (score >= 100 && score < 500) {
      return 3;
    }

    return 4;

  }

  public static void displayHighScorePosition(String name, int position) {

    System.out.println(name + " managed to get into position "
    + position + " on the high score table");

  }
}
