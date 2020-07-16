package UDEMY.leapYearp;

public class ExpressionStatements47 {
    public static void main(String[] args) {

        calculateScore(true , 800 , 5 , 100 );
        calculateScore(true,80,5,5);
    }
    public static int calculateScore(boolean gameOver , int score , int completedLevel , int bonus) {
        if (gameOver) {
            int finalScore = score + completedLevel * bonus;
            finalScore += 1000;
            System.out.println("Your final score is = " + finalScore);
            return finalScore;
        }

            return -1;


    }}








