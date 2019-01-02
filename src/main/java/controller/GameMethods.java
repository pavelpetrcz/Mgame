package controller;

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


    protected MatchesPile userTakeMatches(Integer take, MatchesPile pile) {
        pile.setActualMatchesCount(pile.getActualMatchesCount() - take);
        return pile;
    }

    /**
     *  Computer each round takes matches as well
     * @param pile object with info about round
     * @return object after computers take
     */
    public MatchesPile computerTakeMatches(MatchesPile pile) {
        int computerTake = pile.getActualMatchesCount();
        SecureRandom random = new SecureRandom();

        while (computerTake > pile.getActualMatchesCount()) {
            computerTake = random.nextInt();
        }
        pile.setActualMatchesCount(pile.getActualMatchesCount() - computerTake);
        return pile;
    }

    boolean checkStatusGame(GameState settings) {

        return false;
    }
}