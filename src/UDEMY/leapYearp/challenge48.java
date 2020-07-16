package UDEMY.leapYearp;

public class challenge48 {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("hasan", highScorePosition);

        highScorePosition = calculateHighScorePosition(150);
        displayHighScorePosition("Murtaza", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Murat", highScorePosition);
    }

        public static void displayHighScorePosition (String playerName, int highScorePoisition) {
            System.out.println(playerName + " managed to get into position " + highScorePoisition + " on the high score table");
        }



        public static int calculateHighScorePosition(int playScore) {
            if (playScore >= 1000) {
                return 1;
            } else if (playScore>=500 && playScore < 1000){
                return 2;
            } else if (playScore>=100 && playScore<500){
                return 3;
            }else {
                return 4;
            }

        }
    }