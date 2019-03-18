package controller;

import model.GameItem;
import model.GameSettings;
import model.GameState;
import model.MatchesPile;

import java.security.SecureRandom;

public class GameMethods {

    /**
     * Take specific amount of matches from the pile
     * @param take number of matches that player can take
     * @param pile object with information about actual game
     * @return object after taking specific amount of matches
     */


    protected void userTakeMatches(Integer take, MatchesPile pile) {
        pile.setActualMatchesCount(pile.getActualMatchesCount() - take);
        changeGameStatus(GameItem.getInstance());
    }

    /**
     *  Computer each round takes matches as well
     * @param pile object with info about round
     * @return object after computers take
     */
    protected void computerTakeMatches(MatchesPile pile) {
        int computerTake = 0;
        int upperBound = pile.getActualMatchesCount() + 1;


        SecureRandom random = new SecureRandom();
        computerTake = random.nextInt();
        while (computerTake > pile.getActualMatchesCount() || computerTake < 0) {
            computerTake = random.nextInt(upperBound);
            System.out.println(computerTake);


        }
        pile.setActualMatchesCount(pile.getActualMatchesCount() - computerTake);
        changeGameStatus(GameItem.getInstance());
    }

    /**
     * @param game - current game settings
     * @return - return if the game is over
     */
    protected boolean checkGameIsFinished(GameSettings game) {
        return game.getState() == GameState.FINISHED;
    }

    /**
     * @param item - current game
     */
    protected void changeGameStatus(GameItem item) {
        if (item.getPile().getActualMatchesCount() <= 0) {
            item.getGame().setState(GameState.FINISHED);
        }
    }
}