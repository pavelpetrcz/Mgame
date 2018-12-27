package controller;

import model.GameSettings;
import model.MatchesPile;

public class StartGameFlow {
    public StartGameFlow() {
    }

    public void execute(Long startCount, Long maximumTake) {

        // set pile of matches
        MatchesPile pile = new MatchesPile(startCount);

        // set maximumTake of matche in round
        GameSettings game = new GameSettings(maximumTake);

    }
}
