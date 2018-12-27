package controller;

import model.MatchesPile;

import java.security.SecureRandom;

public class GameMethods {

    /**
     * Take specific amount of matches from the pile
     * @param take number of matches that player can take
     * @param pile object with information about actual game
     * @return object after taking specific amount of matches
     */


    protected MatchesPile userTakeMatches(Long take, MatchesPile pile) {
        pile.setActualMatchesCount(pile.getActualMatchesCount() - take);
        return pile;
    }

    /**
     *  Computer each round takes matches as well
     * @param pile object with info about round
     * @return object after computers take
     */
    public MatchesPile computerTakeMatches(MatchesPile pile) {
        long computerTake = pile.getActualMatchesCount();
        SecureRandom random = new SecureRandom();

        while (computerTake > pile.getActualMatchesCount()) {
            computerTake = random.nextLong();
        }
        pile.setActualMatchesCount(pile.getActualMatchesCount() - computerTake);
        return pile;
    }
}