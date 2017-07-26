package exam1;

public class Exam01 {

    private int countA = 0;
    private int countB = 0;
    private String playerA = "";
    private String playerB = "";

    public Exam01(String firstPerson, String secondPerson) {
        this.playerA = firstPerson;
        this.playerB = secondPerson;
    }

    public void playerAWin() {
        countA++;
    }

    public void playerBWin() {
        countB++;
    }

    public String compareScore() {
        if(countA > countB) return playerA;
        else return playerB;
    }

    public String getScore() {

        String[] score = {"Love", "Fifteen", "Thirty", "Forty"};

        if (isEqualScore()) {
            return String.format("%s-All", score[countA]);
        } else if (isNormalScore()) {
            return String.format("%s-%s", score[countA], score[countB]);
        } else if (isDeuce()) {
            return "Deuce";
        } else if (isAdvantage()) {
            return String.format("Advantage %s", compareScore());
        } else if (isWin()) {
            return String.format("Win for %s", compareScore());
        } else return "Invalid Input";
    }

    public boolean isEqualScore() {
        return (countA == countB && countA <= 2);
    }

    public boolean isNormalScore() {
        return (countA != countB && countA <= 3 && countB <= 3);
    }

    public boolean isDeuce() {
        return (countA == countB && countA >= 3);
    }

    public boolean isAdvantage() {
        return (Math.abs(countA - countB) == 1);
    }

    public boolean isWin() {
        return (Math.abs(countA - countB) >= 2);
    }

}