package model;

public class GameItem {
    private MatchesPile pile;
    public GameSettings game;


    public MatchesPile getPile() {
        return pile;
    }

    public void setPile(MatchesPile pile) {
        this.pile = pile;
    }

    public GameSettings getGame() {
        return game;
    }

    public void setGame(GameSettings game) {
        this.game = game;
    }



}
