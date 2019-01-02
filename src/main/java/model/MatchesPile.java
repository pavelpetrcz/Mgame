package model;


public class MatchesPile implements IMatchesPile {

    /*
    Variables
     */
    private int startMatchesCount; //number of matches at pile at the beginning or round
    private int actualMatchesCount; //number of matches at pile at the moment

    /*
    Custom constructor
     */
    public MatchesPile(int startMatchesCountParam) {
        startMatchesCountParam = this.startMatchesCount;
    }

    /*
    Getters and Setters
     */
    public Integer getStartMatchesCount() {
        return startMatchesCount;
    }

    public void setStartMatchesCount(Integer startMatchesCount) {
        this.startMatchesCount = startMatchesCount;
    }

    public Integer getActualMatchesCount() {
        return actualMatchesCount;
    }

    public void setActualMatchesCount(Integer actualMatchesCount) {
        this.actualMatchesCount = actualMatchesCount;
    }
}