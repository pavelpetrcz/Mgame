package controller;

import model.GameItem;
import model.GameSettings;
import model.MatchesPile;

public class StartGameFlow {

    public StartGameFlow() { }

    public GameItem execute(Integer startCount, Integer maximumTake) {

        GameItem gameItem = GameItem.getInstance();
        // set pile of matches
        MatchesPile pile = new MatchesPile(startCount);
        gameItem.setPile(pile);

        // set maximumTake of matche in round
        GameSettings game = new GameSettings(maximumTake);
        gameItem.setGame(game);

        return gameItem;

    }

}
