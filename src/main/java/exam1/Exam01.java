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
        if(countA == 1) return "Fifteen-Love";
        else if(countA == 2) return "Thirty-Love";
        else if(countA == 3) return "Forty-Love";
        else if(countA == 4) return "Win for Player A";

        if(countB == 1) return "Love-Fifteen";
        else if(countB == 2) return "Love-Thirty";

        return "Love-All";
    }
}
