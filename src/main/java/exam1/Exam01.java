package exam1;

public class Exam01 {

    private int countA = 0;

    public Exam01(String firstPerson, String secondPerson) {
    }


    public void playerAWin() {
        countA++;
    }

    public void playerBWin() {
    }

    public String getScore() {
        if(countA == 1) return "Fifteen-Love";
        else if(countA == 2) return "Thirty-Love";
        else if(countA == 3) return "Forty-Love";
        return "Love-All";
    }
}
