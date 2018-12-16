package model;

class GameSettingsImpl implements IGameSettings {
    Long maximumTake; //maximum count of matches that player can take

    /*
    Custom constructor
     */
    public GameSettingsImpl(Long maximumTake) {
        this.maximumTake = maximumTake;
    }

    /*
        Getters and Setters
         */
    public Long getMaximumTake() {
        return maximumTake;
    }

    public void setMaximumTake(Long maximumTake) {
        this.maximumTake = maximumTake;
    }
}
