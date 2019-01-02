package model;

public class GameSettings implements IGameSettings {
    private int maximumTake; //maximum count of matches that player can take
    private boolean

    /**
     * Custom constructor - GameSettings
     * @param maximumTake - how many matches can player take in round
     */
    public GameSettings(Integer maximumTake) {
        this.maximumTake = maximumTake;
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
}
