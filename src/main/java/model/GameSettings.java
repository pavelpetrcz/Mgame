package model;

public class GameSettings implements IGameSettings {
    Long maximumTake; //maximum count of matches that player can take

    /**
     * Custom constructor - GameSettings
     * @param maximumTake - how many matches can player take in round
     */
    public GameSettings(Long maximumTake) {
        this.maximumTake = maximumTake;
    }

    /*
    Getters and setters
     */

    public Long getMaximumTake() {
        return maximumTake;
    }

    public void setMaximumTake(Long maximumTake) {
        this.maximumTake = maximumTake;
    }
}
