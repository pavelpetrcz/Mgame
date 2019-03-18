package model;

public class GameSettings implements IGameSettings {
    private int maximumTake; //maximum count of matches that player can take
    private GameState state; // state of the game


    /**
     * Custom constructor - GameSettings
     * @param maximumTake - how many matches can player take in round
     */
    public GameSettings(Integer maximumTake) {
        this.maximumTake = maximumTake;
        state = GameState.NEW;
    }

    /*
    Getters and setters
     */
    public Integer getMaximumTake() {
        return maximumTake;
    }

    public void setMaximumTake(Integer maximumTake) {
        this.maximumTake = maximumTake;
    }

    public GameState getState() {
        return state;
    }

    public void setState(GameState state) {
        this.state = state;
    }
}

