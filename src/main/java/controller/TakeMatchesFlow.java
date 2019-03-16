package controller;

import model.GameItem;

public class TakeMatchesFlow {

    public void execute(int playerTake) {
        GameMethods game = new GameMethods();

        //user takes
        game.userTakeMatches(playerTake, GameItem.getInstance().getPile());

        //computer takes
        game.computerTakeMatches(GameItem.getInstance().getPile());
    }
}
