package UDEMY.u57_overlaoding;

public class u57_CalculateScore {
    public static void main(String[] args) {
        int newscore = calculateScore("Tim", 500);
        System.out.println("New score is " + newscore);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + "score " + score + " points");
        return score*1000;
    }

}