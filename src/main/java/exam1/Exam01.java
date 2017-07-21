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

    public String getScore() {

        String scoreA = "Love";
        String scoreB = "Love";

        if(countA - countB == 1 && countA >= 4) return "Advantage Player A";
        else if(countB - countA == 1 && countB >= 4) return "Advantage Player B";

        if(countA - countB == 2 && countA >= 4) return "Win for Player A";
        else if(countB - countA == 2 && countB >= 4) return "Win for Player B";

        if(countA == countB && countA == 0) return "Love-All";
        else if(countA == countB && countA == 1) return "Fifteen-All";
        else if(countA == countB && countA == 2) return "Thirty-All";
        else if(countA == countB && countA >= 3) return "Deuce";

        if(countA == 1) scoreA = "Fifteen";
        else if(countA == 2) scoreA = "Thirty";
        else if(countA == 3) scoreA = "Forty";
        else if(countA == 4) return "Win for Player A";

        if(countB == 1) scoreB = "Fifteen";
        else if(countB == 2) scoreB = "Thirty";
        else if(countB == 3) scoreB = "Forty";
        else if(countB == 4) return "Win for Player B";

        return scoreA+"-"+scoreB;
    }
}
