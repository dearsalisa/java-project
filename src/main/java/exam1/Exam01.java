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
        if(score == 1) return "Fifteen";
        if(score == 2) return "Thirty";
        if(score == 3) return "Forty";
        return "";
    }

    public String getScore() {

        String scoreA = convertScoreToString(countA);
        String scoreB = convertScoreToString(countB);

        if(countA > 3) {
            if(countA - countB == 1) return "Advantage Player A";
            if(countA - countB >= 2) return "Win for Player A";
        }

        if(countB > 3) {
            if(countB - countA == 1) return "Advantage Player B";
            if(countB - countA >= 2) return "Win for Player B";
        }

        if(countA == countB) {
            if(countA >= 3) return "Deuce";
            else return scoreA+"-All";
        }
        else return scoreA+"-"+scoreB;
    }
}
