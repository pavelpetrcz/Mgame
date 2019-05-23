package model;


public class MatchesPile implements IMatchesPile {

    private int startMatchesCount; //number of matches at pile at the beginning or round
    private int actualMatchesCount; //number of matches at pile at the moment

    public MatchesPile(Integer startMatchesCountParam) {
        this.startMatchesCount = startMatchesCountParam;
        this.actualMatchesCount = startMatchesCountParam;
    }

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