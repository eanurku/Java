package com.anurag.mapmethods;

public class Score {
    int home;
    int away;

    public Score(int home, int away) {
        this.home = home;
        this.away = away;
    }

    public static Score of(int home,int away){
        return new Score(home,away);
    }
    public int getHome() {
        return home;
    }


    public int getAway() {
        return away;
    }

    @Override
    public String toString() {
        return "Score{" +
                "home=" + home +
                ", away=" + away +
                '}';
    }
}
