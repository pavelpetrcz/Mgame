package model;

/**
 * Singleton - hold created pile and rules of game in progress
 */

public class GameItem {
    private MatchesPile pile;
    private GameSettings game;

    /**
     * empty constructor of singleton
     */
    private GameItem() {}
    public static  GameItem gameItem = new GameItem();

    /**
     *  Static 'instance' method
     **/
    public static GameItem getInstance() {
        return gameItem;
    }

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
