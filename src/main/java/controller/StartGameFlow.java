package controller;

import model.GameItem;
import model.GameSettings;
import model.GameState;
import model.MatchesPile;

public class StartGameFlow {

    public GameItem execute(Integer startCount, Integer maximumTake) {
        GameItem gameItem = GameItem.getInstance();

        // set pile of matches
        MatchesPile pile = new MatchesPile(startCount);
        gameItem.setPile(pile);

        // set maximumTake of matches in round
        GameSettings game = new GameSettings(maximumTake);
        game.setState(GameState.INPROGRESS); //change of status
        gameItem.setGame(game);
        return gameItem;
    }

}
