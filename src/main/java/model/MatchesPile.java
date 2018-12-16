package model;


public class MatchesPile implements IMatchesPile {

    /*
    Variables
     */
    Long startMatchesCount; //number of matches at pile at the beginning or round
    Long actualMatchesCount; //number of matches at pile at the moment

    /*
    Custom constructor
     */
    public MatchesPile(Long startMatchesCount) {
        startMatchesCount = this.startMatchesCount;
    }


    /*
    Getters and Setters
     */

    public Long getStartMatchesCount() {
        return startMatchesCount;
    }

    public void setStartMatchesCount(Long startMatchesCount) {
        this.startMatchesCount = startMatchesCount;
    }

    public Long getActualMatchesCount() {
        return actualMatchesCount;
    }

    public void setActualMatchesCount(Long actualMatchesCount) {
        this.actualMatchesCount = actualMatchesCount;
    }
}
