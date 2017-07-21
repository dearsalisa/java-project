package exam1;

public class Exam01 {

    private int countA = 0;
    private int countB = 0;

    public Exam01(String firstPerson, String secondPerson) {
    }


    public void playerAWin() {
        countA++;
    }

    public void playerBWin() {
        countB++;
    }

    public String convertScoreToString(int score) {
        if(score == 0) return "Love";
        else if(score == 1) return "Fifteen";
        else if(score == 2) return "Thirty";
        else if(score == 3) return "Forty";
        else return "";
    }

    public String getScore() {

        String scoreA = convertScoreToString(countA);
        String scoreB = convertScoreToString(countB);

        if(countA - countB == 1 && countA >= 4) return "Advantage Player A";
        if(countB - countA == 1 && countB >= 4) return "Advantage Player B";

        if(countA - countB >= 2 && countA >= 4) return "Win for Player A";
        if(countB - countA >= 2 && countB >= 4) return "Win for Player B";

        if(countA == countB) {
            if(countA >= 3) return "Deuce";
            else return scoreA+"-All";
        }
        else return scoreA+"-"+scoreB;
    }
}
